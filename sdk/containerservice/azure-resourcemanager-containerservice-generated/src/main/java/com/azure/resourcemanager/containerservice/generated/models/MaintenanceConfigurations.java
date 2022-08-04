// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of MaintenanceConfigurations. */
public interface MaintenanceConfigurations {
    /**
     * Gets a list of maintenance configurations in the specified managed cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the managed cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of maintenance configurations in the specified managed cluster as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<MaintenanceConfiguration> listByManagedCluster(String resourceGroupName, String resourceName);

    /**
     * Gets a list of maintenance configurations in the specified managed cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the managed cluster resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of maintenance configurations in the specified managed cluster as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<MaintenanceConfiguration> listByManagedCluster(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Gets the specified maintenance configuration of a managed cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the managed cluster resource.
     * @param configName The name of the maintenance configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified maintenance configuration of a managed cluster.
     */
    MaintenanceConfiguration get(String resourceGroupName, String resourceName, String configName);

    /**
     * Gets the specified maintenance configuration of a managed cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the managed cluster resource.
     * @param configName The name of the maintenance configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified maintenance configuration of a managed cluster along with {@link Response}.
     */
    Response<MaintenanceConfiguration> getWithResponse(
        String resourceGroupName, String resourceName, String configName, Context context);

    /**
     * Deletes a maintenance configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the managed cluster resource.
     * @param configName The name of the maintenance configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String resourceName, String configName);

    /**
     * Deletes a maintenance configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the managed cluster resource.
     * @param configName The name of the maintenance configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String resourceName, String configName, Context context);

    /**
     * Gets the specified maintenance configuration of a managed cluster.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified maintenance configuration of a managed cluster along with {@link Response}.
     */
    MaintenanceConfiguration getById(String id);

    /**
     * Gets the specified maintenance configuration of a managed cluster.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified maintenance configuration of a managed cluster along with {@link Response}.
     */
    Response<MaintenanceConfiguration> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a maintenance configuration.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a maintenance configuration.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new MaintenanceConfiguration resource.
     *
     * @param name resource name.
     * @return the first stage of the new MaintenanceConfiguration definition.
     */
    MaintenanceConfiguration.DefinitionStages.Blank define(String name);
}
