// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.models.NetworkIntentPolicyBasedService;
import java.util.Arrays;

/** Samples for SecurityAdminConfigurations CreateOrUpdate. */
public final class SecurityAdminConfigurationsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/NetworkManagerSecurityAdminConfigurationPut.json
     */
    /**
     * Sample code: Create network manager security admin configuration.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createNetworkManagerSecurityAdminConfiguration(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .securityAdminConfigurations()
            .define("myTestSecurityConfig")
            .withExistingNetworkManager("rg1", "testNetworkManager")
            .withDescription("A sample policy")
            .withApplyOnNetworkIntentPolicyBasedServices(Arrays.asList(NetworkIntentPolicyBasedService.NONE))
            .create();
    }
}
