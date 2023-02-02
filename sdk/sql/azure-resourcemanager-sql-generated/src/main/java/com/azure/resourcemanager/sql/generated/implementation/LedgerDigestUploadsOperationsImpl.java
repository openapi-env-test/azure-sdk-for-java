// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.LedgerDigestUploadsOperationsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.LedgerDigestUploadsInner;
import com.azure.resourcemanager.sql.generated.models.LedgerDigestUploads;
import com.azure.resourcemanager.sql.generated.models.LedgerDigestUploadsName;
import com.azure.resourcemanager.sql.generated.models.LedgerDigestUploadsOperations;

public final class LedgerDigestUploadsOperationsImpl implements LedgerDigestUploadsOperations {
    private static final ClientLogger LOGGER = new ClientLogger(LedgerDigestUploadsOperationsImpl.class);

    private final LedgerDigestUploadsOperationsClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public LedgerDigestUploadsOperationsImpl(
        LedgerDigestUploadsOperationsClient innerClient,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<LedgerDigestUploads> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        LedgerDigestUploadsName ledgerDigestUploads,
        Context context) {
        Response<LedgerDigestUploadsInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, serverName, databaseName, ledgerDigestUploads, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LedgerDigestUploadsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LedgerDigestUploads get(
        String resourceGroupName, String serverName, String databaseName, LedgerDigestUploadsName ledgerDigestUploads) {
        LedgerDigestUploadsInner inner =
            this.serviceClient().get(resourceGroupName, serverName, databaseName, ledgerDigestUploads);
        if (inner != null) {
            return new LedgerDigestUploadsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<LedgerDigestUploads> listByDatabase(
        String resourceGroupName, String serverName, String databaseName) {
        PagedIterable<LedgerDigestUploadsInner> inner =
            this.serviceClient().listByDatabase(resourceGroupName, serverName, databaseName);
        return Utils.mapPage(inner, inner1 -> new LedgerDigestUploadsImpl(inner1, this.manager()));
    }

    public PagedIterable<LedgerDigestUploads> listByDatabase(
        String resourceGroupName, String serverName, String databaseName, Context context) {
        PagedIterable<LedgerDigestUploadsInner> inner =
            this.serviceClient().listByDatabase(resourceGroupName, serverName, databaseName, context);
        return Utils.mapPage(inner, inner1 -> new LedgerDigestUploadsImpl(inner1, this.manager()));
    }

    public LedgerDigestUploads disable(
        String resourceGroupName, String serverName, String databaseName, LedgerDigestUploadsName ledgerDigestUploads) {
        LedgerDigestUploadsInner inner =
            this.serviceClient().disable(resourceGroupName, serverName, databaseName, ledgerDigestUploads);
        if (inner != null) {
            return new LedgerDigestUploadsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public LedgerDigestUploads disable(
        String resourceGroupName,
        String serverName,
        String databaseName,
        LedgerDigestUploadsName ledgerDigestUploads,
        Context context) {
        LedgerDigestUploadsInner inner =
            this.serviceClient().disable(resourceGroupName, serverName, databaseName, ledgerDigestUploads, context);
        if (inner != null) {
            return new LedgerDigestUploadsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public LedgerDigestUploads getById(String id) {
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
        String ledgerDigestUploadsLocal = Utils.getValueFromIdByName(id, "ledgerDigestUploads");
        if (ledgerDigestUploadsLocal == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'ledgerDigestUploads'.", id)));
        }
        LedgerDigestUploadsName ledgerDigestUploads = LedgerDigestUploadsName.fromString(ledgerDigestUploadsLocal);
        return this
            .getWithResponse(resourceGroupName, serverName, databaseName, ledgerDigestUploads, Context.NONE)
            .getValue();
    }

    public Response<LedgerDigestUploads> getByIdWithResponse(String id, Context context) {
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
        String ledgerDigestUploadsLocal = Utils.getValueFromIdByName(id, "ledgerDigestUploads");
        if (ledgerDigestUploadsLocal == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'ledgerDigestUploads'.", id)));
        }
        LedgerDigestUploadsName ledgerDigestUploads = LedgerDigestUploadsName.fromString(ledgerDigestUploadsLocal);
        return this.getWithResponse(resourceGroupName, serverName, databaseName, ledgerDigestUploads, context);
    }

    private LedgerDigestUploadsOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    public LedgerDigestUploadsImpl define(LedgerDigestUploadsName name) {
        return new LedgerDigestUploadsImpl(name, this.manager());
    }
}
