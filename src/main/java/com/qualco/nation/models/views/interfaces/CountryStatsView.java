package com.qualco.nation.models.views.interfaces;

import java.math.BigDecimal;

public interface CountryStatsView {
    String getContinentName();
    void setContinentName(String continentName);

    String getRegionName();
    void setRegionName(String regionName);

    String getCountryName();
    void setCountryName(String countryName);

    Integer getYear();
    void setYear(Integer year);

    BigDecimal getPopulation();
    void setPopulation(BigDecimal population);

    BigDecimal getGdp();
    void setGdp(BigDecimal gdp);
}
