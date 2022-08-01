// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkWatcherInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for ListNetworkWatchers API service call. */
@Fluent
public final class NetworkWatcherListResult {
    /*
     * List of network watcher resources.
     */
    @JsonProperty(value = "value")
    private List<NetworkWatcherInner> value;

    /**
     * Get the value property: List of network watcher resources.
     *
     * @return the value value.
     */
    public List<NetworkWatcherInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of network watcher resources.
     *
     * @param value the value value to set.
     * @return the NetworkWatcherListResult object itself.
     */
    public NetworkWatcherListResult withValue(List<NetworkWatcherInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
