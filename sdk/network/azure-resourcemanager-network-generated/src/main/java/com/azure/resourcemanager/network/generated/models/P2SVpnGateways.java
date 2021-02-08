// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of P2SVpnGateways. */
public interface P2SVpnGateways {
    /**
     * Retrieves the details of a virtual wan p2s vpn gateway.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnGateway Resource.
     */
    P2SVpnGateway getByResourceGroup(String resourceGroupName, String gatewayName);

    /**
     * Retrieves the details of a virtual wan p2s vpn gateway.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnGateway Resource.
     */
    Response<P2SVpnGateway> getByResourceGroupWithResponse(
        String resourceGroupName, String gatewayName, Context context);

    /**
     * Deletes a virtual wan p2s vpn gateway.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String gatewayName);

    /**
     * Deletes a virtual wan p2s vpn gateway.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String gatewayName, Context context);

    /**
     * Lists all the P2SVpnGateways in a resource group.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list P2SVpnGateways.
     */
    PagedIterable<P2SVpnGateway> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the P2SVpnGateways in a resource group.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list P2SVpnGateways.
     */
    PagedIterable<P2SVpnGateway> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all the P2SVpnGateways in a subscription.
     *
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list P2SVpnGateways.
     */
    PagedIterable<P2SVpnGateway> list();

    /**
     * Lists all the P2SVpnGateways in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list P2SVpnGateways.
     */
    PagedIterable<P2SVpnGateway> list(Context context);

    /**
     * Generates VPN profile for P2S client of the P2SVpnGateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the P2SVpnGateway.
     * @param parameters Parameters supplied to the generate P2SVpnGateway VPN client package operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpn Profile Response for package generation.
     */
    VpnProfileResponse generateVpnProfile(
        String resourceGroupName, String gatewayName, P2SVpnProfileParameters parameters);

    /**
     * Generates VPN profile for P2S client of the P2SVpnGateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the P2SVpnGateway.
     * @param parameters Parameters supplied to the generate P2SVpnGateway VPN client package operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpn Profile Response for package generation.
     */
    VpnProfileResponse generateVpnProfile(
        String resourceGroupName, String gatewayName, P2SVpnProfileParameters parameters, Context context);

    /**
     * Retrieves the details of a virtual wan p2s vpn gateway.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnGateway Resource.
     */
    P2SVpnGateway getById(String id);

    /**
     * Retrieves the details of a virtual wan p2s vpn gateway.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnGateway Resource.
     */
    Response<P2SVpnGateway> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a virtual wan p2s vpn gateway.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a virtual wan p2s vpn gateway.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new P2SVpnGateway resource.
     *
     * @param name resource name.
     * @return the first stage of the new P2SVpnGateway definition.
     */
    P2SVpnGateway.DefinitionStages.Blank define(String name);
}
