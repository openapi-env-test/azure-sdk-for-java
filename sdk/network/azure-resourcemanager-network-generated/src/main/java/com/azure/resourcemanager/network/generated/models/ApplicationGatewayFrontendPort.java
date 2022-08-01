// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayFrontendPortPropertiesFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Frontend port of an application gateway. */
@Fluent
public final class ApplicationGatewayFrontendPort extends SubResource {
    /*
     * Properties of the application gateway frontend port.
     */
    @JsonProperty(value = "properties")
    private ApplicationGatewayFrontendPortPropertiesFormat innerProperties;

    /*
     * Name of the frontend port that is unique within an Application Gateway.
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
     * Get the innerProperties property: Properties of the application gateway frontend port.
     *
     * @return the innerProperties value.
     */
    private ApplicationGatewayFrontendPortPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the frontend port that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the frontend port that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayFrontendPort object itself.
     */
    public ApplicationGatewayFrontendPort withName(String name) {
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
    public ApplicationGatewayFrontendPort withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the port property: Frontend port.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.innerProperties() == null ? null : this.innerProperties().port();
    }

    /**
     * Set the port property: Frontend port.
     *
     * @param port the port value to set.
     * @return the ApplicationGatewayFrontendPort object itself.
     */
    public ApplicationGatewayFrontendPort withPort(Integer port) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayFrontendPortPropertiesFormat();
        }
        this.innerProperties().withPort(port);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the frontend port resource.
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
