/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VpnServerConfigurations list associated with VirtualWan Response.
 */
public class VpnServerConfigurationsResponseInner {
    /**
     * List of VpnServerConfigurations associated with VirtualWan.
     */
    @JsonProperty(value = "vpnServerConfigurationResourceIds")
    private List<String> vpnServerConfigurationResourceIds;

    /**
     * Get list of VpnServerConfigurations associated with VirtualWan.
     *
     * @return the vpnServerConfigurationResourceIds value
     */
    public List<String> vpnServerConfigurationResourceIds() {
        return this.vpnServerConfigurationResourceIds;
    }

    /**
     * Set list of VpnServerConfigurations associated with VirtualWan.
     *
     * @param vpnServerConfigurationResourceIds the vpnServerConfigurationResourceIds value to set
     * @return the VpnServerConfigurationsResponseInner object itself.
     */
    public VpnServerConfigurationsResponseInner withVpnServerConfigurationResourceIds(List<String> vpnServerConfigurationResourceIds) {
        this.vpnServerConfigurationResourceIds = vpnServerConfigurationResourceIds;
        return this;
    }

}
