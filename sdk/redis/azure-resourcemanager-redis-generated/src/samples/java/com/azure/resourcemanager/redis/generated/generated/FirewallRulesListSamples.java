// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated.generated;

import com.azure.core.util.Context;

/** Samples for FirewallRules List. */
public final class FirewallRulesListSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/stable/2022-05-01/examples/RedisCacheFirewallRulesList.json
     */
    /**
     * Sample code: RedisCacheFirewallRulesList.
     *
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheFirewallRulesList(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.firewallRules().list("rg1", "cache1", Context.NONE);
    }
}
