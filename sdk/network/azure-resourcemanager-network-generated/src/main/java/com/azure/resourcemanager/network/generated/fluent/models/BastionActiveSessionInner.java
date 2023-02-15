// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.network.generated.models.BastionConnectProtocol;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The session detail for a target. */
@Immutable
public final class BastionActiveSessionInner {
    /*
     * A unique id for the session.
     */
    @JsonProperty(value = "sessionId", access = JsonProperty.Access.WRITE_ONLY)
    private String sessionId;

    /*
     * The time when the session started.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private Object startTime;

    /*
     * The subscription id for the target virtual machine.
     */
    @JsonProperty(value = "targetSubscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String targetSubscriptionId;

    /*
     * The type of the resource.
     */
    @JsonProperty(value = "resourceType", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceType;

    /*
     * The host name of the target.
     */
    @JsonProperty(value = "targetHostName", access = JsonProperty.Access.WRITE_ONLY)
    private String targetHostname;

    /*
     * The resource group of the target.
     */
    @JsonProperty(value = "targetResourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String targetResourceGroup;

    /*
     * The user name who is active on this session.
     */
    @JsonProperty(value = "userName", access = JsonProperty.Access.WRITE_ONLY)
    private String username;

    /*
     * The IP Address of the target.
     */
    @JsonProperty(value = "targetIpAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String targetIpAddress;

    /*
     * The protocol used to connect to the target.
     */
    @JsonProperty(value = "protocol", access = JsonProperty.Access.WRITE_ONLY)
    private BastionConnectProtocol protocol;

    /*
     * The resource id of the target.
     */
    @JsonProperty(value = "targetResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String targetResourceId;

    /*
     * Duration in mins the session has been active.
     */
    @JsonProperty(value = "sessionDurationInMins", access = JsonProperty.Access.WRITE_ONLY)
    private Float sessionDurationInMins;

    /** Creates an instance of BastionActiveSessionInner class. */
    public BastionActiveSessionInner() {
    }

    /**
     * Get the sessionId property: A unique id for the session.
     *
     * @return the sessionId value.
     */
    public String sessionId() {
        return this.sessionId;
    }

    /**
     * Get the startTime property: The time when the session started.
     *
     * @return the startTime value.
     */
    public Object startTime() {
        return this.startTime;
    }

    /**
     * Get the targetSubscriptionId property: The subscription id for the target virtual machine.
     *
     * @return the targetSubscriptionId value.
     */
    public String targetSubscriptionId() {
        return this.targetSubscriptionId;
    }

    /**
     * Get the resourceType property: The type of the resource.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the targetHostname property: The host name of the target.
     *
     * @return the targetHostname value.
     */
    public String targetHostname() {
        return this.targetHostname;
    }

    /**
     * Get the targetResourceGroup property: The resource group of the target.
     *
     * @return the targetResourceGroup value.
     */
    public String targetResourceGroup() {
        return this.targetResourceGroup;
    }

    /**
     * Get the username property: The user name who is active on this session.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Get the targetIpAddress property: The IP Address of the target.
     *
     * @return the targetIpAddress value.
     */
    public String targetIpAddress() {
        return this.targetIpAddress;
    }

    /**
     * Get the protocol property: The protocol used to connect to the target.
     *
     * @return the protocol value.
     */
    public BastionConnectProtocol protocol() {
        return this.protocol;
    }

    /**
     * Get the targetResourceId property: The resource id of the target.
     *
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Get the sessionDurationInMins property: Duration in mins the session has been active.
     *
     * @return the sessionDurationInMins value.
     */
    public Float sessionDurationInMins() {
        return this.sessionDurationInMins;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
