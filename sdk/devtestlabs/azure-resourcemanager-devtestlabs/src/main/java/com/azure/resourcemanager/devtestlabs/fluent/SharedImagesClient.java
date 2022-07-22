// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.fluent.models.SharedImageInner;
import com.azure.resourcemanager.devtestlabs.models.SharedImageFragment;

/** An instance of this class provides access to all the operations defined in SharedImagesClient. */
public interface SharedImagesClient {
    /**
     * List shared images in a given shared gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param sharedGalleryName The name of the shared gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains a list of sharedImages and their properties as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SharedImageInner> list(String resourceGroupName, String labName, String sharedGalleryName);

    /**
     * List shared images in a given shared gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param sharedGalleryName The name of the shared gallery.
     * @param expand Specify the $expand query. Example: 'properties($expand=versions)'.
     * @param filter The filter to apply to the operation. Example: '$filter=contains(name,'myName')'.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param orderby The ordering expression for the results, using OData notation. Example: '$orderby=name desc'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains a list of sharedImages and their properties as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SharedImageInner> list(
        String resourceGroupName,
        String labName,
        String sharedGalleryName,
        String expand,
        String filter,
        Integer top,
        String orderby,
        Context context);

    /**
     * Get shared image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param sharedGalleryName The name of the shared gallery.
     * @param name The name of the shared image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SharedImageInner get(String resourceGroupName, String labName, String sharedGalleryName, String name);

    /**
     * Get shared image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param sharedGalleryName The name of the shared gallery.
     * @param name The name of the shared image.
     * @param expand Specify the $expand query. Example: 'properties($expand=versions)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared image along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SharedImageInner> getWithResponse(
        String resourceGroupName,
        String labName,
        String sharedGalleryName,
        String name,
        String expand,
        Context context);

    /**
     * Create or replace an existing Shared Image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param sharedGalleryName The name of the shared gallery.
     * @param name The name of the shared image.
     * @param sharedImage Properties of a shared image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a shared image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SharedImageInner createOrUpdate(
        String resourceGroupName, String labName, String sharedGalleryName, String name, SharedImageInner sharedImage);

    /**
     * Create or replace an existing Shared Image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param sharedGalleryName The name of the shared gallery.
     * @param name The name of the shared image.
     * @param sharedImage Properties of a shared image.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a shared image along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SharedImageInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String labName,
        String sharedGalleryName,
        String name,
        SharedImageInner sharedImage,
        Context context);

    /**
     * Delete shared image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param sharedGalleryName The name of the shared gallery.
     * @param name The name of the shared image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String labName, String sharedGalleryName, String name);

    /**
     * Delete shared image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param sharedGalleryName The name of the shared gallery.
     * @param name The name of the shared image.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String labName, String sharedGalleryName, String name, Context context);

    /**
     * Allows modifying tags of shared images. All other properties will be ignored.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param sharedGalleryName The name of the shared gallery.
     * @param name The name of the shared image.
     * @param sharedImage Allows modifying tags of shared images. All other properties will be ignored.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a shared image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SharedImageInner update(
        String resourceGroupName,
        String labName,
        String sharedGalleryName,
        String name,
        SharedImageFragment sharedImage);

    /**
     * Allows modifying tags of shared images. All other properties will be ignored.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param sharedGalleryName The name of the shared gallery.
     * @param name The name of the shared image.
     * @param sharedImage Allows modifying tags of shared images. All other properties will be ignored.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a shared image along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SharedImageInner> updateWithResponse(
        String resourceGroupName,
        String labName,
        String sharedGalleryName,
        String name,
        SharedImageFragment sharedImage,
        Context context);
}
