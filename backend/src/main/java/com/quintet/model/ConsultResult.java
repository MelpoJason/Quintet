/*
 * For personal use;
 */

package com.quintet.model;

public class ConsultResult {
    private boolean isEnable;
    private String errorCode;

    public ConsultResult(boolean isEnable, String errorCode) {
        this.isEnable = isEnable;
        this.errorCode = errorCode;
    }

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
