package com.qualco.nation.mappers;

import com.qualco.nation.models.views.implementations.CountryStatsViewImpl;
import com.qualco.nation.models.views.interfaces.CountryStatsView;
import com.qualco.nation.models.dto.CountryStatsViewDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CountryStatsViewMapper {
    CountryStatsViewImpl toEntity(CountryStatsViewDto countryStatsViewDto);

    CountryStatsViewDto toDto(CountryStatsView countryStatsView);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    CountryStatsView partialUpdate(CountryStatsViewDto countryStatsViewDto, @MappingTarget CountryStatsView countryStatsView);
}