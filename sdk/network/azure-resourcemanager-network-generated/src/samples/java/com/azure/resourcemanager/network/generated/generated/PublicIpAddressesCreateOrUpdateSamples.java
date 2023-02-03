// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.models.IpAllocationMethod;
import com.azure.resourcemanager.network.generated.models.IpVersion;
import com.azure.resourcemanager.network.generated.models.PublicIpAddressDnsSettings;
import com.azure.resourcemanager.network.generated.models.PublicIpAddressSku;
import com.azure.resourcemanager.network.generated.models.PublicIpAddressSkuName;
import com.azure.resourcemanager.network.generated.models.PublicIpAddressSkuTier;

/** Samples for PublicIpAddresses CreateOrUpdate. */
public final class PublicIpAddressesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/PublicIpAddressCreateDns.json
     */
    /**
     * Sample code: Create public IP address DNS.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createPublicIPAddressDNS(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .publicIpAddresses()
            .define("test-ip")
            .withRegion("eastus")
            .withExistingResourceGroup("rg1")
            .withDnsSettings(new PublicIpAddressDnsSettings().withDomainNameLabel("dnslbl"))
            .create();
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/PublicIpAddressCreateCustomizedValues.json
     */
    /**
     * Sample code: Create public IP address allocation method.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createPublicIPAddressAllocationMethod(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .publicIpAddresses()
            .define("test-ip")
            .withRegion("eastus")
            .withExistingResourceGroup("rg1")
            .withSku(
                new PublicIpAddressSku()
                    .withName(PublicIpAddressSkuName.STANDARD)
                    .withTier(PublicIpAddressSkuTier.GLOBAL))
            .withPublicIpAllocationMethod(IpAllocationMethod.STATIC)
            .withPublicIpAddressVersion(IpVersion.IPV4)
            .withIdleTimeoutInMinutes(10)
            .create();
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/PublicIpAddressCreateDefaults.json
     */
    /**
     * Sample code: Create public IP address defaults.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createPublicIPAddressDefaults(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.publicIpAddresses().define("test-ip").withRegion("eastus").withExistingResourceGroup("rg1").create();
    }
}
