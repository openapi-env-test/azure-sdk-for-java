// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for PrivateLinkServices List. */
public final class PrivateLinkServicesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/PrivateLinkServiceListAll.json
     */
    /**
     * Sample code: List all private list service.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listAllPrivateListService(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.privateLinkServices().list(Context.NONE);
    }
}
