package com.xhxk.projectmange.controller;

import com.xhxk.projectmange.common.BusinessException;
import org.springframework.validation.BindingResult;

public class BaseController {
    protected void handleBindingResult(BindingResult bindingResult){
       String message= ( ( ( bindingResult).getAllErrors()).get(0)).getDefaultMessage();
        throw new BusinessException(message);
    }
}
