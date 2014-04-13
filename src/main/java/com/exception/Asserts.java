package com.exception;


/**
 * 断言
 * Created by wula on 2014/4/13.
 */
public class Asserts {
    public static void assertTrue(boolean condition, String errorMessage) {
        if(!condition)
            throw new AssertsException(errorMessage);
    }
}

