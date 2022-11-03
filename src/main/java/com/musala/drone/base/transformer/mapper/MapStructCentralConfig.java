package com.musala.drone.base.transformer.mapper;

import com.musala.drone.base.dto.BaseDto;
import com.musala.drone.base.model.BaseEntity;
import org.mapstruct.*;

/**
 * @author Samuel Tadros
 * @created 12/1/2020
 * @description
 */
@MapperConfig(
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_FROM_CONFIG
)
public interface MapStructCentralConfig {
    @Mappings({
            @Mapping(target = "creationDate", source = "createdDate"),
            @Mapping(target = "lastModificationDate", source = "modifiedDate")
    })
    BaseDto anyEntityToDto(BaseEntity entity);

    @Mappings({
            @Mapping(target = "createdDate", ignore = true),
            @Mapping(target = "modifiedDate", ignore = true),
            @Mapping(target = "createdBy", ignore = true),
            @Mapping(target = "modifiedBy", ignore = true),
    })
    BaseEntity anyDtoToEntity(BaseDto dto);
}