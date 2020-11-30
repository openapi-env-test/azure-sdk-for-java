// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.implementation;

import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.ComputeManager;
import com.azure.resourcemanager.compute.fluent.GallerySharingProfilesClient;
import com.azure.resourcemanager.compute.fluent.models.SharingUpdateInner;
import com.azure.resourcemanager.compute.models.GallerySharingProfiles;
import com.azure.resourcemanager.compute.models.SharingUpdate;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class GallerySharingProfilesImpl implements GallerySharingProfiles {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GallerySharingProfilesImpl.class);

    private final GallerySharingProfilesClient innerClient;

    private final ComputeManager serviceManager;

    public GallerySharingProfilesImpl(GallerySharingProfilesClient innerClient, ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public SharingUpdate update(String resourceGroupName, String galleryName, SharingUpdateInner sharingUpdate) {
        SharingUpdateInner inner = this.serviceClient().update(resourceGroupName, galleryName, sharingUpdate);
        if (inner != null) {
            return new SharingUpdateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public SharingUpdate update(
        String resourceGroupName, String galleryName, SharingUpdateInner sharingUpdate, Context context) {
        SharingUpdateInner inner = this.serviceClient().update(resourceGroupName, galleryName, sharingUpdate, context);
        if (inner != null) {
            return new SharingUpdateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private GallerySharingProfilesClient serviceClient() {
        return this.innerClient;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}
