// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** status of Start Integrationruntimes. */
public final class WorkspaceStatus extends ExpandableStringEnum<WorkspaceStatus> {
    /** Static value InProgress for WorkspaceStatus. */
    public static final WorkspaceStatus IN_PROGRESS = fromString("InProgress");

    /** Static value Succeeded for WorkspaceStatus. */
    public static final WorkspaceStatus SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for WorkspaceStatus. */
    public static final WorkspaceStatus FAILED = fromString("Failed");

    /**
     * Creates or finds a WorkspaceStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WorkspaceStatus.
     */
    @JsonCreator
    public static WorkspaceStatus fromString(String name) {
        return fromString(name, WorkspaceStatus.class);
    }

    /**
     * Gets known WorkspaceStatus values.
     *
     * @return known WorkspaceStatus values.
     */
    public static Collection<WorkspaceStatus> values() {
        return values(WorkspaceStatus.class);
    }
}
