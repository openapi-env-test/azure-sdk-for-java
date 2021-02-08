// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of LocalNetworkGateways. */
public interface LocalNetworkGateways {
    /**
     * The Get LocalNetworkGateway operation retrieves information about the specified local network gateway through
     * Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a common class for general resource information.
     */
    LocalNetworkGateway getByResourceGroup(String resourceGroupName, String localNetworkGatewayName);

    /**
     * The Get LocalNetworkGateway operation retrieves information about the specified local network gateway through
     * Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a common class for general resource information.
     */
    Response<LocalNetworkGateway> getByResourceGroupWithResponse(
        String resourceGroupName, String localNetworkGatewayName, Context context);

    /**
     * The Delete LocalNetworkGateway operation deletes the specified local network Gateway through Network resource
     * provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String localNetworkGatewayName);

    /**
     * The Delete LocalNetworkGateway operation deletes the specified local network Gateway through Network resource
     * provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String localNetworkGatewayName, Context context);

    /**
     * The List LocalNetworkGateways operation retrieves all the local network gateways stored.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListLocalNetworkGateways Api service call.
     */
    PagedIterable<LocalNetworkGateway> listByResourceGroup(String resourceGroupName);

    /**
     * The List LocalNetworkGateways operation retrieves all the local network gateways stored.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListLocalNetworkGateways Api service call.
     */
    PagedIterable<LocalNetworkGateway> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * The Get LocalNetworkGateway operation retrieves information about the specified local network gateway through
     * Network resource provider.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a common class for general resource information.
     */
    LocalNetworkGateway getById(String id);

    /**
     * The Get LocalNetworkGateway operation retrieves information about the specified local network gateway through
     * Network resource provider.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a common class for general resource information.
     */
    Response<LocalNetworkGateway> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new LocalNetworkGateway resource.
     *
     * @param name resource name.
     * @return the first stage of the new LocalNetworkGateway definition.
     */
    LocalNetworkGateway.DefinitionStages.Blank define(String name);
}
