package com.rong.blog.exception;

public class BaseException extends Exception {

    /**
     * @Fields serialVersionUID :序列号
     **/
//    private static final long serialVersionUID = 1L;

    public BaseException() {
        super();
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public String toString() {
        return this.getMessage();
    }

}