package com.damm.common.exception;

import com.damm.common.response.ResponseResult;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @author 黄林强
 * @ClassName GlobalExceptionHandle
 * @description: TODO
 * @date 2024年03月02日
 * @version: 1.0
 */

@ControllerAdvice
public class GlobalExceptionHandle implements HandlerInterceptor {


    @ExceptionHandler(BizException.class)
    @ResponseBody
    public ResponseResult<?> handleBizException(BizException exception, HttpServletRequest request) {
        return ResponseResult.error(exception);
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseResult<?> handleException(Exception exception) {
        if(exception instanceof MethodArgumentNotValidException) {
            return ResponseResult.error(BizException.INVALID_PARAM.getCode(), exception.getMessage());
        }
        return ResponseResult.error(BizException.SYSTEM_ERROR.getCode(), exception.getClass().getName());
    }

}
