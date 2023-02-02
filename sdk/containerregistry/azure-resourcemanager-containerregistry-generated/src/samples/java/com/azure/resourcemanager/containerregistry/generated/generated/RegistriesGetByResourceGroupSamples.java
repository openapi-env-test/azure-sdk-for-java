// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.generated;

import com.azure.core.util.Context;

/** Samples for Registries GetByResourceGroup. */
public final class RegistriesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-01-01-preview/examples/RegistryGet.json
     */
    /**
     * Sample code: RegistryGet.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registryGet(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.registries().getByResourceGroupWithResponse("myResourceGroup", "myRegistry", Context.NONE);
    }
}
