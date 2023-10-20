package com.qualco.nation.models.dto;

import com.qualco.nation.models.entities.CountryStats;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link CountryStats}
 */
public class CountryStatsDto implements Serializable {
    private final int countryId;
    private final int year;
    private final BigDecimal population;
    private final BigDecimal gdp;

    public CountryStatsDto(int countryId, int year, BigDecimal population, BigDecimal gdp) {
        this.countryId = countryId;
        this.year = year;
        this.population = population;
        this.gdp = gdp;
    }

    public int getCountryId() {
        return countryId;
    }

    public int getYear() {
        return year;
    }

    public BigDecimal getPopulation() {
        return population;
    }

    public BigDecimal getGdp() {
        return gdp;
    }
}
