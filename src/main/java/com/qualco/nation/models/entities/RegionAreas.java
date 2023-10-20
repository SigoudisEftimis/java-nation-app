package com.qualco.nation.models.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "region_areas", schema = "nation", catalog = "")
public class RegionAreas {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "region_name", nullable = false, length = 100)
    private String regionName;
    @Basic
    @Column(name = "region_area", nullable = false, precision = 2)
    private BigDecimal regionArea;

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public BigDecimal getRegionArea() {
        return regionArea;
    }

    public void setRegionArea(BigDecimal regionArea) {
        this.regionArea = regionArea;
    }
}
