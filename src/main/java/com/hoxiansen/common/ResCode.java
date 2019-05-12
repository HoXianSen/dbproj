package com.hoxiansen.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResCode {
    SUCCESS(0,""),
    ;
    private int code;
    private String message;
}
