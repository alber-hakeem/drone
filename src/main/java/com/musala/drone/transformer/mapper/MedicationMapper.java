package com.musala.drone.transformer.mapper;

import com.musala.drone.base.transformer.mapper.BaseMapper;
import com.musala.drone.base.transformer.mapper.MapStructCentralConfig;
import com.musala.drone.dto.MedicationDto;
import com.musala.drone.model.Medication;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

/**
 * @author Alber Rashad
 * @created 03/11/2022
 * @description
 */
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        config = MapStructCentralConfig.class)
public interface MedicationMapper extends BaseMapper<Medication, MedicationDto> {

}
