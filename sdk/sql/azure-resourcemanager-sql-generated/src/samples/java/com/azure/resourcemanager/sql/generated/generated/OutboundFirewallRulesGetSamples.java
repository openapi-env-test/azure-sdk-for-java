// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for OutboundFirewallRules Get. */
public final class OutboundFirewallRulesGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2021-02-01-preview/examples/OutboundFirewallRuleGet.json
     */
    /**
     * Sample code: Gets outbound firewall rule.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void getsOutboundFirewallRule(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .outboundFirewallRules()
            .getWithResponse("sqlcrudtest-7398", "sqlcrudtest-4645", "server.database.windows.net", Context.NONE);
    }
}
