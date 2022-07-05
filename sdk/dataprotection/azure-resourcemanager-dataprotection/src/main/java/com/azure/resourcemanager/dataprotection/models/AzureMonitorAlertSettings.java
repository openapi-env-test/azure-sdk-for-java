// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Settings for Azure Monitor based alerts. */
@Fluent
public final class AzureMonitorAlertSettings {
    /*
     * The alertsForAllJobFailures property.
     */
    @JsonProperty(value = "alertsForAllJobFailures")
    private AlertsState alertsForAllJobFailures;

    /**
     * Get the alertsForAllJobFailures property: The alertsForAllJobFailures property.
     *
     * @return the alertsForAllJobFailures value.
     */
    public AlertsState alertsForAllJobFailures() {
        return this.alertsForAllJobFailures;
    }

    /**
     * Set the alertsForAllJobFailures property: The alertsForAllJobFailures property.
     *
     * @param alertsForAllJobFailures the alertsForAllJobFailures value to set.
     * @return the AzureMonitorAlertSettings object itself.
     */
    public AzureMonitorAlertSettings withAlertsForAllJobFailures(AlertsState alertsForAllJobFailures) {
        this.alertsForAllJobFailures = alertsForAllJobFailures;
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
