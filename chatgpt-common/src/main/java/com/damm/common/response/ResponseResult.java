package com.damm.common.response;

import com.damm.common.exception.BizException;
import com.damm.common.utils.MDCUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.MDC;

/**
 * @author 黄林强
 * @ClassName ResponseResult
 * @description: TODO
 * @date 2024年07月07日
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseResult<T> {

    private Integer code;

    private String msg;

    private T data;

    private String recordId;

    public static <T> ResponseResult<T> success(T data) {
        return new ResponseResult<>(0, "OK", data, MDCUtil.getRecordId());
    }

    public static <T> ResponseResult<T> error(Integer code, String message) {
        return new ResponseResult<>(code, message, null, MDCUtil.getRecordId());
    }


    public static <T> ResponseResult<T> error(Integer code, String message, T data) {
        return new ResponseResult<>(code, message, data, MDCUtil.getRecordId());
    }


    public static <T> ResponseResult<T> error(BizException exception) {
        return new ResponseResult<>(exception.getCode(), exception.getMessage(), null, MDCUtil.getRecordId());
    }
}
