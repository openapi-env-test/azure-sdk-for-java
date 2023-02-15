// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmesh.generated;

/** Samples for Volume Delete. */
public final class VolumeDeleteSamples {
    /*
     * x-ms-original-file: specification/servicefabricmesh/resource-manager/Microsoft.ServiceFabricMesh/preview/2018-09-01-preview/examples/volumes/delete.json
     */
    /**
     * Sample code: DeleteVolume.
     *
     * @param manager Entry point to ServiceFabricMeshManager.
     */
    public static void deleteVolume(com.azure.resourcemanager.servicefabricmesh.ServiceFabricMeshManager manager) {
        manager
            .volumes()
            .deleteByResourceGroupWithResponse("sbz_demo", "sampleVolume", com.azure.core.util.Context.NONE);
    }
}
