package com.musala.drone.transformer;

import com.musala.drone.base.transformer.BaseTransformer;
import com.musala.drone.dto.DroneMedicationDto;
import com.musala.drone.model.DroneMedication;
import com.musala.drone.transformer.mapper.DroneMedicationMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author Alber Rashad
 * @created 05/11/2022
 * @description
 */

@AllArgsConstructor
@Component
public class DroneMedicationTransformer implements BaseTransformer<DroneMedication, DroneMedicationDto, DroneMedicationMapper> {
    private final DroneMedicationMapper droneMedicationMapper;

    @Override
    public DroneMedicationMapper getMapper() {
        return droneMedicationMapper;
    }
}