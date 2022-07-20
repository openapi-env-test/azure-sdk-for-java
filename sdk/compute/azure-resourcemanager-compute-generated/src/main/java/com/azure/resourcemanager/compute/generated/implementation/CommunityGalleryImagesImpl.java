// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.CommunityGalleryImagesClient;
import com.azure.resourcemanager.compute.generated.fluent.models.CommunityGalleryImageInner;
import com.azure.resourcemanager.compute.generated.models.CommunityGalleryImage;
import com.azure.resourcemanager.compute.generated.models.CommunityGalleryImages;

public final class CommunityGalleryImagesImpl implements CommunityGalleryImages {
    private static final ClientLogger LOGGER = new ClientLogger(CommunityGalleryImagesImpl.class);

    private final CommunityGalleryImagesClient innerClient;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    public CommunityGalleryImagesImpl(
        CommunityGalleryImagesClient innerClient,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public CommunityGalleryImage get(String location, String publicGalleryName, String galleryImageName) {
        CommunityGalleryImageInner inner = this.serviceClient().get(location, publicGalleryName, galleryImageName);
        if (inner != null) {
            return new CommunityGalleryImageImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CommunityGalleryImage> getWithResponse(
        String location, String publicGalleryName, String galleryImageName, Context context) {
        Response<CommunityGalleryImageInner> inner =
            this.serviceClient().getWithResponse(location, publicGalleryName, galleryImageName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CommunityGalleryImageImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<CommunityGalleryImage> list(String location, String publicGalleryName) {
        PagedIterable<CommunityGalleryImageInner> inner = this.serviceClient().list(location, publicGalleryName);
        return Utils.mapPage(inner, inner1 -> new CommunityGalleryImageImpl(inner1, this.manager()));
    }

    public PagedIterable<CommunityGalleryImage> list(String location, String publicGalleryName, Context context) {
        PagedIterable<CommunityGalleryImageInner> inner =
            this.serviceClient().list(location, publicGalleryName, context);
        return Utils.mapPage(inner, inner1 -> new CommunityGalleryImageImpl(inner1, this.manager()));
    }

    private CommunityGalleryImagesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}
