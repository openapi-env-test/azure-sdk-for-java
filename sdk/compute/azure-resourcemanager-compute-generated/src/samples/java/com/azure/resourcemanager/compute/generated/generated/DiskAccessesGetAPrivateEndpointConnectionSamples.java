// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for DiskAccesses GetAPrivateEndpointConnection. */
public final class DiskAccessesGetAPrivateEndpointConnectionSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-12-01/examples/GetInformationAboutAPrivateEndpointConnection.json
     */
    /**
     * Sample code: Get information about a private endpoint connection under a disk access resource.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getInformationAboutAPrivateEndpointConnectionUnderADiskAccessResource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .diskAccesses()
            .getAPrivateEndpointConnectionWithResponse(
                "myResourceGroup", "myDiskAccess", "myPrivateEndpointConnection", Context.NONE);
    }
}
