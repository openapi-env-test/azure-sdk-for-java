// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.security.models.SecurityTaskParameters;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Describes properties of a task. */
@Fluent
public final class SecurityTaskProperties {
    /*
     * State of the task (Active, Resolved etc.)
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /*
     * The time this task was discovered in UTC
     */
    @JsonProperty(value = "creationTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTimeUtc;

    /*
     * Changing set of properties, depending on the task type that is derived
     * from the name field
     */
    @JsonProperty(value = "securityTaskParameters")
    private SecurityTaskParameters securityTaskParameters;

    /*
     * The time this task's details were last changed in UTC
     */
    @JsonProperty(value = "lastStateChangeTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastStateChangeTimeUtc;

    /*
     * Additional data on the state of the task
     */
    @JsonProperty(value = "subState", access = JsonProperty.Access.WRITE_ONLY)
    private String subState;

    /**
     * Get the state property: State of the task (Active, Resolved etc.).
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Get the creationTimeUtc property: The time this task was discovered in UTC.
     *
     * @return the creationTimeUtc value.
     */
    public OffsetDateTime creationTimeUtc() {
        return this.creationTimeUtc;
    }

    /**
     * Get the securityTaskParameters property: Changing set of properties, depending on the task type that is derived
     * from the name field.
     *
     * @return the securityTaskParameters value.
     */
    public SecurityTaskParameters securityTaskParameters() {
        return this.securityTaskParameters;
    }

    /**
     * Set the securityTaskParameters property: Changing set of properties, depending on the task type that is derived
     * from the name field.
     *
     * @param securityTaskParameters the securityTaskParameters value to set.
     * @return the SecurityTaskProperties object itself.
     */
    public SecurityTaskProperties withSecurityTaskParameters(SecurityTaskParameters securityTaskParameters) {
        this.securityTaskParameters = securityTaskParameters;
        return this;
    }

    /**
     * Get the lastStateChangeTimeUtc property: The time this task's details were last changed in UTC.
     *
     * @return the lastStateChangeTimeUtc value.
     */
    public OffsetDateTime lastStateChangeTimeUtc() {
        return this.lastStateChangeTimeUtc;
    }

    /**
     * Get the subState property: Additional data on the state of the task.
     *
     * @return the subState value.
     */
    public String subState() {
        return this.subState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (securityTaskParameters() != null) {
            securityTaskParameters().validate();
        }
    }
}
