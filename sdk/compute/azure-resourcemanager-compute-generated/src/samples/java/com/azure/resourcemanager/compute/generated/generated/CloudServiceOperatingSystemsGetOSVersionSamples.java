// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for CloudServiceOperatingSystems GetOSVersion. */
public final class CloudServiceOperatingSystemsGetOSVersionSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-03-01/examples/GetCloudServiceOSVersion.json
     */
    /**
     * Sample code: Get Cloud Service OS Version.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getCloudServiceOSVersion(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .cloudServiceOperatingSystems()
            .getOSVersionWithResponse("westus2", "WA-GUEST-OS-3.90_202010-02", Context.NONE);
    }
}
