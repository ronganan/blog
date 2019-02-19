package com.rong.blog.exception;

public class EncryptionException extends BaseException {
//    static final long serialVersionUID = 8731823579400609556L;

    public EncryptionException() {
        super();
    }

    public EncryptionException(String message) {
        super(message);
    }

    public EncryptionException(Throwable cause) {
        super(cause);
    }

    public EncryptionException(String message, Throwable cause) {
        super(message, cause);
    }

}