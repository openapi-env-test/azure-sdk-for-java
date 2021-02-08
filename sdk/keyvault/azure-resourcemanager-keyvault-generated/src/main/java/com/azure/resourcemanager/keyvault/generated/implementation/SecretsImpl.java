// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.keyvault.generated.KeyVaultManager;
import com.azure.resourcemanager.keyvault.generated.fluent.SecretsClient;
import com.azure.resourcemanager.keyvault.generated.fluent.models.SecretInner;
import com.azure.resourcemanager.keyvault.generated.models.Secret;
import com.azure.resourcemanager.keyvault.generated.models.Secrets;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SecretsImpl implements Secrets {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SecretsImpl.class);

    private final SecretsClient innerClient;

    private final KeyVaultManager serviceManager;

    public SecretsImpl(SecretsClient innerClient, KeyVaultManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Secret get(String resourceGroupName, String vaultName, String secretName) {
        SecretInner inner = this.serviceClient().get(resourceGroupName, vaultName, secretName);
        if (inner != null) {
            return new SecretImpl(inner, this.manager());
        } else {
            return null;
        }
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

    public PagedIterable<Secret> list(String resourceGroupName, String vaultName) {
        PagedIterable<SecretInner> inner = this.serviceClient().list(resourceGroupName, vaultName);
        return inner.mapPage(inner1 -> new SecretImpl(inner1, this.manager()));
    }

    public PagedIterable<Secret> list(String resourceGroupName, String vaultName, Integer top, Context context) {
        PagedIterable<SecretInner> inner = this.serviceClient().list(resourceGroupName, vaultName, top, context);
        return inner.mapPage(inner1 -> new SecretImpl(inner1, this.manager()));
    }

    public Secret getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vaultName = Utils.getValueFromIdByName(id, "vaults");
        if (vaultName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        String secretName = Utils.getValueFromIdByName(id, "secrets");
        if (secretName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'secrets'.", id)));
        }
        return this.getWithResponse(resourceGroupName, vaultName, secretName, Context.NONE).getValue();
    }

    public Response<Secret> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vaultName = Utils.getValueFromIdByName(id, "vaults");
        if (vaultName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        String secretName = Utils.getValueFromIdByName(id, "secrets");
        if (secretName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'secrets'.", id)));
        }
        return this.getWithResponse(resourceGroupName, vaultName, secretName, context);
    }

    private SecretsClient serviceClient() {
        return this.innerClient;
    }

    private KeyVaultManager manager() {
        return this.serviceManager;
    }

    public SecretImpl define(String name) {
        return new SecretImpl(name, this.manager());
    }
}
