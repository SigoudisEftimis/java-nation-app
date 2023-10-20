package com.qualco.nation.models.views.interfaces;


import java.math.BigInteger;

public interface CountryView {
    String getName();
    void setName(String name);

    BigInteger getArea();
    void setArea(BigInteger area);

    String getCountryCode2();
    void setCountryCode2(String countryCode2);
}

