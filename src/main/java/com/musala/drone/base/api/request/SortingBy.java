package com.musala.drone.base.api.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Alber Rashad
 * @created 29/10/2022
 * @description
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SortingBy {
    private String fieldName;
    private SortingDirection direction=SortingDirection.ASC;
    private Boolean isNumber=false;
    public SortingBy(String fieldName,SortingDirection direction){
        this.direction=direction;
        this.fieldName=fieldName;
    }
}
