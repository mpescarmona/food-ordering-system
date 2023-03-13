package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

/**
 * @author: Mario Oscar Pescarmona Tricoli
 */
public class OrderId extends BaseId<UUID> {
    protected OrderId(UUID value) {
        super(value);
    }
}
