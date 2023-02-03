// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Enable or Disable public network access to workspace. */
public final class WorkspacePublicNetworkAccess extends ExpandableStringEnum<WorkspacePublicNetworkAccess> {
    /** Static value Enabled for WorkspacePublicNetworkAccess. */
    public static final WorkspacePublicNetworkAccess ENABLED = fromString("Enabled");

    /** Static value Disabled for WorkspacePublicNetworkAccess. */
    public static final WorkspacePublicNetworkAccess DISABLED = fromString("Disabled");

    /**
     * Creates or finds a WorkspacePublicNetworkAccess from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WorkspacePublicNetworkAccess.
     */
    @JsonCreator
    public static WorkspacePublicNetworkAccess fromString(String name) {
        return fromString(name, WorkspacePublicNetworkAccess.class);
    }

    /**
     * Gets known WorkspacePublicNetworkAccess values.
     *
     * @return known WorkspacePublicNetworkAccess values.
     */
    public static Collection<WorkspacePublicNetworkAccess> values() {
        return values(WorkspacePublicNetworkAccess.class);
    }
}
