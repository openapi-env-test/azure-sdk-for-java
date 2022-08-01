// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.AdminRuleCollectionsClient;
import com.azure.resourcemanager.network.generated.fluent.models.AdminRuleCollectionInner;
import com.azure.resourcemanager.network.generated.models.AdminRuleCollection;
import com.azure.resourcemanager.network.generated.models.AdminRuleCollections;

public final class AdminRuleCollectionsImpl implements AdminRuleCollections {
    private static final ClientLogger LOGGER = new ClientLogger(AdminRuleCollectionsImpl.class);

    private final AdminRuleCollectionsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public AdminRuleCollectionsImpl(
        AdminRuleCollectionsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AdminRuleCollection> list(
        String resourceGroupName, String networkManagerName, String configurationName) {
        PagedIterable<AdminRuleCollectionInner> inner =
            this.serviceClient().list(resourceGroupName, networkManagerName, configurationName);
        return Utils.mapPage(inner, inner1 -> new AdminRuleCollectionImpl(inner1, this.manager()));
    }

    public PagedIterable<AdminRuleCollection> list(
        String resourceGroupName,
        String networkManagerName,
        String configurationName,
        Integer top,
        String skipToken,
        Context context) {
        PagedIterable<AdminRuleCollectionInner> inner =
            this
                .serviceClient()
                .list(resourceGroupName, networkManagerName, configurationName, top, skipToken, context);
        return Utils.mapPage(inner, inner1 -> new AdminRuleCollectionImpl(inner1, this.manager()));
    }

    public AdminRuleCollection get(
        String resourceGroupName, String networkManagerName, String configurationName, String ruleCollectionName) {
        AdminRuleCollectionInner inner =
            this.serviceClient().get(resourceGroupName, networkManagerName, configurationName, ruleCollectionName);
        if (inner != null) {
            return new AdminRuleCollectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AdminRuleCollection> getWithResponse(
        String resourceGroupName,
        String networkManagerName,
        String configurationName,
        String ruleCollectionName,
        Context context) {
        Response<AdminRuleCollectionInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, networkManagerName, configurationName, ruleCollectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AdminRuleCollectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(
        String resourceGroupName,
        String networkManagerName,
        String configurationName,
        String ruleCollectionName,
        Boolean force) {
        this
            .serviceClient()
            .delete(resourceGroupName, networkManagerName, configurationName, ruleCollectionName, force);
    }

    public void delete(
        String resourceGroupName, String networkManagerName, String configurationName, String ruleCollectionName) {
        this.serviceClient().delete(resourceGroupName, networkManagerName, configurationName, ruleCollectionName);
    }

    public void delete(
        String resourceGroupName,
        String networkManagerName,
        String configurationName,
        String ruleCollectionName,
        Boolean force,
        Context context) {
        this
            .serviceClient()
            .delete(resourceGroupName, networkManagerName, configurationName, ruleCollectionName, force, context);
    }

    public AdminRuleCollection getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = Utils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "securityAdminConfigurations");
        if (configurationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'securityAdminConfigurations'.",
                                id)));
        }
        String ruleCollectionName = Utils.getValueFromIdByName(id, "ruleCollections");
        if (ruleCollectionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'ruleCollections'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, networkManagerName, configurationName, ruleCollectionName, Context.NONE)
            .getValue();
    }

    public Response<AdminRuleCollection> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = Utils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "securityAdminConfigurations");
        if (configurationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'securityAdminConfigurations'.",
                                id)));
        }
        String ruleCollectionName = Utils.getValueFromIdByName(id, "ruleCollections");
        if (ruleCollectionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'ruleCollections'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, networkManagerName, configurationName, ruleCollectionName, context);
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
        String networkManagerName = Utils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "securityAdminConfigurations");
        if (configurationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'securityAdminConfigurations'.",
                                id)));
        }
        String ruleCollectionName = Utils.getValueFromIdByName(id, "ruleCollections");
        if (ruleCollectionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'ruleCollections'.", id)));
        }
        Boolean localForce = null;
        this
            .delete(
                resourceGroupName, networkManagerName, configurationName, ruleCollectionName, localForce, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Boolean force, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = Utils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "securityAdminConfigurations");
        if (configurationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'securityAdminConfigurations'.",
                                id)));
        }
        String ruleCollectionName = Utils.getValueFromIdByName(id, "ruleCollections");
        if (ruleCollectionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'ruleCollections'.", id)));
        }
        this.delete(resourceGroupName, networkManagerName, configurationName, ruleCollectionName, force, context);
    }

    private AdminRuleCollectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public AdminRuleCollectionImpl define(String name) {
        return new AdminRuleCollectionImpl(name, this.manager());
    }
}
