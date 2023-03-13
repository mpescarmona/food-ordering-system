package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

/**
 * @author: Mario Oscar Pescarmona Tricoli
 */
public class RestaurantId extends BaseId <UUID> {
    public RestaurantId(UUID value) {
        super(value);
    }
}
