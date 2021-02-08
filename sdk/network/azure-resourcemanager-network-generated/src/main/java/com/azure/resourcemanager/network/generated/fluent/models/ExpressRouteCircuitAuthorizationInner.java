// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.AuthorizationUseStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Authorization in a ExpressRouteCircuit resource. */
@JsonFlatten
@Fluent
public class ExpressRouteCircuitAuthorizationInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteCircuitAuthorizationInner.class);

    /*
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Gets or sets the authorization key
     */
    @JsonProperty(value = "properties.authorizationKey")
    private String authorizationKey;

    /*
     * Gets or sets AuthorizationUseStatus
     */
    @JsonProperty(value = "properties.authorizationUseStatus")
    private AuthorizationUseStatus authorizationUseStatus;

    /*
     * Gets or sets Provisioning state of the PublicIP resource
     * Updating/Deleting/Failed
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the name property: Gets name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets name of the resource that is unique within a resource group. This name can be used to
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
     * Set the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the ExpressRouteCircuitAuthorizationInner object itself.
     */
    public ExpressRouteCircuitAuthorizationInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the authorizationKey property: Gets or sets the authorization key.
     *
     * @return the authorizationKey value.
     */
    public String authorizationKey() {
        return this.authorizationKey;
    }

    /**
     * Set the authorizationKey property: Gets or sets the authorization key.
     *
     * @param authorizationKey the authorizationKey value to set.
     * @return the ExpressRouteCircuitAuthorizationInner object itself.
     */
    public ExpressRouteCircuitAuthorizationInner withAuthorizationKey(String authorizationKey) {
        this.authorizationKey = authorizationKey;
        return this;
    }

    /**
     * Get the authorizationUseStatus property: Gets or sets AuthorizationUseStatus.
     *
     * @return the authorizationUseStatus value.
     */
    public AuthorizationUseStatus authorizationUseStatus() {
        return this.authorizationUseStatus;
    }

    /**
     * Set the authorizationUseStatus property: Gets or sets AuthorizationUseStatus.
     *
     * @param authorizationUseStatus the authorizationUseStatus value to set.
     * @return the ExpressRouteCircuitAuthorizationInner object itself.
     */
    public ExpressRouteCircuitAuthorizationInner withAuthorizationUseStatus(
        AuthorizationUseStatus authorizationUseStatus) {
        this.authorizationUseStatus = authorizationUseStatus;
        return this;
    }

    /**
     * Get the provisioningState property: Gets or sets Provisioning state of the PublicIP resource
     * Updating/Deleting/Failed.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Gets or sets Provisioning state of the PublicIP resource
     * Updating/Deleting/Failed.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ExpressRouteCircuitAuthorizationInner object itself.
     */
    public ExpressRouteCircuitAuthorizationInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExpressRouteCircuitAuthorizationInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
