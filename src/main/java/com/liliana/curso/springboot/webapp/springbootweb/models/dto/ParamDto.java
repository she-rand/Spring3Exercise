package com.liliana.curso.springboot.webapp.springbootweb.models.dto;

public class ParamDto {

    private String message;
    private Integer code;
    

    public ParamDto() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
    
}
