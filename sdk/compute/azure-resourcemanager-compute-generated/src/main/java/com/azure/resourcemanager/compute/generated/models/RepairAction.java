// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Type of repair action (replace, restart, reimage) that will be used for repairing unhealthy virtual machines in the
 * scale set. Default value is replace.
 */
public final class RepairAction extends ExpandableStringEnum<RepairAction> {
    /** Static value Replace for RepairAction. */
    public static final RepairAction REPLACE = fromString("Replace");

    /** Static value Restart for RepairAction. */
    public static final RepairAction RESTART = fromString("Restart");

    /** Static value Reimage for RepairAction. */
    public static final RepairAction REIMAGE = fromString("Reimage");

    /**
     * Creates or finds a RepairAction from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RepairAction.
     */
    @JsonCreator
    public static RepairAction fromString(String name) {
        return fromString(name, RepairAction.class);
    }

    /**
     * Gets known RepairAction values.
     *
     * @return known RepairAction values.
     */
    public static Collection<RepairAction> values() {
        return values(RepairAction.class);
    }
}
