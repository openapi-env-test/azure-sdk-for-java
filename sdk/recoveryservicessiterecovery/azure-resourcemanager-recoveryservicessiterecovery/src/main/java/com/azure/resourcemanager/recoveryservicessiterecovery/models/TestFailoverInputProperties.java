// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input definition for test failover input properties. */
@Fluent
public final class TestFailoverInputProperties {
    /*
     * Test failover direction.
     */
    @JsonProperty(value = "failoverDirection")
    private String failoverDirection;

    /*
     * Network type to be used for test failover.
     */
    @JsonProperty(value = "networkType")
    private String networkType;

    /*
     * The id of the network to be used for test failover.
     */
    @JsonProperty(value = "networkId")
    private String networkId;

    /*
     * Provider specific settings.
     */
    @JsonProperty(value = "providerSpecificDetails")
    private TestFailoverProviderSpecificInput providerSpecificDetails;

    /**
     * Get the failoverDirection property: Test failover direction.
     *
     * @return the failoverDirection value.
     */
    public String failoverDirection() {
        return this.failoverDirection;
    }

    /**
     * Set the failoverDirection property: Test failover direction.
     *
     * @param failoverDirection the failoverDirection value to set.
     * @return the TestFailoverInputProperties object itself.
     */
    public TestFailoverInputProperties withFailoverDirection(String failoverDirection) {
        this.failoverDirection = failoverDirection;
        return this;
    }

    /**
     * Get the networkType property: Network type to be used for test failover.
     *
     * @return the networkType value.
     */
    public String networkType() {
        return this.networkType;
    }

    /**
     * Set the networkType property: Network type to be used for test failover.
     *
     * @param networkType the networkType value to set.
     * @return the TestFailoverInputProperties object itself.
     */
    public TestFailoverInputProperties withNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * Get the networkId property: The id of the network to be used for test failover.
     *
     * @return the networkId value.
     */
    public String networkId() {
        return this.networkId;
    }

    /**
     * Set the networkId property: The id of the network to be used for test failover.
     *
     * @param networkId the networkId value to set.
     * @return the TestFailoverInputProperties object itself.
     */
    public TestFailoverInputProperties withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * Get the providerSpecificDetails property: Provider specific settings.
     *
     * @return the providerSpecificDetails value.
     */
    public TestFailoverProviderSpecificInput providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the providerSpecificDetails property: Provider specific settings.
     *
     * @param providerSpecificDetails the providerSpecificDetails value to set.
     * @return the TestFailoverInputProperties object itself.
     */
    public TestFailoverInputProperties withProviderSpecificDetails(
        TestFailoverProviderSpecificInput providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (providerSpecificDetails() != null) {
            providerSpecificDetails().validate();
        }
    }
}
