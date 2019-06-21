package com.he.helloupms.enums;

public enum ResultConstant {
    /**
     * 失败
     */
    FAIL(0, "fail"),
    /**
     * 成功
     */
    SUCCESS(1, "success");

    public int code;
    public String message;

    ResultConstant(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
