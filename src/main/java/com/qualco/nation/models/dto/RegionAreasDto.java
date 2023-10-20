package com.qualco.nation.models.dto;

import com.qualco.nation.models.entities.RegionAreas;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link RegionAreas}
 */
public class RegionAreasDto implements Serializable {
    private final String regionName;
    private final BigDecimal regionArea;

    public RegionAreasDto(String regionName, BigDecimal regionArea) {
        this.regionName = regionName;
        this.regionArea = regionArea;
    }

    public String getRegionName() {
        return regionName;
    }

    public BigDecimal getRegionArea() {
        return regionArea;
    }
}