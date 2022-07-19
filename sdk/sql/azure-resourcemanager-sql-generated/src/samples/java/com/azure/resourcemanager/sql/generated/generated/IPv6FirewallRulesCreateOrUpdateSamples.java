// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.models.IPv6FirewallRule;

/** Samples for IPv6FirewallRules CreateOrUpdate. */
public final class IPv6FirewallRulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2021-11-01-preview/examples/IPv6FirewallRuleCreate.json
     */
    /**
     * Sample code: Create an IPv6 firewall rule max/min.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void createAnIPv6FirewallRuleMaxMin(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .iPv6FirewallRules()
            .define("firewallrulecrudtest-5370")
            .withExistingServer("firewallrulecrudtest-12", "firewallrulecrudtest-6285")
            .withStartIPv6Address("0000:0000:0000:0000:0000:ffff:0000:0003")
            .withEndIPv6Address("0000:0000:0000:0000:0000:ffff:0000:0003")
            .create();
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2021-11-01-preview/examples/IPv6FirewallRuleUpdate.json
     */
    /**
     * Sample code: Update an IPv6 firewall rule max/min.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void updateAnIPv6FirewallRuleMaxMin(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        IPv6FirewallRule resource =
            manager
                .iPv6FirewallRules()
                .getWithResponse(
                    "firewallrulecrudtest-12", "firewallrulecrudtest-6285", "firewallrulecrudtest-3927", Context.NONE)
                .getValue();
        resource
            .update()
            .withStartIPv6Address("0000:0000:0000:0000:0000:ffff:0000:0001")
            .withEndIPv6Address("0000:0000:0000:0000:0000:ffff:0000:0001")
            .apply();
    }
}
