package com.qualco.nation.mappers;

import com.qualco.nation.models.entities.Languages;
import com.qualco.nation.models.dto.LanguagesDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface LanguagesMapper {
    Languages toEntity(LanguagesDto languagesDto);

    LanguagesDto toDto(Languages languages);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Languages partialUpdate(LanguagesDto languagesDto, @MappingTarget Languages languages);
}