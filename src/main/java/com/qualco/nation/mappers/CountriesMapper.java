package com.qualco.nation.mappers;

import com.qualco.nation.models.entities.Countries;
import com.qualco.nation.models.dto.CountriesDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CountriesMapper {
    Countries toEntity(CountriesDto countriesDto);

    @AfterMapping
    default void linkCountryLanguagesByCountryId(@MappingTarget Countries countries) {
        countries.getCountryLanguages().forEach(countryLanguagesByCountryId -> countryLanguagesByCountryId.setCountries(countries));
    }

    @AfterMapping
    default void linkCountryStatsByCountryId(@MappingTarget Countries countries) {
        countries.getCountryStats().forEach(countryStatsByCountryId -> countryStatsByCountryId.setCountry(countries));
    }

    CountriesDto toDto(Countries countries);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Countries partialUpdate(CountriesDto countriesDto, @MappingTarget Countries countries);
}