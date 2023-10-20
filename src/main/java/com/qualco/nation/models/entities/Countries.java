package com.qualco.nation.models.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Collection;

@Entity
public class Countries {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "country_id", nullable = false)
    private int countryId;
    @Basic
    @Column(name = "name", nullable = true, length = 50)
    private String name;
    @Basic
    @Column(name = "area", nullable = false, precision = 2)
    private BigDecimal area;
    @Basic
    @Column(name = "national_day", nullable = true)
    private Date nationalDay;
    @Basic
    @Column(name = "country_code2", nullable = false, length = 2)
    private String countryCode2;
    @Basic
    @Column(name = "country_code3", nullable = false, length = 3)
    private String countryCode3;
    @Basic
    @Column(name = "region_id", insertable=false, updatable=false ,  nullable = false)
    private int regionId;
    @ManyToOne
    @JoinColumn(name = "region_id", referencedColumnName = "region_id", nullable = false)
    private Regions regions;
    @OneToMany(mappedBy = "countries")
    private Collection<CountryLanguages> countryLanguages;
    @OneToMany(mappedBy = "country")
    private Collection<CountryStats> countryStats;



    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public Date getNationalDay() {
        return nationalDay;
    }

    public void setNationalDay(Date nationalDay) {
        this.nationalDay = nationalDay;
    }

    public String getCountryCode2() {
        return countryCode2;
    }

    public void setCountryCode2(String countryCode2) {
        this.countryCode2 = countryCode2;
    }

    public String getCountryCode3() {
        return countryCode3;
    }

    public void setCountryCode3(String countryCode3) {
        this.countryCode3 = countryCode3;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public Regions getRegions() {
        return regions;
    }

    public void setRegions(Regions regions) {
        this.regions = regions;
    }

    public Collection<CountryLanguages> getCountryLanguages() {
        return countryLanguages;
    }

    public void setCountryLanguages(Collection<CountryLanguages> countryLanguages) {
        this.countryLanguages = countryLanguages;
    }

    public Collection<CountryStats> getCountryStats() {
        return countryStats;
    }

    public void setCountryStats(Collection<CountryStats> countryStats) {
        this.countryStats = countryStats;
    }
}
