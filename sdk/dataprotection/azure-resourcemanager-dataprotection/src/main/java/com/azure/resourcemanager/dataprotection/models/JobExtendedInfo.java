// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Extended Information about the job. */
@Fluent
public final class JobExtendedInfo {
    /*
     * Job's Additional Details
     */
    @JsonProperty(value = "additionalDetails")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> additionalDetails;

    /*
     * State of the Backup Instance
     */
    @JsonProperty(value = "backupInstanceState", access = JsonProperty.Access.WRITE_ONLY)
    private String backupInstanceState;

    /*
     * Number of bytes transferred
     */
    @JsonProperty(value = "dataTransferredInBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Double dataTransferredInBytes;

    /*
     * Destination where restore is done
     */
    @JsonProperty(value = "recoveryDestination", access = JsonProperty.Access.WRITE_ONLY)
    private String recoveryDestination;

    /*
     * Details of the Source Recovery Point
     */
    @JsonProperty(value = "sourceRecoverPoint", access = JsonProperty.Access.WRITE_ONLY)
    private RestoreJobRecoveryPointDetails sourceRecoverPoint;

    /*
     * List of Sub Tasks of the job
     */
    @JsonProperty(value = "subTasks", access = JsonProperty.Access.WRITE_ONLY)
    private List<JobSubTask> subTasks;

    /*
     * Details of the Target Recovery Point
     */
    @JsonProperty(value = "targetRecoverPoint", access = JsonProperty.Access.WRITE_ONLY)
    private RestoreJobRecoveryPointDetails targetRecoverPoint;

    /**
     * Get the additionalDetails property: Job's Additional Details.
     *
     * @return the additionalDetails value.
     */
    public Map<String, String> additionalDetails() {
        return this.additionalDetails;
    }

    /**
     * Set the additionalDetails property: Job's Additional Details.
     *
     * @param additionalDetails the additionalDetails value to set.
     * @return the JobExtendedInfo object itself.
     */
    public JobExtendedInfo withAdditionalDetails(Map<String, String> additionalDetails) {
        this.additionalDetails = additionalDetails;
        return this;
    }

    /**
     * Get the backupInstanceState property: State of the Backup Instance.
     *
     * @return the backupInstanceState value.
     */
    public String backupInstanceState() {
        return this.backupInstanceState;
    }

    /**
     * Get the dataTransferredInBytes property: Number of bytes transferred.
     *
     * @return the dataTransferredInBytes value.
     */
    public Double dataTransferredInBytes() {
        return this.dataTransferredInBytes;
    }

    /**
     * Get the recoveryDestination property: Destination where restore is done.
     *
     * @return the recoveryDestination value.
     */
    public String recoveryDestination() {
        return this.recoveryDestination;
    }

    /**
     * Get the sourceRecoverPoint property: Details of the Source Recovery Point.
     *
     * @return the sourceRecoverPoint value.
     */
    public RestoreJobRecoveryPointDetails sourceRecoverPoint() {
        return this.sourceRecoverPoint;
    }

    /**
     * Get the subTasks property: List of Sub Tasks of the job.
     *
     * @return the subTasks value.
     */
    public List<JobSubTask> subTasks() {
        return this.subTasks;
    }

    /**
     * Get the targetRecoverPoint property: Details of the Target Recovery Point.
     *
     * @return the targetRecoverPoint value.
     */
    public RestoreJobRecoveryPointDetails targetRecoverPoint() {
        return this.targetRecoverPoint;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceRecoverPoint() != null) {
            sourceRecoverPoint().validate();
        }
        if (subTasks() != null) {
            subTasks().forEach(e -> e.validate());
        }
        if (targetRecoverPoint() != null) {
            targetRecoverPoint().validate();
        }
    }
}
