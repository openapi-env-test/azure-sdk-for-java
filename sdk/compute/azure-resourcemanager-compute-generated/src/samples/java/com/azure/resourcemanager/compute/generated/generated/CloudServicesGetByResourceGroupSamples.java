// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for CloudServices GetByResourceGroup. */
public final class CloudServicesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-03-01/examples/GetCloudServiceWithMultiRoleAndRDP.json
     */
    /**
     * Sample code: Get Cloud Service with Multiple Roles and RDP Extension.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getCloudServiceWithMultipleRolesAndRDPExtension(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.cloudServices().getByResourceGroupWithResponse("ConstosoRG", "{cs-name}", Context.NONE);
    }
}
