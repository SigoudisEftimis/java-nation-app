package com.qualco.nation.models.dto;

import com.qualco.nation.models.dto.CountryLanguagesDto;
import com.qualco.nation.models.dto.CountryStatsDto;
import com.qualco.nation.models.dto.RegionsDto;
import com.qualco.nation.models.entities.Countries;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Collection;

/**
 * DTO for {@link Countries}
 */
public class CountriesDto implements Serializable {
    private final int countryId;
    private final String name;
    private final BigDecimal area;
    private final Date nationalDay;
    private final String countryCode2;
    private final String countryCode3;
    private final int regionId;
    private final RegionsDto regionsByRegionId;
    private final Collection<CountryLanguagesDto> countryLanguagesByCountryId;
    private final Collection<CountryStatsDto> countryStatsByCountryId;

    public CountriesDto(int countryId, String name, BigDecimal area, Date nationalDay, String countryCode2, String countryCode3, int regionId, RegionsDto regionsByRegionId, Collection<CountryLanguagesDto> countryLanguagesByCountryId, Collection<CountryStatsDto> countryStatsByCountryId) {
        this.countryId = countryId;
        this.name = name;
        this.area = area;
        this.nationalDay = nationalDay;
        this.countryCode2 = countryCode2;
        this.countryCode3 = countryCode3;
        this.regionId = regionId;
        this.regionsByRegionId = regionsByRegionId;
        this.countryLanguagesByCountryId = countryLanguagesByCountryId;
        this.countryStatsByCountryId = countryStatsByCountryId;
    }

    public int getCountryId() {
        return countryId;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getArea() {
        return area;
    }

    public Date getNationalDay() {
        return nationalDay;
    }

    public String getCountryCode2() {
        return countryCode2;
    }

    public String getCountryCode3() {
        return countryCode3;
    }

    public int getRegionId() {
        return regionId;
    }

    public RegionsDto getRegionsByRegionId() {
        return regionsByRegionId;
    }

    public Collection<CountryLanguagesDto> getCountryLanguagesByCountryId() {
        return countryLanguagesByCountryId;
    }

    public Collection<CountryStatsDto> getCountryStatsByCountryId() {
        return countryStatsByCountryId;
    }
}