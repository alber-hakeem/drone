package com.musala.drone.transformer;

import com.musala.drone.base.transformer.BaseTransformer;
import com.musala.drone.dto.MedicationDto;
import com.musala.drone.model.Medication;
import com.musala.drone.transformer.mapper.MedicationMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author Alber Rashad
 * @created 03/11/2022
 * @description
 */
@Component
@AllArgsConstructor
public class MedicationTransformer implements BaseTransformer<Medication, MedicationDto, MedicationMapper> {

    private final MedicationMapper medicationMapper;
    @Override
    public MedicationMapper getMapper() {
        return medicationMapper;
    }
}
