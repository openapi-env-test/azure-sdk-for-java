// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for CloudServiceOperatingSystems GetOSFamily. */
public final class CloudServiceOperatingSystemsGetOSFamilySamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/CloudserviceRP/stable/2022-04-04/CloudServiceRP/examples/CloudServiceOSFamily_Get.json
     */
    /**
     * Sample code: Get Cloud Service OS Family.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getCloudServiceOSFamily(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.cloudServiceOperatingSystems().getOSFamilyWithResponse("westus2", "3", Context.NONE);
    }
}
