// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.singularity.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.singularity.fluent.ImagesClient;
import com.azure.resourcemanager.singularity.fluent.models.AvailablePlatformImageDescriptionInner;
import com.azure.resourcemanager.singularity.models.AvailablePlatformImageDescription;
import com.azure.resourcemanager.singularity.models.Images;

public final class ImagesImpl implements Images {
    private static final ClientLogger LOGGER = new ClientLogger(ImagesImpl.class);

    private final ImagesClient innerClient;

    private final com.azure.resourcemanager.singularity.SingularityManager serviceManager;

    public ImagesImpl(
        ImagesClient innerClient, com.azure.resourcemanager.singularity.SingularityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AvailablePlatformImageDescription> list() {
        PagedIterable<AvailablePlatformImageDescriptionInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new AvailablePlatformImageDescriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<AvailablePlatformImageDescription> list(Context context) {
        PagedIterable<AvailablePlatformImageDescriptionInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new AvailablePlatformImageDescriptionImpl(inner1, this.manager()));
    }

    private ImagesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.singularity.SingularityManager manager() {
        return this.serviceManager;
    }
}
