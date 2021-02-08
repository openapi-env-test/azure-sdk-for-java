// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of VirtualNetworks. */
public interface VirtualNetworks {
    /**
     * The Delete VirtualNetwork operation deletes the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String virtualNetworkName);

    /**
     * The Delete VirtualNetwork operation deletes the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualNetworkName, Context context);

    /**
     * The Get VirtualNetwork operation retrieves information about the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network resource.
     */
    VirtualNetwork getByResourceGroup(String resourceGroupName, String virtualNetworkName);

    /**
     * The Get VirtualNetwork operation retrieves information about the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network resource.
     */
    Response<VirtualNetwork> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualNetworkName, Context context);

    /**
     * The list VirtualNetwork returns all Virtual Networks in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListVirtualNetworks Api service call.
     */
    PagedIterable<VirtualNetwork> list();

    /**
     * The list VirtualNetwork returns all Virtual Networks in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListVirtualNetworks Api service call.
     */
    PagedIterable<VirtualNetwork> list(Context context);

    /**
     * The list VirtualNetwork returns all Virtual Networks in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListVirtualNetworks Api service call.
     */
    PagedIterable<VirtualNetwork> listByResourceGroup(String resourceGroupName);

    /**
     * The list VirtualNetwork returns all Virtual Networks in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListVirtualNetworks Api service call.
     */
    PagedIterable<VirtualNetwork> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * The Get VirtualNetwork operation retrieves information about the specified virtual network.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network resource.
     */
    VirtualNetwork getById(String id);

    /**
     * The Get VirtualNetwork operation retrieves information about the specified virtual network.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network resource.
     */
    Response<VirtualNetwork> getByIdWithResponse(String id, Context context);

    /**
     * The Delete VirtualNetwork operation deletes the specified virtual network.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * The Delete VirtualNetwork operation deletes the specified virtual network.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new VirtualNetwork resource.
     *
     * @param name resource name.
     * @return the first stage of the new VirtualNetwork definition.
     */
    VirtualNetwork.DefinitionStages.Blank define(String name);
}
