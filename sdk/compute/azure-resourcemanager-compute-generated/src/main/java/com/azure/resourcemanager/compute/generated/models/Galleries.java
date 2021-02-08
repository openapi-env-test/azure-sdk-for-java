// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Galleries. */
public interface Galleries {
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
    Gallery getByResourceGroup(String resourceGroupName, String galleryName);

    /**
     * Retrieves information about a Shared Image Gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery.
     * @param select The select expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Shared Image Gallery that you want to create or update.
     */
    Response<Gallery> getByResourceGroupWithResponse(
        String resourceGroupName, String galleryName, SelectPermissions select, Context context);

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
    void deleteByResourceGroup(String resourceGroupName, String galleryName);

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
    PagedIterable<Gallery> listByResourceGroup(String resourceGroupName);

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
    PagedIterable<Gallery> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List galleries under a subscription.
     *
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Galleries operation response.
     */
    PagedIterable<Gallery> list();

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
    PagedIterable<Gallery> list(Context context);

    /**
     * Retrieves information about a Shared Image Gallery.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Shared Image Gallery that you want to create or update.
     */
    Gallery getById(String id);

    /**
     * Retrieves information about a Shared Image Gallery.
     *
     * @param id the resource ID.
     * @param select The select expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Shared Image Gallery that you want to create or update.
     */
    Response<Gallery> getByIdWithResponse(String id, SelectPermissions select, Context context);

    /**
     * Delete a Shared Image Gallery.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a Shared Image Gallery.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Gallery resource.
     *
     * @param name resource name.
     * @return the first stage of the new Gallery definition.
     */
    Gallery.DefinitionStages.Blank define(String name);
}
