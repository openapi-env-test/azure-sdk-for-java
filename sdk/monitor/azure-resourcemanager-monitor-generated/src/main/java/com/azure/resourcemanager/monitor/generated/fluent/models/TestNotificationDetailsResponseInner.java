// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.models.ActionDetail;
import com.azure.resourcemanager.monitor.generated.models.Context;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The details of the test notification results. */
@Fluent
public final class TestNotificationDetailsResponseInner {
    /*
     * The context info
     */
    @JsonProperty(value = "context")
    private Context context;

    /*
     * The overall state
     */
    @JsonProperty(value = "state", required = true)
    private String state;

    /*
     * The completed time
     */
    @JsonProperty(value = "completedTime")
    private String completedTime;

    /*
     * The created time
     */
    @JsonProperty(value = "createdTime")
    private String createdTime;

    /*
     * The list of action detail
     */
    @JsonProperty(value = "actionDetails")
    private List<ActionDetail> actionDetails;

    /**
     * Get the context property: The context info.
     *
     * @return the context value.
     */
    public Context context() {
        return this.context;
    }

    /**
     * Set the context property: The context info.
     *
     * @param context the context value to set.
     * @return the TestNotificationDetailsResponseInner object itself.
     */
    public TestNotificationDetailsResponseInner withContext(Context context) {
        this.context = context;
        return this;
    }

    /**
     * Get the state property: The overall state.
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: The overall state.
     *
     * @param state the state value to set.
     * @return the TestNotificationDetailsResponseInner object itself.
     */
    public TestNotificationDetailsResponseInner withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the completedTime property: The completed time.
     *
     * @return the completedTime value.
     */
    public String completedTime() {
        return this.completedTime;
    }

    /**
     * Set the completedTime property: The completed time.
     *
     * @param completedTime the completedTime value to set.
     * @return the TestNotificationDetailsResponseInner object itself.
     */
    public TestNotificationDetailsResponseInner withCompletedTime(String completedTime) {
        this.completedTime = completedTime;
        return this;
    }

    /**
     * Get the createdTime property: The created time.
     *
     * @return the createdTime value.
     */
    public String createdTime() {
        return this.createdTime;
    }

    /**
     * Set the createdTime property: The created time.
     *
     * @param createdTime the createdTime value to set.
     * @return the TestNotificationDetailsResponseInner object itself.
     */
    public TestNotificationDetailsResponseInner withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Get the actionDetails property: The list of action detail.
     *
     * @return the actionDetails value.
     */
    public List<ActionDetail> actionDetails() {
        return this.actionDetails;
    }

    /**
     * Set the actionDetails property: The list of action detail.
     *
     * @param actionDetails the actionDetails value to set.
     * @return the TestNotificationDetailsResponseInner object itself.
     */
    public TestNotificationDetailsResponseInner withActionDetails(List<ActionDetail> actionDetails) {
        this.actionDetails = actionDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (context() != null) {
            context().validate();
        }
        if (state() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property state in model TestNotificationDetailsResponseInner"));
        }
        if (actionDetails() != null) {
            actionDetails().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TestNotificationDetailsResponseInner.class);
}
