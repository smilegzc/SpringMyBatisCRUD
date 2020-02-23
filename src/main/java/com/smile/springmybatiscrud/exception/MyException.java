package com.smile.springmybatiscrud.exception;

/**
 * 自定义异常
 */
public class MyException extends RuntimeException {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public MyException() {
        super("用户不存在!");
    }
}
