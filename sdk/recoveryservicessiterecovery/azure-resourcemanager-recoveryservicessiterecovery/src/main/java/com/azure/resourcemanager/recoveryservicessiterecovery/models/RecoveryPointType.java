// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RecoveryPointType. */
public final class RecoveryPointType extends ExpandableStringEnum<RecoveryPointType> {
    /** Static value LatestTime for RecoveryPointType. */
    public static final RecoveryPointType LATEST_TIME = fromString("LatestTime");

    /** Static value LatestTag for RecoveryPointType. */
    public static final RecoveryPointType LATEST_TAG = fromString("LatestTag");

    /** Static value Custom for RecoveryPointType. */
    public static final RecoveryPointType CUSTOM = fromString("Custom");

    /**
     * Creates or finds a RecoveryPointType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RecoveryPointType.
     */
    @JsonCreator
    public static RecoveryPointType fromString(String name) {
        return fromString(name, RecoveryPointType.class);
    }

    /**
     * Gets known RecoveryPointType values.
     *
     * @return known RecoveryPointType values.
     */
    public static Collection<RecoveryPointType> values() {
        return values(RecoveryPointType.class);
    }
}
