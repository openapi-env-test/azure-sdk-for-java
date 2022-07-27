// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.ManagedInstanceKeysClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedInstanceKeyInner;
import com.azure.resourcemanager.sql.generated.models.ManagedInstanceKey;
import com.azure.resourcemanager.sql.generated.models.ManagedInstanceKeys;

public final class ManagedInstanceKeysImpl implements ManagedInstanceKeys {
    private static final ClientLogger LOGGER = new ClientLogger(ManagedInstanceKeysImpl.class);

    private final ManagedInstanceKeysClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public ManagedInstanceKeysImpl(
        ManagedInstanceKeysClient innerClient, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ManagedInstanceKey> listByInstance(String resourceGroupName, String managedInstanceName) {
        PagedIterable<ManagedInstanceKeyInner> inner =
            this.serviceClient().listByInstance(resourceGroupName, managedInstanceName);
        return Utils.mapPage(inner, inner1 -> new ManagedInstanceKeyImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagedInstanceKey> listByInstance(
        String resourceGroupName, String managedInstanceName, String filter, Context context) {
        PagedIterable<ManagedInstanceKeyInner> inner =
            this.serviceClient().listByInstance(resourceGroupName, managedInstanceName, filter, context);
        return Utils.mapPage(inner, inner1 -> new ManagedInstanceKeyImpl(inner1, this.manager()));
    }

    public ManagedInstanceKey get(String resourceGroupName, String managedInstanceName, String keyName) {
        ManagedInstanceKeyInner inner = this.serviceClient().get(resourceGroupName, managedInstanceName, keyName);
        if (inner != null) {
            return new ManagedInstanceKeyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ManagedInstanceKey> getWithResponse(
        String resourceGroupName, String managedInstanceName, String keyName, Context context) {
        Response<ManagedInstanceKeyInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, managedInstanceName, keyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ManagedInstanceKeyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String managedInstanceName, String keyName) {
        this.serviceClient().delete(resourceGroupName, managedInstanceName, keyName);
    }

    public void delete(String resourceGroupName, String managedInstanceName, String keyName, Context context) {
        this.serviceClient().delete(resourceGroupName, managedInstanceName, keyName, context);
    }

    public ManagedInstanceKey getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String managedInstanceName = Utils.getValueFromIdByName(id, "managedInstances");
        if (managedInstanceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'managedInstances'.", id)));
        }
        String keyName = Utils.getValueFromIdByName(id, "keys");
        if (keyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'keys'.", id)));
        }
        return this.getWithResponse(resourceGroupName, managedInstanceName, keyName, Context.NONE).getValue();
    }

    public Response<ManagedInstanceKey> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String managedInstanceName = Utils.getValueFromIdByName(id, "managedInstances");
        if (managedInstanceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'managedInstances'.", id)));
        }
        String keyName = Utils.getValueFromIdByName(id, "keys");
        if (keyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'keys'.", id)));
        }
        return this.getWithResponse(resourceGroupName, managedInstanceName, keyName, context);
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
        String managedInstanceName = Utils.getValueFromIdByName(id, "managedInstances");
        if (managedInstanceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'managedInstances'.", id)));
        }
        String keyName = Utils.getValueFromIdByName(id, "keys");
        if (keyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'keys'.", id)));
        }
        this.delete(resourceGroupName, managedInstanceName, keyName, Context.NONE);
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
        String managedInstanceName = Utils.getValueFromIdByName(id, "managedInstances");
        if (managedInstanceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'managedInstances'.", id)));
        }
        String keyName = Utils.getValueFromIdByName(id, "keys");
        if (keyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'keys'.", id)));
        }
        this.delete(resourceGroupName, managedInstanceName, keyName, context);
    }

    private ManagedInstanceKeysClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    public ManagedInstanceKeyImpl define(String name) {
        return new ManagedInstanceKeyImpl(name, this.manager());
    }
}
