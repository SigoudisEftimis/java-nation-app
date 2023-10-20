package com.qualco.nation.models.dto;

import com.qualco.nation.models.entities.Languages;

import java.io.Serializable;

/**
 * DTO for {@link Languages}
 */
public class LanguagesDto implements Serializable {
    private final int languageId;
    private final String language;

    public LanguagesDto(int languageId, String language) {
        this.languageId = languageId;
        this.language = language;
    }

    public int getLanguageId() {
        return languageId;
    }

    public String getLanguage() {
        return language;
    }
}