// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for DscpConfiguration Delete. */
public final class DscpConfigurationDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/DscpConfigurationDelete.json
     */
    /**
     * Sample code: Delete DSCP Configuration.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void deleteDSCPConfiguration(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.dscpConfigurations().delete("rg1", "mydscpConfig", Context.NONE);
    }
}
