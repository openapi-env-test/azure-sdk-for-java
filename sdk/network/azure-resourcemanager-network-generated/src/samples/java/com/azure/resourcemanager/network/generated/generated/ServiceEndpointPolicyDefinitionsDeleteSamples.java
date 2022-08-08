// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ServiceEndpointPolicyDefinitions Delete. */
public final class ServiceEndpointPolicyDefinitionsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/ServiceEndpointPolicyDefinitionDelete.json
     */
    /**
     * Sample code: Delete service endpoint policy definitions from service endpoint policy.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void deleteServiceEndpointPolicyDefinitionsFromServiceEndpointPolicy(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.serviceEndpointPolicyDefinitions().delete("rg1", "testPolicy", "testDefinition", Context.NONE);
    }
}
