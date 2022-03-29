// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents the health policy used to evaluate the health of services belonging to a service type. */
@Fluent
public final class ArmServiceTypeHealthPolicy {
    /*
     * The maximum percentage of services allowed to be unhealthy before your
     * application is considered in error.
     *
     */
    @JsonProperty(value = "maxPercentUnhealthyServices")
    private Integer maxPercentUnhealthyServices;

    /*
     * The maximum percentage of partitions per service allowed to be unhealthy
     * before your application is considered in error.
     *
     */
    @JsonProperty(value = "maxPercentUnhealthyPartitionsPerService")
    private Integer maxPercentUnhealthyPartitionsPerService;

    /*
     * The maximum percentage of replicas per partition allowed to be unhealthy
     * before your application is considered in error.
     *
     */
    @JsonProperty(value = "maxPercentUnhealthyReplicasPerPartition")
    private Integer maxPercentUnhealthyReplicasPerPartition;

    /**
     * Get the maxPercentUnhealthyServices property: The maximum percentage of services allowed to be unhealthy before
     * your application is considered in error.
     *
     * @return the maxPercentUnhealthyServices value.
     */
    public Integer maxPercentUnhealthyServices() {
        return this.maxPercentUnhealthyServices;
    }

    /**
     * Set the maxPercentUnhealthyServices property: The maximum percentage of services allowed to be unhealthy before
     * your application is considered in error.
     *
     * @param maxPercentUnhealthyServices the maxPercentUnhealthyServices value to set.
     * @return the ArmServiceTypeHealthPolicy object itself.
     */
    public ArmServiceTypeHealthPolicy withMaxPercentUnhealthyServices(Integer maxPercentUnhealthyServices) {
        this.maxPercentUnhealthyServices = maxPercentUnhealthyServices;
        return this;
    }

    /**
     * Get the maxPercentUnhealthyPartitionsPerService property: The maximum percentage of partitions per service
     * allowed to be unhealthy before your application is considered in error.
     *
     * @return the maxPercentUnhealthyPartitionsPerService value.
     */
    public Integer maxPercentUnhealthyPartitionsPerService() {
        return this.maxPercentUnhealthyPartitionsPerService;
    }

    /**
     * Set the maxPercentUnhealthyPartitionsPerService property: The maximum percentage of partitions per service
     * allowed to be unhealthy before your application is considered in error.
     *
     * @param maxPercentUnhealthyPartitionsPerService the maxPercentUnhealthyPartitionsPerService value to set.
     * @return the ArmServiceTypeHealthPolicy object itself.
     */
    public ArmServiceTypeHealthPolicy withMaxPercentUnhealthyPartitionsPerService(
        Integer maxPercentUnhealthyPartitionsPerService) {
        this.maxPercentUnhealthyPartitionsPerService = maxPercentUnhealthyPartitionsPerService;
        return this;
    }

    /**
     * Get the maxPercentUnhealthyReplicasPerPartition property: The maximum percentage of replicas per partition
     * allowed to be unhealthy before your application is considered in error.
     *
     * @return the maxPercentUnhealthyReplicasPerPartition value.
     */
    public Integer maxPercentUnhealthyReplicasPerPartition() {
        return this.maxPercentUnhealthyReplicasPerPartition;
    }

    /**
     * Set the maxPercentUnhealthyReplicasPerPartition property: The maximum percentage of replicas per partition
     * allowed to be unhealthy before your application is considered in error.
     *
     * @param maxPercentUnhealthyReplicasPerPartition the maxPercentUnhealthyReplicasPerPartition value to set.
     * @return the ArmServiceTypeHealthPolicy object itself.
     */
    public ArmServiceTypeHealthPolicy withMaxPercentUnhealthyReplicasPerPartition(
        Integer maxPercentUnhealthyReplicasPerPartition) {
        this.maxPercentUnhealthyReplicasPerPartition = maxPercentUnhealthyReplicasPerPartition;
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
