// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for PrivateDnsZoneGroups Delete. */
public final class PrivateDnsZoneGroupsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/PrivateEndpointDnsZoneGroupDelete.json
     */
    /**
     * Sample code: Delete private dns zone group.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void deletePrivateDnsZoneGroup(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.privateDnsZoneGroups().delete("rg1", "testPe", "testPdnsgroup", com.azure.core.util.Context.NONE);
    }
}
