package com.github.diegonighty.calc.exception;

public class OperationException extends Exception {

    private final String message;

    public OperationException(String message) {
        this.message = message;
    }

}
