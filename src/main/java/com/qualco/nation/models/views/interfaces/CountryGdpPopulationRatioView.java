package com.qualco.nation.models.views.interfaces;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface CountryGdpPopulationRatioView {
    String getName();
    void setName(String name);

    String getCountryCode3();
    void setCountryCode3(String countryCode3);

    int getYear();
    void setYear(int year);

    BigInteger getPopulation();
    void setPopulation(BigInteger population);

    BigDecimal getGdp();
    void setGdp(BigDecimal gdp);
}


