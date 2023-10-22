package com.qualco.nation.services;


import com.qualco.nation.mappers.RegionsMapper;
import com.qualco.nation.models.dto.RegionsDto;
import com.qualco.nation.models.entities.Regions;
import com.qualco.nation.repositories.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RegionService {

    private final RegionRepository regionRepository;

    private final RegionsMapper regionsMapper;

    @Autowired
    public RegionService(RegionRepository regionRepository, RegionsMapper regionsMapper) {
        this.regionRepository = regionRepository;
        this.regionsMapper = regionsMapper;
    }

    public List<RegionsDto> getRegions() {
        List<Regions> regions = this.regionRepository.findAll();

        return regions.stream()
                .map(regionsMapper::toDto)
                .collect(Collectors.toList());
    }

}
