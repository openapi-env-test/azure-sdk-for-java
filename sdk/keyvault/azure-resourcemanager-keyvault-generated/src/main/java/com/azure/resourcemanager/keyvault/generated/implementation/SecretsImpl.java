// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.keyvault.generated.fluent.SecretsClient;
import com.azure.resourcemanager.keyvault.generated.fluent.models.SecretInner;
import com.azure.resourcemanager.keyvault.generated.models.Secret;
import com.azure.resourcemanager.keyvault.generated.models.Secrets;

public final class SecretsImpl implements Secrets {
    private static final ClientLogger LOGGER = new ClientLogger(SecretsImpl.class);

    private final SecretsClient innerClient;

    private final com.azure.resourcemanager.keyvault.generated.KeyVaultManager serviceManager;

    public SecretsImpl(
        SecretsClient innerClient, com.azure.resourcemanager.keyvault.generated.KeyVaultManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Secret> getWithResponse(
        String resourceGroupName, String vaultName, String secretName, Context context) {
        Response<SecretInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, vaultName, secretName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SecretImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Secret get(String resourceGroupName, String vaultName, String secretName) {
        SecretInner inner = this.serviceClient().get(resourceGroupName, vaultName, secretName);
        if (inner != null) {
            return new SecretImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<Secret> list(String resourceGroupName, String vaultName) {
        PagedIterable<SecretInner> inner = this.serviceClient().list(resourceGroupName, vaultName);
        return Utils.mapPage(inner, inner1 -> new SecretImpl(inner1, this.manager()));
    }

    public PagedIterable<Secret> list(String resourceGroupName, String vaultName, Integer top, Context context) {
        PagedIterable<SecretInner> inner = this.serviceClient().list(resourceGroupName, vaultName, top, context);
        return Utils.mapPage(inner, inner1 -> new SecretImpl(inner1, this.manager()));
    }

    public Secret getById(String id) {
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
        String secretName = Utils.getValueFromIdByName(id, "secrets");
        if (secretName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'secrets'.", id)));
        }
        return this.getWithResponse(resourceGroupName, vaultName, secretName, Context.NONE).getValue();
    }

    public Response<Secret> getByIdWithResponse(String id, Context context) {
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
        String secretName = Utils.getValueFromIdByName(id, "secrets");
        if (secretName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'secrets'.", id)));
        }
        return this.getWithResponse(resourceGroupName, vaultName, secretName, context);
    }

    private SecretsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.keyvault.generated.KeyVaultManager manager() {
        return this.serviceManager;
    }

    public SecretImpl define(String name) {
        return new SecretImpl(name, this.manager());
    }
}
