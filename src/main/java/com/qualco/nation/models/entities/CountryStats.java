package com.qualco.nation.models.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "country_stats", schema = "nation", catalog = "")
@IdClass(CountryStatsPK.class)
public class CountryStats {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "country_id", nullable = false)
    private int countryId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "year", nullable = false)
    private int year;
    @Basic
    @Column(name = "population", nullable = true, precision = 12, scale = 2) // Adjust precision and scale as needed
    private BigDecimal population;
    @Basic
    @Column(name = "gdp", nullable = true, precision = 12, scale = 2) // Adjust precision and scale as needed
    private BigDecimal gdp;
    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "country_id", nullable = false)
    private Countries country;

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public BigDecimal getPopulation() {
        return population;
    }

    public void setPopulation(BigDecimal population) {
        this.population = population;
    }

    public BigDecimal getGdp() {
        return gdp;
    }

    public void setGdp(BigDecimal gdp) {
        this.gdp = gdp;
    }

    public Countries getCountry() {
        return country;
    }

    public void setCountry(Countries country) {
        this.country = country;
    }
}
