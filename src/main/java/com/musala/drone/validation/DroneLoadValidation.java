package com.musala.drone.validation;

import com.musala.drone.dto.DroneDto;
import com.musala.drone.dto.MedicationDto;

import java.util.Set;

/**
 * @author Alber Rashad
 * @created 05/11/2022
 * @description
 */
public interface DroneLoadValidation {
    void setNext(DroneLoadValidation next);
    void validate(DroneDto droneDto, Set<MedicationDto> medicationDtos);
}
