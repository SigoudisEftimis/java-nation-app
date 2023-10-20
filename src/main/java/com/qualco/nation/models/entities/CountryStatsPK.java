package com.qualco.nation.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class CountryStatsPK implements Serializable {
    @Column(name = "country_id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int countryId;
    @Column(name = "year", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int year;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryStatsPK that = (CountryStatsPK) o;
        return countryId == that.countryId && year == that.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryId, year);
    }
}
