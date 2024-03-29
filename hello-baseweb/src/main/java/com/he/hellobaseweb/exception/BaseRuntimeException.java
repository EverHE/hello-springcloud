package com.he.hellobaseweb.exception;


public class BaseRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 609281876732234454L;
    public static final int RUNTIME_EXCEPTION = 10000001;

    private int code;

    public BaseRuntimeException() {
        super(ExceptionBundle.getMessage(String.valueOf(RUNTIME_EXCEPTION)));
        this.code = RUNTIME_EXCEPTION;
    }

    public BaseRuntimeException(int code) {
        this(code, ExceptionBundle.getMessage(String.valueOf(code)));
    }

    public BaseRuntimeException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BaseRuntimeException(int code, Object[] args) {
        this(code, ExceptionBundle.getMessage(String.valueOf(code)), args);
    }

    public BaseRuntimeException(int code, String msgFormat, Object[] args) {
        super(String.format(msgFormat, args));
        this.code = code;
    }

    public BaseRuntimeException(int code, Throwable cause) {
        super(ExceptionBundle.getMessage(String.valueOf(code)), cause);
        this.code = code;
    }

    public BaseRuntimeException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

}
