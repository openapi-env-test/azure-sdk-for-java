// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

/** Samples for MoveCollections Delete. */
public final class MoveCollectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/resourcemover/resource-manager/Microsoft.Migrate/stable/2022-08-01/examples/MoveCollections_Delete.json
     */
    /**
     * Sample code: MoveCollections_Delete.
     *
     * @param manager Entry point to ResourceMoverManager.
     */
    public static void moveCollectionsDelete(com.azure.resourcemanager.resourcemover.ResourceMoverManager manager) {
        manager.moveCollections().delete("rg1", "movecollection1", com.azure.core.util.Context.NONE);
    }
}
