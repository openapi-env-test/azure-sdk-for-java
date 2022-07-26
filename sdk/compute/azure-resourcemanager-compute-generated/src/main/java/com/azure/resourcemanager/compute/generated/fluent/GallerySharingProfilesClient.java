// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.compute.generated.fluent.models.SharingUpdateInner;

/** An instance of this class provides access to all the operations defined in GallerySharingProfilesClient. */
public interface GallerySharingProfilesClient {
    /**
     * Update sharing profile of a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery.
     * @param sharingUpdate Parameters supplied to the update gallery sharing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of specifies information about the gallery sharing profile update.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SharingUpdateInner>, SharingUpdateInner> beginUpdate(
        String resourceGroupName, String galleryName, SharingUpdateInner sharingUpdate);

    /**
     * Update sharing profile of a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery.
     * @param sharingUpdate Parameters supplied to the update gallery sharing profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of specifies information about the gallery sharing profile update.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SharingUpdateInner>, SharingUpdateInner> beginUpdate(
        String resourceGroupName, String galleryName, SharingUpdateInner sharingUpdate, Context context);

    /**
     * Update sharing profile of a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery.
     * @param sharingUpdate Parameters supplied to the update gallery sharing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery sharing profile update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SharingUpdateInner update(String resourceGroupName, String galleryName, SharingUpdateInner sharingUpdate);

    /**
     * Update sharing profile of a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery.
     * @param sharingUpdate Parameters supplied to the update gallery sharing profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery sharing profile update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SharingUpdateInner update(
        String resourceGroupName, String galleryName, SharingUpdateInner sharingUpdate, Context context);
}
