package com.qualco.nation.repositories;

import com.qualco.nation.models.entities.Countries;
import com.qualco.nation.models.views.interfaces.CountryGdpPopulationRatioView;
import com.qualco.nation.models.views.interfaces.CountryStatsView;
import com.qualco.nation.models.views.interfaces.CountryView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CountriesRepository extends JpaRepository<Countries, Integer> {

    @Query("SELECT c.name AS name, c.area AS area, c.countryCode2 AS countryCode2 FROM Countries c")
    Page<CountryView> getCountries(Pageable pageable);

    @Query("SELECT c.name as name, c.countryCode3 as countryCode3, cs.year as year, cs.population as population, cs.gdp as gdp " +
            "FROM Countries c " +
            "JOIN c.countryStats cs " +
            "WHERE cs.gdp / cs.population = (SELECT MAX(cs2.gdp / cs2.population) " +
            "FROM CountryStats cs2 " +
            "WHERE cs2.country.countryId = c.countryId)")
    Page<CountryGdpPopulationRatioView> findCountriesMaxGdpPerPopulationRatio(Pageable pageable);

    @Query("SELECT NEW com.qualco.nation.models.views.implementations.CountryStatsViewImpl(c.name, r.name, co.name, cs.year, cs.population, cs.gdp) " +
            "FROM Countries c " +
            "JOIN c.regions r " +
            "JOIN c.regions.continents co " +
            "JOIN c.countryStats cs " +
            "WHERE (:regionId IS NULL OR r.regionId = :regionId) " +
            "AND (:startDate IS NULL OR cs.year >= :startDate) " +
            "AND (:endDate IS NULL OR cs.year <= :endDate)")
    Page<CountryStatsView> findFilteredCountryStats(
            @Param("regionId") Long regionId,
            @Param("startDate") Integer startDate,
            @Param("endDate") Integer endDate,
            Pageable pageable
    );
}
