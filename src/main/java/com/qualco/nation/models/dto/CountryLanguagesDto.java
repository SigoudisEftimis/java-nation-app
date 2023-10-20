package com.qualco.nation.models.dto;

import com.qualco.nation.models.entities.CountryLanguages;

import java.io.Serializable;

/**
 * DTO for {@link CountryLanguages}
 */
public class CountryLanguagesDto implements Serializable {
    private final int countryId;
    private final int languageId;
    private final byte official;

    public CountryLanguagesDto(int countryId, int languageId, byte official) {
        this.countryId = countryId;
        this.languageId = languageId;
        this.official = official;
    }

    public int getCountryId() {
        return countryId;
    }

    public int getLanguageId() {
        return languageId;
    }

    public byte getOfficial() {
        return official;
    }
}