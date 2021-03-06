// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.resourcemanager.avs.models.PortMirroringDirectionEnum;

/** Samples for WorkloadNetworks CreatePortMirroring. */
public final class WorkloadNetworksCreatePortMirroringSamples {
    /**
     * Sample code: WorkloadNetworks_CreatePortMirroring.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void workloadNetworksCreatePortMirroring(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager
            .workloadNetworks()
            .definePortMirroring("portMirroring1")
            .withExistingPrivateCloud("group1", "cloud1")
            .withDisplayName("portMirroring1")
            .withDirection(PortMirroringDirectionEnum.fromString("BIDIRECTIONAL"))
            .withSource("vmGroup1")
            .withDestination("vmGroup2")
            .withRevision(1L)
            .create();
    }
}
