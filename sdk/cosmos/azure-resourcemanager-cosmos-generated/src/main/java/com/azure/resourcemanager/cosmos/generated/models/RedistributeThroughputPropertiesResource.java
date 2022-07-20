// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Resource to redistribute throughput for Azure Cosmos DB resource. */
@Fluent
public final class RedistributeThroughputPropertiesResource {
    /*
     * ThroughputPolicy to apply for throughput redistribution
     */
    @JsonProperty(value = "throughputPolicy", required = true)
    private ThroughputPolicyType throughputPolicy;

    /*
     * Array of PhysicalPartitionThroughputInfoResource objects.
     */
    @JsonProperty(value = "targetPhysicalPartitionThroughputInfo", required = true)
    private List<PhysicalPartitionThroughputInfoResource> targetPhysicalPartitionThroughputInfo;

    /*
     * Array of PhysicalPartitionThroughputInfoResource objects.
     */
    @JsonProperty(value = "sourcePhysicalPartitionThroughputInfo", required = true)
    private List<PhysicalPartitionThroughputInfoResource> sourcePhysicalPartitionThroughputInfo;

    /**
     * Get the throughputPolicy property: ThroughputPolicy to apply for throughput redistribution.
     *
     * @return the throughputPolicy value.
     */
    public ThroughputPolicyType throughputPolicy() {
        return this.throughputPolicy;
    }

    /**
     * Set the throughputPolicy property: ThroughputPolicy to apply for throughput redistribution.
     *
     * @param throughputPolicy the throughputPolicy value to set.
     * @return the RedistributeThroughputPropertiesResource object itself.
     */
    public RedistributeThroughputPropertiesResource withThroughputPolicy(ThroughputPolicyType throughputPolicy) {
        this.throughputPolicy = throughputPolicy;
        return this;
    }

    /**
     * Get the targetPhysicalPartitionThroughputInfo property: Array of PhysicalPartitionThroughputInfoResource objects.
     *
     * @return the targetPhysicalPartitionThroughputInfo value.
     */
    public List<PhysicalPartitionThroughputInfoResource> targetPhysicalPartitionThroughputInfo() {
        return this.targetPhysicalPartitionThroughputInfo;
    }

    /**
     * Set the targetPhysicalPartitionThroughputInfo property: Array of PhysicalPartitionThroughputInfoResource objects.
     *
     * @param targetPhysicalPartitionThroughputInfo the targetPhysicalPartitionThroughputInfo value to set.
     * @return the RedistributeThroughputPropertiesResource object itself.
     */
    public RedistributeThroughputPropertiesResource withTargetPhysicalPartitionThroughputInfo(
        List<PhysicalPartitionThroughputInfoResource> targetPhysicalPartitionThroughputInfo) {
        this.targetPhysicalPartitionThroughputInfo = targetPhysicalPartitionThroughputInfo;
        return this;
    }

    /**
     * Get the sourcePhysicalPartitionThroughputInfo property: Array of PhysicalPartitionThroughputInfoResource objects.
     *
     * @return the sourcePhysicalPartitionThroughputInfo value.
     */
    public List<PhysicalPartitionThroughputInfoResource> sourcePhysicalPartitionThroughputInfo() {
        return this.sourcePhysicalPartitionThroughputInfo;
    }

    /**
     * Set the sourcePhysicalPartitionThroughputInfo property: Array of PhysicalPartitionThroughputInfoResource objects.
     *
     * @param sourcePhysicalPartitionThroughputInfo the sourcePhysicalPartitionThroughputInfo value to set.
     * @return the RedistributeThroughputPropertiesResource object itself.
     */
    public RedistributeThroughputPropertiesResource withSourcePhysicalPartitionThroughputInfo(
        List<PhysicalPartitionThroughputInfoResource> sourcePhysicalPartitionThroughputInfo) {
        this.sourcePhysicalPartitionThroughputInfo = sourcePhysicalPartitionThroughputInfo;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (throughputPolicy() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property throughputPolicy in model"
                            + " RedistributeThroughputPropertiesResource"));
        }
        if (targetPhysicalPartitionThroughputInfo() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetPhysicalPartitionThroughputInfo in model"
                            + " RedistributeThroughputPropertiesResource"));
        } else {
            targetPhysicalPartitionThroughputInfo().forEach(e -> e.validate());
        }
        if (sourcePhysicalPartitionThroughputInfo() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourcePhysicalPartitionThroughputInfo in model"
                            + " RedistributeThroughputPropertiesResource"));
        } else {
            sourcePhysicalPartitionThroughputInfo().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RedistributeThroughputPropertiesResource.class);
}
