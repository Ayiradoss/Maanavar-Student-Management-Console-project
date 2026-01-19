package com.zsgs.maanavar.exception;

public class DatabaseException extends RuntimeException {
    public DatabaseException(String msg, Throwable cause) {
        super(msg, cause);
    }
}