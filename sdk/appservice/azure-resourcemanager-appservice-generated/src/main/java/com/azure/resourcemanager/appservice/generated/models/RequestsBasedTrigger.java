// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RequestsBasedTrigger. */
@Fluent
public final class RequestsBasedTrigger {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RequestsBasedTrigger.class);

    /*
     * Count
     */
    @JsonProperty(value = "count")
    private Integer count;

    /*
     * TimeInterval
     */
    @JsonProperty(value = "timeInterval")
    private String timeInterval;

    /**
     * Get the count property: Count.
     *
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count property: Count.
     *
     * @param count the count value to set.
     * @return the RequestsBasedTrigger object itself.
     */
    public RequestsBasedTrigger withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get the timeInterval property: TimeInterval.
     *
     * @return the timeInterval value.
     */
    public String timeInterval() {
        return this.timeInterval;
    }

    /**
     * Set the timeInterval property: TimeInterval.
     *
     * @param timeInterval the timeInterval value to set.
     * @return the RequestsBasedTrigger object itself.
     */
    public RequestsBasedTrigger withTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
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
