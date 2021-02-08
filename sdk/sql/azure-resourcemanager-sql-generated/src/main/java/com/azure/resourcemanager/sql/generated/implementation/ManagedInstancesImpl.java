// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.ManagedInstancesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedInstanceInner;
import com.azure.resourcemanager.sql.generated.models.ManagedInstance;
import com.azure.resourcemanager.sql.generated.models.ManagedInstances;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ManagedInstancesImpl implements ManagedInstances {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedInstancesImpl.class);

    private final ManagedInstancesClient innerClient;

    private final SqlManager serviceManager;

    public ManagedInstancesImpl(ManagedInstancesClient innerClient, SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ManagedInstance> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ManagedInstanceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new ManagedInstanceImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagedInstance> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ManagedInstanceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new ManagedInstanceImpl(inner1, this.manager()));
    }

    public ManagedInstance getByResourceGroup(String resourceGroupName, String managedInstanceName) {
        ManagedInstanceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, managedInstanceName);
        if (inner != null) {
            return new ManagedInstanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ManagedInstance> getByResourceGroupWithResponse(
        String resourceGroupName, String managedInstanceName, Context context) {
        Response<ManagedInstanceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, managedInstanceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ManagedInstanceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String managedInstanceName) {
        this.serviceClient().delete(resourceGroupName, managedInstanceName);
    }

    public void delete(String resourceGroupName, String managedInstanceName, Context context) {
        this.serviceClient().delete(resourceGroupName, managedInstanceName, context);
    }

    public PagedIterable<ManagedInstance> list() {
        PagedIterable<ManagedInstanceInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new ManagedInstanceImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagedInstance> list(Context context) {
        PagedIterable<ManagedInstanceInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new ManagedInstanceImpl(inner1, this.manager()));
    }

    public ManagedInstance getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String managedInstanceName = Utils.getValueFromIdByName(id, "managedInstances");
        if (managedInstanceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'managedInstances'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, managedInstanceName, Context.NONE).getValue();
    }

    public Response<ManagedInstance> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String managedInstanceName = Utils.getValueFromIdByName(id, "managedInstances");
        if (managedInstanceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'managedInstances'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, managedInstanceName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String managedInstanceName = Utils.getValueFromIdByName(id, "managedInstances");
        if (managedInstanceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'managedInstances'.", id)));
        }
        this.delete(resourceGroupName, managedInstanceName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String managedInstanceName = Utils.getValueFromIdByName(id, "managedInstances");
        if (managedInstanceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'managedInstances'.", id)));
        }
        this.delete(resourceGroupName, managedInstanceName, context);
    }

    private ManagedInstancesClient serviceClient() {
        return this.innerClient;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    public ManagedInstanceImpl define(String name) {
        return new ManagedInstanceImpl(name, this.manager());
    }
}
