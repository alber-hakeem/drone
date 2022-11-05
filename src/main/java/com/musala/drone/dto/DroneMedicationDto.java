package com.musala.drone.dto;

import com.musala.drone.base.dto.BaseDto;
import com.musala.drone.model.Drone;
import com.musala.drone.model.Medication;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Alber Rashad
 * @created 05/11/2022
 * @description
 */
@Data
@AllArgsConstructor
public class DroneMedicationDto extends BaseDto {

    private Long id;
    private DroneDto drone;
    private MedicationDto medication;
    private int itemsCount;

}
