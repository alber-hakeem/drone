package com.musala.drone.validation;

import com.musala.drone.base.exception.custom.BusinessException;
import com.musala.drone.base.service.MessageService;
import com.musala.drone.constant.MessageConstants;
import com.musala.drone.dto.DroneDto;
import com.musala.drone.dto.MedicationDto;
import com.musala.drone.enums.DroneState;

import java.util.Set;

/**
 * @author Alber Rashad
 * @created 05/11/2022
 * @description
 */
public class DroneBatteryValidation implements DroneLoadValidation{
    private DroneLoadValidation nextValidation;



    @Override
    public void setNext(DroneLoadValidation next) {
        nextValidation=next;
    }

    @Override
    public void validate(DroneDto droneDto, Set<MedicationDto> medicationDtos) {
        if(!droneDto.getState().equals(DroneState.IDLE))
            throw new BusinessException(MessageConstants.DRONE_BATTERY_IS_LOW);
        else
            this.nextValidation.validate(droneDto,medicationDtos);

    }
}
