package com.damm.common.exception;

/**
 * @author 黄林强
 * @ClassName BizException
 * @description: TODO
 * @date 2024年07月06日
 * @version: 1.0
 */
public class BizException extends RuntimeException{

    public final static BizException THIRD_CALL_EXCEPTION = new BizException(30001, "远程服务器请求异常");
    public final static BizException THIRD_RETURN_EXCEPTION = new BizException(30002, "远程服务器响应异常");
    public final static BizException SYSTEM_ERROR = new BizException(50001, "服务器异常");

    private final Integer code;
    private String message;

    public BizException(Integer code, String message, Exception e) {
        super(message, e);
        this.code = code;
    }

    public BizException(Integer code, String message) {
        super(message);
        this.code = code;
    }


    public BizException(Integer code, String message, Throwable throwable) {
        super(message, throwable);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
