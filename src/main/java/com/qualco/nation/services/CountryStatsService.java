package com.qualco.nation.services;

import com.qualco.nation.mappers.CountryStatsViewMapper;
import com.qualco.nation.models.dto.CountryStatsViewDto;
import com.qualco.nation.models.views.interfaces.CountryStatsView;
import com.qualco.nation.repositories.CountryStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CountryStatsService {

    private  final CountryStatsRepository countryStatsRepository;

    private final CountryStatsViewMapper countryStatsViewMapper;

    @Autowired
    public CountryStatsService(CountryStatsRepository countryStatsRepository, CountryStatsViewMapper countryStatsViewMapper) {
        this.countryStatsRepository = countryStatsRepository;
        this.countryStatsViewMapper = countryStatsViewMapper;
    }

    public Page<CountryStatsViewDto> getFilteredCountryStats(
            Long regionId, Integer startDate, Integer endDate, Pageable pageable
    ) {
        Page<CountryStatsView> countryStats = countryStatsRepository.findFilteredCountryStats(regionId, startDate, endDate, pageable);
        return countryStats.map(countryStatsViewMapper::toDto);
    }
}
