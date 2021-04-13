package com.ani.training;

/**
 *  - What is exception ? -> unwanted situation
 *  - How Spring boot handles exception by default ? -> by showing predefined JSON object
 *  - How do you throw exception ? -> throw new YourExceptionClass
 *  - How do you customize exception ? -> by extending to runtime exception class
 *  - How do you handle exception in spring boot ? -> by writing method with @ExceptionHandler annotation
 * */
public class InvalidAmountException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Amount Should Be Non Zero, Non Negative";
    }

    @Override
    public String toString() {
        return "Invalid Amount";
    }
}
