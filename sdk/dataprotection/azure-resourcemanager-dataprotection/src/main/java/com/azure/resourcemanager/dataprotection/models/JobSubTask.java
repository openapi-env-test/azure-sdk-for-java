// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Details of Job's Sub Task. */
@Fluent
public final class JobSubTask {
    /*
     * Additional details of Sub Tasks
     */
    @JsonProperty(value = "additionalDetails")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> additionalDetails;

    /*
     * Task Id of the Sub Task
     */
    @JsonProperty(value = "taskId", required = true)
    private int taskId;

    /*
     * Name of the Sub Task
     */
    @JsonProperty(value = "taskName", required = true)
    private String taskName;

    /*
     * Progress of the Sub Task
     */
    @JsonProperty(value = "taskProgress", access = JsonProperty.Access.WRITE_ONLY)
    private String taskProgress;

    /*
     * Status of the Sub Task
     */
    @JsonProperty(value = "taskStatus", required = true)
    private String taskStatus;

    /**
     * Get the additionalDetails property: Additional details of Sub Tasks.
     *
     * @return the additionalDetails value.
     */
    public Map<String, String> additionalDetails() {
        return this.additionalDetails;
    }

    /**
     * Set the additionalDetails property: Additional details of Sub Tasks.
     *
     * @param additionalDetails the additionalDetails value to set.
     * @return the JobSubTask object itself.
     */
    public JobSubTask withAdditionalDetails(Map<String, String> additionalDetails) {
        this.additionalDetails = additionalDetails;
        return this;
    }

    /**
     * Get the taskId property: Task Id of the Sub Task.
     *
     * @return the taskId value.
     */
    public int taskId() {
        return this.taskId;
    }

    /**
     * Set the taskId property: Task Id of the Sub Task.
     *
     * @param taskId the taskId value to set.
     * @return the JobSubTask object itself.
     */
    public JobSubTask withTaskId(int taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Get the taskName property: Name of the Sub Task.
     *
     * @return the taskName value.
     */
    public String taskName() {
        return this.taskName;
    }

    /**
     * Set the taskName property: Name of the Sub Task.
     *
     * @param taskName the taskName value to set.
     * @return the JobSubTask object itself.
     */
    public JobSubTask withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * Get the taskProgress property: Progress of the Sub Task.
     *
     * @return the taskProgress value.
     */
    public String taskProgress() {
        return this.taskProgress;
    }

    /**
     * Get the taskStatus property: Status of the Sub Task.
     *
     * @return the taskStatus value.
     */
    public String taskStatus() {
        return this.taskStatus;
    }

    /**
     * Set the taskStatus property: Status of the Sub Task.
     *
     * @param taskStatus the taskStatus value to set.
     * @return the JobSubTask object itself.
     */
    public JobSubTask withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (taskName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property taskName in model JobSubTask"));
        }
        if (taskStatus() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property taskStatus in model JobSubTask"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(JobSubTask.class);
}
