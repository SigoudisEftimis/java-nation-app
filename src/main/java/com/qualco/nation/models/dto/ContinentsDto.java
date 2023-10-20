package com.qualco.nation.models.dto;

import com.qualco.nation.models.dto.RegionsDto;
import com.qualco.nation.models.entities.Continents;

import java.io.Serializable;
import java.util.Collection;

/**
 * DTO for {@link Continents}
 */
public class ContinentsDto implements Serializable {
    private final int continentId;
    private final String name;
    private final Collection<RegionsDto> regionsByContinentId;

    public ContinentsDto(int continentId, String name, Collection<RegionsDto> regionsByContinentId) {
        this.continentId = continentId;
        this.name = name;
        this.regionsByContinentId = regionsByContinentId;
    }

    public int getContinentId() {
        return continentId;
    }

    public String getName() {
        return name;
    }

    public Collection<RegionsDto> getRegionsByContinentId() {
        return regionsByContinentId;
    }
}