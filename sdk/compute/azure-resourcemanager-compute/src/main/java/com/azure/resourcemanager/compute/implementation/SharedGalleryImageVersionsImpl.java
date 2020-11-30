// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.ComputeManager;
import com.azure.resourcemanager.compute.fluent.SharedGalleryImageVersionsClient;
import com.azure.resourcemanager.compute.fluent.models.SharedGalleryImageVersionInner;
import com.azure.resourcemanager.compute.models.SharedGalleryImageVersion;
import com.azure.resourcemanager.compute.models.SharedGalleryImageVersions;
import com.azure.resourcemanager.compute.models.SharedToValues;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SharedGalleryImageVersionsImpl implements SharedGalleryImageVersions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SharedGalleryImageVersionsImpl.class);

    private final SharedGalleryImageVersionsClient innerClient;

    private final ComputeManager serviceManager;

    public SharedGalleryImageVersionsImpl(SharedGalleryImageVersionsClient innerClient, ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SharedGalleryImageVersion> list(
        String location, String galleryUniqueName, String galleryImageName) {
        PagedIterable<SharedGalleryImageVersionInner> inner =
            this.serviceClient().list(location, galleryUniqueName, galleryImageName);
        return inner.mapPage(inner1 -> new SharedGalleryImageVersionImpl(inner1, this.manager()));
    }

    public PagedIterable<SharedGalleryImageVersion> list(
        String location, String galleryUniqueName, String galleryImageName, SharedToValues sharedTo, Context context) {
        PagedIterable<SharedGalleryImageVersionInner> inner =
            this.serviceClient().list(location, galleryUniqueName, galleryImageName, sharedTo, context);
        return inner.mapPage(inner1 -> new SharedGalleryImageVersionImpl(inner1, this.manager()));
    }

    public SharedGalleryImageVersion get(
        String location, String galleryUniqueName, String galleryImageName, String galleryImageVersionName) {
        SharedGalleryImageVersionInner inner =
            this.serviceClient().get(location, galleryUniqueName, galleryImageName, galleryImageVersionName);
        if (inner != null) {
            return new SharedGalleryImageVersionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SharedGalleryImageVersion> getWithResponse(
        String location,
        String galleryUniqueName,
        String galleryImageName,
        String galleryImageVersionName,
        Context context) {
        Response<SharedGalleryImageVersionInner> inner =
            this
                .serviceClient()
                .getWithResponse(location, galleryUniqueName, galleryImageName, galleryImageVersionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SharedGalleryImageVersionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private SharedGalleryImageVersionsClient serviceClient() {
        return this.innerClient;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}
