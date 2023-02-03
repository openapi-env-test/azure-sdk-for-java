// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayIpConfigurationPropertiesFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/** IP configuration of an application gateway. Currently 1 public and 1 private IP configuration is allowed. */
@Fluent
public final class ApplicationGatewayIpConfiguration extends SubResource {
    /*
     * Properties of the application gateway IP configuration.
     */
    @JsonProperty(value = "properties")
    private ApplicationGatewayIpConfigurationPropertiesFormat innerProperties;

    /*
     * Name of the IP configuration that is unique within an Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /** Creates an instance of ApplicationGatewayIpConfiguration class. */
    public ApplicationGatewayIpConfiguration() {
    }

    /**
     * Get the innerProperties property: Properties of the application gateway IP configuration.
     *
     * @return the innerProperties value.
     */
    private ApplicationGatewayIpConfigurationPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the IP configuration that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the IP configuration that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayIpConfiguration object itself.
     */
    public ApplicationGatewayIpConfiguration withName(String name) {
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
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationGatewayIpConfiguration withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the subnet property: Reference to the subnet resource. A subnet from where application gateway gets its
     * private address.
     *
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.innerProperties() == null ? null : this.innerProperties().subnet();
    }

    /**
     * Set the subnet property: Reference to the subnet resource. A subnet from where application gateway gets its
     * private address.
     *
     * @param subnet the subnet value to set.
     * @return the ApplicationGatewayIpConfiguration object itself.
     */
    public ApplicationGatewayIpConfiguration withSubnet(SubResource subnet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayIpConfigurationPropertiesFormat();
        }
        this.innerProperties().withSubnet(subnet);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the application gateway IP configuration resource.
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
