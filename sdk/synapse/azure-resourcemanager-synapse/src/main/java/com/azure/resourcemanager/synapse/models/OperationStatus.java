// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OperationStatus. */
public final class OperationStatus extends ExpandableStringEnum<OperationStatus> {
    /** Static value InProgress for OperationStatus. */
    public static final OperationStatus IN_PROGRESS = fromString("InProgress");

    /** Static value Succeeded for OperationStatus. */
    public static final OperationStatus SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for OperationStatus. */
    public static final OperationStatus FAILED = fromString("Failed");

    /** Static value Canceled for OperationStatus. */
    public static final OperationStatus CANCELED = fromString("Canceled");

    /**
     * Creates or finds a OperationStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OperationStatus.
     */
    @JsonCreator
    public static OperationStatus fromString(String name) {
        return fromString(name, OperationStatus.class);
    }

    /**
     * Gets known OperationStatus values.
     *
     * @return known OperationStatus values.
     */
    public static Collection<OperationStatus> values() {
        return values(OperationStatus.class);
    }
}
