package com.bigtree.order.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiErrorResponse {

    String reference;
    String title;
    String detail;
    Integer status;

}
