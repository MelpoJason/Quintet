package com.quintet.model.dto;


import com.quintet.model.BaseModel;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class GenericDTO<T> extends BaseModel {
    private Integer code;
    private String msg;
    private T data;
}
