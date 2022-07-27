// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The JobScheduleAction model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "actionType")
@JsonTypeName("CreateJob")
@Fluent
public final class JobScheduleAction extends ScheduleActionBase {
    /*
     * [Required] Defines Schedule action definition details.
     */
    @JsonProperty(value = "jobDefinition", required = true)
    private JobBaseProperties jobDefinition;

    /**
     * Get the jobDefinition property: [Required] Defines Schedule action definition details.
     *
     * @return the jobDefinition value.
     */
    public JobBaseProperties jobDefinition() {
        return this.jobDefinition;
    }

    /**
     * Set the jobDefinition property: [Required] Defines Schedule action definition details.
     *
     * @param jobDefinition the jobDefinition value to set.
     * @return the JobScheduleAction object itself.
     */
    public JobScheduleAction withJobDefinition(JobBaseProperties jobDefinition) {
        this.jobDefinition = jobDefinition;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (jobDefinition() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property jobDefinition in model JobScheduleAction"));
        } else {
            jobDefinition().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(JobScheduleAction.class);
}
