package com.quintet.exception;

public class BaseException extends RuntimeException {
    private static final long serialVersionUID = -7619231466939296677L;

    static final String INVALID_PARAMS = "INVALID_PARAMS";

    static String toMessage(String base, String msg) {
        return new StringBuilder(base).append(":").append(msg).toString();
    }

    public BaseException() {
        super();
    }


    public BaseException(String msg) {
        super(msg);
    }

    public static String getErrMsg(Exception e){
        if(e.getMessage() != null){
            return e.getMessage();
        }
        if(e.getCause() != null && e.getCause().getMessage() != null){
            return e.getCause().getMessage();
        }
        return null;
    }

}
