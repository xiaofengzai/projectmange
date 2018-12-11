package com.xhxk.projectmange.common;

import lombok.Data;

@Data
public class BusinessException extends RuntimeException {
    private Integer code=-1;
    public BusinessException(String message) {
        super(message);
    }
}
