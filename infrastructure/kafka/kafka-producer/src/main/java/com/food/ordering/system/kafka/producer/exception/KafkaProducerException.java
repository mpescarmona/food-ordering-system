package com.food.ordering.system.kafka.producer.exception;

/**
 * @author: Mario Oscar Pescarmona Tricoli
 */
public class KafkaProducerException extends RuntimeException {
    public KafkaProducerException(String message) {
        super(message);
    }
}
