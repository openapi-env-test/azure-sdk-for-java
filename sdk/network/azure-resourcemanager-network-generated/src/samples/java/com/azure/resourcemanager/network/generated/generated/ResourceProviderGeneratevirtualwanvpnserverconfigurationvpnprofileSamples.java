// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.models.AuthenticationMethod;
import com.azure.resourcemanager.network.generated.models.VirtualWanVpnProfileParameters;

/** Samples for ResourceProvider Generatevirtualwanvpnserverconfigurationvpnprofile. */
public final class ResourceProviderGeneratevirtualwanvpnserverconfigurationvpnprofileSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/GenerateVirtualWanVpnServerConfigurationVpnProfile.json
     */
    /**
     * Sample code: GenerateVirtualWanVpnServerConfigurationVpnProfile.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void generateVirtualWanVpnServerConfigurationVpnProfile(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .resourceProviders()
            .generatevirtualwanvpnserverconfigurationvpnprofile(
                "rg1",
                "wan1",
                new VirtualWanVpnProfileParameters()
                    .withVpnServerConfigurationResourceId(
                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/vpnServerConfigurations/vpnconfig1")
                    .withAuthenticationMethod(AuthenticationMethod.EAPTLS),
                Context.NONE);
    }
}
