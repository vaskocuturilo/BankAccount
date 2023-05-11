package com.example.bankaccount.exception;

public class BalanceNotFound extends Exception {

    public BalanceNotFound(String message) {
        super(message);
    }

    public BalanceNotFound(String message, Throwable cause) {
        super(message, cause);
    }
}
