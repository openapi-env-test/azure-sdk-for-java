// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

/** Samples for FirewallRules CreateOrUpdate. */
public final class FirewallRulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/stable/2017-12-01/examples/FirewallRuleCreate.json
     */
    /**
     * Sample code: FirewallRuleCreate.
     *
     * @param manager Entry point to MySqlManager.
     */
    public static void firewallRuleCreate(com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        manager
            .firewallRules()
            .define("rule1")
            .withExistingServer("TestGroup", "testserver")
            .withStartIpAddress("0.0.0.0")
            .withEndIpAddress("255.255.255.255")
            .create();
    }
}
