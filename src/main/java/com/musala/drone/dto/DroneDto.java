package com.musala.drone.dto;

import com.musala.drone.base.dto.BaseDto;
import com.musala.drone.enums.DroneModel;
import com.musala.drone.enums.DroneState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Set;

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

    @Size(max = 100,message = "Max allowed characters are 100")
    private String serialNumber;

    @Enumerated(EnumType.STRING)
    private DroneModel model;

    @Enumerated(EnumType.STRING)
    private DroneState state;

    @Max(value = 500,message = "Max allowed weight is 500")
    private float weightLimit;

    @Range(min = 0,max = 100)
    private Integer batteryCapacity;

    private Set<MedicationDto> medicationDtoList;

}
