// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The content of the event request message. */
@Fluent
public final class EventContent {
    /*
     * The event ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The time at which the event occurred.
     */
    @JsonProperty(value = "timestamp")
    private OffsetDateTime timestamp;

    /*
     * The action that encompasses the provided event.
     */
    @JsonProperty(value = "action")
    private String action;

    /*
     * The target of the event.
     */
    @JsonProperty(value = "target")
    private Target target;

    /*
     * The request that generated the event.
     */
    @JsonProperty(value = "request")
    private Request request;

    /*
     * The agent that initiated the event. For most situations, this could be from the authorization context of the
     * request.
     */
    @JsonProperty(value = "actor")
    private Actor actor;

    /*
     * The registry node that generated the event. Put differently, while the actor initiates the event, the source
     * generates it.
     */
    @JsonProperty(value = "source")
    private Source source;

    /** Creates an instance of EventContent class. */
    public EventContent() {
    }

    /**
     * Get the id property: The event ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The event ID.
     *
     * @param id the id value to set.
     * @return the EventContent object itself.
     */
    public EventContent withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the timestamp property: The time at which the event occurred.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp property: The time at which the event occurred.
     *
     * @param timestamp the timestamp value to set.
     * @return the EventContent object itself.
     */
    public EventContent withTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get the action property: The action that encompasses the provided event.
     *
     * @return the action value.
     */
    public String action() {
        return this.action;
    }

    /**
     * Set the action property: The action that encompasses the provided event.
     *
     * @param action the action value to set.
     * @return the EventContent object itself.
     */
    public EventContent withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Get the target property: The target of the event.
     *
     * @return the target value.
     */
    public Target target() {
        return this.target;
    }

    /**
     * Set the target property: The target of the event.
     *
     * @param target the target value to set.
     * @return the EventContent object itself.
     */
    public EventContent withTarget(Target target) {
        this.target = target;
        return this;
    }

    /**
     * Get the request property: The request that generated the event.
     *
     * @return the request value.
     */
    public Request request() {
        return this.request;
    }

    /**
     * Set the request property: The request that generated the event.
     *
     * @param request the request value to set.
     * @return the EventContent object itself.
     */
    public EventContent withRequest(Request request) {
        this.request = request;
        return this;
    }

    /**
     * Get the actor property: The agent that initiated the event. For most situations, this could be from the
     * authorization context of the request.
     *
     * @return the actor value.
     */
    public Actor actor() {
        return this.actor;
    }

    /**
     * Set the actor property: The agent that initiated the event. For most situations, this could be from the
     * authorization context of the request.
     *
     * @param actor the actor value to set.
     * @return the EventContent object itself.
     */
    public EventContent withActor(Actor actor) {
        this.actor = actor;
        return this;
    }

    /**
     * Get the source property: The registry node that generated the event. Put differently, while the actor initiates
     * the event, the source generates it.
     *
     * @return the source value.
     */
    public Source source() {
        return this.source;
    }

    /**
     * Set the source property: The registry node that generated the event. Put differently, while the actor initiates
     * the event, the source generates it.
     *
     * @param source the source value to set.
     * @return the EventContent object itself.
     */
    public EventContent withSource(Source source) {
        this.source = source;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (target() != null) {
            target().validate();
        }
        if (request() != null) {
            request().validate();
        }
        if (actor() != null) {
            actor().validate();
        }
        if (source() != null) {
            source().validate();
        }
    }
}
