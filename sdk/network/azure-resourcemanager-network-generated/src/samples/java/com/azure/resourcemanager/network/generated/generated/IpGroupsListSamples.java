// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for IpGroups List. */
public final class IpGroupsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/IpGroupsListBySubscription.json
     */
    /**
     * Sample code: List_IpGroups.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listIpGroups(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.ipGroups().list(Context.NONE);
    }
}
