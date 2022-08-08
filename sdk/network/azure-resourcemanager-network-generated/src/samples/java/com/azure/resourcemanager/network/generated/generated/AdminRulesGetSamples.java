// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for AdminRules Get. */
public final class AdminRulesGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/NetworkManagerDefaultAdminRuleGet.json
     */
    /**
     * Sample code: Gets security default admin rule.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getsSecurityDefaultAdminRule(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .adminRules()
            .getWithResponse(
                "rg1",
                "testNetworkManager",
                "myTestSecurityConfig",
                "testRuleCollection",
                "SampleDefaultAdminRule",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/NetworkManagerAdminRuleGet.json
     */
    /**
     * Sample code: Gets security admin rule.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getsSecurityAdminRule(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .adminRules()
            .getWithResponse(
                "rg1",
                "testNetworkManager",
                "myTestSecurityConfig",
                "testRuleCollection",
                "SampleAdminRule",
                Context.NONE);
    }
}
