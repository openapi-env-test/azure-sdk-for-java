// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayOnDemandProbe;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayProtocol;

/** Samples for ApplicationGateways BackendHealthOnDemand. */
public final class ApplicationGatewaysBackendHealthOnDemandSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/ApplicationGatewayBackendHealthTest.json
     */
    /**
     * Sample code: Test Backend Health.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void testBackendHealth(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .applicationGateways()
            .backendHealthOnDemand(
                "rg1",
                "appgw",
                new ApplicationGatewayOnDemandProbe()
                    .withProtocol(ApplicationGatewayProtocol.HTTP)
                    .withPath("/")
                    .withTimeout(30)
                    .withPickHostnameFromBackendHttpSettings(true)
                    .withBackendAddressPool(
                        new SubResource()
                            .withId(
                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/applicationGateways/appgw/backendaddressPools/MFAnalyticsPool"))
                    .withBackendHttpSettings(
                        new SubResource()
                            .withId(
                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/applicationGateways/appgw/backendHttpSettingsCollection/MFPoolSettings")),
                null,
                Context.NONE);
    }
}
