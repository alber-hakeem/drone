package com.musala.drone.base.api.response;

import com.musala.drone.base.api.common.Page;
import com.musala.drone.base.dto.BaseDto;
import lombok.*;

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
public class PaginationResponse<Dto extends BaseDto> extends Page {
    private int totalNumberOfPages;
    private long totalNumberOfElements;
    private List<Dto> result;
    private boolean isFirst;
    private boolean isLast;

    @Builder
    public PaginationResponse(int pageNumber, int pageSize, int totalNumberOfPages, long totalNumberOfElements, List<Dto> result, boolean isFirst, boolean isLast) {
        super(pageNumber, pageSize);
        this.totalNumberOfPages = totalNumberOfPages;
        this.totalNumberOfElements = totalNumberOfElements;
        this.result = result;
        this.isFirst = isFirst;
        this.isLast = isLast;
    }
}
