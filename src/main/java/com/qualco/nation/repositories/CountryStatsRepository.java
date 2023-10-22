package com.qualco.nation.repositories;

import com.qualco.nation.models.entities.CountryStats;
import com.qualco.nation.models.views.interfaces.CountryStatsView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryStatsRepository extends JpaRepository<CountryStats, Long> {
    @Query("SELECT NEW com.qualco.nation.models.views.implementations.CountryStatsViewImpl(co.name, r.name, c.name, cs.year, cs.population, cs.gdp) " +
            "FROM CountryStats cs " +
            "JOIN cs.country c " +
            "JOIN cs.country.regions r " +
            "JOIN cs.country.regions.continents co " +
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
