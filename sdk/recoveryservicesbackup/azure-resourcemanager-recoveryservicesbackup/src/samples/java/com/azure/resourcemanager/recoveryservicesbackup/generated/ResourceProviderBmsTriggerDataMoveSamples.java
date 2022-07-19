// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesbackup.models.DataMoveLevel;
import com.azure.resourcemanager.recoveryservicesbackup.models.TriggerDataMoveRequest;

/** Samples for ResourceProvider BmsTriggerDataMove. */
public final class ResourceProviderBmsTriggerDataMoveSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/preview/2022-06-01-preview/examples/BackupDataMove/TriggerDataMove_Post.json
     */
    /**
     * Sample code: Trigger Data Move.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void triggerDataMove(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .resourceProviders()
            .bmsTriggerDataMove(
                "target-rsv",
                "targetRG",
                new TriggerDataMoveRequest()
                    .withSourceResourceId(
                        "/subscriptions/04cf684a-d41f-4550-9f70-7708a3a2283b/resourceGroups/sourceRG/providers/Microsoft.RecoveryServices/vaults/source-rsv")
                    .withSourceRegion("USGov Iowa")
                    .withDataMoveLevel(DataMoveLevel.VAULT)
                    .withCorrelationId("MTg2OTcyMzM4NzYyMjc1NDY3Nzs1YmUzYmVmNi04YjJiLTRhOTItOTllYi01NTM0MDllYjk2NjE="),
                Context.NONE);
    }
}
