package com.qualco.nation.models.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Languages {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "language_id", nullable = false)
    private int languageId;
    @Basic
    @Column(name = "language", nullable = false, length = 50)
    private String language;
    @OneToMany(mappedBy = "languages")
    private Collection<CountryLanguages> countryLanguages;

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Collection<CountryLanguages> getCountryLanguages() {
        return countryLanguages;
    }

    public void setCountryLanguages(Collection<CountryLanguages> countryLanguages) {
        this.countryLanguages = countryLanguages;
    }
}
