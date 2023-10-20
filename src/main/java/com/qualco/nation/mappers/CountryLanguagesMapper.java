package com.qualco.nation.mappers;

import com.qualco.nation.models.dto.CountryLanguagesDto;
import com.qualco.nation.models.entities.CountryLanguages;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CountryLanguagesMapper {
    CountryLanguages toEntity(CountryLanguagesDto countryLanguagesDto);

    CountryLanguagesDto toDto(CountryLanguages countryLanguages);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    CountryLanguages partialUpdate(CountryLanguagesDto countryLanguagesDto, @MappingTarget CountryLanguages countryLanguages);
}