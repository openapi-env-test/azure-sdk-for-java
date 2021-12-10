// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for CloudServices GetInstanceView. */
public final class CloudServicesGetInstanceViewSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-03-01/examples/GetCloudServiceInstanceViewWithMultiRole.json
     */
    /**
     * Sample code: Get Cloud Service Instance View with Multiple Roles.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getCloudServiceInstanceViewWithMultipleRoles(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.cloudServices().getInstanceViewWithResponse("ConstosoRG", "{cs-name}", Context.NONE);
    }
}
