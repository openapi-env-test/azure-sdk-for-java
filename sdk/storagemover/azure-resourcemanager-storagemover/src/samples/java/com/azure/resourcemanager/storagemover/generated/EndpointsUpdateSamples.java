// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storagemover.models.Endpoint;

/** Samples for Endpoints Update. */
public final class EndpointsUpdateSamples {
    /*
     * x-ms-original-file: specification/storagemover/resource-manager/Microsoft.StorageMover/preview/2022-07-01-preview/examples/Endpoints_Update.json
     */
    /**
     * Sample code: Endpoints_Update.
     *
     * @param manager Entry point to StorageMoverManager.
     */
    public static void endpointsUpdate(com.azure.resourcemanager.storagemover.StorageMoverManager manager) {
        Endpoint resource =
            manager
                .endpoints()
                .getWithResponse("examples-rg", "examples-storageMoverName", "examples-endpointName", Context.NONE)
                .getValue();
        resource.update().apply();
    }
}
