package com.qualco.nation.repositories;

import com.qualco.nation.models.entities.CountryLanguages;
import com.qualco.nation.models.views.interfaces.LanguageView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryLanguagesRepository extends JpaRepository<CountryLanguages, Long> {
    @Query("SELECT " +
            "cl.official as official, " +
            "cl.languages.language as language, " +
            "cl.languages.languageId as languageId " +
            "FROM CountryLanguages cl " +
            "WHERE cl.countries.countryId = :countryId")
    List<LanguageView> findLanguagesByCountryId(@Param("countryId") int countryId);

}

