// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for AvailableDelegations List. */
public final class AvailableDelegationsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/AvailableDelegationsSubscriptionGet.json
     */
    /**
     * Sample code: Get available delegations.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getAvailableDelegations(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.availableDelegations().list("westcentralus", Context.NONE);
    }
}
