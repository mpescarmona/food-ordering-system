package com.food.ordering.system.domain.exception;

/**
 * @author: Mario Oscar Pescarmona Tricoli
 */
public class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }

    public DomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
