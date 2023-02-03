// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters that define the configuration of traffic analytics. */
@Fluent
public final class TrafficAnalyticsProperties {
    /*
     * Parameters that define the configuration of traffic analytics.
     */
    @JsonProperty(value = "networkWatcherFlowAnalyticsConfiguration")
    private TrafficAnalyticsConfigurationProperties networkWatcherFlowAnalyticsConfiguration;

    /** Creates an instance of TrafficAnalyticsProperties class. */
    public TrafficAnalyticsProperties() {
    }

    /**
     * Get the networkWatcherFlowAnalyticsConfiguration property: Parameters that define the configuration of traffic
     * analytics.
     *
     * @return the networkWatcherFlowAnalyticsConfiguration value.
     */
    public TrafficAnalyticsConfigurationProperties networkWatcherFlowAnalyticsConfiguration() {
        return this.networkWatcherFlowAnalyticsConfiguration;
    }

    /**
     * Set the networkWatcherFlowAnalyticsConfiguration property: Parameters that define the configuration of traffic
     * analytics.
     *
     * @param networkWatcherFlowAnalyticsConfiguration the networkWatcherFlowAnalyticsConfiguration value to set.
     * @return the TrafficAnalyticsProperties object itself.
     */
    public TrafficAnalyticsProperties withNetworkWatcherFlowAnalyticsConfiguration(
        TrafficAnalyticsConfigurationProperties networkWatcherFlowAnalyticsConfiguration) {
        this.networkWatcherFlowAnalyticsConfiguration = networkWatcherFlowAnalyticsConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkWatcherFlowAnalyticsConfiguration() != null) {
            networkWatcherFlowAnalyticsConfiguration().validate();
        }
    }
}
