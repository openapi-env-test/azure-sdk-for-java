// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.redis.generated.models.RedisKeyType;
import com.azure.resourcemanager.redis.generated.models.RedisRegenerateKeyParameters;

/** Samples for Redis RegenerateKey. */
public final class RedisRegenerateKeySamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/stable/2021-06-01/examples/RedisCacheRegenerateKey.json
     */
    /**
     * Sample code: RedisCacheRegenerateKey.
     *
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheRegenerateKey(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager
            .redis()
            .regenerateKeyWithResponse(
                "rg1", "cache1", new RedisRegenerateKeyParameters().withKeyType(RedisKeyType.PRIMARY), Context.NONE);
    }
}
