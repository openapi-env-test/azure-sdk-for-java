// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayPrivateLinkConfigurationProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Private Link Configuration on an application gateway. */
@Fluent
public final class ApplicationGatewayPrivateLinkConfiguration extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayPrivateLinkConfiguration.class);

    /*
     * Properties of the application gateway private link configuration.
     */
    @JsonProperty(value = "properties")
    private ApplicationGatewayPrivateLinkConfigurationProperties innerProperties;

    /*
     * Name of the private link configuration that is unique within an
     * Application Gateway.
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

    /**
     * Get the innerProperties property: Properties of the application gateway private link configuration.
     *
     * @return the innerProperties value.
     */
    private ApplicationGatewayPrivateLinkConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the private link configuration that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the private link configuration that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayPrivateLinkConfiguration object itself.
     */
    public ApplicationGatewayPrivateLinkConfiguration withName(String name) {
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
    public ApplicationGatewayPrivateLinkConfiguration withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the ipConfigurations property: An array of application gateway private link ip configurations.
     *
     * @return the ipConfigurations value.
     */
    public List<ApplicationGatewayPrivateLinkIpConfiguration> ipConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().ipConfigurations();
    }

    /**
     * Set the ipConfigurations property: An array of application gateway private link ip configurations.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the ApplicationGatewayPrivateLinkConfiguration object itself.
     */
    public ApplicationGatewayPrivateLinkConfiguration withIpConfigurations(
        List<ApplicationGatewayPrivateLinkIpConfiguration> ipConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPrivateLinkConfigurationProperties();
        }
        this.innerProperties().withIpConfigurations(ipConfigurations);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the application gateway private link configuration.
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
