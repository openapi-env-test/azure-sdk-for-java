// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ElasticSans. */
public interface ElasticSans {
    /**
     * Gets a list of ElasticSans in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of ElasticSans in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ElasticSan> list();

    /**
     * Gets a list of ElasticSans in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of ElasticSans in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ElasticSan> list(Context context);

    /**
     * Gets a list of ElasticSan in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of ElasticSan in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ElasticSan> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a list of ElasticSan in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of ElasticSan in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ElasticSan> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Delete a Elastic San.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param forceDeleteVolumeGroups Required if the San has associated Volume Groups.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String elasticSanName, Boolean forceDeleteVolumeGroups);

    /**
     * Delete a Elastic San.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String elasticSanName);

    /**
     * Delete a Elastic San.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param forceDeleteVolumeGroups Required if the San has associated Volume Groups.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String elasticSanName, Boolean forceDeleteVolumeGroups, Context context);

    /**
     * Get a ElasticSan.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a ElasticSan.
     */
    ElasticSan getByResourceGroup(String resourceGroupName, String elasticSanName);

    /**
     * Get a ElasticSan.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a ElasticSan along with {@link Response}.
     */
    Response<ElasticSan> getByResourceGroupWithResponse(
        String resourceGroupName, String elasticSanName, Context context);

    /**
     * Get a ElasticSan.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a ElasticSan along with {@link Response}.
     */
    ElasticSan getById(String id);

    /**
     * Get a ElasticSan.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a ElasticSan along with {@link Response}.
     */
    Response<ElasticSan> getByIdWithResponse(String id, Context context);

    /**
     * Delete a Elastic San.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a Elastic San.
     *
     * @param id the resource ID.
     * @param forceDeleteVolumeGroups Required if the San has associated Volume Groups.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Boolean forceDeleteVolumeGroups, Context context);

    /**
     * Begins definition for a new ElasticSan resource.
     *
     * @param name resource name.
     * @return the first stage of the new ElasticSan definition.
     */
    ElasticSan.DefinitionStages.Blank define(String name);
}
