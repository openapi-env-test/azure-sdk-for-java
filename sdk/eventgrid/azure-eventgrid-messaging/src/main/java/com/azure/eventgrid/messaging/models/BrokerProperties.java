// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.eventgrid.messaging.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the Event Broker operation. */
@Immutable
public final class BrokerProperties {
    /*
     * The token used to lock the event.
     */
    @JsonProperty(value = "lockToken", required = true)
    private String lockToken;

    /*
     * The attempt count for delivering the event.
     */
    @JsonProperty(value = "deliveryCount", required = true)
    private int deliveryCount;

    /**
     * Creates an instance of BrokerProperties class.
     *
     * @param lockToken the lockToken value to set.
     * @param deliveryCount the deliveryCount value to set.
     */
    @JsonCreator
    private BrokerProperties(
            @JsonProperty(value = "lockToken", required = true) String lockToken,
            @JsonProperty(value = "deliveryCount", required = true) int deliveryCount) {
        this.lockToken = lockToken;
        this.deliveryCount = deliveryCount;
    }

    /**
     * Get the lockToken property: The token used to lock the event.
     *
     * @return the lockToken value.
     */
    public String getLockToken() {
        return this.lockToken;
    }

    /**
     * Get the deliveryCount property: The attempt count for delivering the event.
     *
     * @return the deliveryCount value.
     */
    public int getDeliveryCount() {
        return this.deliveryCount;
    }
}
