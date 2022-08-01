// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.IpAllocationMethod;
import com.azure.resourcemanager.network.generated.models.IpVersion;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The private link service ip configuration. */
@Fluent
public final class PrivateLinkServiceIpConfigurationInner extends SubResource {
    /*
     * Properties of the private link service ip configuration.
     */
    @JsonProperty(value = "properties")
    private PrivateLinkServiceIpConfigurationPropertiesInner innerProperties;

    /*
     * The name of private link service ip configuration.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the innerProperties property: Properties of the private link service ip configuration.
     *
     * @return the innerProperties value.
     */
    private PrivateLinkServiceIpConfigurationPropertiesInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of private link service ip configuration.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of private link service ip configuration.
     *
     * @param name the name value to set.
     * @return the PrivateLinkServiceIpConfigurationInner object itself.
     */
    public PrivateLinkServiceIpConfigurationInner withName(String name) {
        this.name = name;
        return this;
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
     * Get the type property: The resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /** {@inheritDoc} */
    @Override
    public PrivateLinkServiceIpConfigurationInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the privateIpAddress property: The private IP address of the IP configuration.
     *
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIpAddress();
    }

    /**
     * Set the privateIpAddress property: The private IP address of the IP configuration.
     *
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the PrivateLinkServiceIpConfigurationInner object itself.
     */
    public PrivateLinkServiceIpConfigurationInner withPrivateIpAddress(String privateIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkServiceIpConfigurationPropertiesInner();
        }
        this.innerProperties().withPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * Get the privateIpAllocationMethod property: The private IP address allocation method.
     *
     * @return the privateIpAllocationMethod value.
     */
    public IpAllocationMethod privateIpAllocationMethod() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIpAllocationMethod();
    }

    /**
     * Set the privateIpAllocationMethod property: The private IP address allocation method.
     *
     * @param privateIpAllocationMethod the privateIpAllocationMethod value to set.
     * @return the PrivateLinkServiceIpConfigurationInner object itself.
     */
    public PrivateLinkServiceIpConfigurationInner withPrivateIpAllocationMethod(
        IpAllocationMethod privateIpAllocationMethod) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkServiceIpConfigurationPropertiesInner();
        }
        this.innerProperties().withPrivateIpAllocationMethod(privateIpAllocationMethod);
        return this;
    }

    /**
     * Get the subnet property: The reference to the subnet resource.
     *
     * @return the subnet value.
     */
    public SubnetInner subnet() {
        return this.innerProperties() == null ? null : this.innerProperties().subnet();
    }

    /**
     * Set the subnet property: The reference to the subnet resource.
     *
     * @param subnet the subnet value to set.
     * @return the PrivateLinkServiceIpConfigurationInner object itself.
     */
    public PrivateLinkServiceIpConfigurationInner withSubnet(SubnetInner subnet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkServiceIpConfigurationPropertiesInner();
        }
        this.innerProperties().withSubnet(subnet);
        return this;
    }

    /**
     * Get the primary property: Whether the ip configuration is primary or not.
     *
     * @return the primary value.
     */
    public Boolean primary() {
        return this.innerProperties() == null ? null : this.innerProperties().primary();
    }

    /**
     * Set the primary property: Whether the ip configuration is primary or not.
     *
     * @param primary the primary value to set.
     * @return the PrivateLinkServiceIpConfigurationInner object itself.
     */
    public PrivateLinkServiceIpConfigurationInner withPrimary(Boolean primary) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkServiceIpConfigurationPropertiesInner();
        }
        this.innerProperties().withPrimary(primary);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the private link service IP configuration resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the privateIpAddressVersion property: Whether the specific IP configuration is IPv4 or IPv6. Default is IPv4.
     *
     * @return the privateIpAddressVersion value.
     */
    public IpVersion privateIpAddressVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIpAddressVersion();
    }

    /**
     * Set the privateIpAddressVersion property: Whether the specific IP configuration is IPv4 or IPv6. Default is IPv4.
     *
     * @param privateIpAddressVersion the privateIpAddressVersion value to set.
     * @return the PrivateLinkServiceIpConfigurationInner object itself.
     */
    public PrivateLinkServiceIpConfigurationInner withPrivateIpAddressVersion(IpVersion privateIpAddressVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkServiceIpConfigurationPropertiesInner();
        }
        this.innerProperties().withPrivateIpAddressVersion(privateIpAddressVersion);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
