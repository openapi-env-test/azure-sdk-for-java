// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.Context;

/** Samples for ReplicationProtectionContainerMappings Purge. */
public final class ReplicationProtectionContainerMappingsPurgeSamp {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-04-01/examples/ReplicationProtectionContainerMappings_Purge.json
     */
    /**
     * Sample code: Purge protection container mapping.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void purgeProtectionContainerMapping(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .replicationProtectionContainerMappings()
            .purge(
                "vault1",
                "resourceGroupPS1",
                "cloud1",
                "cloud_6d224fc6-f326-5d35-96de-fbf51efb3179",
                "cloud1protectionprofile1",
                Context.NONE);
    }
}
