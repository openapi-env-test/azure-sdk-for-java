// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.AuthorizationUseStatus;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Authorization in an ExpressRouteCircuit resource. */
@Fluent
public final class ExpressRouteCircuitAuthorizationInner extends SubResource {
    /*
     * Properties of the express route circuit authorization.
     */
    @JsonProperty(value = "properties")
    private AuthorizationPropertiesFormat innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
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
     * Get the innerProperties property: Properties of the express route circuit authorization.
     *
     * @return the innerProperties value.
     */
    private AuthorizationPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the ExpressRouteCircuitAuthorizationInner object itself.
     */
    public ExpressRouteCircuitAuthorizationInner withName(String name) {
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
    public ExpressRouteCircuitAuthorizationInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the authorizationKey property: The authorization key.
     *
     * @return the authorizationKey value.
     */
    public String authorizationKey() {
        return this.innerProperties() == null ? null : this.innerProperties().authorizationKey();
    }

    /**
     * Set the authorizationKey property: The authorization key.
     *
     * @param authorizationKey the authorizationKey value to set.
     * @return the ExpressRouteCircuitAuthorizationInner object itself.
     */
    public ExpressRouteCircuitAuthorizationInner withAuthorizationKey(String authorizationKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationPropertiesFormat();
        }
        this.innerProperties().withAuthorizationKey(authorizationKey);
        return this;
    }

    /**
     * Get the authorizationUseStatus property: The authorization use status.
     *
     * @return the authorizationUseStatus value.
     */
    public AuthorizationUseStatus authorizationUseStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().authorizationUseStatus();
    }

    /**
     * Set the authorizationUseStatus property: The authorization use status.
     *
     * @param authorizationUseStatus the authorizationUseStatus value to set.
     * @return the ExpressRouteCircuitAuthorizationInner object itself.
     */
    public ExpressRouteCircuitAuthorizationInner withAuthorizationUseStatus(
        AuthorizationUseStatus authorizationUseStatus) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationPropertiesFormat();
        }
        this.innerProperties().withAuthorizationUseStatus(authorizationUseStatus);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the authorization resource.
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
