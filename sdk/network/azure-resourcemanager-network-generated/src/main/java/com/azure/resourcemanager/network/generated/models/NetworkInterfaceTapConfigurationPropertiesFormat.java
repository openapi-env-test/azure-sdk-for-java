// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceTapConfigurationPropertiesFormatInner;

/** An immutable client-side representation of NetworkInterfaceTapConfigurationPropertiesFormat. */
public interface NetworkInterfaceTapConfigurationPropertiesFormat {
    /**
     * Gets the virtualNetworkTap property: The reference to the Virtual Network Tap resource.
     *
     * @return the virtualNetworkTap value.
     */
    VirtualNetworkTap virtualNetworkTap();

    /**
     * Gets the provisioningState property: The provisioning state of the network interface tap configuration resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the inner
     * com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceTapConfigurationPropertiesFormatInner
     * object.
     *
     * @return the inner object.
     */
    NetworkInterfaceTapConfigurationPropertiesFormatInner innerModel();
}
