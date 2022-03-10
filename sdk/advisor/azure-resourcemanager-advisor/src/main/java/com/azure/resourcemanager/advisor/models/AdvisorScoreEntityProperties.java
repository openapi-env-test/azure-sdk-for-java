// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Advisor score data. */
@Fluent
public final class AdvisorScoreEntityProperties {
    /*
     * The details of latest available score.
     */
    @JsonProperty(value = "lastRefreshedScore")
    private ScoreEntity lastRefreshedScore;

    /*
     * The historic Advisor score data.
     */
    @JsonProperty(value = "timeSeries")
    private List<TimeSeriesEntityItem> timeSeries;

    /**
     * Get the lastRefreshedScore property: The details of latest available score.
     *
     * @return the lastRefreshedScore value.
     */
    public ScoreEntity lastRefreshedScore() {
        return this.lastRefreshedScore;
    }

    /**
     * Set the lastRefreshedScore property: The details of latest available score.
     *
     * @param lastRefreshedScore the lastRefreshedScore value to set.
     * @return the AdvisorScoreEntityProperties object itself.
     */
    public AdvisorScoreEntityProperties withLastRefreshedScore(ScoreEntity lastRefreshedScore) {
        this.lastRefreshedScore = lastRefreshedScore;
        return this;
    }

    /**
     * Get the timeSeries property: The historic Advisor score data.
     *
     * @return the timeSeries value.
     */
    public List<TimeSeriesEntityItem> timeSeries() {
        return this.timeSeries;
    }

    /**
     * Set the timeSeries property: The historic Advisor score data.
     *
     * @param timeSeries the timeSeries value to set.
     * @return the AdvisorScoreEntityProperties object itself.
     */
    public AdvisorScoreEntityProperties withTimeSeries(List<TimeSeriesEntityItem> timeSeries) {
        this.timeSeries = timeSeries;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (lastRefreshedScore() != null) {
            lastRefreshedScore().validate();
        }
        if (timeSeries() != null) {
            timeSeries().forEach(e -> e.validate());
        }
    }
}
