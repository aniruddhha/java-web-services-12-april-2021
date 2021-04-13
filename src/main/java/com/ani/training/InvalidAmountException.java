package com.ani.training;

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
