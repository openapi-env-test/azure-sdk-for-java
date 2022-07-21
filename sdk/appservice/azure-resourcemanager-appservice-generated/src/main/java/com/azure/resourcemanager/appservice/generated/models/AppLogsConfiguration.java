// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AppLogsConfiguration model. */
@Fluent
public final class AppLogsConfiguration {
    /*
     * The destination property.
     */
    @JsonProperty(value = "destination")
    private String destination;

    /*
     * The logAnalyticsConfiguration property.
     */
    @JsonProperty(value = "logAnalyticsConfiguration")
    private LogAnalyticsConfiguration logAnalyticsConfiguration;

    /**
     * Get the destination property: The destination property.
     *
     * @return the destination value.
     */
    public String destination() {
        return this.destination;
    }

    /**
     * Set the destination property: The destination property.
     *
     * @param destination the destination value to set.
     * @return the AppLogsConfiguration object itself.
     */
    public AppLogsConfiguration withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get the logAnalyticsConfiguration property: The logAnalyticsConfiguration property.
     *
     * @return the logAnalyticsConfiguration value.
     */
    public LogAnalyticsConfiguration logAnalyticsConfiguration() {
        return this.logAnalyticsConfiguration;
    }

    /**
     * Set the logAnalyticsConfiguration property: The logAnalyticsConfiguration property.
     *
     * @param logAnalyticsConfiguration the logAnalyticsConfiguration value to set.
     * @return the AppLogsConfiguration object itself.
     */
    public AppLogsConfiguration withLogAnalyticsConfiguration(LogAnalyticsConfiguration logAnalyticsConfiguration) {
        this.logAnalyticsConfiguration = logAnalyticsConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (logAnalyticsConfiguration() != null) {
            logAnalyticsConfiguration().validate();
        }
    }
}
