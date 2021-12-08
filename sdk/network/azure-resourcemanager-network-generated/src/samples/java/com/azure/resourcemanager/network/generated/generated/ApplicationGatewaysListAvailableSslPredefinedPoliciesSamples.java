// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ApplicationGateways ListAvailableSslPredefinedPolicies. */
public final class ApplicationGatewaysListAvailableSslPredefinedPoliciesSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/ApplicationGatewayAvailableSslOptionsPredefinedPoliciesGet.json
     */
    /**
     * Sample code: Get Available Ssl Predefined Policies.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getAvailableSslPredefinedPolicies(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.applicationGateways().listAvailableSslPredefinedPolicies(Context.NONE);
    }
}
