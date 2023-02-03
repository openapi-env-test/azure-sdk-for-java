// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicebus.generated.fluent.MigrationConfigsClient;
import com.azure.resourcemanager.servicebus.generated.fluent.models.MigrationConfigPropertiesInner;
import com.azure.resourcemanager.servicebus.generated.models.MigrationConfigProperties;
import com.azure.resourcemanager.servicebus.generated.models.MigrationConfigs;
import com.azure.resourcemanager.servicebus.generated.models.MigrationConfigurationName;

public final class MigrationConfigsImpl implements MigrationConfigs {
    private static final ClientLogger LOGGER = new ClientLogger(MigrationConfigsImpl.class);

    private final MigrationConfigsClient innerClient;

    private final com.azure.resourcemanager.servicebus.generated.ServiceBusManager serviceManager;

    public MigrationConfigsImpl(
        MigrationConfigsClient innerClient,
        com.azure.resourcemanager.servicebus.generated.ServiceBusManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MigrationConfigProperties> list(String resourceGroupName, String namespaceName) {
        PagedIterable<MigrationConfigPropertiesInner> inner =
            this.serviceClient().list(resourceGroupName, namespaceName);
        return Utils.mapPage(inner, inner1 -> new MigrationConfigPropertiesImpl(inner1, this.manager()));
    }

    public PagedIterable<MigrationConfigProperties> list(
        String resourceGroupName, String namespaceName, Context context) {
        PagedIterable<MigrationConfigPropertiesInner> inner =
            this.serviceClient().list(resourceGroupName, namespaceName, context);
        return Utils.mapPage(inner, inner1 -> new MigrationConfigPropertiesImpl(inner1, this.manager()));
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String namespaceName, MigrationConfigurationName configName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, namespaceName, configName, context);
    }

    public void delete(String resourceGroupName, String namespaceName, MigrationConfigurationName configName) {
        this.serviceClient().delete(resourceGroupName, namespaceName, configName);
    }

    public Response<MigrationConfigProperties> getWithResponse(
        String resourceGroupName, String namespaceName, MigrationConfigurationName configName, Context context) {
        Response<MigrationConfigPropertiesInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, namespaceName, configName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MigrationConfigPropertiesImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public MigrationConfigProperties get(
        String resourceGroupName, String namespaceName, MigrationConfigurationName configName) {
        MigrationConfigPropertiesInner inner = this.serviceClient().get(resourceGroupName, namespaceName, configName);
        if (inner != null) {
            return new MigrationConfigPropertiesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> completeMigrationWithResponse(
        String resourceGroupName, String namespaceName, MigrationConfigurationName configName, Context context) {
        return this
            .serviceClient()
            .completeMigrationWithResponse(resourceGroupName, namespaceName, configName, context);
    }

    public void completeMigration(
        String resourceGroupName, String namespaceName, MigrationConfigurationName configName) {
        this.serviceClient().completeMigration(resourceGroupName, namespaceName, configName);
    }

    public Response<Void> revertWithResponse(
        String resourceGroupName, String namespaceName, MigrationConfigurationName configName, Context context) {
        return this.serviceClient().revertWithResponse(resourceGroupName, namespaceName, configName, context);
    }

    public void revert(String resourceGroupName, String namespaceName, MigrationConfigurationName configName) {
        this.serviceClient().revert(resourceGroupName, namespaceName, configName);
    }

    public MigrationConfigProperties getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String configNameLocal = Utils.getValueFromIdByName(id, "migrationConfigurations");
        if (configNameLocal == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'migrationConfigurations'.",
                                id)));
        }
        MigrationConfigurationName configName = MigrationConfigurationName.fromString(configNameLocal);
        return this.getWithResponse(resourceGroupName, namespaceName, configName, Context.NONE).getValue();
    }

    public Response<MigrationConfigProperties> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String configNameLocal = Utils.getValueFromIdByName(id, "migrationConfigurations");
        if (configNameLocal == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'migrationConfigurations'.",
                                id)));
        }
        MigrationConfigurationName configName = MigrationConfigurationName.fromString(configNameLocal);
        return this.getWithResponse(resourceGroupName, namespaceName, configName, context);
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
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String configNameLocal = Utils.getValueFromIdByName(id, "migrationConfigurations");
        if (configNameLocal == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'migrationConfigurations'.",
                                id)));
        }
        MigrationConfigurationName configName = MigrationConfigurationName.fromString(configNameLocal);
        this.deleteWithResponse(resourceGroupName, namespaceName, configName, Context.NONE);
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
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String configNameLocal = Utils.getValueFromIdByName(id, "migrationConfigurations");
        if (configNameLocal == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'migrationConfigurations'.",
                                id)));
        }
        MigrationConfigurationName configName = MigrationConfigurationName.fromString(configNameLocal);
        return this.deleteWithResponse(resourceGroupName, namespaceName, configName, context);
    }

    private MigrationConfigsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.servicebus.generated.ServiceBusManager manager() {
        return this.serviceManager;
    }

    public MigrationConfigPropertiesImpl define(MigrationConfigurationName name) {
        return new MigrationConfigPropertiesImpl(name, this.manager());
    }
}
