// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmesh.generated;

/** Samples for Secret Delete. */
public final class SecretDeleteSamples {
    /*
     * x-ms-original-file: specification/servicefabricmesh/resource-manager/Microsoft.ServiceFabricMesh/preview/2018-09-01-preview/examples/secrets/delete.json
     */
    /**
     * Sample code: DeleteSecret.
     *
     * @param manager Entry point to ServiceFabricMeshManager.
     */
    public static void deleteSecret(com.azure.resourcemanager.servicefabricmesh.ServiceFabricMeshManager manager) {
        manager
            .secrets()
            .deleteByResourceGroupWithResponse("sbz_demo", "dbConnectionString", com.azure.core.util.Context.NONE);
    }
}
