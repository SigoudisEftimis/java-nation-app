package com.qualco.nation.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "country_languages", schema = "nation", catalog = "")
@IdClass(CountryLanguagesPK.class)
public class CountryLanguages {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "country_id", nullable = false)
    private int countryId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "language_id", nullable = false)
    private int languageId;
    @Basic
    @Column(name = "official", nullable = false)
    private byte official;
    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "country_id", nullable = false)
    private Countries countries;
    @ManyToOne
    @JoinColumn(name = "language_id", referencedColumnName = "language_id", nullable = false)
    private Languages languages;

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public byte getOfficial() {
        return official;
    }

    public void setOfficial(byte official) {
        this.official = official;
    }

    public Countries getCountries() {
        return countries;
    }

    public void setCountries(Countries countries) {
        this.countries = countries;
    }

    public Languages getLanguages() {
        return languages;
    }

    public void setLanguages(Languages languages) {
        this.languages = languages;
    }
}
