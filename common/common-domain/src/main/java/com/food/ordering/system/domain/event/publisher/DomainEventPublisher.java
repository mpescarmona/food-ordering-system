package com.food.ordering.system.domain.event.publisher;

import com.food.ordering.system.domain.event.DomainEvent;

/**
 * @author: Mario Oscar Pescarmona Tricoli
 */
public interface DomainEventPublisher<T extends DomainEvent> {

    void publish(T domainEvent);
}
