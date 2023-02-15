// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.DscpConfigurationsClient;
import com.azure.resourcemanager.network.generated.fluent.models.DscpConfigurationInner;
import com.azure.resourcemanager.network.generated.models.DscpConfiguration;
import com.azure.resourcemanager.network.generated.models.DscpConfigurations;

public final class DscpConfigurationsImpl implements DscpConfigurations {
    private static final ClientLogger LOGGER = new ClientLogger(DscpConfigurationsImpl.class);

    private final DscpConfigurationsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public DscpConfigurationsImpl(
        DscpConfigurationsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String dscpConfigurationName) {
        this.serviceClient().delete(resourceGroupName, dscpConfigurationName);
    }

    public void delete(String resourceGroupName, String dscpConfigurationName, Context context) {
        this.serviceClient().delete(resourceGroupName, dscpConfigurationName, context);
    }

    public Response<DscpConfiguration> getByResourceGroupWithResponse(
        String resourceGroupName, String dscpConfigurationName, Context context) {
        Response<DscpConfigurationInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, dscpConfigurationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DscpConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DscpConfiguration getByResourceGroup(String resourceGroupName, String dscpConfigurationName) {
        DscpConfigurationInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, dscpConfigurationName);
        if (inner != null) {
            return new DscpConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<DscpConfiguration> listByResourceGroup(String resourceGroupName) {
        PagedIterable<DscpConfigurationInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new DscpConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<DscpConfiguration> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<DscpConfigurationInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new DscpConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<DscpConfiguration> list() {
        PagedIterable<DscpConfigurationInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new DscpConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<DscpConfiguration> list(Context context) {
        PagedIterable<DscpConfigurationInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new DscpConfigurationImpl(inner1, this.manager()));
    }

    public DscpConfiguration getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dscpConfigurationName = Utils.getValueFromIdByName(id, "dscpConfigurations");
        if (dscpConfigurationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dscpConfigurations'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, dscpConfigurationName, Context.NONE).getValue();
    }

    public Response<DscpConfiguration> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dscpConfigurationName = Utils.getValueFromIdByName(id, "dscpConfigurations");
        if (dscpConfigurationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dscpConfigurations'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, dscpConfigurationName, context);
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
        String dscpConfigurationName = Utils.getValueFromIdByName(id, "dscpConfigurations");
        if (dscpConfigurationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dscpConfigurations'.", id)));
        }
        this.delete(resourceGroupName, dscpConfigurationName, Context.NONE);
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
        String dscpConfigurationName = Utils.getValueFromIdByName(id, "dscpConfigurations");
        if (dscpConfigurationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dscpConfigurations'.", id)));
        }
        this.delete(resourceGroupName, dscpConfigurationName, context);
    }

    private DscpConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public DscpConfigurationImpl define(String name) {
        return new DscpConfigurationImpl(name, this.manager());
    }
}
