// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated.generated;

import com.azure.core.util.Context;

/** Samples for PrivateLinkResources ListByRedisCache. */
public final class PrivateLinkResourcesListByRedisCacheSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/stable/2021-06-01/examples/RedisCacheListPrivateLinkResources.json
     */
    /**
     * Sample code: StorageAccountListPrivateLinkResources.
     *
     * @param manager Entry point to RedisManager.
     */
    public static void storageAccountListPrivateLinkResources(
        com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.privateLinkResources().listByRedisCache("rgtest01", "cacheTest01", Context.NONE);
    }
}
