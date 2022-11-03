package com.musala.drone.base.api.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Alber Rashad
 * @created 29/10/2022
 * @description
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilterPaginationRequest<Filtration> extends PaginationRequest{
    private Filtration criteria;
    private Boolean deletedRecords;
}
