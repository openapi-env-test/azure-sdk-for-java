// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.resourcemanager.recoveryservicessiterecovery.models.AddVCenterRequestProperties;

/** Samples for ReplicationvCenters Create. */
public final class ReplicationvCentersCreateSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-04-01/examples/ReplicationvCenters_Create.json
     */
    /**
     * Sample code: Add vCenter.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void addVCenter(com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .replicationvCenters()
            .define("esx-78")
            .withExistingReplicationFabric("MadhaviVault", "MadhaviVRG", "MadhaviFabric")
            .withProperties(
                new AddVCenterRequestProperties()
                    .withFriendlyName("esx-78")
                    .withIpAddress("inmtest78")
                    .withProcessServerId("5A720CAB-39CB-F445-BD1662B0B33164B5")
                    .withPort("443")
                    .withRunAsAccountId("2"))
            .create();
    }
}
