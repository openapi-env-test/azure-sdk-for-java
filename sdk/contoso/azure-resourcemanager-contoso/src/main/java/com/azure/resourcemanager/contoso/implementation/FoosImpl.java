// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.contoso.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.contoso.ContosoManager;
import com.azure.resourcemanager.contoso.fluent.FoosClient;
import com.azure.resourcemanager.contoso.fluent.models.ResultInner;
import com.azure.resourcemanager.contoso.models.Foos;
import com.azure.resourcemanager.contoso.models.Result;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class FoosImpl implements Foos {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FoosImpl.class);

    private final FoosClient innerClient;

    private final ContosoManager serviceManager;

    public FoosImpl(FoosClient innerClient, ContosoManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Result getByResourceGroup(String resourceGroupName, String fooName) {
        ResultInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, fooName);
        if (inner != null) {
            return new ResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Result> getByResourceGroupWithResponse(String resourceGroupName, String fooName, Context context) {
        Response<ResultInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, fooName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private FoosClient serviceClient() {
        return this.innerClient;
    }

    private ContosoManager manager() {
        return this.serviceManager;
    }
}
