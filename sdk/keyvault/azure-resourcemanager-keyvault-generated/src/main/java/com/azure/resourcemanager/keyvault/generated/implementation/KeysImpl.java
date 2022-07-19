// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.keyvault.generated.fluent.KeysClient;
import com.azure.resourcemanager.keyvault.generated.fluent.models.KeyInner;
import com.azure.resourcemanager.keyvault.generated.models.Key;
import com.azure.resourcemanager.keyvault.generated.models.Keys;

public final class KeysImpl implements Keys {
    private static final ClientLogger LOGGER = new ClientLogger(KeysImpl.class);

    private final KeysClient innerClient;

    private final com.azure.resourcemanager.keyvault.generated.KeyVaultManager serviceManager;

    public KeysImpl(
        KeysClient innerClient, com.azure.resourcemanager.keyvault.generated.KeyVaultManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Key get(String resourceGroupName, String vaultName, String keyName) {
        KeyInner inner = this.serviceClient().get(resourceGroupName, vaultName, keyName);
        if (inner != null) {
            return new KeyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Key> getWithResponse(String resourceGroupName, String vaultName, String keyName, Context context) {
        Response<KeyInner> inner = this.serviceClient().getWithResponse(resourceGroupName, vaultName, keyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new KeyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Key> list(String resourceGroupName, String vaultName) {
        PagedIterable<KeyInner> inner = this.serviceClient().list(resourceGroupName, vaultName);
        return Utils.mapPage(inner, inner1 -> new KeyImpl(inner1, this.manager()));
    }

    public PagedIterable<Key> list(String resourceGroupName, String vaultName, Context context) {
        PagedIterable<KeyInner> inner = this.serviceClient().list(resourceGroupName, vaultName, context);
        return Utils.mapPage(inner, inner1 -> new KeyImpl(inner1, this.manager()));
    }

    public Key getVersion(String resourceGroupName, String vaultName, String keyName, String keyVersion) {
        KeyInner inner = this.serviceClient().getVersion(resourceGroupName, vaultName, keyName, keyVersion);
        if (inner != null) {
            return new KeyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Key> getVersionWithResponse(
        String resourceGroupName, String vaultName, String keyName, String keyVersion, Context context) {
        Response<KeyInner> inner =
            this.serviceClient().getVersionWithResponse(resourceGroupName, vaultName, keyName, keyVersion, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new KeyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Key> listVersions(String resourceGroupName, String vaultName, String keyName) {
        PagedIterable<KeyInner> inner = this.serviceClient().listVersions(resourceGroupName, vaultName, keyName);
        return Utils.mapPage(inner, inner1 -> new KeyImpl(inner1, this.manager()));
    }

    public PagedIterable<Key> listVersions(
        String resourceGroupName, String vaultName, String keyName, Context context) {
        PagedIterable<KeyInner> inner =
            this.serviceClient().listVersions(resourceGroupName, vaultName, keyName, context);
        return Utils.mapPage(inner, inner1 -> new KeyImpl(inner1, this.manager()));
    }

    public Key getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vaultName = Utils.getValueFromIdByName(id, "vaults");
        if (vaultName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        String keyName = Utils.getValueFromIdByName(id, "keys");
        if (keyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'keys'.", id)));
        }
        return this.getWithResponse(resourceGroupName, vaultName, keyName, Context.NONE).getValue();
    }

    public Response<Key> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vaultName = Utils.getValueFromIdByName(id, "vaults");
        if (vaultName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        String keyName = Utils.getValueFromIdByName(id, "keys");
        if (keyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'keys'.", id)));
        }
        return this.getWithResponse(resourceGroupName, vaultName, keyName, context);
    }

    private KeysClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.keyvault.generated.KeyVaultManager manager() {
        return this.serviceManager;
    }

    public KeyImpl define(String name) {
        return new KeyImpl(name, this.manager());
    }
}
