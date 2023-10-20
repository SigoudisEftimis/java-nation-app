package com.qualco.nation.models.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Regions {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "region_id", nullable = false)
    private int regionId;
    @Basic
    @Column(name = "name", nullable = false, length = 100)
    private String name;
    @Basic
    @Column(name = "continent_id", insertable=false, updatable=false, nullable = false)
    private int continentId;
    @OneToMany(mappedBy = "regions")
    private Collection<Countries> countriesByRegionId;
    @ManyToOne
    @JoinColumn(name = "continent_id", referencedColumnName = "continent_id", nullable = false)
    private Continents continents;

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContinentId() {
        return continentId;
    }

    public void setContinentId(int continentId) {
        this.continentId = continentId;
    }

    public Collection<Countries> getCountriesByRegionId() {
        return countriesByRegionId;
    }

    public void setCountriesByRegionId(Collection<Countries> countriesByRegionId) {
        this.countriesByRegionId = countriesByRegionId;
    }

    public Continents getContinents() {
        return continents;
    }

    public void setContinents(Continents continents) {
        this.continents = continents;
    }
}
