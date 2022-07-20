// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.AddressSpace;
import com.azure.resourcemanager.network.generated.models.BgpSettings;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** A common class for general resource information. */
@Fluent
public final class LocalNetworkGatewayInner extends Resource {
    /*
     * Properties of the local network gateway.
     */
    @JsonProperty(value = "properties", required = true)
    private LocalNetworkGatewayPropertiesFormat innerProperties = new LocalNetworkGatewayPropertiesFormat();

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the innerProperties property: Properties of the local network gateway.
     *
     * @return the innerProperties value.
     */
    private LocalNetworkGatewayPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LocalNetworkGatewayInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LocalNetworkGatewayInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the localNetworkAddressSpace property: Local network site address space.
     *
     * @return the localNetworkAddressSpace value.
     */
    public AddressSpace localNetworkAddressSpace() {
        return this.innerProperties() == null ? null : this.innerProperties().localNetworkAddressSpace();
    }

    /**
     * Set the localNetworkAddressSpace property: Local network site address space.
     *
     * @param localNetworkAddressSpace the localNetworkAddressSpace value to set.
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withLocalNetworkAddressSpace(AddressSpace localNetworkAddressSpace) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LocalNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withLocalNetworkAddressSpace(localNetworkAddressSpace);
        return this;
    }

    /**
     * Get the gatewayIpAddress property: IP address of local network gateway.
     *
     * @return the gatewayIpAddress value.
     */
    public String gatewayIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().gatewayIpAddress();
    }

    /**
     * Set the gatewayIpAddress property: IP address of local network gateway.
     *
     * @param gatewayIpAddress the gatewayIpAddress value to set.
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withGatewayIpAddress(String gatewayIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LocalNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withGatewayIpAddress(gatewayIpAddress);
        return this;
    }

    /**
     * Get the fqdn property: FQDN of local network gateway.
     *
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.innerProperties() == null ? null : this.innerProperties().fqdn();
    }

    /**
     * Set the fqdn property: FQDN of local network gateway.
     *
     * @param fqdn the fqdn value to set.
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withFqdn(String fqdn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LocalNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withFqdn(fqdn);
        return this;
    }

    /**
     * Get the bgpSettings property: Local network gateway's BGP speaker settings.
     *
     * @return the bgpSettings value.
     */
    public BgpSettings bgpSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().bgpSettings();
    }

    /**
     * Set the bgpSettings property: Local network gateway's BGP speaker settings.
     *
     * @param bgpSettings the bgpSettings value to set.
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withBgpSettings(BgpSettings bgpSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LocalNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withBgpSettings(bgpSettings);
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the local network gateway resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Get the provisioningState property: The provisioning state of the local network gateway resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model LocalNetworkGatewayInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LocalNetworkGatewayInner.class);
}
