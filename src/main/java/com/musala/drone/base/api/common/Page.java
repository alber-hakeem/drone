package com.musala.drone.base.api.common;

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
public class Page {
    private int pageNumber;
    private int pageSize;
}
