// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Model class for event details of a HyperVReplica E2E event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("HyperVReplica2012")
@Fluent
public final class HyperVReplica2012EventDetails extends EventProviderSpecificDetails {
    /*
     * The container friendly name.
     */
    @JsonProperty(value = "containerName")
    private String containerName;

    /*
     * The fabric friendly name.
     */
    @JsonProperty(value = "fabricName")
    private String fabricName;

    /*
     * The remote container name.
     */
    @JsonProperty(value = "remoteContainerName")
    private String remoteContainerName;

    /*
     * The remote fabric name.
     */
    @JsonProperty(value = "remoteFabricName")
    private String remoteFabricName;

    /**
     * Get the containerName property: The container friendly name.
     *
     * @return the containerName value.
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set the containerName property: The container friendly name.
     *
     * @param containerName the containerName value to set.
     * @return the HyperVReplica2012EventDetails object itself.
     */
    public HyperVReplica2012EventDetails withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get the fabricName property: The fabric friendly name.
     *
     * @return the fabricName value.
     */
    public String fabricName() {
        return this.fabricName;
    }

    /**
     * Set the fabricName property: The fabric friendly name.
     *
     * @param fabricName the fabricName value to set.
     * @return the HyperVReplica2012EventDetails object itself.
     */
    public HyperVReplica2012EventDetails withFabricName(String fabricName) {
        this.fabricName = fabricName;
        return this;
    }

    /**
     * Get the remoteContainerName property: The remote container name.
     *
     * @return the remoteContainerName value.
     */
    public String remoteContainerName() {
        return this.remoteContainerName;
    }

    /**
     * Set the remoteContainerName property: The remote container name.
     *
     * @param remoteContainerName the remoteContainerName value to set.
     * @return the HyperVReplica2012EventDetails object itself.
     */
    public HyperVReplica2012EventDetails withRemoteContainerName(String remoteContainerName) {
        this.remoteContainerName = remoteContainerName;
        return this;
    }

    /**
     * Get the remoteFabricName property: The remote fabric name.
     *
     * @return the remoteFabricName value.
     */
    public String remoteFabricName() {
        return this.remoteFabricName;
    }

    /**
     * Set the remoteFabricName property: The remote fabric name.
     *
     * @param remoteFabricName the remoteFabricName value to set.
     * @return the HyperVReplica2012EventDetails object itself.
     */
    public HyperVReplica2012EventDetails withRemoteFabricName(String remoteFabricName) {
        this.remoteFabricName = remoteFabricName;
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
