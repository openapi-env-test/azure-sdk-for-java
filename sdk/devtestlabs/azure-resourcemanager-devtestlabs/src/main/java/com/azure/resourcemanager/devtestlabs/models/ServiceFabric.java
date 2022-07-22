// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.fluent.models.ServiceFabricInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of ServiceFabric. */
public interface ServiceFabric {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the externalServiceFabricId property: The backing service fabric resource's id.
     *
     * @return the externalServiceFabricId value.
     */
    String externalServiceFabricId();

    /**
     * Gets the environmentId property: The resource id of the environment under which the service fabric resource is
     * present.
     *
     * @return the environmentId value.
     */
    String environmentId();

    /**
     * Gets the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value.
     */
    String uniqueIdentifier();

    /**
     * Gets the systemDataPropertiesSystemData property: The system metadata relating to this resource.
     *
     * @return the systemDataPropertiesSystemData value.
     */
    SystemData systemDataPropertiesSystemData();

    /**
     * Gets the status property: The status of the schedule (i.e. Enabled, Disabled).
     *
     * @return the status value.
     */
    EnableStatus status();

    /**
     * Gets the taskType property: The task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart).
     *
     * @return the taskType value.
     */
    String taskType();

    /**
     * Gets the timeZoneId property: The time zone ID (e.g. Pacific Standard time).
     *
     * @return the timeZoneId value.
     */
    String timeZoneId();

    /**
     * Gets the createdDate property: The creation date of the schedule.
     *
     * @return the createdDate value.
     */
    OffsetDateTime createdDate();

    /**
     * Gets the targetResourceId property: The resource ID to which the schedule belongs.
     *
     * @return the targetResourceId value.
     */
    String targetResourceId();

    /**
     * Gets the provisioningStateApplicableScheduleProvisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningStateApplicableScheduleProvisioningState value.
     */
    String provisioningStateApplicableScheduleProvisioningState();

    /**
     * Gets the uniqueIdentifierApplicableScheduleUniqueIdentifier property: The unique immutable identifier of a
     * resource (Guid).
     *
     * @return the uniqueIdentifierApplicableScheduleUniqueIdentifier value.
     */
    String uniqueIdentifierApplicableScheduleUniqueIdentifier();

    /**
     * Gets the weekdays property: The days of the week for which the schedule is set (e.g. Sunday, Monday, Tuesday,
     * etc.).
     *
     * @return the weekdays value.
     */
    List<String> weekdays();

    /**
     * Gets the time property: The time of the day the schedule will occur.
     *
     * @return the time value.
     */
    String time();

    /**
     * Gets the timeDailyRecurrenceTime property: The time of day the schedule will occur.
     *
     * @return the timeDailyRecurrenceTime value.
     */
    String timeDailyRecurrenceTime();

    /**
     * Gets the minute property: Minutes of the hour the schedule will run.
     *
     * @return the minute value.
     */
    Integer minute();

    /**
     * Gets the statusNotificationSettingsStatus property: If notifications are enabled for this schedule (i.e. Enabled,
     * Disabled).
     *
     * @return the statusNotificationSettingsStatus value.
     */
    EnableStatus statusNotificationSettingsStatus();

    /**
     * Gets the timeInMinutes property: Time in minutes before event at which notification will be sent.
     *
     * @return the timeInMinutes value.
     */
    Integer timeInMinutes();

    /**
     * Gets the webhookUrl property: The webhook URL to which the notification will be sent.
     *
     * @return the webhookUrl value.
     */
    String webhookUrl();

    /**
     * Gets the emailRecipient property: The email recipient to send notifications to (can be a list of semi-colon
     * separated email addresses).
     *
     * @return the emailRecipient value.
     */
    String emailRecipient();

    /**
     * Gets the notificationLocale property: The locale to use when sending a notification (fallback for unsupported
     * languages is EN).
     *
     * @return the notificationLocale value.
     */
    String notificationLocale();

    /**
     * Gets the idPropertiesId property: Fully qualified resource ID for the resource. Ex -
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}.
     *
     * @return the idPropertiesId value.
     */
    String idPropertiesId();

    /**
     * Gets the namePropertiesName property: The name of the resource.
     *
     * @return the namePropertiesName value.
     */
    String namePropertiesName();

    /**
     * Gets the typePropertiesType property: The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or
     * "Microsoft.Storage/storageAccounts".
     *
     * @return the typePropertiesType value.
     */
    String typePropertiesType();

    /**
     * Gets the tagsPropertiesTags property: Resource tags.
     *
     * @return the tagsPropertiesTags value.
     */
    Map<String, String> tagsPropertiesTags();

    /**
     * Gets the locationPropertiesLocation property: The geo-location where the resource lives.
     *
     * @return the locationPropertiesLocation value.
     */
    String locationPropertiesLocation();

    /**
     * Gets the systemDataLabVmsStartupSystemData property: The system metadata relating to this resource.
     *
     * @return the systemDataLabVmsStartupSystemData value.
     */
    SystemData systemDataLabVmsStartupSystemData();

    /**
     * Gets the statusLabVmsStartupStatus property: The status of the schedule (i.e. Enabled, Disabled).
     *
     * @return the statusLabVmsStartupStatus value.
     */
    EnableStatus statusLabVmsStartupStatus();

    /**
     * Gets the taskTypeLabVmsStartupTaskType property: The task type of the schedule (e.g. LabVmsShutdownTask,
     * LabVmAutoStart).
     *
     * @return the taskTypeLabVmsStartupTaskType value.
     */
    String taskTypeLabVmsStartupTaskType();

    /**
     * Gets the timeZoneIdLabVmsStartupTimeZoneId property: The time zone ID (e.g. Pacific Standard time).
     *
     * @return the timeZoneIdLabVmsStartupTimeZoneId value.
     */
    String timeZoneIdLabVmsStartupTimeZoneId();

    /**
     * Gets the createdDateLabVmsStartupCreatedDate property: The creation date of the schedule.
     *
     * @return the createdDateLabVmsStartupCreatedDate value.
     */
    OffsetDateTime createdDateLabVmsStartupCreatedDate();

    /**
     * Gets the targetResourceIdLabVmsStartupTargetResourceId property: The resource ID to which the schedule belongs.
     *
     * @return the targetResourceIdLabVmsStartupTargetResourceId value.
     */
    String targetResourceIdLabVmsStartupTargetResourceId();

    /**
     * Gets the provisioningStateLabVmsStartupProvisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningStateLabVmsStartupProvisioningState value.
     */
    String provisioningStateLabVmsStartupProvisioningState();

    /**
     * Gets the uniqueIdentifierLabVmsStartupUniqueIdentifier property: The unique immutable identifier of a resource
     * (Guid).
     *
     * @return the uniqueIdentifierLabVmsStartupUniqueIdentifier value.
     */
    String uniqueIdentifierLabVmsStartupUniqueIdentifier();

    /**
     * Gets the weekdaysLabVmsStartupWeekdays property: The days of the week for which the schedule is set (e.g. Sunday,
     * Monday, Tuesday, etc.).
     *
     * @return the weekdaysLabVmsStartupWeekdays value.
     */
    List<String> weekdaysLabVmsStartupWeekdays();

    /**
     * Gets the timeLabVmsStartupTime property: The time of the day the schedule will occur.
     *
     * @return the timeLabVmsStartupTime value.
     */
    String timeLabVmsStartupTime();

    /**
     * Gets the timeDailyRecurrenceTimeLabVmsStartupTimeDailyRecurrenceTime property: The time of day the schedule will
     * occur.
     *
     * @return the timeDailyRecurrenceTimeLabVmsStartupTimeDailyRecurrenceTime value.
     */
    String timeDailyRecurrenceTimeLabVmsStartupTimeDailyRecurrenceTime();

    /**
     * Gets the minuteLabVmsStartupMinute property: Minutes of the hour the schedule will run.
     *
     * @return the minuteLabVmsStartupMinute value.
     */
    Integer minuteLabVmsStartupMinute();

    /**
     * Gets the statusNotificationSettingsStatusLabVmsStartupStatusNotificationSettingsStatus property: If notifications
     * are enabled for this schedule (i.e. Enabled, Disabled).
     *
     * @return the statusNotificationSettingsStatusLabVmsStartupStatusNotificationSettingsStatus value.
     */
    EnableStatus statusNotificationSettingsStatusLabVmsStartupStatusNotificationSettingsStatus();

    /**
     * Gets the timeInMinutesLabVmsStartupTimeInMinutes property: Time in minutes before event at which notification
     * will be sent.
     *
     * @return the timeInMinutesLabVmsStartupTimeInMinutes value.
     */
    Integer timeInMinutesLabVmsStartupTimeInMinutes();

    /**
     * Gets the webhookUrlLabVmsStartupWebhookUrl property: The webhook URL to which the notification will be sent.
     *
     * @return the webhookUrlLabVmsStartupWebhookUrl value.
     */
    String webhookUrlLabVmsStartupWebhookUrl();

    /**
     * Gets the emailRecipientLabVmsStartupEmailRecipient property: The email recipient to send notifications to (can be
     * a list of semi-colon separated email addresses).
     *
     * @return the emailRecipientLabVmsStartupEmailRecipient value.
     */
    String emailRecipientLabVmsStartupEmailRecipient();

    /**
     * Gets the notificationLocaleLabVmsStartupNotificationLocale property: The locale to use when sending a
     * notification (fallback for unsupported languages is EN).
     *
     * @return the notificationLocaleLabVmsStartupNotificationLocale value.
     */
    String notificationLocaleLabVmsStartupNotificationLocale();

    /**
     * Gets the idLabVmsStartupId property: Fully qualified resource ID for the resource. Ex -
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}.
     *
     * @return the idLabVmsStartupId value.
     */
    String idLabVmsStartupId();

    /**
     * Gets the nameLabVmsStartupName property: The name of the resource.
     *
     * @return the nameLabVmsStartupName value.
     */
    String nameLabVmsStartupName();

    /**
     * Gets the typeLabVmsStartupType property: The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or
     * "Microsoft.Storage/storageAccounts".
     *
     * @return the typeLabVmsStartupType value.
     */
    String typeLabVmsStartupType();

    /**
     * Gets the tagsLabVmsStartupTags property: Resource tags.
     *
     * @return the tagsLabVmsStartupTags value.
     */
    Map<String, String> tagsLabVmsStartupTags();

    /**
     * Gets the locationLabVmsStartupLocation property: The geo-location where the resource lives.
     *
     * @return the locationLabVmsStartupLocation value.
     */
    String locationLabVmsStartupLocation();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.devtestlabs.fluent.models.ServiceFabricInner object.
     *
     * @return the inner object.
     */
    ServiceFabricInner innerModel();

    /** The entirety of the ServiceFabric definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The ServiceFabric definition stages. */
    interface DefinitionStages {
        /** The first stage of the ServiceFabric definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the ServiceFabric definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the ServiceFabric definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, labName, username.
             *
             * @param resourceGroupName The name of the resource group.
             * @param labName The name of the lab.
             * @param username The name of the user profile.
             * @return the next definition stage.
             */
            WithCreate withExistingUser(String resourceGroupName, String labName, String username);
        }
        /**
         * The stage of the ServiceFabric definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithExternalServiceFabricId,
                DefinitionStages.WithEnvironmentId {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ServiceFabric create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ServiceFabric create(Context context);
        }
        /** The stage of the ServiceFabric definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ServiceFabric definition allowing to specify externalServiceFabricId. */
        interface WithExternalServiceFabricId {
            /**
             * Specifies the externalServiceFabricId property: The backing service fabric resource's id.
             *
             * @param externalServiceFabricId The backing service fabric resource's id.
             * @return the next definition stage.
             */
            WithCreate withExternalServiceFabricId(String externalServiceFabricId);
        }
        /** The stage of the ServiceFabric definition allowing to specify environmentId. */
        interface WithEnvironmentId {
            /**
             * Specifies the environmentId property: The resource id of the environment under which the service fabric
             * resource is present.
             *
             * @param environmentId The resource id of the environment under which the service fabric resource is
             *     present.
             * @return the next definition stage.
             */
            WithCreate withEnvironmentId(String environmentId);
        }
    }
    /**
     * Begins update for the ServiceFabric resource.
     *
     * @return the stage of resource update.
     */
    ServiceFabric.Update update();

    /** The template for ServiceFabric update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ServiceFabric apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ServiceFabric apply(Context context);
    }
    /** The ServiceFabric update stages. */
    interface UpdateStages {
        /** The stage of the ServiceFabric update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The tags of the resource..
             *
             * @param tags The tags of the resource.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ServiceFabric refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ServiceFabric refresh(Context context);

    /**
     * Lists the applicable start/stop schedules, if any.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return schedules applicable to a virtual machine.
     */
    ApplicableSchedule listApplicableSchedules();

    /**
     * Lists the applicable start/stop schedules, if any.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return schedules applicable to a virtual machine along with {@link Response}.
     */
    Response<ApplicableSchedule> listApplicableSchedulesWithResponse(Context context);

    /**
     * Start a service fabric. This operation can take a while to complete.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start();

    /**
     * Start a service fabric. This operation can take a while to complete.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(Context context);

    /**
     * Stop a service fabric This operation can take a while to complete.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop();

    /**
     * Stop a service fabric This operation can take a while to complete.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(Context context);
}
