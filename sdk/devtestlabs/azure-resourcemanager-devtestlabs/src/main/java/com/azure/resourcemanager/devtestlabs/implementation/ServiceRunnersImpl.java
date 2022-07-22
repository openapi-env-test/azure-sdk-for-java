// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devtestlabs.fluent.ServiceRunnersClient;
import com.azure.resourcemanager.devtestlabs.fluent.models.ServiceRunnerInner;
import com.azure.resourcemanager.devtestlabs.models.ServiceRunner;
import com.azure.resourcemanager.devtestlabs.models.ServiceRunners;

public final class ServiceRunnersImpl implements ServiceRunners {
    private static final ClientLogger LOGGER = new ClientLogger(ServiceRunnersImpl.class);

    private final ServiceRunnersClient innerClient;

    private final com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager;

    public ServiceRunnersImpl(
        ServiceRunnersClient innerClient, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ServiceRunner> list(String resourceGroupName, String labName) {
        PagedIterable<ServiceRunnerInner> inner = this.serviceClient().list(resourceGroupName, labName);
        return Utils.mapPage(inner, inner1 -> new ServiceRunnerImpl(inner1, this.manager()));
    }

    public PagedIterable<ServiceRunner> list(
        String resourceGroupName, String labName, String filter, Integer top, String orderby, Context context) {
        PagedIterable<ServiceRunnerInner> inner =
            this.serviceClient().list(resourceGroupName, labName, filter, top, orderby, context);
        return Utils.mapPage(inner, inner1 -> new ServiceRunnerImpl(inner1, this.manager()));
    }

    public ServiceRunner get(String resourceGroupName, String labName, String name) {
        ServiceRunnerInner inner = this.serviceClient().get(resourceGroupName, labName, name);
        if (inner != null) {
            return new ServiceRunnerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ServiceRunner> getWithResponse(
        String resourceGroupName, String labName, String name, Context context) {
        Response<ServiceRunnerInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, labName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServiceRunnerImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String labName, String name) {
        this.serviceClient().delete(resourceGroupName, labName, name);
    }

    public void delete(String resourceGroupName, String labName, String name, Context context) {
        this.serviceClient().delete(resourceGroupName, labName, name, context);
    }

    public ServiceRunner getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "servicerunners");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'servicerunners'.", id)));
        }
        return this.getWithResponse(resourceGroupName, labName, name, Context.NONE).getValue();
    }

    public Response<ServiceRunner> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "servicerunners");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'servicerunners'.", id)));
        }
        return this.getWithResponse(resourceGroupName, labName, name, context);
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
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "servicerunners");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'servicerunners'.", id)));
        }
        this.delete(resourceGroupName, labName, name, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "servicerunners");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'servicerunners'.", id)));
        }
        this.delete(resourceGroupName, labName, name, context);
    }

    private ServiceRunnersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager() {
        return this.serviceManager;
    }

    public ServiceRunnerImpl define(String name) {
        return new ServiceRunnerImpl(name, this.manager());
    }
}
