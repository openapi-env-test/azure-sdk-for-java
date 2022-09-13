// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** The status of the Kubernetes custom resource. */
@Fluent
public final class ActiveDirectoryConnectorStatus {
    /*
     * The time that the custom resource was last updated.
     */
    @JsonProperty(value = "lastUpdateTime")
    private String lastUpdateTime;

    /*
     * The version of the replicaSet associated with the AD connector custom
     * resource.
     */
    @JsonProperty(value = "observedGeneration")
    private Long observedGeneration;

    /*
     * The state of the AD connector custom resource.
     */
    @JsonProperty(value = "state")
    private String state;

    /*
     * The status of the Kubernetes custom resource.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the lastUpdateTime property: The time that the custom resource was last updated.
     *
     * @return the lastUpdateTime value.
     */
    public String lastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * Set the lastUpdateTime property: The time that the custom resource was last updated.
     *
     * @param lastUpdateTime the lastUpdateTime value to set.
     * @return the ActiveDirectoryConnectorStatus object itself.
     */
    public ActiveDirectoryConnectorStatus withLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * Get the observedGeneration property: The version of the replicaSet associated with the AD connector custom
     * resource.
     *
     * @return the observedGeneration value.
     */
    public Long observedGeneration() {
        return this.observedGeneration;
    }

    /**
     * Set the observedGeneration property: The version of the replicaSet associated with the AD connector custom
     * resource.
     *
     * @param observedGeneration the observedGeneration value to set.
     * @return the ActiveDirectoryConnectorStatus object itself.
     */
    public ActiveDirectoryConnectorStatus withObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    /**
     * Get the state property: The state of the AD connector custom resource.
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: The state of the AD connector custom resource.
     *
     * @param state the state value to set.
     * @return the ActiveDirectoryConnectorStatus object itself.
     */
    public ActiveDirectoryConnectorStatus withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the additionalProperties property: The status of the Kubernetes custom resource.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The status of the Kubernetes custom resource.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the ActiveDirectoryConnectorStatus object itself.
     */
    public ActiveDirectoryConnectorStatus withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
