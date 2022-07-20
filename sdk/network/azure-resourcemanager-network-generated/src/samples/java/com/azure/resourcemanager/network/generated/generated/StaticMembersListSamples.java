// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for StaticMembers List. */
public final class StaticMembersListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/NetworkManagerStaticMemberList.json
     */
    /**
     * Sample code: StaticMembersList.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void staticMembersList(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.staticMembers().list("rg1", "testNetworkManager", "testNetworkGroup", null, null, Context.NONE);
    }
}
