// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated.generated;

import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/stable/2022-05-01/examples/RedisCacheOperations.json
     */
    /**
     * Sample code: RedisCacheOperations.
     *
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheOperations(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.operations().list(Context.NONE);
    }
}
