// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CapacityReservationGroupInstanceViewTypes. */
public final class CapacityReservationGroupInstanceViewTypes
    extends ExpandableStringEnum<CapacityReservationGroupInstanceViewTypes> {
    /** Static value instanceView for CapacityReservationGroupInstanceViewTypes. */
    public static final CapacityReservationGroupInstanceViewTypes INSTANCE_VIEW = fromString("instanceView");

    /**
     * Creates or finds a CapacityReservationGroupInstanceViewTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CapacityReservationGroupInstanceViewTypes.
     */
    @JsonCreator
    public static CapacityReservationGroupInstanceViewTypes fromString(String name) {
        return fromString(name, CapacityReservationGroupInstanceViewTypes.class);
    }

    /**
     * Gets known CapacityReservationGroupInstanceViewTypes values.
     *
     * @return known CapacityReservationGroupInstanceViewTypes values.
     */
    public static Collection<CapacityReservationGroupInstanceViewTypes> values() {
        return values(CapacityReservationGroupInstanceViewTypes.class);
    }
}
