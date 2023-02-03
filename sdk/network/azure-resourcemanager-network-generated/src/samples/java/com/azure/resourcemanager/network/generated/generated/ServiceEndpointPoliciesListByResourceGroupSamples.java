// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ServiceEndpointPolicies ListByResourceGroup. */
public final class ServiceEndpointPoliciesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/ServiceEndpointPolicyList.json
     */
    /**
     * Sample code: List resource group service endpoint policies.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listResourceGroupServiceEndpointPolicies(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.serviceEndpointPolicies().listByResourceGroup("rg1", Context.NONE);
    }
}
