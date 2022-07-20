// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.singularity.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.singularity.fluent.StorageCachesClient;
import com.azure.resourcemanager.singularity.fluent.models.StorageCacheResourceDescriptionInner;
import com.azure.resourcemanager.singularity.fluent.models.StorageCacheResourceDiagnosticsInfoInner;
import com.azure.resourcemanager.singularity.models.StorageCacheResourceDescription;
import com.azure.resourcemanager.singularity.models.StorageCacheResourceDiagnosticsInfo;
import com.azure.resourcemanager.singularity.models.StorageCaches;

public final class StorageCachesImpl implements StorageCaches {
    private static final ClientLogger LOGGER = new ClientLogger(StorageCachesImpl.class);

    private final StorageCachesClient innerClient;

    private final com.azure.resourcemanager.singularity.SingularityManager serviceManager;

    public StorageCachesImpl(
        StorageCachesClient innerClient, com.azure.resourcemanager.singularity.SingularityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public StorageCacheResourceDescription get(
        String resourceGroupName, String accountName, String storageCacheResourceName) {
        StorageCacheResourceDescriptionInner inner =
            this.serviceClient().get(resourceGroupName, accountName, storageCacheResourceName);
        if (inner != null) {
            return new StorageCacheResourceDescriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<StorageCacheResourceDescription> getWithResponse(
        String resourceGroupName, String accountName, String storageCacheResourceName, Context context) {
        Response<StorageCacheResourceDescriptionInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, storageCacheResourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new StorageCacheResourceDescriptionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String storageCacheResourceName) {
        this.serviceClient().delete(resourceGroupName, accountName, storageCacheResourceName);
    }

    public void delete(String resourceGroupName, String accountName, String storageCacheResourceName, Context context) {
        this.serviceClient().delete(resourceGroupName, accountName, storageCacheResourceName, context);
    }

    public StorageCacheResourceDiagnosticsInfo getDiagnostics(
        String resourceGroupName, String accountName, String storageCacheResourceName) {
        StorageCacheResourceDiagnosticsInfoInner inner =
            this.serviceClient().getDiagnostics(resourceGroupName, accountName, storageCacheResourceName);
        if (inner != null) {
            return new StorageCacheResourceDiagnosticsInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<StorageCacheResourceDiagnosticsInfo> getDiagnosticsWithResponse(
        String resourceGroupName, String accountName, String storageCacheResourceName, Context context) {
        Response<StorageCacheResourceDiagnosticsInfoInner> inner =
            this
                .serviceClient()
                .getDiagnosticsWithResponse(resourceGroupName, accountName, storageCacheResourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new StorageCacheResourceDiagnosticsInfoImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<StorageCacheResourceDescription> listByAccount(String resourceGroupName, String accountName) {
        PagedIterable<StorageCacheResourceDescriptionInner> inner =
            this.serviceClient().listByAccount(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new StorageCacheResourceDescriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<StorageCacheResourceDescription> listByAccount(
        String resourceGroupName, String accountName, String continuationToken, Context context) {
        PagedIterable<StorageCacheResourceDescriptionInner> inner =
            this.serviceClient().listByAccount(resourceGroupName, accountName, continuationToken, context);
        return Utils.mapPage(inner, inner1 -> new StorageCacheResourceDescriptionImpl(inner1, this.manager()));
    }

    public StorageCacheResourceDescription resume(
        String resourceGroupName, String accountName, String storageCacheResourceName) {
        StorageCacheResourceDescriptionInner inner =
            this.serviceClient().resume(resourceGroupName, accountName, storageCacheResourceName);
        if (inner != null) {
            return new StorageCacheResourceDescriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public StorageCacheResourceDescription resume(
        String resourceGroupName, String accountName, String storageCacheResourceName, Context context) {
        StorageCacheResourceDescriptionInner inner =
            this.serviceClient().resume(resourceGroupName, accountName, storageCacheResourceName, context);
        if (inner != null) {
            return new StorageCacheResourceDescriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public StorageCacheResourceDescription suspend(
        String resourceGroupName, String accountName, String storageCacheResourceName) {
        StorageCacheResourceDescriptionInner inner =
            this.serviceClient().suspend(resourceGroupName, accountName, storageCacheResourceName);
        if (inner != null) {
            return new StorageCacheResourceDescriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public StorageCacheResourceDescription suspend(
        String resourceGroupName, String accountName, String storageCacheResourceName, Context context) {
        StorageCacheResourceDescriptionInner inner =
            this.serviceClient().suspend(resourceGroupName, accountName, storageCacheResourceName, context);
        if (inner != null) {
            return new StorageCacheResourceDescriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public StorageCacheResourceDescription getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        String storageCacheResourceName = Utils.getValueFromIdByName(id, "storagecontainers");
        if (storageCacheResourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'storagecontainers'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, storageCacheResourceName, Context.NONE).getValue();
    }

    public Response<StorageCacheResourceDescription> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        String storageCacheResourceName = Utils.getValueFromIdByName(id, "storagecontainers");
        if (storageCacheResourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'storagecontainers'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, storageCacheResourceName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        String storageCacheResourceName = Utils.getValueFromIdByName(id, "storagecontainers");
        if (storageCacheResourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'storagecontainers'.", id)));
        }
        this.delete(resourceGroupName, accountName, storageCacheResourceName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        String storageCacheResourceName = Utils.getValueFromIdByName(id, "storagecontainers");
        if (storageCacheResourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'storagecontainers'.", id)));
        }
        this.delete(resourceGroupName, accountName, storageCacheResourceName, context);
    }

    private StorageCachesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.singularity.SingularityManager manager() {
        return this.serviceManager;
    }

    public StorageCacheResourceDescriptionImpl define(String name) {
        return new StorageCacheResourceDescriptionImpl(name, this.manager());
    }
}
