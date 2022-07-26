// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devcenter.models.DomainJoinType;
import com.azure.resourcemanager.devcenter.models.HealthCheckStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Network properties. */
@Fluent
public final class NetworkProperties extends NetworkConnectionUpdateProperties {
    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Overall health status of the network connection. Health checks are run
     * on creation, update, and periodically to validate the network
     * connection.
     */
    @JsonProperty(value = "healthCheckStatus", access = JsonProperty.Access.WRITE_ONLY)
    private HealthCheckStatus healthCheckStatus;

    /*
     * The name for resource group where NICs will be placed.
     */
    @JsonProperty(value = "networkingResourceGroupName")
    private String networkingResourceGroupName;

    /*
     * AAD Join type.
     */
    @JsonProperty(value = "domainJoinType", required = true)
    private DomainJoinType domainJoinType;

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the healthCheckStatus property: Overall health status of the network connection. Health checks are run on
     * creation, update, and periodically to validate the network connection.
     *
     * @return the healthCheckStatus value.
     */
    public HealthCheckStatus healthCheckStatus() {
        return this.healthCheckStatus;
    }

    /**
     * Get the networkingResourceGroupName property: The name for resource group where NICs will be placed.
     *
     * @return the networkingResourceGroupName value.
     */
    public String networkingResourceGroupName() {
        return this.networkingResourceGroupName;
    }

    /**
     * Set the networkingResourceGroupName property: The name for resource group where NICs will be placed.
     *
     * @param networkingResourceGroupName the networkingResourceGroupName value to set.
     * @return the NetworkProperties object itself.
     */
    public NetworkProperties withNetworkingResourceGroupName(String networkingResourceGroupName) {
        this.networkingResourceGroupName = networkingResourceGroupName;
        return this;
    }

    /**
     * Get the domainJoinType property: AAD Join type.
     *
     * @return the domainJoinType value.
     */
    public DomainJoinType domainJoinType() {
        return this.domainJoinType;
    }

    /**
     * Set the domainJoinType property: AAD Join type.
     *
     * @param domainJoinType the domainJoinType value to set.
     * @return the NetworkProperties object itself.
     */
    public NetworkProperties withDomainJoinType(DomainJoinType domainJoinType) {
        this.domainJoinType = domainJoinType;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkProperties withSubnetId(String subnetId) {
        super.withSubnetId(subnetId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkProperties withDomainName(String domainName) {
        super.withDomainName(domainName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkProperties withOrganizationUnit(String organizationUnit) {
        super.withOrganizationUnit(organizationUnit);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkProperties withDomainUsername(String domainUsername) {
        super.withDomainUsername(domainUsername);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkProperties withDomainPassword(String domainPassword) {
        super.withDomainPassword(domainPassword);
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
        if (domainJoinType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property domainJoinType in model NetworkProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NetworkProperties.class);
}
