package com.musala.drone.base.transformer.mapper;

import com.musala.drone.base.dto.BaseDto;
import com.musala.drone.base.model.BaseEntity;
import org.mapstruct.MappingTarget;


public interface BaseMapper<Entity extends BaseEntity, Dto extends BaseDto> {
    Entity dtoToEntity(Dto dto);
    Dto entityToDto(Entity entity);
    void updateEntity(Dto dto, @MappingTarget Entity entity);
}
