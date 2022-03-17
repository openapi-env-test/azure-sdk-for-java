// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.fluent.models.ServiceEndpointPolicyDefinitionInner;
import java.util.Arrays;

/** Samples for ServiceEndpointPolicies CreateOrUpdate. */
public final class ServiceEndpointPoliciesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/ServiceEndpointPolicyCreate.json
     */
    /**
     * Sample code: Create service endpoint policy.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createServiceEndpointPolicy(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .serviceEndpointPolicies()
            .define("testPolicy")
            .withRegion("westus")
            .withExistingResourceGroup("rg1")
            .create();
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/ServiceEndpointPolicyCreateWithDefinition.json
     */
    /**
     * Sample code: Create service endpoint policy with definition.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createServiceEndpointPolicyWithDefinition(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .serviceEndpointPolicies()
            .define("testPolicy")
            .withRegion("westus")
            .withExistingResourceGroup("rg1")
            .withServiceEndpointPolicyDefinitions(
                Arrays
                    .asList(
                        new ServiceEndpointPolicyDefinitionInner()
                            .withName("StorageServiceEndpointPolicyDefinition")
                            .withDescription("Storage Service EndpointPolicy Definition")
                            .withService("Microsoft.Storage")
                            .withServiceResources(
                                Arrays
                                    .asList(
                                        "/subscriptions/subid1",
                                        "/subscriptions/subid1/resourceGroups/storageRg",
                                        "/subscriptions/subid1/resourceGroups/storageRg/providers/Microsoft.Storage/storageAccounts/stAccount"))))
            .create();
    }
}
