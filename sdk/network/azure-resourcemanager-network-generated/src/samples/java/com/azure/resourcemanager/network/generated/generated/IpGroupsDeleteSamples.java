// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for IpGroups Delete. */
public final class IpGroupsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/IpGroupsDelete.json
     */
    /**
     * Sample code: Delete_IpGroups.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void deleteIpGroups(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.ipGroups().delete("myResourceGroup", "ipGroups1", com.azure.core.util.Context.NONE);
    }
}
