package com.exception;

/**
 * 业务断言异常
 * Created by wula on 2014/4/13.
 */
public class AssertsException extends RuntimeException {
    /** 详细的业务要求错误信息 */
    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public AssertsException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }

    public AssertsException(String errorMessage, String message) {
        super(message);
        this.errorMessage = errorMessage;
    }

    public AssertsException(String errorMessage, String message, Throwable cause) {
        super(message, cause);
        this.errorMessage = errorMessage;
    }

    public AssertsException(String errorMessage, Throwable cause) {
        super(cause);
        this.errorMessage = errorMessage;
    }
}
