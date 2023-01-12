// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.releaseplannertest.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.List;

/** Resource collection API of Extensions. */
public interface Extensions {
    /**
     * Install extension.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param farmBeatsResourceName FarmBeats resource name.
     * @param extensionId Id of extension resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extension resource along with {@link Response}.
     */
    Response<Extension> createWithResponse(
        String resourceGroupName, String farmBeatsResourceName, String extensionId, Context context);

    /**
     * Install extension.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param farmBeatsResourceName FarmBeats resource name.
     * @param extensionId Id of extension resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extension resource.
     */
    Extension create(String resourceGroupName, String farmBeatsResourceName, String extensionId);

    /**
     * Get installed extension details by extension id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param farmBeatsResourceName FarmBeats resource name.
     * @param extensionId Id of extension resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return installed extension details by extension id along with {@link Response}.
     */
    Response<Extension> getWithResponse(
        String resourceGroupName, String farmBeatsResourceName, String extensionId, Context context);

    /**
     * Get installed extension details by extension id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param farmBeatsResourceName FarmBeats resource name.
     * @param extensionId Id of extension resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return installed extension details by extension id.
     */
    Extension get(String resourceGroupName, String farmBeatsResourceName, String extensionId);

    /**
     * Upgrade to latest extension.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param farmBeatsResourceName FarmBeats resource name.
     * @param extensionId Id of extension resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extension resource along with {@link Response}.
     */
    Response<Extension> updateWithResponse(
        String resourceGroupName, String farmBeatsResourceName, String extensionId, Context context);

    /**
     * Upgrade to latest extension.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param farmBeatsResourceName FarmBeats resource name.
     * @param extensionId Id of extension resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extension resource.
     */
    Extension update(String resourceGroupName, String farmBeatsResourceName, String extensionId);

    /**
     * Uninstall extension.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param farmBeatsResourceName FarmBeats resource name.
     * @param extensionId Id of extension resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String farmBeatsResourceName, String extensionId, Context context);

    /**
     * Uninstall extension.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param farmBeatsResourceName FarmBeats resource name.
     * @param extensionId Id of extension resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String farmBeatsResourceName, String extensionId);

    /**
     * Get installed extensions details.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param farmBeatsResourceName FarmBeats resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return installed extensions details as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Extension> listByFarmBeats(String resourceGroupName, String farmBeatsResourceName);

    /**
     * Get installed extensions details.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param farmBeatsResourceName FarmBeats resource name.
     * @param extensionIds Installed extension ids.
     * @param extensionCategories Installed extension categories.
     * @param maxPageSize Maximum number of items needed (inclusive). Minimum = 10, Maximum = 1000, Default value = 50.
     * @param skipToken Skip token for getting next set of results.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return installed extensions details as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Extension> listByFarmBeats(
        String resourceGroupName,
        String farmBeatsResourceName,
        List<String> extensionIds,
        List<String> extensionCategories,
        Integer maxPageSize,
        String skipToken,
        Context context);
}
