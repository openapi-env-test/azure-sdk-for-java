// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for JobProvisioningState. */
public final class JobProvisioningState extends ExpandableStringEnum<JobProvisioningState> {
    /** Static value Succeeded for JobProvisioningState. */
    public static final JobProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for JobProvisioningState. */
    public static final JobProvisioningState FAILED = fromString("Failed");

    /** Static value Canceled for JobProvisioningState. */
    public static final JobProvisioningState CANCELED = fromString("Canceled");

    /** Static value InProgress for JobProvisioningState. */
    public static final JobProvisioningState IN_PROGRESS = fromString("InProgress");

    /**
     * Creates or finds a JobProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding JobProvisioningState.
     */
    @JsonCreator
    public static JobProvisioningState fromString(String name) {
        return fromString(name, JobProvisioningState.class);
    }

    /**
     * Gets known JobProvisioningState values.
     *
     * @return known JobProvisioningState values.
     */
    public static Collection<JobProvisioningState> values() {
        return values(JobProvisioningState.class);
    }
}
