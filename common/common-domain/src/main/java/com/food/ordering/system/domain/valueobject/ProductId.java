package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

/**
 * @author: Mario Oscar Pescarmona Tricoli
 */
public class ProductId extends BaseId<UUID> {
    public ProductId(UUID value) {
        super(value);
    }
}
