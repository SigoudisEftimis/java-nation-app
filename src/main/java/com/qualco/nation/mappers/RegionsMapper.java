package com.qualco.nation.mappers;

import com.qualco.nation.models.dto.RegionsDto;
import com.qualco.nation.models.entities.Regions;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RegionsMapper {
    Regions toEntity(RegionsDto regionsDto);

    RegionsDto toDto(Regions regions);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Regions partialUpdate(RegionsDto regionsDto, @MappingTarget Regions regions);
}