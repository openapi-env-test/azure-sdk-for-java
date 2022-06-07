// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.fluent.ActivityLogAlertsClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.ActivityLogAlertResourceInner;
import com.azure.resourcemanager.monitor.generated.models.ActivityLogAlertResource;
import com.azure.resourcemanager.monitor.generated.models.ActivityLogAlerts;

public final class ActivityLogAlertsImpl implements ActivityLogAlerts {
    private static final ClientLogger LOGGER = new ClientLogger(ActivityLogAlertsImpl.class);

    private final ActivityLogAlertsClient innerClient;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

    public ActivityLogAlertsImpl(
        ActivityLogAlertsClient innerClient,
        com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ActivityLogAlertResource getByResourceGroup(String resourceGroupName, String activityLogAlertName) {
        ActivityLogAlertResourceInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, activityLogAlertName);
        if (inner != null) {
            return new ActivityLogAlertResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ActivityLogAlertResource> getByResourceGroupWithResponse(
        String resourceGroupName, String activityLogAlertName, Context context) {
        Response<ActivityLogAlertResourceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, activityLogAlertName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ActivityLogAlertResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String activityLogAlertName) {
        this.serviceClient().delete(resourceGroupName, activityLogAlertName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String activityLogAlertName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, activityLogAlertName, context);
    }

    public PagedIterable<ActivityLogAlertResource> list() {
        PagedIterable<ActivityLogAlertResourceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ActivityLogAlertResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<ActivityLogAlertResource> list(Context context) {
        PagedIterable<ActivityLogAlertResourceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new ActivityLogAlertResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<ActivityLogAlertResource> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ActivityLogAlertResourceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new ActivityLogAlertResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<ActivityLogAlertResource> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ActivityLogAlertResourceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new ActivityLogAlertResourceImpl(inner1, this.manager()));
    }

    public ActivityLogAlertResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String activityLogAlertName = Utils.getValueFromIdByName(id, "activityLogAlerts");
        if (activityLogAlertName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'activityLogAlerts'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, activityLogAlertName, Context.NONE).getValue();
    }

    public Response<ActivityLogAlertResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String activityLogAlertName = Utils.getValueFromIdByName(id, "activityLogAlerts");
        if (activityLogAlertName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'activityLogAlerts'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, activityLogAlertName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String activityLogAlertName = Utils.getValueFromIdByName(id, "activityLogAlerts");
        if (activityLogAlertName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'activityLogAlerts'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, activityLogAlertName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String activityLogAlertName = Utils.getValueFromIdByName(id, "activityLogAlerts");
        if (activityLogAlertName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'activityLogAlerts'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, activityLogAlertName, context);
    }

    private ActivityLogAlertsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }

    public ActivityLogAlertResourceImpl define(String name) {
        return new ActivityLogAlertResourceImpl(name, this.manager());
    }
}
