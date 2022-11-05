package com.musala.drone.transformer.mapper;

import com.musala.drone.base.transformer.mapper.BaseMapper;
import com.musala.drone.base.transformer.mapper.MapStructCentralConfig;
import com.musala.drone.dto.DroneMedicationDto;
import com.musala.drone.model.DroneMedication;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

/**
 * @author Alber Rashad
 * @created 05/11/2022
 * @description
 */
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        config = MapStructCentralConfig.class)
public interface DroneMedicationMapper extends BaseMapper<DroneMedication, DroneMedicationDto> {
}
