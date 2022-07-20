// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes properties of a calculated secure score. */
@Immutable
public final class SecureScoreItemProperties {
    /*
     * The initiative’s name
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * score object
     */
    @JsonProperty(value = "score", access = JsonProperty.Access.WRITE_ONLY)
    private ScoreDetails innerScore;

    /*
     * The relative weight for each subscription. Used when calculating an
     * aggregated secure score for multiple subscriptions.
     */
    @JsonProperty(value = "weight", access = JsonProperty.Access.WRITE_ONLY)
    private Long weight;

    /**
     * Get the displayName property: The initiative’s name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the innerScore property: score object.
     *
     * @return the innerScore value.
     */
    private ScoreDetails innerScore() {
        return this.innerScore;
    }

    /**
     * Get the weight property: The relative weight for each subscription. Used when calculating an aggregated secure
     * score for multiple subscriptions.
     *
     * @return the weight value.
     */
    public Long weight() {
        return this.weight;
    }

    /**
     * Get the max property: Maximum score available.
     *
     * @return the max value.
     */
    public Integer max() {
        return this.innerScore() == null ? null : this.innerScore().max();
    }

    /**
     * Get the current property: Current score.
     *
     * @return the current value.
     */
    public Double current() {
        return this.innerScore() == null ? null : this.innerScore().current();
    }

    /**
     * Get the percentage property: Ratio of the current score divided by the maximum. Rounded to 4 digits after the
     * decimal point.
     *
     * @return the percentage value.
     */
    public Double percentage() {
        return this.innerScore() == null ? null : this.innerScore().percentage();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerScore() != null) {
            innerScore().validate();
        }
    }
}
