// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TimeSeriesEntityItemAggregationLevel. */
public final class TimeSeriesEntityItemAggregationLevel
    extends ExpandableStringEnum<TimeSeriesEntityItemAggregationLevel> {
    /** Static value week for TimeSeriesEntityItemAggregationLevel. */
    public static final TimeSeriesEntityItemAggregationLevel WEEK = fromString("week");

    /** Static value day for TimeSeriesEntityItemAggregationLevel. */
    public static final TimeSeriesEntityItemAggregationLevel DAY = fromString("day");

    /** Static value month for TimeSeriesEntityItemAggregationLevel. */
    public static final TimeSeriesEntityItemAggregationLevel MONTH = fromString("month");

    /**
     * Creates or finds a TimeSeriesEntityItemAggregationLevel from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TimeSeriesEntityItemAggregationLevel.
     */
    @JsonCreator
    public static TimeSeriesEntityItemAggregationLevel fromString(String name) {
        return fromString(name, TimeSeriesEntityItemAggregationLevel.class);
    }

    /** @return known TimeSeriesEntityItemAggregationLevel values. */
    public static Collection<TimeSeriesEntityItemAggregationLevel> values() {
        return values(TimeSeriesEntityItemAggregationLevel.class);
    }
}
