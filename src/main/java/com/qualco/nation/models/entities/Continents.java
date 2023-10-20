package com.qualco.nation.models.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Continents {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "continent_id", nullable = false)
    private int continentId;
    @Basic
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @OneToMany(mappedBy = "continents")
    private Collection<Regions> regions;

    public int getContinentId() {
        return continentId;
    }

    public void setContinentId(int continentId) {
        this.continentId = continentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Regions> getRegions() {
        return regions;
    }

    public void setRegions(Collection<Regions> regions) {
        this.regions = regions;
    }
}
