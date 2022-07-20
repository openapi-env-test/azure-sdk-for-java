// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for BgpServiceCommunities List. */
public final class BgpServiceCommunitiesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/ServiceCommunityList.json
     */
    /**
     * Sample code: ServiceCommunityList.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void serviceCommunityList(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.bgpServiceCommunities().list(Context.NONE);
    }
}
