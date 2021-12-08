// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.models.SessionIds;

/** Samples for ResourceProvider DisconnectActiveSessions. */
public final class ResourceProviderDisconnectActiveSessionsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/BastionSessionDelete.json
     */
    /**
     * Sample code: Deletes the specified active session.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void deletesTheSpecifiedActiveSession(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .resourceProviders()
            .disconnectActiveSessions("rg1", "bastionhosttenant", new SessionIds(), Context.NONE);
    }
}
