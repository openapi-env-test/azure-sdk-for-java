// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.DatabaseSecurityAlertPoliciesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.DatabaseSecurityAlertPolicyInner;
import com.azure.resourcemanager.sql.generated.models.DatabaseSecurityAlertPolicies;
import com.azure.resourcemanager.sql.generated.models.DatabaseSecurityAlertPolicy;
import com.azure.resourcemanager.sql.generated.models.SecurityAlertPolicyName;

public final class DatabaseSecurityAlertPoliciesImpl implements DatabaseSecurityAlertPolicies {
    private static final ClientLogger LOGGER = new ClientLogger(DatabaseSecurityAlertPoliciesImpl.class);

    private final DatabaseSecurityAlertPoliciesClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public DatabaseSecurityAlertPoliciesImpl(
        DatabaseSecurityAlertPoliciesClient innerClient,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<DatabaseSecurityAlertPolicy> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        SecurityAlertPolicyName securityAlertPolicyName,
        Context context) {
        Response<DatabaseSecurityAlertPolicyInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, serverName, databaseName, securityAlertPolicyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DatabaseSecurityAlertPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DatabaseSecurityAlertPolicy get(
        String resourceGroupName,
        String serverName,
        String databaseName,
        SecurityAlertPolicyName securityAlertPolicyName) {
        DatabaseSecurityAlertPolicyInner inner =
            this.serviceClient().get(resourceGroupName, serverName, databaseName, securityAlertPolicyName);
        if (inner != null) {
            return new DatabaseSecurityAlertPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<DatabaseSecurityAlertPolicy> listByDatabase(
        String resourceGroupName, String serverName, String databaseName) {
        PagedIterable<DatabaseSecurityAlertPolicyInner> inner =
            this.serviceClient().listByDatabase(resourceGroupName, serverName, databaseName);
        return Utils.mapPage(inner, inner1 -> new DatabaseSecurityAlertPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<DatabaseSecurityAlertPolicy> listByDatabase(
        String resourceGroupName, String serverName, String databaseName, Context context) {
        PagedIterable<DatabaseSecurityAlertPolicyInner> inner =
            this.serviceClient().listByDatabase(resourceGroupName, serverName, databaseName, context);
        return Utils.mapPage(inner, inner1 -> new DatabaseSecurityAlertPolicyImpl(inner1, this.manager()));
    }

    public DatabaseSecurityAlertPolicy getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        String securityAlertPolicyNameLocal = Utils.getValueFromIdByName(id, "securityAlertPolicies");
        if (securityAlertPolicyNameLocal == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'securityAlertPolicies'.",
                                id)));
        }
        SecurityAlertPolicyName securityAlertPolicyName =
            SecurityAlertPolicyName.fromString(securityAlertPolicyNameLocal);
        return this
            .getWithResponse(resourceGroupName, serverName, databaseName, securityAlertPolicyName, Context.NONE)
            .getValue();
    }

    public Response<DatabaseSecurityAlertPolicy> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        String securityAlertPolicyNameLocal = Utils.getValueFromIdByName(id, "securityAlertPolicies");
        if (securityAlertPolicyNameLocal == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'securityAlertPolicies'.",
                                id)));
        }
        SecurityAlertPolicyName securityAlertPolicyName =
            SecurityAlertPolicyName.fromString(securityAlertPolicyNameLocal);
        return this.getWithResponse(resourceGroupName, serverName, databaseName, securityAlertPolicyName, context);
    }

    private DatabaseSecurityAlertPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    public DatabaseSecurityAlertPolicyImpl define(SecurityAlertPolicyName name) {
        return new DatabaseSecurityAlertPolicyImpl(name, this.manager());
    }
}
