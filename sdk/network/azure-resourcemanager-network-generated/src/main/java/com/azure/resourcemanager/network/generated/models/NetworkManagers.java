// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of NetworkManagers. */
public interface NetworkManagers {
    /**
     * Gets the specified Network Manager.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Network Manager.
     */
    NetworkManager getByResourceGroup(String resourceGroupName, String networkManagerName);

    /**
     * Gets the specified Network Manager.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Network Manager along with {@link Response}.
     */
    Response<NetworkManager> getByResourceGroupWithResponse(
        String resourceGroupName, String networkManagerName, Context context);

    /**
     * Deletes a network manager.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param force Deletes the resource even if it is part of a deployed configuration. If the configuration has been
     *     deployed, the service will do a cleanup deployment in the background, prior to the delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkManagerName, Boolean force);

    /**
     * Deletes a network manager.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkManagerName);

    /**
     * Deletes a network manager.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param force Deletes the resource even if it is part of a deployed configuration. If the configuration has been
     *     deployed, the service will do a cleanup deployment in the background, prior to the delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkManagerName, Boolean force, Context context);

    /**
     * List all network managers in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list NetworkManager as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkManager> list();

    /**
     * List all network managers in a subscription.
     *
     * @param top An optional query parameter which specifies the maximum number of records to be returned by the
     *     server.
     * @param skipToken SkipToken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skipToken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list NetworkManager as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkManager> list(Integer top, String skipToken, Context context);

    /**
     * List network managers in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list NetworkManager as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkManager> listByResourceGroup(String resourceGroupName);

    /**
     * List network managers in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param top An optional query parameter which specifies the maximum number of records to be returned by the
     *     server.
     * @param skipToken SkipToken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skipToken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list NetworkManager as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkManager> listByResourceGroup(
        String resourceGroupName, Integer top, String skipToken, Context context);

    /**
     * Gets the specified Network Manager.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Network Manager along with {@link Response}.
     */
    NetworkManager getById(String id);

    /**
     * Gets the specified Network Manager.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Network Manager along with {@link Response}.
     */
    Response<NetworkManager> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a network manager.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a network manager.
     *
     * @param id the resource ID.
     * @param force Deletes the resource even if it is part of a deployed configuration. If the configuration has been
     *     deployed, the service will do a cleanup deployment in the background, prior to the delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Boolean force, Context context);

    /**
     * Begins definition for a new NetworkManager resource.
     *
     * @param name resource name.
     * @return the first stage of the new NetworkManager definition.
     */
    NetworkManager.DefinitionStages.Blank define(String name);
}
