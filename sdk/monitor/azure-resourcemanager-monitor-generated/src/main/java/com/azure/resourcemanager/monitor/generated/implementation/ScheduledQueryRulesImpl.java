// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.fluent.ScheduledQueryRulesClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.LogSearchRuleResourceInner;
import com.azure.resourcemanager.monitor.generated.models.LogSearchRuleResource;
import com.azure.resourcemanager.monitor.generated.models.ScheduledQueryRules;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ScheduledQueryRulesImpl implements ScheduledQueryRules {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ScheduledQueryRulesImpl.class);

    private final ScheduledQueryRulesClient innerClient;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

    public ScheduledQueryRulesImpl(
        ScheduledQueryRulesClient innerClient,
        com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public LogSearchRuleResource getByResourceGroup(String resourceGroupName, String ruleName) {
        LogSearchRuleResourceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, ruleName);
        if (inner != null) {
            return new LogSearchRuleResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LogSearchRuleResource> getByResourceGroupWithResponse(
        String resourceGroupName, String ruleName, Context context) {
        Response<LogSearchRuleResourceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, ruleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LogSearchRuleResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String ruleName) {
        this.serviceClient().delete(resourceGroupName, ruleName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String ruleName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, ruleName, context);
    }

    public PagedIterable<LogSearchRuleResource> list() {
        PagedIterable<LogSearchRuleResourceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new LogSearchRuleResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<LogSearchRuleResource> list(String filter, Context context) {
        PagedIterable<LogSearchRuleResourceInner> inner = this.serviceClient().list(filter, context);
        return Utils.mapPage(inner, inner1 -> new LogSearchRuleResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<LogSearchRuleResource> listByResourceGroup(String resourceGroupName) {
        PagedIterable<LogSearchRuleResourceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new LogSearchRuleResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<LogSearchRuleResource> listByResourceGroup(
        String resourceGroupName, String filter, Context context) {
        PagedIterable<LogSearchRuleResourceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, filter, context);
        return Utils.mapPage(inner, inner1 -> new LogSearchRuleResourceImpl(inner1, this.manager()));
    }

    public LogSearchRuleResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String ruleName = Utils.getValueFromIdByName(id, "scheduledQueryRules");
        if (ruleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'scheduledQueryRules'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, ruleName, Context.NONE).getValue();
    }

    public Response<LogSearchRuleResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String ruleName = Utils.getValueFromIdByName(id, "scheduledQueryRules");
        if (ruleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'scheduledQueryRules'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, ruleName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String ruleName = Utils.getValueFromIdByName(id, "scheduledQueryRules");
        if (ruleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'scheduledQueryRules'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, ruleName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String ruleName = Utils.getValueFromIdByName(id, "scheduledQueryRules");
        if (ruleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'scheduledQueryRules'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, ruleName, context);
    }

    private ScheduledQueryRulesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }

    public LogSearchRuleResourceImpl define(String name) {
        return new LogSearchRuleResourceImpl(name, this.manager());
    }
}
