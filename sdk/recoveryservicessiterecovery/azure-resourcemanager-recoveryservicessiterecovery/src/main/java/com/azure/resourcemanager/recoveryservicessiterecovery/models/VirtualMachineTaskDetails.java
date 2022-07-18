// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** This class represents the virtual machine task details. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("VirtualMachineTaskDetails")
@Fluent
public final class VirtualMachineTaskDetails extends JobTaskDetails {
    /*
     * The skipped reason.
     */
    @JsonProperty(value = "skippedReason")
    private String skippedReason;

    /*
     * The skipped reason string.
     */
    @JsonProperty(value = "skippedReasonString")
    private String skippedReasonString;

    /**
     * Get the skippedReason property: The skipped reason.
     *
     * @return the skippedReason value.
     */
    public String skippedReason() {
        return this.skippedReason;
    }

    /**
     * Set the skippedReason property: The skipped reason.
     *
     * @param skippedReason the skippedReason value to set.
     * @return the VirtualMachineTaskDetails object itself.
     */
    public VirtualMachineTaskDetails withSkippedReason(String skippedReason) {
        this.skippedReason = skippedReason;
        return this;
    }

    /**
     * Get the skippedReasonString property: The skipped reason string.
     *
     * @return the skippedReasonString value.
     */
    public String skippedReasonString() {
        return this.skippedReasonString;
    }

    /**
     * Set the skippedReasonString property: The skipped reason string.
     *
     * @param skippedReasonString the skippedReasonString value to set.
     * @return the VirtualMachineTaskDetails object itself.
     */
    public VirtualMachineTaskDetails withSkippedReasonString(String skippedReasonString) {
        this.skippedReasonString = skippedReasonString;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineTaskDetails withJobTask(JobEntity jobTask) {
        super.withJobTask(jobTask);
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
    }
}
