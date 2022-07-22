package com.training.environment.response;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ResponseCode {
    SUCCESS(200, "成功"),
    FAIL(500, "服务端发生错误"),
    ACCESS_DENIED(401, "没有权限访问该资源");

    private final int code;
    private final String message;

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
