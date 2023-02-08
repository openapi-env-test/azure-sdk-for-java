// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

/** Samples for MoveCollections ListByResourceGroup. */
public final class MoveCollectionsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/resourcemover/resource-manager/Microsoft.Migrate/stable/2022-08-01/examples/MoveCollections_ListMoveCollectionsByResourceGroup.json
     */
    /**
     * Sample code: MoveCollections_ListMoveCollectionsByResourceGroup.
     *
     * @param manager Entry point to ResourceMoverManager.
     */
    public static void moveCollectionsListMoveCollectionsByResourceGroup(
        com.azure.resourcemanager.resourcemover.ResourceMoverManager manager) {
        manager.moveCollections().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
