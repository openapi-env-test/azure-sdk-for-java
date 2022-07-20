// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for NetworkProfiles List. */
public final class NetworkProfilesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/NetworkProfileListAll.json
     */
    /**
     * Sample code: List all network profiles.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listAllNetworkProfiles(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkProfiles().list(Context.NONE);
    }
}
