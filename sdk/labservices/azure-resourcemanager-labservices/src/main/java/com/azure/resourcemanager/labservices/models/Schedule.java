// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.labservices.fluent.models.ScheduleInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of Schedule. */
public interface Schedule {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the schedule.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: Current provisioning state of the schedule.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the startAt property: When lab user virtual machines will be started. Timestamp offsets will be ignored and
     * timeZoneId is used instead.
     *
     * @return the startAt value.
     */
    OffsetDateTime startAt();

    /**
     * Gets the stopAt property: When lab user virtual machines will be stopped. Timestamp offsets will be ignored and
     * timeZoneId is used instead.
     *
     * @return the stopAt value.
     */
    OffsetDateTime stopAt();

    /**
     * Gets the recurrencePattern property: The recurrence pattern of the scheduled actions.
     *
     * @return the recurrencePattern value.
     */
    RecurrencePattern recurrencePattern();

    /**
     * Gets the timeZoneId property: The IANA timezone id for the schedule.
     *
     * @return the timeZoneId value.
     */
    String timeZoneId();

    /**
     * Gets the notes property: Notes for this schedule.
     *
     * @return the notes value.
     */
    String notes();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.labservices.fluent.models.ScheduleInner object.
     *
     * @return the inner object.
     */
    ScheduleInner innerModel();

    /** The entirety of the Schedule definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The Schedule definition stages. */
    interface DefinitionStages {
        /** The first stage of the Schedule definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Schedule definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, labName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param labName The name of the lab that uniquely identifies it within containing lab account. Used in
             *     resource URIs.
             * @return the next definition stage.
             */
            WithCreate withExistingLab(String resourceGroupName, String labName);
        }
        /**
         * The stage of the Schedule definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithStartAt,
                DefinitionStages.WithStopAt,
                DefinitionStages.WithRecurrencePattern,
                DefinitionStages.WithTimeZoneId,
                DefinitionStages.WithNotes {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Schedule create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Schedule create(Context context);
        }
        /** The stage of the Schedule definition allowing to specify startAt. */
        interface WithStartAt {
            /**
             * Specifies the startAt property: When lab user virtual machines will be started. Timestamp offsets will be
             * ignored and timeZoneId is used instead..
             *
             * @param startAt When lab user virtual machines will be started. Timestamp offsets will be ignored and
             *     timeZoneId is used instead.
             * @return the next definition stage.
             */
            WithCreate withStartAt(OffsetDateTime startAt);
        }
        /** The stage of the Schedule definition allowing to specify stopAt. */
        interface WithStopAt {
            /**
             * Specifies the stopAt property: When lab user virtual machines will be stopped. Timestamp offsets will be
             * ignored and timeZoneId is used instead..
             *
             * @param stopAt When lab user virtual machines will be stopped. Timestamp offsets will be ignored and
             *     timeZoneId is used instead.
             * @return the next definition stage.
             */
            WithCreate withStopAt(OffsetDateTime stopAt);
        }
        /** The stage of the Schedule definition allowing to specify recurrencePattern. */
        interface WithRecurrencePattern {
            /**
             * Specifies the recurrencePattern property: The recurrence pattern of the scheduled actions..
             *
             * @param recurrencePattern The recurrence pattern of the scheduled actions.
             * @return the next definition stage.
             */
            WithCreate withRecurrencePattern(RecurrencePattern recurrencePattern);
        }
        /** The stage of the Schedule definition allowing to specify timeZoneId. */
        interface WithTimeZoneId {
            /**
             * Specifies the timeZoneId property: The IANA timezone id for the schedule..
             *
             * @param timeZoneId The IANA timezone id for the schedule.
             * @return the next definition stage.
             */
            WithCreate withTimeZoneId(String timeZoneId);
        }
        /** The stage of the Schedule definition allowing to specify notes. */
        interface WithNotes {
            /**
             * Specifies the notes property: Notes for this schedule..
             *
             * @param notes Notes for this schedule.
             * @return the next definition stage.
             */
            WithCreate withNotes(String notes);
        }
    }
    /**
     * Begins update for the Schedule resource.
     *
     * @return the stage of resource update.
     */
    Schedule.Update update();

    /** The template for Schedule update. */
    interface Update
        extends UpdateStages.WithStartAt,
            UpdateStages.WithStopAt,
            UpdateStages.WithRecurrencePattern,
            UpdateStages.WithTimeZoneId,
            UpdateStages.WithNotes {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Schedule apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Schedule apply(Context context);
    }
    /** The Schedule update stages. */
    interface UpdateStages {
        /** The stage of the Schedule update allowing to specify startAt. */
        interface WithStartAt {
            /**
             * Specifies the startAt property: When lab user virtual machines will be started. Timestamp offsets will be
             * ignored and timeZoneId is used instead..
             *
             * @param startAt When lab user virtual machines will be started. Timestamp offsets will be ignored and
             *     timeZoneId is used instead.
             * @return the next definition stage.
             */
            Update withStartAt(OffsetDateTime startAt);
        }
        /** The stage of the Schedule update allowing to specify stopAt. */
        interface WithStopAt {
            /**
             * Specifies the stopAt property: When lab user virtual machines will be stopped. Timestamp offsets will be
             * ignored and timeZoneId is used instead..
             *
             * @param stopAt When lab user virtual machines will be stopped. Timestamp offsets will be ignored and
             *     timeZoneId is used instead.
             * @return the next definition stage.
             */
            Update withStopAt(OffsetDateTime stopAt);
        }
        /** The stage of the Schedule update allowing to specify recurrencePattern. */
        interface WithRecurrencePattern {
            /**
             * Specifies the recurrencePattern property: The recurrence pattern of the scheduled actions..
             *
             * @param recurrencePattern The recurrence pattern of the scheduled actions.
             * @return the next definition stage.
             */
            Update withRecurrencePattern(RecurrencePattern recurrencePattern);
        }
        /** The stage of the Schedule update allowing to specify timeZoneId. */
        interface WithTimeZoneId {
            /**
             * Specifies the timeZoneId property: The IANA timezone id for the schedule..
             *
             * @param timeZoneId The IANA timezone id for the schedule.
             * @return the next definition stage.
             */
            Update withTimeZoneId(String timeZoneId);
        }
        /** The stage of the Schedule update allowing to specify notes. */
        interface WithNotes {
            /**
             * Specifies the notes property: Notes for this schedule..
             *
             * @param notes Notes for this schedule.
             * @return the next definition stage.
             */
            Update withNotes(String notes);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Schedule refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Schedule refresh(Context context);
}
