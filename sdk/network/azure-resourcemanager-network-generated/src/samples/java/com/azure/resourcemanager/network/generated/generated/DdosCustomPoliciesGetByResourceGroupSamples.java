// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for DdosCustomPolicies GetByResourceGroup. */
public final class DdosCustomPoliciesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/DdosCustomPolicyGet.json
     */
    /**
     * Sample code: Get DDoS custom policy.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getDDoSCustomPolicy(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.ddosCustomPolicies().getByResourceGroupWithResponse("rg1", "test-ddos-custom-policy", Context.NONE);
    }
}
