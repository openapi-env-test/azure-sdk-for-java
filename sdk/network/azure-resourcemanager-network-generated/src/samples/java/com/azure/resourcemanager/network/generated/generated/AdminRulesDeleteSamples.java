// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for AdminRules Delete. */
public final class AdminRulesDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/NetworkManagerAdminRuleDelete.json
     */
    /**
     * Sample code: Deletes an admin rule.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void deletesAnAdminRule(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .adminRules()
            .delete(
                "rg1",
                "testNetworkManager",
                "myTestSecurityConfig",
                "testRuleCollection",
                "SampleAdminRule",
                false,
                Context.NONE);
    }
}
