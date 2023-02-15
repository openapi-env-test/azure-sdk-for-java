// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for Usages List. */
public final class UsagesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/UsageList.json
     */
    /**
     * Sample code: List usages.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listUsages(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.usages().list("westus", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/UsageListSpacedLocation.json
     */
    /**
     * Sample code: List usages spaced location.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listUsagesSpacedLocation(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.usages().list("West US", com.azure.core.util.Context.NONE);
    }
}
