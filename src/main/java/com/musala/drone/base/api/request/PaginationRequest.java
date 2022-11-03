package com.musala.drone.base.api.request;

import com.musala.drone.base.api.common.Page;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Alber Rashad
 * @created 29/10/2022
 * @description
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class PaginationRequest extends Page {
    private List<SortingBy> sortingByList;
}
