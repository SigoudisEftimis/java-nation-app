package com.qualco.nation.models.dto;

import com.qualco.nation.models.entities.CountryLanguagesPK;

import java.io.Serializable;

/**
 * DTO for {@link CountryLanguagesPK}
 */
public class CountryLanguagesPKDto implements Serializable {
    private final int countryId;
    private final int languageId;

    public CountryLanguagesPKDto(int countryId, int languageId) {
        this.countryId = countryId;
        this.languageId = languageId;
    }

    public int getCountryId() {
        return countryId;
    }

    public int getLanguageId() {
        return languageId;
    }
}