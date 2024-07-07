package com.damm.common.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author 黄林强
 * @ClassName GlobalExceptionHandle
 * @description: TODO
 * @date 2024年03月02日
 * @version: 1.0
 */

@ControllerAdvice
public class GlobalExceptionHandle {

    @ExceptionHandler(Exception.class)
    public BizException handleException(BizException exception) {
        return new BizException(exception.getCode(), exception.getMessage());
    }

}
