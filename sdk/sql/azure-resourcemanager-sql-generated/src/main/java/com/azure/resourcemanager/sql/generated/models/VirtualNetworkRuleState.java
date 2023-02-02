// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Virtual Network Rule State. */
public final class VirtualNetworkRuleState extends ExpandableStringEnum<VirtualNetworkRuleState> {
    /** Static value Initializing for VirtualNetworkRuleState. */
    public static final VirtualNetworkRuleState INITIALIZING = fromString("Initializing");

    /** Static value InProgress for VirtualNetworkRuleState. */
    public static final VirtualNetworkRuleState IN_PROGRESS = fromString("InProgress");

    /** Static value Ready for VirtualNetworkRuleState. */
    public static final VirtualNetworkRuleState READY = fromString("Ready");

    /** Static value Failed for VirtualNetworkRuleState. */
    public static final VirtualNetworkRuleState FAILED = fromString("Failed");

    /** Static value Deleting for VirtualNetworkRuleState. */
    public static final VirtualNetworkRuleState DELETING = fromString("Deleting");

    /** Static value Unknown for VirtualNetworkRuleState. */
    public static final VirtualNetworkRuleState UNKNOWN = fromString("Unknown");

    /**
     * Creates or finds a VirtualNetworkRuleState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VirtualNetworkRuleState.
     */
    @JsonCreator
    public static VirtualNetworkRuleState fromString(String name) {
        return fromString(name, VirtualNetworkRuleState.class);
    }

    /**
     * Gets known VirtualNetworkRuleState values.
     *
     * @return known VirtualNetworkRuleState values.
     */
    public static Collection<VirtualNetworkRuleState> values() {
        return values(VirtualNetworkRuleState.class);
    }
}
