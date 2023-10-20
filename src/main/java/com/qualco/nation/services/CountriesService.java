package com.qualco.nation.services;

import com.qualco.nation.mappers.CountryStatsViewMapper;

import com.qualco.nation.models.dto.CountryStatsViewDto;
import com.qualco.nation.models.views.interfaces.CountryGdpPopulationRatioView;
import com.qualco.nation.models.views.interfaces.CountryStatsView;
import com.qualco.nation.models.views.interfaces.CountryView;
import com.qualco.nation.models.views.interfaces.LanguageView;
import com.qualco.nation.repositories.CountriesRepository;
import com.qualco.nation.repositories.CountryLanguagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CountriesService {

    private final CountriesRepository countriesRepository;
    private final CountryLanguagesRepository countryLanguageRepository;
    private final CountryStatsViewMapper countryStatsViewMapper;

    @Autowired
    public CountriesService(CountriesRepository countriesRepository, CountryLanguagesRepository countryLanguageRepository, CountryStatsViewMapper countryStatsViewMapper) {
        this.countriesRepository = countriesRepository;
        this.countryLanguageRepository = countryLanguageRepository;
        this.countryStatsViewMapper = countryStatsViewMapper;
    }

    public Page<CountryView> getCountries(Pageable pageable) {
        return countriesRepository.getCountries(pageable);
    }


    public List<LanguageView> getLanguagesForCountry(int countryId) {
        return countryLanguageRepository.findLanguagesByCountryId(countryId);
    }

    public Page<CountryGdpPopulationRatioView> getCountriesMaxGdpPerPopulationRatio(Pageable pageable) {
        return countriesRepository.findCountriesMaxGdpPerPopulationRatio(pageable);
    }

    public Page<CountryStatsViewDto> getFilteredCountryStats(
            Long regionId, Integer startDate, Integer endDate, Pageable pageable
    ) {
        Page<CountryStatsView> countryStats = countriesRepository.findFilteredCountryStats(regionId, startDate, endDate, pageable);
        return countryStats.map(countryStatsViewMapper::toDto);
    }



}
