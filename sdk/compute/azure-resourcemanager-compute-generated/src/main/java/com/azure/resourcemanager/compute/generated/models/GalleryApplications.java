// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of GalleryApplications. */
public interface GalleryApplications {
    /**
     * Retrieves information about a gallery Application Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery from which the Application Definitions are to be
     *     retrieved.
     * @param galleryApplicationName The name of the gallery Application Definition to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Application Definition that you want to create or update.
     */
    GalleryApplication get(String resourceGroupName, String galleryName, String galleryApplicationName);

    /**
     * Retrieves information about a gallery Application Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery from which the Application Definitions are to be
     *     retrieved.
     * @param galleryApplicationName The name of the gallery Application Definition to be retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Application Definition that you want to create or update along
     *     with {@link Response}.
     */
    Response<GalleryApplication> getWithResponse(
        String resourceGroupName, String galleryName, String galleryApplicationName, Context context);

    /**
     * Delete a gallery Application.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition is to be
     *     deleted.
     * @param galleryApplicationName The name of the gallery Application Definition to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String galleryName, String galleryApplicationName);

    /**
     * Delete a gallery Application.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition is to be
     *     deleted.
     * @param galleryApplicationName The name of the gallery Application Definition to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String galleryName, String galleryApplicationName, Context context);

    /**
     * List gallery Application Definitions in a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery from which Application Definitions are to be
     *     listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Gallery Applications operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<GalleryApplication> listByGallery(String resourceGroupName, String galleryName);

    /**
     * List gallery Application Definitions in a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery from which Application Definitions are to be
     *     listed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Gallery Applications operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<GalleryApplication> listByGallery(String resourceGroupName, String galleryName, Context context);

    /**
     * Retrieves information about a gallery Application Definition.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Application Definition that you want to create or update along
     *     with {@link Response}.
     */
    GalleryApplication getById(String id);

    /**
     * Retrieves information about a gallery Application Definition.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Application Definition that you want to create or update along
     *     with {@link Response}.
     */
    Response<GalleryApplication> getByIdWithResponse(String id, Context context);

    /**
     * Delete a gallery Application.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a gallery Application.
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
     * Begins definition for a new GalleryApplication resource.
     *
     * @param name resource name.
     * @return the first stage of the new GalleryApplication definition.
     */
    GalleryApplication.DefinitionStages.Blank define(String name);
}
