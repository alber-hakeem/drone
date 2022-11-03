package com.musala.drone.dto;

import com.musala.drone.base.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

/**
 * @author Alber Rashad
 * @created 03/11/2022
 * @description
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MedicationDto extends BaseDto {

    private Long id;
    private String name;
    private float weight;
    private String code;
    private String imageUrl;
    private DroneDto droneDto;

}
