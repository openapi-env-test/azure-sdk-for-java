// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.releaseplannertest.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections Get. */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/releaseplannertest/resource-manager/Microsoft.AgFoodPlatform/preview/2021-09-01-preview/examples/PrivateEndpointConnections_Get.json
     */
    /**
     * Sample code: PrivateEndpointConnections_Get.
     *
     * @param manager Entry point to AgriFoodManager.
     */
    public static void privateEndpointConnectionsGet(
        com.azure.resourcemanager.releaseplannertest.AgriFoodManager manager) {
        manager
            .privateEndpointConnections()
            .getWithResponse(
                "examples-rg", "examples-farmbeatsResourceName", "privateEndpointConnectionName", Context.NONE);
    }
}
