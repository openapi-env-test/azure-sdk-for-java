// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.support.fluent.ServicesClient;
import com.azure.resourcemanager.support.fluent.models.ServiceInner;
import com.azure.resourcemanager.support.models.Service;
import com.azure.resourcemanager.support.models.Services;

public final class ServicesImpl implements Services {
    private static final ClientLogger LOGGER = new ClientLogger(ServicesImpl.class);

    private final ServicesClient innerClient;

    private final com.azure.resourcemanager.support.SupportManager serviceManager;

    public ServicesImpl(ServicesClient innerClient, com.azure.resourcemanager.support.SupportManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Service> list() {
        PagedIterable<ServiceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<Service> list(Context context) {
        PagedIterable<ServiceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new ServiceImpl(inner1, this.manager()));
    }

    public Service get(String serviceName) {
        ServiceInner inner = this.serviceClient().get(serviceName);
        if (inner != null) {
            return new ServiceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Service> getWithResponse(String serviceName, Context context) {
        Response<ServiceInner> inner = this.serviceClient().getWithResponse(serviceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServiceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ServicesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.support.SupportManager manager() {
        return this.serviceManager;
    }
}
