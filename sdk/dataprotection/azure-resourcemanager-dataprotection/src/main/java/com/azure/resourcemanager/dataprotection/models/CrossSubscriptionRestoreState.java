// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** CrossSubscriptionRestore state. */
public final class CrossSubscriptionRestoreState extends ExpandableStringEnum<CrossSubscriptionRestoreState> {
    /** Static value Disabled for CrossSubscriptionRestoreState. */
    public static final CrossSubscriptionRestoreState DISABLED = fromString("Disabled");

    /** Static value PermanentlyDisabled for CrossSubscriptionRestoreState. */
    public static final CrossSubscriptionRestoreState PERMANENTLY_DISABLED = fromString("PermanentlyDisabled");

    /** Static value Enabled for CrossSubscriptionRestoreState. */
    public static final CrossSubscriptionRestoreState ENABLED = fromString("Enabled");

    /**
     * Creates or finds a CrossSubscriptionRestoreState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CrossSubscriptionRestoreState.
     */
    @JsonCreator
    public static CrossSubscriptionRestoreState fromString(String name) {
        return fromString(name, CrossSubscriptionRestoreState.class);
    }

    /**
     * Gets known CrossSubscriptionRestoreState values.
     *
     * @return known CrossSubscriptionRestoreState values.
     */
    public static Collection<CrossSubscriptionRestoreState> values() {
        return values(CrossSubscriptionRestoreState.class);
    }
}
