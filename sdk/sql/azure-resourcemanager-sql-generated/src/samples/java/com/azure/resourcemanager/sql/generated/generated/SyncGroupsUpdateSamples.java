// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.models.SyncConflictResolutionPolicy;
import com.azure.resourcemanager.sql.generated.models.SyncGroup;

/** Samples for SyncGroups Update. */
public final class SyncGroupsUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/SyncGroupPatch.json
     */
    /**
     * Sample code: Update a sync group.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void updateASyncGroup(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        SyncGroup resource =
            manager
                .syncGroups()
                .getWithResponse(
                    "syncgroupcrud-65440",
                    "syncgroupcrud-8475",
                    "syncgroupcrud-4328",
                    "syncgroupcrud-3187",
                    Context.NONE)
                .getValue();
        resource
            .update()
            .withInterval(-1)
            .withConflictResolutionPolicy(SyncConflictResolutionPolicy.HUB_WIN)
            .withSyncDatabaseId(
                "/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/syncgroupcrud-3521/providers/Microsoft.Sql/servers/syncgroupcrud-8475/databases/syncgroupcrud-4328")
            .withHubDatabaseUsername("hubUser")
            .withHubDatabasePassword("hubPassword")
            .withUsePrivateLinkConnection(true)
            .apply();
    }
}
