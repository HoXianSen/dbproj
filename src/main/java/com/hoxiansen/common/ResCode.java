package com.hoxiansen.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResCode {
    SUCCESS(0,""),
    USER_NOT_FOUND(1,"用户不存在"),
    PASSWORD_ERROR(2,"密码错误"),
    ;
    private int code;
    private String message;
}
