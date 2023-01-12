// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.releaseplannertest.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PrivateLinkResources. */
public interface PrivateLinkResources {
    /**
     * Get list of Private link resources.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param farmBeatsResourceName FarmBeats resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Private link resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PrivateLinkResource> listByResource(String resourceGroupName, String farmBeatsResourceName);

    /**
     * Get list of Private link resources.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param farmBeatsResourceName FarmBeats resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Private link resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PrivateLinkResource> listByResource(
        String resourceGroupName, String farmBeatsResourceName, Context context);

    /**
     * Get Private link resource object.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param farmBeatsResourceName FarmBeats resource name.
     * @param subResourceName Sub resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private link resource object along with {@link Response}.
     */
    Response<PrivateLinkResource> getWithResponse(
        String resourceGroupName, String farmBeatsResourceName, String subResourceName, Context context);

    /**
     * Get Private link resource object.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param farmBeatsResourceName FarmBeats resource name.
     * @param subResourceName Sub resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private link resource object.
     */
    PrivateLinkResource get(String resourceGroupName, String farmBeatsResourceName, String subResourceName);
}
