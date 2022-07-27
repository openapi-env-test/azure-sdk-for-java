// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.ModelVersionInner;
import com.azure.resourcemanager.machinelearning.models.ListViewType;

/** An instance of this class provides access to all the operations defined in ModelVersionsClient. */
public interface ModelVersionsClient {
    /**
     * List model versions.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Model name. This is case-sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of ModelVersion entities as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ModelVersionInner> list(String resourceGroupName, String workspaceName, String name);

    /**
     * List model versions.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Model name. This is case-sensitive.
     * @param skip Continuation token for pagination.
     * @param orderBy Ordering of list.
     * @param top Maximum number of records to return.
     * @param version Model version.
     * @param description Model description.
     * @param offset Number of initial results to skip.
     * @param tags Comma-separated list of tag names (and optionally values). Example: tag1,tag2=value2.
     * @param properties Comma-separated list of property names (and optionally values). Example: prop1,prop2=value2.
     * @param feed Name of the feed.
     * @param listViewType View type for including/excluding (for example) archived entities.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of ModelVersion entities as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ModelVersionInner> list(
        String resourceGroupName,
        String workspaceName,
        String name,
        String skip,
        String orderBy,
        Integer top,
        String version,
        String description,
        Integer offset,
        String tags,
        String properties,
        String feed,
        ListViewType listViewType,
        Context context);

    /**
     * Delete version.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name. This is case-sensitive.
     * @param version Version identifier. This is case-sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, String name, String version);

    /**
     * Delete version.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name. This is case-sensitive.
     * @param version Version identifier. This is case-sensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String workspaceName, String name, String version, Context context);

    /**
     * Get version.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name. This is case-sensitive.
     * @param version Version identifier. This is case-sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return version.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ModelVersionInner get(String resourceGroupName, String workspaceName, String name, String version);

    /**
     * Get version.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name. This is case-sensitive.
     * @param version Version identifier. This is case-sensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return version along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ModelVersionInner> getWithResponse(
        String resourceGroupName, String workspaceName, String name, String version, Context context);

    /**
     * Create or update version.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name. This is case-sensitive.
     * @param version Version identifier. This is case-sensitive.
     * @param body Version entity to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Resource Manager resource envelope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ModelVersionInner createOrUpdate(
        String resourceGroupName, String workspaceName, String name, String version, ModelVersionInner body);

    /**
     * Create or update version.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name. This is case-sensitive.
     * @param version Version identifier. This is case-sensitive.
     * @param body Version entity to create or update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Resource Manager resource envelope along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ModelVersionInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String name,
        String version,
        ModelVersionInner body,
        Context context);
}
