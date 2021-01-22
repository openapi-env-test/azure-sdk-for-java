// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.adp.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.adp.AdpManager;
import com.azure.resourcemanager.adp.fluent.AccountsClient;
import com.azure.resourcemanager.adp.fluent.models.AccountInner;
import com.azure.resourcemanager.adp.models.Account;
import com.azure.resourcemanager.adp.models.Accounts;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AccountsImpl implements Accounts {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AccountsImpl.class);

    private final AccountsClient innerClient;

    private final AdpManager serviceManager;

    public AccountsImpl(AccountsClient innerClient, AdpManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Account> list() {
        PagedIterable<AccountInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new AccountImpl(inner1, this.manager()));
    }

    public PagedIterable<Account> list(Context context) {
        PagedIterable<AccountInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new AccountImpl(inner1, this.manager()));
    }

    public PagedIterable<Account> listByResourceGroup(String resourceGroupName) {
        PagedIterable<AccountInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new AccountImpl(inner1, this.manager()));
    }

    public PagedIterable<Account> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<AccountInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new AccountImpl(inner1, this.manager()));
    }

    public Account getByResourceGroup(String resourceGroupName, String accountName) {
        AccountInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, accountName);
        if (inner != null) {
            return new AccountImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Account> getByResourceGroupWithResponse(
        String resourceGroupName, String accountName, Context context) {
        Response<AccountInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, accountName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AccountImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String accountName) {
        this.serviceClient().delete(resourceGroupName, accountName);
    }

    public void delete(String resourceGroupName, String accountName, Context context) {
        this.serviceClient().delete(resourceGroupName, accountName, context);
    }

    public Account getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, accountName, Context.NONE).getValue();
    }

    public Response<Account> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, accountName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        this.delete(resourceGroupName, accountName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        this.delete(resourceGroupName, accountName, context);
    }

    private AccountsClient serviceClient() {
        return this.innerClient;
    }

    private AdpManager manager() {
        return this.serviceManager;
    }

    public AccountImpl define(String name) {
        return new AccountImpl(name, this.manager());
    }
}
