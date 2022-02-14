// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.models.AddressSpace;
import java.util.Arrays;

/** Samples for LocalNetworkGateways CreateOrUpdate. */
public final class LocalNetworkGatewaysCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/LocalNetworkGatewayCreate.json
     */
    /**
     * Sample code: CreateLocalNetworkGateway.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createLocalNetworkGateway(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .localNetworkGateways()
            .define("localgw")
            .withRegion("Central US")
            .withExistingResourceGroup("rg1")
            .withLocalNetworkAddressSpace(new AddressSpace().withAddressPrefixes(Arrays.asList("10.1.0.0/16")))
            .withGatewayIpAddress("11.12.13.14")
            .withFqdn("site1.contoso.com")
            .create();
    }
}
