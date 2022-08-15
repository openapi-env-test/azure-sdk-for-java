// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerinstance.generated.fluent.models.CachedImagesInner;
import com.azure.resourcemanager.containerinstance.generated.fluent.models.CapabilitiesInner;
import com.azure.resourcemanager.containerinstance.generated.fluent.models.UsageInner;

/** An instance of this class provides access to all the operations defined in LocationsClient. */
public interface LocationsClient {
    /**
     * Get the usage for a subscription.
     *
     * @param location The identifier for the physical azure location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the usage for a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<UsageInner> listUsage(String location);

    /**
     * Get the usage for a subscription.
     *
     * @param location The identifier for the physical azure location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the usage for a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<UsageInner> listUsage(String location, Context context);

    /**
     * Get the list of cached images on specific OS type for a subscription in a region.
     *
     * @param location The identifier for the physical azure location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cached images on specific OS type for a subscription in a region as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CachedImagesInner> listCachedImages(String location);

    /**
     * Get the list of cached images on specific OS type for a subscription in a region.
     *
     * @param location The identifier for the physical azure location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cached images on specific OS type for a subscription in a region as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CachedImagesInner> listCachedImages(String location, Context context);

    /**
     * Get the list of CPU/memory/GPU capabilities of a region.
     *
     * @param location The identifier for the physical azure location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of CPU/memory/GPU capabilities of a region as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CapabilitiesInner> listCapabilities(String location);

    /**
     * Get the list of CPU/memory/GPU capabilities of a region.
     *
     * @param location The identifier for the physical azure location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of CPU/memory/GPU capabilities of a region as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CapabilitiesInner> listCapabilities(String location, Context context);
}
