package com.github.owenjia.common;

import java.io.Serializable;

public class ApiResult<T> implements Serializable {

    /**
     * 约定：0 表示成功，其它表示失败.
     */
    private int code;

    private String message;

    private T data;

    private ApiResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> ApiResult<T> success(T data) {
        return new ApiResult<>(0, "success", data);
    }

    public static <T> ApiResult<T> success() {
        return success(null);
    }

    public static <T> ApiResult<T> fail(String message) {
        return new ApiResult<>(-1, message, null);
    }

    public static <T> ApiResult<T> fail(int code, String message) {
        return new ApiResult<>(code, message, null);
    }

}
