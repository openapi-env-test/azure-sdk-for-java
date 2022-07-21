// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The recurrence schedule occurrence. */
@Fluent
public final class RecurrenceScheduleOccurrence {
    /*
     * The day of the week.
     */
    @JsonProperty(value = "day")
    private DayOfWeek day;

    /*
     * The occurrence.
     */
    @JsonProperty(value = "occurrence")
    private Integer occurrence;

    /**
     * Get the day property: The day of the week.
     *
     * @return the day value.
     */
    public DayOfWeek day() {
        return this.day;
    }

    /**
     * Set the day property: The day of the week.
     *
     * @param day the day value to set.
     * @return the RecurrenceScheduleOccurrence object itself.
     */
    public RecurrenceScheduleOccurrence withDay(DayOfWeek day) {
        this.day = day;
        return this;
    }

    /**
     * Get the occurrence property: The occurrence.
     *
     * @return the occurrence value.
     */
    public Integer occurrence() {
        return this.occurrence;
    }

    /**
     * Set the occurrence property: The occurrence.
     *
     * @param occurrence the occurrence value to set.
     * @return the RecurrenceScheduleOccurrence object itself.
     */
    public RecurrenceScheduleOccurrence withOccurrence(Integer occurrence) {
        this.occurrence = occurrence;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
