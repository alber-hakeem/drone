package com.musala.drone.dto;

import com.musala.drone.base.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;

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
    @Pattern(regexp = "[\\w-]+", message = "Invalid name!")
    private String name;

    @Max(value = 500,message = "Max allowed weight is 500")
    private float weight;
    private String code;
    private String imageUrl;

}
