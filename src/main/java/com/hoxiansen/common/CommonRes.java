package com.hoxiansen.common;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class CommonRes {
    private int code;
    private String message;
    private Object data;

    public CommonRes() {
        setCodeAndMsg(ResCode.SUCCESS);
    }

    public void setCodeAndMsg(ResCode code) {
        this.code = code.getCode();
        this.message = code.getMessage();
    }
}
