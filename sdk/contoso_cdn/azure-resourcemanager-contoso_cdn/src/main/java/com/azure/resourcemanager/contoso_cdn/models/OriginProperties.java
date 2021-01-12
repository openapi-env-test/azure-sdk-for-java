// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.contoso_cdn.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JSON object that contains the properties of the origin. */
@Immutable
public final class OriginProperties extends OriginUpdatePropertiesParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OriginProperties.class);

    /*
     * Resource status of the origin.
     */
    @JsonProperty(value = "resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private OriginResourceState resourceState;

    /*
     * Provisioning status of the origin.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The approval status for the connection to the Private Link
     */
    @JsonProperty(value = "privateEndpointStatus", access = JsonProperty.Access.WRITE_ONLY)
    private PrivateEndpointStatus privateEndpointStatus;

    /**
     * Get the resourceState property: Resource status of the origin.
     *
     * @return the resourceState value.
     */
    public OriginResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get the provisioningState property: Provisioning status of the origin.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the privateEndpointStatus property: The approval status for the connection to the Private Link.
     *
     * @return the privateEndpointStatus value.
     */
    public PrivateEndpointStatus privateEndpointStatus() {
        return this.privateEndpointStatus;
    }

    /** {@inheritDoc} */
    @Override
    public OriginProperties withHostname(String hostname) {
        super.withHostname(hostname);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OriginProperties withHttpPort(Integer httpPort) {
        super.withHttpPort(httpPort);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OriginProperties withHttpsPort(Integer httpsPort) {
        super.withHttpsPort(httpsPort);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OriginProperties withOriginHostHeader(String originHostHeader) {
        super.withOriginHostHeader(originHostHeader);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OriginProperties withPriority(Integer priority) {
        super.withPriority(priority);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OriginProperties withWeight(Integer weight) {
        super.withWeight(weight);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OriginProperties withEnabled(Boolean enabled) {
        super.withEnabled(enabled);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OriginProperties withPrivateLinkAlias(String privateLinkAlias) {
        super.withPrivateLinkAlias(privateLinkAlias);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OriginProperties withPrivateLinkResourceId(String privateLinkResourceId) {
        super.withPrivateLinkResourceId(privateLinkResourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OriginProperties withPrivateLinkLocation(String privateLinkLocation) {
        super.withPrivateLinkLocation(privateLinkLocation);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OriginProperties withPrivateLinkApprovalMessage(String privateLinkApprovalMessage) {
        super.withPrivateLinkApprovalMessage(privateLinkApprovalMessage);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
