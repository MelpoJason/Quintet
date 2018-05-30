package com.quintet.exception;

public class InvalidParamsException extends BaseException {
    private static final String INVALID_PARAMS_EXCEPTION = "INVALID PARAMS EXCEPTION";

    public InvalidParamsException() {
        super();
    }

    public InvalidParamsException(String msg) {
        super(toMessage(INVALID_PARAMS_EXCEPTION, msg));
    }
}
