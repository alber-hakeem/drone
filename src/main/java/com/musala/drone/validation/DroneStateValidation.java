package com.musala.drone.validation;

import com.musala.drone.base.exception.custom.BusinessException;
import com.musala.drone.base.service.MessageService;
import com.musala.drone.base.service.MessageServiceImpl;
import com.musala.drone.constant.MessageConstants;
import com.musala.drone.dto.DroneDto;
import com.musala.drone.dto.MedicationDto;
import com.musala.drone.enums.DroneState;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * @author Alber Rashad
 * @created 05/11/2022
 * @description
 */
public class DroneStateValidation implements DroneLoadValidation{
    private DroneLoadValidation nextValidation;



    @Override
    public void setNext(DroneLoadValidation next) {
        nextValidation=next;
    }

    @Override
    public void validate(DroneDto droneDto, Set<MedicationDto> medicationDtos) {
        if(!droneDto.getState().equals(DroneState.IDLE))
            throw new BusinessException(MessageConstants.DRONE_IS_NOT_IN_VAlID_STATE);
        else
            this.nextValidation.validate(droneDto,medicationDtos);

    }
}
