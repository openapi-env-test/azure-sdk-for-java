// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The repeating times at which this profile begins. This element is not used if the FixedDate element is used. */
@Fluent
public final class Recurrence {
    /*
     * the recurrence frequency. How often the schedule profile should take effect. This value must be Week, meaning
     * each week will have the same set of profiles. For example, to set a daily schedule, set **schedule** to every
     * day of the week. The frequency property specifies that the schedule is repeated weekly.
     */
    @JsonProperty(value = "frequency", required = true)
    private RecurrenceFrequency frequency;

    /*
     * the scheduling constraints for when the profile begins.
     */
    @JsonProperty(value = "schedule", required = true)
    private RecurrentSchedule schedule;

    /** Creates an instance of Recurrence class. */
    public Recurrence() {
    }

    /**
     * Get the frequency property: the recurrence frequency. How often the schedule profile should take effect. This
     * value must be Week, meaning each week will have the same set of profiles. For example, to set a daily schedule,
     * set **schedule** to every day of the week. The frequency property specifies that the schedule is repeated weekly.
     *
     * @return the frequency value.
     */
    public RecurrenceFrequency frequency() {
        return this.frequency;
    }

    /**
     * Set the frequency property: the recurrence frequency. How often the schedule profile should take effect. This
     * value must be Week, meaning each week will have the same set of profiles. For example, to set a daily schedule,
     * set **schedule** to every day of the week. The frequency property specifies that the schedule is repeated weekly.
     *
     * @param frequency the frequency value to set.
     * @return the Recurrence object itself.
     */
    public Recurrence withFrequency(RecurrenceFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Get the schedule property: the scheduling constraints for when the profile begins.
     *
     * @return the schedule value.
     */
    public RecurrentSchedule schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: the scheduling constraints for when the profile begins.
     *
     * @param schedule the schedule value to set.
     * @return the Recurrence object itself.
     */
    public Recurrence withSchedule(RecurrentSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (frequency() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property frequency in model Recurrence"));
        }
        if (schedule() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property schedule in model Recurrence"));
        } else {
            schedule().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Recurrence.class);
}
