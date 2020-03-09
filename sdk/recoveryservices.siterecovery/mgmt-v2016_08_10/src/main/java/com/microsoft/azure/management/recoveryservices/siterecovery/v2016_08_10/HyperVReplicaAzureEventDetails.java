/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Model class for event details of a HyperVReplica E2A event.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType", defaultImpl = HyperVReplicaAzureEventDetails.class)
@JsonTypeName("HyperVReplicaAzure")
public class HyperVReplicaAzureEventDetails extends EventProviderSpecificDetails {
    /**
     * The container friendly name.
     */
    @JsonProperty(value = "containerName")
    private String containerName;

    /**
     * The fabric friendly name.
     */
    @JsonProperty(value = "fabricName")
    private String fabricName;

    /**
     * The remote container name.
     */
    @JsonProperty(value = "remoteContainerName")
    private String remoteContainerName;

    /**
     * Get the container friendly name.
     *
     * @return the containerName value
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set the container friendly name.
     *
     * @param containerName the containerName value to set
     * @return the HyperVReplicaAzureEventDetails object itself.
     */
    public HyperVReplicaAzureEventDetails withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get the fabric friendly name.
     *
     * @return the fabricName value
     */
    public String fabricName() {
        return this.fabricName;
    }

    /**
     * Set the fabric friendly name.
     *
     * @param fabricName the fabricName value to set
     * @return the HyperVReplicaAzureEventDetails object itself.
     */
    public HyperVReplicaAzureEventDetails withFabricName(String fabricName) {
        this.fabricName = fabricName;
        return this;
    }

    /**
     * Get the remote container name.
     *
     * @return the remoteContainerName value
     */
    public String remoteContainerName() {
        return this.remoteContainerName;
    }

    /**
     * Set the remote container name.
     *
     * @param remoteContainerName the remoteContainerName value to set
     * @return the HyperVReplicaAzureEventDetails object itself.
     */
    public HyperVReplicaAzureEventDetails withRemoteContainerName(String remoteContainerName) {
        this.remoteContainerName = remoteContainerName;
        return this;
    }

}
