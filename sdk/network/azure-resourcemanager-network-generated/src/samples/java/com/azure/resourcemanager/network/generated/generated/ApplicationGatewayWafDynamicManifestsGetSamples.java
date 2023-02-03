// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ApplicationGatewayWafDynamicManifests Get. */
public final class ApplicationGatewayWafDynamicManifestsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/GetApplicationGatewayWafDynamicManifests.json
     */
    /**
     * Sample code: Gets WAF manifests.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getsWAFManifests(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.applicationGatewayWafDynamicManifests().get("westus", Context.NONE);
    }
}
