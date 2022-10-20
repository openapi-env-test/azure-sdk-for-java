// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated.generated;

import com.azure.core.util.Context;

/** Samples for Redis GetByResourceGroup. */
public final class RedisGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/stable/2022-05-01/examples/RedisCacheGet.json
     */
    /**
     * Sample code: RedisCacheGet.
     *
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheGet(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.redis().getByResourceGroupWithResponse("rg1", "cache1", Context.NONE);
    }
}
