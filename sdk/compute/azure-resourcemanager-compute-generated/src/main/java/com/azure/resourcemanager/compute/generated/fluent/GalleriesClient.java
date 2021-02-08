// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.compute.generated.fluent.models.GalleryInner;

/** An instance of this class provides access to all the operations defined in GalleriesClient. */
public interface GalleriesClient {
    /**
     * Create or update a Shared Image Gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery. The allowed characters are alphabets and numbers with
     *     dots and periods allowed in the middle. The maximum length is 80 characters.
     * @param gallery Parameters supplied to the create or update Shared Image Gallery operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Shared Image Gallery that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<GalleryInner>, GalleryInner> beginCreateOrUpdate(
        String resourceGroupName, String galleryName, GalleryInner gallery);

    /**
     * Create or update a Shared Image Gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery. The allowed characters are alphabets and numbers with
     *     dots and periods allowed in the middle. The maximum length is 80 characters.
     * @param gallery Parameters supplied to the create or update Shared Image Gallery operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Shared Image Gallery that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<GalleryInner>, GalleryInner> beginCreateOrUpdate(
        String resourceGroupName, String galleryName, GalleryInner gallery, Context context);

    /**
     * Create or update a Shared Image Gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery. The allowed characters are alphabets and numbers with
     *     dots and periods allowed in the middle. The maximum length is 80 characters.
     * @param gallery Parameters supplied to the create or update Shared Image Gallery operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Shared Image Gallery that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GalleryInner createOrUpdate(String resourceGroupName, String galleryName, GalleryInner gallery);

    /**
     * Create or update a Shared Image Gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery. The allowed characters are alphabets and numbers with
     *     dots and periods allowed in the middle. The maximum length is 80 characters.
     * @param gallery Parameters supplied to the create or update Shared Image Gallery operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Shared Image Gallery that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GalleryInner createOrUpdate(String resourceGroupName, String galleryName, GalleryInner gallery, Context context);

    /**
     * Retrieves information about a Shared Image Gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Shared Image Gallery that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GalleryInner getByResourceGroup(String resourceGroupName, String galleryName);

    /**
     * Retrieves information about a Shared Image Gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Shared Image Gallery that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GalleryInner> getByResourceGroupWithResponse(
        String resourceGroupName, String galleryName, Context context);

    /**
     * Delete a Shared Image Gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String galleryName);

    /**
     * Delete a Shared Image Gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String galleryName, Context context);

    /**
     * Delete a Shared Image Gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String galleryName);

    /**
     * Delete a Shared Image Gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String galleryName, Context context);

    /**
     * List galleries under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Galleries operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GalleryInner> listByResourceGroup(String resourceGroupName);

    /**
     * List galleries under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Galleries operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GalleryInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List galleries under a subscription.
     *
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Galleries operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GalleryInner> list();

    /**
     * List galleries under a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Galleries operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GalleryInner> list(Context context);
}
