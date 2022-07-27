// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.List;

/** Resource collection API of Computes. */
public interface Computes {
    /**
     * Gets computes in specified workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return computes in specified workspace as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ComputeResource> list(String resourceGroupName, String workspaceName);

    /**
     * Gets computes in specified workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param skip Continuation token for pagination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return computes in specified workspace as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ComputeResource> list(String resourceGroupName, String workspaceName, String skip, Context context);

    /**
     * Gets compute definition by its name. Any secrets (storage keys, service credentials, etc) are not returned - use
     * 'keys' nested resource to get them.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param computeName Name of the Azure Machine Learning compute.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return compute definition by its name.
     */
    ComputeResource get(String resourceGroupName, String workspaceName, String computeName);

    /**
     * Gets compute definition by its name. Any secrets (storage keys, service credentials, etc) are not returned - use
     * 'keys' nested resource to get them.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param computeName Name of the Azure Machine Learning compute.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return compute definition by its name along with {@link Response}.
     */
    Response<ComputeResource> getWithResponse(
        String resourceGroupName, String workspaceName, String computeName, Context context);

    /**
     * Deletes specified Machine Learning compute.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param computeName Name of the Azure Machine Learning compute.
     * @param underlyingResourceAction Delete the underlying compute if 'Delete', or detach the underlying compute from
     *     workspace if 'Detach'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String workspaceName,
        String computeName,
        UnderlyingResourceAction underlyingResourceAction);

    /**
     * Deletes specified Machine Learning compute.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param computeName Name of the Azure Machine Learning compute.
     * @param underlyingResourceAction Delete the underlying compute if 'Delete', or detach the underlying compute from
     *     workspace if 'Detach'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String workspaceName,
        String computeName,
        UnderlyingResourceAction underlyingResourceAction,
        Context context);

    /**
     * Updates the custom services list. The list of custom services provided shall be overwritten.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param computeName Name of the Azure Machine Learning compute.
     * @param customServices New list of Custom Services.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void updateCustomServices(
        String resourceGroupName, String workspaceName, String computeName, List<CustomService> customServices);

    /**
     * Updates the custom services list. The list of custom services provided shall be overwritten.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param computeName Name of the Azure Machine Learning compute.
     * @param customServices New list of Custom Services.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> updateCustomServicesWithResponse(
        String resourceGroupName,
        String workspaceName,
        String computeName,
        List<CustomService> customServices,
        Context context);

    /**
     * Get the details (e.g IP address, port etc) of all the compute nodes in the compute.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param computeName Name of the Azure Machine Learning compute.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details (e.g IP address, port etc) of all the compute nodes in the compute as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<AmlComputeNodeInformation> listNodes(
        String resourceGroupName, String workspaceName, String computeName);

    /**
     * Get the details (e.g IP address, port etc) of all the compute nodes in the compute.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param computeName Name of the Azure Machine Learning compute.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details (e.g IP address, port etc) of all the compute nodes in the compute as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<AmlComputeNodeInformation> listNodes(
        String resourceGroupName, String workspaceName, String computeName, Context context);

    /**
     * Gets secrets related to Machine Learning compute (storage keys, service credentials, etc).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param computeName Name of the Azure Machine Learning compute.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return secrets related to Machine Learning compute (storage keys, service credentials, etc).
     */
    ComputeSecrets listKeys(String resourceGroupName, String workspaceName, String computeName);

    /**
     * Gets secrets related to Machine Learning compute (storage keys, service credentials, etc).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param computeName Name of the Azure Machine Learning compute.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return secrets related to Machine Learning compute (storage keys, service credentials, etc) along with {@link
     *     Response}.
     */
    Response<ComputeSecrets> listKeysWithResponse(
        String resourceGroupName, String workspaceName, String computeName, Context context);

    /**
     * Posts a start action to a compute instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param computeName Name of the Azure Machine Learning compute.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String workspaceName, String computeName);

    /**
     * Posts a start action to a compute instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param computeName Name of the Azure Machine Learning compute.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String workspaceName, String computeName, Context context);

    /**
     * Posts a stop action to a compute instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param computeName Name of the Azure Machine Learning compute.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String workspaceName, String computeName);

    /**
     * Posts a stop action to a compute instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param computeName Name of the Azure Machine Learning compute.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String workspaceName, String computeName, Context context);

    /**
     * Posts a restart action to a compute instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param computeName Name of the Azure Machine Learning compute.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(String resourceGroupName, String workspaceName, String computeName);

    /**
     * Posts a restart action to a compute instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param computeName Name of the Azure Machine Learning compute.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(String resourceGroupName, String workspaceName, String computeName, Context context);

    /**
     * Updates the idle shutdown setting of a compute instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param computeName Name of the Azure Machine Learning compute.
     * @param parameters The object for updating idle shutdown setting of specified ComputeInstance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void updateIdleShutdownSetting(
        String resourceGroupName, String workspaceName, String computeName, IdleShutdownSetting parameters);

    /**
     * Updates the idle shutdown setting of a compute instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param computeName Name of the Azure Machine Learning compute.
     * @param parameters The object for updating idle shutdown setting of specified ComputeInstance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> updateIdleShutdownSettingWithResponse(
        String resourceGroupName,
        String workspaceName,
        String computeName,
        IdleShutdownSetting parameters,
        Context context);

    /**
     * Gets compute definition by its name. Any secrets (storage keys, service credentials, etc) are not returned - use
     * 'keys' nested resource to get them.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return compute definition by its name along with {@link Response}.
     */
    ComputeResource getById(String id);

    /**
     * Gets compute definition by its name. Any secrets (storage keys, service credentials, etc) are not returned - use
     * 'keys' nested resource to get them.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return compute definition by its name along with {@link Response}.
     */
    Response<ComputeResource> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ComputeResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new ComputeResource definition.
     */
    ComputeResource.DefinitionStages.Blank define(String name);
}
