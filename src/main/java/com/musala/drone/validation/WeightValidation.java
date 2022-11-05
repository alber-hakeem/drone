package com.musala.drone.validation;

import com.musala.drone.base.exception.custom.BusinessException;
import com.musala.drone.base.service.MessageService;
import com.musala.drone.constant.MessageConstants;
import com.musala.drone.dto.DroneDto;
import com.musala.drone.dto.MedicationDto;

import java.util.Set;

/**
 * @author Alber Rashad
 * @created 05/11/2022
 * @description
 */
public class WeightValidation implements DroneLoadValidation{
    private DroneLoadValidation nextValidation;

    @Override
    public void setNext(DroneLoadValidation next) {
        nextValidation=next;
    }

    @Override
    public void validate(DroneDto droneDto, Set<MedicationDto> medicationDtos) {
        float totalMedicationsWeight=medicationDtos.stream().map(MedicationDto::getWeight).reduce(0f,(a, b)->a+b);
        if(totalMedicationsWeight>droneDto.getWeightLimit())
            throw new BusinessException(MessageConstants.LOAD_IS_OVER_WEIGHT);
    }
}
