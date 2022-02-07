// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for IpGroups ListByResourceGroup. */
public final class IpGroupsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/IpGroupsListByResourceGroup.json
     */
    /**
     * Sample code: ListByResourceGroup_IpGroups.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listByResourceGroupIpGroups(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.ipGroups().listByResourceGroup("myResourceGroup", Context.NONE);
    }
}
