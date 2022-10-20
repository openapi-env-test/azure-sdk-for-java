// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated.generated;

import com.azure.core.util.Context;

/** Samples for Redis ListUpgradeNotifications. */
public final class RedisListUpgradeNotificationsSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/stable/2022-05-01/examples/RedisCacheListUpgradeNotifications.json
     */
    /**
     * Sample code: RedisCacheListUpgradeNotifications.
     *
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheListUpgradeNotifications(
        com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.redis().listUpgradeNotifications("rg1", "cache1", 5000.0, Context.NONE);
    }
}
