package com.qualco.nation.models.dto;

import com.qualco.nation.models.views.interfaces.CountryStatsView;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link CountryStatsView}
 */
public class CountryStatsViewDto implements Serializable {
    private final String continentName;
    private final String regionName;
    private final String countryName;
    private final Integer year;
    private final BigDecimal population;
    private final BigDecimal gdp;

    public CountryStatsViewDto(String continentName, String regionName, String countryName, Integer year, BigDecimal population, BigDecimal gdp) {
        this.continentName = continentName;
        this.regionName = regionName;
        this.countryName = countryName;
        this.year = year;
        this.population = population;
        this.gdp = gdp;
    }

    public String getContinentName() {
        return continentName;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getCountryName() {
        return countryName;
    }

    public Integer getYear() {
        return year;
    }

    public BigDecimal getPopulation() {
        return population;
    }

    public BigDecimal getGdp() {
        return gdp;
    }
}