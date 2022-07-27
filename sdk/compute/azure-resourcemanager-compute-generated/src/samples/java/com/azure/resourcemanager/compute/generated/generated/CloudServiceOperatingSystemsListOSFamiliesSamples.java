// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for CloudServiceOperatingSystems ListOSFamilies. */
public final class CloudServiceOperatingSystemsListOSFamiliesSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/CloudserviceRP/stable/2022-04-04/CloudServiceRP/examples/CloudServiceOSFamilies_List.json
     */
    /**
     * Sample code: List Cloud Service OS Families in a subscription.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listCloudServiceOSFamiliesInASubscription(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.cloudServiceOperatingSystems().listOSFamilies("westus2", Context.NONE);
    }
}
