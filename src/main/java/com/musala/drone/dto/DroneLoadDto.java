package com.musala.drone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

/**
 * @author Alber Rashad
 * @created 05/11/2022
 * @description
 */
@AllArgsConstructor
@Data
public class DroneLoadDto {
    private Long droneId;
    private Set<Long> medicationIds;
}
