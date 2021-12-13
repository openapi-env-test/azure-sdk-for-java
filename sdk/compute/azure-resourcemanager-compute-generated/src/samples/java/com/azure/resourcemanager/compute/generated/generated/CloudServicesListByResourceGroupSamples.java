// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for CloudServices ListByResourceGroup. */
public final class CloudServicesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-03-01/examples/ListCloudServicesInResourceGroup.json
     */
    /**
     * Sample code: List Cloud Services in a Resource Group.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listCloudServicesInAResourceGroup(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.cloudServices().listByResourceGroup("ConstosoRG", Context.NONE);
    }
}
