// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.models.AddressSpace;
import com.azure.resourcemanager.network.generated.models.BgpSettings;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LocalNetworkGateway properties. */
@Fluent
public final class LocalNetworkGatewayPropertiesFormat {
    /*
     * Local network site address space.
     */
    @JsonProperty(value = "localNetworkAddressSpace")
    private AddressSpace localNetworkAddressSpace;

    /*
     * IP address of local network gateway.
     */
    @JsonProperty(value = "gatewayIpAddress")
    private String gatewayIpAddress;

    /*
     * FQDN of local network gateway.
     */
    @JsonProperty(value = "fqdn")
    private String fqdn;

    /*
     * Local network gateway's BGP speaker settings.
     */
    @JsonProperty(value = "bgpSettings")
    private BgpSettings bgpSettings;

    /*
     * The resource GUID property of the local network gateway resource.
     */
    @JsonProperty(value = "resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the local network gateway resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the localNetworkAddressSpace property: Local network site address space.
     *
     * @return the localNetworkAddressSpace value.
     */
    public AddressSpace localNetworkAddressSpace() {
        return this.localNetworkAddressSpace;
    }

    /**
     * Set the localNetworkAddressSpace property: Local network site address space.
     *
     * @param localNetworkAddressSpace the localNetworkAddressSpace value to set.
     * @return the LocalNetworkGatewayPropertiesFormat object itself.
     */
    public LocalNetworkGatewayPropertiesFormat withLocalNetworkAddressSpace(AddressSpace localNetworkAddressSpace) {
        this.localNetworkAddressSpace = localNetworkAddressSpace;
        return this;
    }

    /**
     * Get the gatewayIpAddress property: IP address of local network gateway.
     *
     * @return the gatewayIpAddress value.
     */
    public String gatewayIpAddress() {
        return this.gatewayIpAddress;
    }

    /**
     * Set the gatewayIpAddress property: IP address of local network gateway.
     *
     * @param gatewayIpAddress the gatewayIpAddress value to set.
     * @return the LocalNetworkGatewayPropertiesFormat object itself.
     */
    public LocalNetworkGatewayPropertiesFormat withGatewayIpAddress(String gatewayIpAddress) {
        this.gatewayIpAddress = gatewayIpAddress;
        return this;
    }

    /**
     * Get the fqdn property: FQDN of local network gateway.
     *
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Set the fqdn property: FQDN of local network gateway.
     *
     * @param fqdn the fqdn value to set.
     * @return the LocalNetworkGatewayPropertiesFormat object itself.
     */
    public LocalNetworkGatewayPropertiesFormat withFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Get the bgpSettings property: Local network gateway's BGP speaker settings.
     *
     * @return the bgpSettings value.
     */
    public BgpSettings bgpSettings() {
        return this.bgpSettings;
    }

    /**
     * Set the bgpSettings property: Local network gateway's BGP speaker settings.
     *
     * @param bgpSettings the bgpSettings value to set.
     * @return the LocalNetworkGatewayPropertiesFormat object itself.
     */
    public LocalNetworkGatewayPropertiesFormat withBgpSettings(BgpSettings bgpSettings) {
        this.bgpSettings = bgpSettings;
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the local network gateway resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the local network gateway resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (localNetworkAddressSpace() != null) {
            localNetworkAddressSpace().validate();
        }
        if (bgpSettings() != null) {
            bgpSettings().validate();
        }
    }
}
