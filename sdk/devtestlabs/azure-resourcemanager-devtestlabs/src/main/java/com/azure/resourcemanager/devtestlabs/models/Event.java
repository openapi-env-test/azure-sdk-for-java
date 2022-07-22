// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An event to be notified for. */
@Fluent
public final class Event {
    /*
     * The event type for which this notification is enabled (i.e.
     * AutoShutdown, Cost)
     */
    @JsonProperty(value = "eventName")
    private NotificationChannelEventType eventName;

    /**
     * Get the eventName property: The event type for which this notification is enabled (i.e. AutoShutdown, Cost).
     *
     * @return the eventName value.
     */
    public NotificationChannelEventType eventName() {
        return this.eventName;
    }

    /**
     * Set the eventName property: The event type for which this notification is enabled (i.e. AutoShutdown, Cost).
     *
     * @param eventName the eventName value to set.
     * @return the Event object itself.
     */
    public Event withEventName(NotificationChannelEventType eventName) {
        this.eventName = eventName;
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
