package com.qualco.nation.models.dto;

import com.qualco.nation.models.entities.Regions;

import java.io.Serializable;

/**
 * DTO for {@link Regions}
 */
public class RegionsDto implements Serializable {
    private final int regionId;
    private final String name;
    private final int continentId;

    public RegionsDto(int regionId, String name, int continentId) {
        this.regionId = regionId;
        this.name = name;
        this.continentId = continentId;
    }

    public int getRegionId() {
        return regionId;
    }

    public String getName() {
        return name;
    }

    public int getContinentId() {
        return continentId;
    }
}