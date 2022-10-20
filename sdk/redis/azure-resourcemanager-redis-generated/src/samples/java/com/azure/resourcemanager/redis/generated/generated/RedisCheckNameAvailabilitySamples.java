// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.redis.generated.models.CheckNameAvailabilityParameters;

/** Samples for Redis CheckNameAvailability. */
public final class RedisCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/stable/2022-05-01/examples/RedisCacheCheckNameAvailability.json
     */
    /**
     * Sample code: RedisCacheCheckNameAvailability.
     *
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheCheckNameAvailability(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager
            .redis()
            .checkNameAvailabilityWithResponse(
                new CheckNameAvailabilityParameters().withName("cacheName").withType("Microsoft.Cache/Redis"),
                Context.NONE);
    }
}
