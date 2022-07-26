// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Sharing status of current gallery. */
@Fluent
public final class SharingStatus {
    /*
     * The sharing state of the gallery. Aggregated sharing state of current
     * gallery.
     */
    @JsonProperty(value = "aggregatedState", access = JsonProperty.Access.WRITE_ONLY)
    private SharingState aggregatedState;

    /*
     * Summary of all regional sharing status.
     */
    @JsonProperty(value = "summary")
    private List<RegionalSharingStatus> summary;

    /**
     * Get the aggregatedState property: The sharing state of the gallery. Aggregated sharing state of current gallery.
     *
     * @return the aggregatedState value.
     */
    public SharingState aggregatedState() {
        return this.aggregatedState;
    }

    /**
     * Get the summary property: Summary of all regional sharing status.
     *
     * @return the summary value.
     */
    public List<RegionalSharingStatus> summary() {
        return this.summary;
    }

    /**
     * Set the summary property: Summary of all regional sharing status.
     *
     * @param summary the summary value to set.
     * @return the SharingStatus object itself.
     */
    public SharingStatus withSummary(List<RegionalSharingStatus> summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (summary() != null) {
            summary().forEach(e -> e.validate());
        }
    }
}
