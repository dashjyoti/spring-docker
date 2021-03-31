package com.phonebookbackend.api;

public enum ResultCode implements IErrorCode {
    SUCCESS(200, "Successful"),
    FAILED(500, "Failed"),
    VALIDATE_FAILED(404, "Validate failed"),
    UNAUTHORIZED(401, "unauthorized"),
    FORBIDDEN(403, "no access right");
    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }
    @Override
    public long getCode() {
        return 0;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
