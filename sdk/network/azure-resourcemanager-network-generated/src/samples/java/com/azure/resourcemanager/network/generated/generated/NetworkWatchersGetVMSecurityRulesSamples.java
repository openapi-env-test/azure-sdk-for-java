// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.models.SecurityGroupViewParameters;

/** Samples for NetworkWatchers GetVMSecurityRules. */
public final class NetworkWatchersGetVMSecurityRulesSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/NetworkWatcherSecurityGroupViewGet.json
     */
    /**
     * Sample code: Get security group view.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getSecurityGroupView(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .networkWatchers()
            .getVMSecurityRules(
                "rg1",
                "nw1",
                new SecurityGroupViewParameters()
                    .withTargetResourceId(
                        "/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Compute/virtualMachines/vm1"),
                Context.NONE);
    }
}
