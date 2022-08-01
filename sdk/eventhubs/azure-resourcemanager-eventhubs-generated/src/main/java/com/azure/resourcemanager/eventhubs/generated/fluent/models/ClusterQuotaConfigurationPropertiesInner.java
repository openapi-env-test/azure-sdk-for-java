// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Contains all settings for the cluster. */
@Fluent
public final class ClusterQuotaConfigurationPropertiesInner {
    /*
     * All possible Cluster settings - a collection of key/value paired
     * settings which apply to quotas and configurations imposed on the
     * cluster.
     */
    @JsonProperty(value = "settings")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> settings;

    /**
     * Get the settings property: All possible Cluster settings - a collection of key/value paired settings which apply
     * to quotas and configurations imposed on the cluster.
     *
     * @return the settings value.
     */
    public Map<String, String> settings() {
        return this.settings;
    }

    /**
     * Set the settings property: All possible Cluster settings - a collection of key/value paired settings which apply
     * to quotas and configurations imposed on the cluster.
     *
     * @param settings the settings value to set.
     * @return the ClusterQuotaConfigurationPropertiesInner object itself.
     */
    public ClusterQuotaConfigurationPropertiesInner withSettings(Map<String, String> settings) {
        this.settings = settings;
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
