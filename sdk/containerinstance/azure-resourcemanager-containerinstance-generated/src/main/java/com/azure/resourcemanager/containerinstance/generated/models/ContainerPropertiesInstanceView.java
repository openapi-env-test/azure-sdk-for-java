// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The instance view of the container instance. Only valid in response. */
@Immutable
public final class ContainerPropertiesInstanceView {
    /*
     * The number of times that the container instance has been restarted.
     */
    @JsonProperty(value = "restartCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer restartCount;

    /*
     * Current container instance state.
     */
    @JsonProperty(value = "currentState", access = JsonProperty.Access.WRITE_ONLY)
    private ContainerState currentState;

    /*
     * Previous container instance state.
     */
    @JsonProperty(value = "previousState", access = JsonProperty.Access.WRITE_ONLY)
    private ContainerState previousState;

    /*
     * The events of the container instance.
     */
    @JsonProperty(value = "events", access = JsonProperty.Access.WRITE_ONLY)
    private List<Event> events;

    /**
     * Get the restartCount property: The number of times that the container instance has been restarted.
     *
     * @return the restartCount value.
     */
    public Integer restartCount() {
        return this.restartCount;
    }

    /**
     * Get the currentState property: Current container instance state.
     *
     * @return the currentState value.
     */
    public ContainerState currentState() {
        return this.currentState;
    }

    /**
     * Get the previousState property: Previous container instance state.
     *
     * @return the previousState value.
     */
    public ContainerState previousState() {
        return this.previousState;
    }

    /**
     * Get the events property: The events of the container instance.
     *
     * @return the events value.
     */
    public List<Event> events() {
        return this.events;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (currentState() != null) {
            currentState().validate();
        }
        if (previousState() != null) {
            previousState().validate();
        }
        if (events() != null) {
            events().forEach(e -> e.validate());
        }
    }
}
