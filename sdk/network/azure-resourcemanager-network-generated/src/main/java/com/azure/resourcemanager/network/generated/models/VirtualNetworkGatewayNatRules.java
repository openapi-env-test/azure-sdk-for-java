// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of VirtualNetworkGatewayNatRules. */
public interface VirtualNetworkGatewayNatRules {
    /**
     * Retrieves the details of a nat rule.
     *
     * @param resourceGroupName The resource group name of the Virtual Network Gateway.
     * @param virtualNetworkGatewayName The name of the gateway.
     * @param natRuleName The name of the nat rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualNetworkGatewayNatRule Resource along with {@link Response}.
     */
    Response<VirtualNetworkGatewayNatRule> getWithResponse(
        String resourceGroupName, String virtualNetworkGatewayName, String natRuleName, Context context);

    /**
     * Retrieves the details of a nat rule.
     *
     * @param resourceGroupName The resource group name of the Virtual Network Gateway.
     * @param virtualNetworkGatewayName The name of the gateway.
     * @param natRuleName The name of the nat rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualNetworkGatewayNatRule Resource.
     */
    VirtualNetworkGatewayNatRule get(String resourceGroupName, String virtualNetworkGatewayName, String natRuleName);

    /**
     * Deletes a nat rule.
     *
     * @param resourceGroupName The resource group name of the Virtual Network Gateway.
     * @param virtualNetworkGatewayName The name of the gateway.
     * @param natRuleName The name of the nat rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualNetworkGatewayName, String natRuleName);

    /**
     * Deletes a nat rule.
     *
     * @param resourceGroupName The resource group name of the Virtual Network Gateway.
     * @param virtualNetworkGatewayName The name of the gateway.
     * @param natRuleName The name of the nat rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualNetworkGatewayName, String natRuleName, Context context);

    /**
     * Retrieves all nat rules for a particular virtual network gateway.
     *
     * @param resourceGroupName The resource group name of the virtual network gateway.
     * @param virtualNetworkGatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all nat rules to a virtual network gateway as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<VirtualNetworkGatewayNatRule> listByVirtualNetworkGateway(
        String resourceGroupName, String virtualNetworkGatewayName);

    /**
     * Retrieves all nat rules for a particular virtual network gateway.
     *
     * @param resourceGroupName The resource group name of the virtual network gateway.
     * @param virtualNetworkGatewayName The name of the gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all nat rules to a virtual network gateway as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<VirtualNetworkGatewayNatRule> listByVirtualNetworkGateway(
        String resourceGroupName, String virtualNetworkGatewayName, Context context);

    /**
     * Retrieves the details of a nat rule.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualNetworkGatewayNatRule Resource along with {@link Response}.
     */
    VirtualNetworkGatewayNatRule getById(String id);

    /**
     * Retrieves the details of a nat rule.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualNetworkGatewayNatRule Resource along with {@link Response}.
     */
    Response<VirtualNetworkGatewayNatRule> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a nat rule.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a nat rule.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new VirtualNetworkGatewayNatRule resource.
     *
     * @param name resource name.
     * @return the first stage of the new VirtualNetworkGatewayNatRule definition.
     */
    VirtualNetworkGatewayNatRule.DefinitionStages.Blank define(String name);
}
