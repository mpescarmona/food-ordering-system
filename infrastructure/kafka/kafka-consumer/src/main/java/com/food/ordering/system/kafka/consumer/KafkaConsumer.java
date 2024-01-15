package com.food.ordering.system.kafka.consumer;

import org.apache.avro.specific.SpecificRecordBase;

import java.util.List;

/**
 * @author: Mario Oscar Pescarmona Tricoli
 */
public interface KafkaConsumer<T extends SpecificRecordBase> {
    void receive(List<T> messages, List<Long> keys, List<Integer> partitions, List<Long> offsets);
}
