// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.fluent.models.ServiceFabricInner;
import com.azure.resourcemanager.devtestlabs.models.ApplicableSchedule;
import com.azure.resourcemanager.devtestlabs.models.EnableStatus;
import com.azure.resourcemanager.devtestlabs.models.ServiceFabric;
import com.azure.resourcemanager.devtestlabs.models.ServiceFabricFragment;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ServiceFabricImpl implements ServiceFabric, ServiceFabric.Definition, ServiceFabric.Update {
    private ServiceFabricInner innerObject;

    private final com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String externalServiceFabricId() {
        return this.innerModel().externalServiceFabricId();
    }

    public String environmentId() {
        return this.innerModel().environmentId();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String uniqueIdentifier() {
        return this.innerModel().uniqueIdentifier();
    }

    public SystemData systemDataPropertiesSystemData() {
        return this.innerModel().systemDataPropertiesSystemData();
    }

    public EnableStatus status() {
        return this.innerModel().status();
    }

    public String taskType() {
        return this.innerModel().taskType();
    }

    public String timeZoneId() {
        return this.innerModel().timeZoneId();
    }

    public OffsetDateTime createdDate() {
        return this.innerModel().createdDate();
    }

    public String targetResourceId() {
        return this.innerModel().targetResourceId();
    }

    public String provisioningStateApplicableScheduleProvisioningState() {
        return this.innerModel().provisioningStateApplicableScheduleProvisioningState();
    }

    public String uniqueIdentifierApplicableScheduleUniqueIdentifier() {
        return this.innerModel().uniqueIdentifierApplicableScheduleUniqueIdentifier();
    }

    public List<String> weekdays() {
        List<String> inner = this.innerModel().weekdays();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String time() {
        return this.innerModel().time();
    }

    public String timeDailyRecurrenceTime() {
        return this.innerModel().timeDailyRecurrenceTime();
    }

    public Integer minute() {
        return this.innerModel().minute();
    }

    public EnableStatus statusNotificationSettingsStatus() {
        return this.innerModel().statusNotificationSettingsStatus();
    }

    public Integer timeInMinutes() {
        return this.innerModel().timeInMinutes();
    }

    public String webhookUrl() {
        return this.innerModel().webhookUrl();
    }

    public String emailRecipient() {
        return this.innerModel().emailRecipient();
    }

    public String notificationLocale() {
        return this.innerModel().notificationLocale();
    }

    public String idPropertiesId() {
        return this.innerModel().idPropertiesId();
    }

    public String namePropertiesName() {
        return this.innerModel().namePropertiesName();
    }

    public String typePropertiesType() {
        return this.innerModel().typePropertiesType();
    }

    public Map<String, String> tagsPropertiesTags() {
        Map<String, String> inner = this.innerModel().tagsPropertiesTags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String locationPropertiesLocation() {
        return this.innerModel().locationPropertiesLocation();
    }

    public SystemData systemDataLabVmsStartupSystemData() {
        return this.innerModel().systemDataLabVmsStartupSystemData();
    }

    public EnableStatus statusLabVmsStartupStatus() {
        return this.innerModel().statusLabVmsStartupStatus();
    }

    public String taskTypeLabVmsStartupTaskType() {
        return this.innerModel().taskTypeLabVmsStartupTaskType();
    }

    public String timeZoneIdLabVmsStartupTimeZoneId() {
        return this.innerModel().timeZoneIdLabVmsStartupTimeZoneId();
    }

    public OffsetDateTime createdDateLabVmsStartupCreatedDate() {
        return this.innerModel().createdDateLabVmsStartupCreatedDate();
    }

    public String targetResourceIdLabVmsStartupTargetResourceId() {
        return this.innerModel().targetResourceIdLabVmsStartupTargetResourceId();
    }

    public String provisioningStateLabVmsStartupProvisioningState() {
        return this.innerModel().provisioningStateLabVmsStartupProvisioningState();
    }

    public String uniqueIdentifierLabVmsStartupUniqueIdentifier() {
        return this.innerModel().uniqueIdentifierLabVmsStartupUniqueIdentifier();
    }

    public List<String> weekdaysLabVmsStartupWeekdays() {
        List<String> inner = this.innerModel().weekdaysLabVmsStartupWeekdays();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String timeLabVmsStartupTime() {
        return this.innerModel().timeLabVmsStartupTime();
    }

    public String timeDailyRecurrenceTimeLabVmsStartupTimeDailyRecurrenceTime() {
        return this.innerModel().timeDailyRecurrenceTimeLabVmsStartupTimeDailyRecurrenceTime();
    }

    public Integer minuteLabVmsStartupMinute() {
        return this.innerModel().minuteLabVmsStartupMinute();
    }

    public EnableStatus statusNotificationSettingsStatusLabVmsStartupStatusNotificationSettingsStatus() {
        return this.innerModel().statusNotificationSettingsStatusLabVmsStartupStatusNotificationSettingsStatus();
    }

    public Integer timeInMinutesLabVmsStartupTimeInMinutes() {
        return this.innerModel().timeInMinutesLabVmsStartupTimeInMinutes();
    }

    public String webhookUrlLabVmsStartupWebhookUrl() {
        return this.innerModel().webhookUrlLabVmsStartupWebhookUrl();
    }

    public String emailRecipientLabVmsStartupEmailRecipient() {
        return this.innerModel().emailRecipientLabVmsStartupEmailRecipient();
    }

    public String notificationLocaleLabVmsStartupNotificationLocale() {
        return this.innerModel().notificationLocaleLabVmsStartupNotificationLocale();
    }

    public String idLabVmsStartupId() {
        return this.innerModel().idLabVmsStartupId();
    }

    public String nameLabVmsStartupName() {
        return this.innerModel().nameLabVmsStartupName();
    }

    public String typeLabVmsStartupType() {
        return this.innerModel().typeLabVmsStartupType();
    }

    public Map<String, String> tagsLabVmsStartupTags() {
        Map<String, String> inner = this.innerModel().tagsLabVmsStartupTags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String locationLabVmsStartupLocation() {
        return this.innerModel().locationLabVmsStartupLocation();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ServiceFabricInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String labName;

    private String username;

    private String name;

    private ServiceFabricFragment updateServiceFabric;

    public ServiceFabricImpl withExistingUser(String resourceGroupName, String labName, String username) {
        this.resourceGroupName = resourceGroupName;
        this.labName = labName;
        this.username = username;
        return this;
    }

    public ServiceFabric create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServiceFabrics()
                .createOrUpdate(resourceGroupName, labName, username, name, this.innerModel(), Context.NONE);
        return this;
    }

    public ServiceFabric create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServiceFabrics()
                .createOrUpdate(resourceGroupName, labName, username, name, this.innerModel(), context);
        return this;
    }

    ServiceFabricImpl(String name, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = new ServiceFabricInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public ServiceFabricImpl update() {
        this.updateServiceFabric = new ServiceFabricFragment();
        return this;
    }

    public ServiceFabric apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServiceFabrics()
                .updateWithResponse(resourceGroupName, labName, username, name, updateServiceFabric, Context.NONE)
                .getValue();
        return this;
    }

    public ServiceFabric apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServiceFabrics()
                .updateWithResponse(resourceGroupName, labName, username, name, updateServiceFabric, context)
                .getValue();
        return this;
    }

    ServiceFabricImpl(
        ServiceFabricInner innerObject, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.labName = Utils.getValueFromIdByName(innerObject.id(), "labs");
        this.username = Utils.getValueFromIdByName(innerObject.id(), "users");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "servicefabrics");
    }

    public ServiceFabric refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServiceFabrics()
                .getWithResponse(resourceGroupName, labName, username, name, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public ServiceFabric refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServiceFabrics()
                .getWithResponse(resourceGroupName, labName, username, name, localExpand, context)
                .getValue();
        return this;
    }

    public ApplicableSchedule listApplicableSchedules() {
        return serviceManager.serviceFabrics().listApplicableSchedules(resourceGroupName, labName, username, name);
    }

    public Response<ApplicableSchedule> listApplicableSchedulesWithResponse(Context context) {
        return serviceManager
            .serviceFabrics()
            .listApplicableSchedulesWithResponse(resourceGroupName, labName, username, name, context);
    }

    public void start() {
        serviceManager.serviceFabrics().start(resourceGroupName, labName, username, name);
    }

    public void start(Context context) {
        serviceManager.serviceFabrics().start(resourceGroupName, labName, username, name, context);
    }

    public void stop() {
        serviceManager.serviceFabrics().stop(resourceGroupName, labName, username, name);
    }

    public void stop(Context context) {
        serviceManager.serviceFabrics().stop(resourceGroupName, labName, username, name, context);
    }

    public ServiceFabricImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ServiceFabricImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ServiceFabricImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateServiceFabric.withTags(tags);
            return this;
        }
    }

    public ServiceFabricImpl withExternalServiceFabricId(String externalServiceFabricId) {
        this.innerModel().withExternalServiceFabricId(externalServiceFabricId);
        return this;
    }

    public ServiceFabricImpl withEnvironmentId(String environmentId) {
        this.innerModel().withEnvironmentId(environmentId);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
