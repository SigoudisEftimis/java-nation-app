package com.qualco.nation.models.dto;

import com.qualco.nation.models.entities.CountryStatsPK;

import java.io.Serializable;

/**
 * DTO for {@link CountryStatsPK}
 */
public class CountryStatsPKDto implements Serializable {
    private final int countryId;
    private final int year;

    public CountryStatsPKDto(int countryId, int year) {
        this.countryId = countryId;
        this.year = year;
    }

    public int getCountryId() {
        return countryId;
    }

    public int getYear() {
        return year;
    }
}