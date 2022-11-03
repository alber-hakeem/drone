package com.musala.drone.dto;

import com.musala.drone.base.dto.BaseDto;
import com.musala.drone.enums.DroneModel;
import com.musala.drone.enums.DroneState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

/**
 * @author Alber Rashad
 * @created 03/11/2022
 * @description
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DroneDto extends BaseDto {

    private Long id;

    @Size(max = 100)
    private String serialNumber;

    @Enumerated(EnumType.STRING)
    private DroneModel model;

    @Enumerated(EnumType.STRING)
    private DroneState state;

    @Max(500)
    private float weightLimit;

    private Integer batteryCapacity;

}
