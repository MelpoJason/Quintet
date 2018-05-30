package com.quintet.model.dto;


import com.quintet.model.BaseModel;
import org.springframework.http.HttpStatus;

public class GenericDTO<T> extends BaseModel {
    private int code;
    private String msg;
    private T data;

    private GenericDTO(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <E> GenericDTO<E> getReturnDTO(E data) {
        return new GenericDTO<>(HttpStatus.OK.value(), HttpStatus.OK.name(), data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
