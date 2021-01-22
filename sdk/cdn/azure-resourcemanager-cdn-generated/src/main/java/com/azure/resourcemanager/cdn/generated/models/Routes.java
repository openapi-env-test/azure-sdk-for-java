// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Routes. */
public interface Routes {
    /**
     * Lists all of the existing origins within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list routes.
     */
    PagedIterable<Route> listByEndpoint(String resourceGroupName, String profileName, String endpointName);

    /**
     * Lists all of the existing origins within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list routes.
     */
    PagedIterable<Route> listByEndpoint(
        String resourceGroupName, String profileName, String endpointName, Context context);

    /**
     * Gets an existing route with the specified route name under the specified subscription, resource group, profile,
     * and AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing route with the specified route name under the specified subscription, resource group,
     *     profile, and AzureFrontDoor endpoint.
     */
    Route get(String resourceGroupName, String profileName, String endpointName, String routeName);

    /**
     * Gets an existing route with the specified route name under the specified subscription, resource group, profile,
     * and AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing route with the specified route name under the specified subscription, resource group,
     *     profile, and AzureFrontDoor endpoint.
     */
    Response<Route> getWithResponse(
        String resourceGroupName, String profileName, String endpointName, String routeName, Context context);

    /**
     * Deletes an existing route with the specified route name under the specified subscription, resource group,
     * profile, and AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String profileName, String endpointName, String routeName);

    /**
     * Deletes an existing route with the specified route name under the specified subscription, resource group,
     * profile, and AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String profileName, String endpointName, String routeName, Context context);

    /**
     * Gets an existing route with the specified route name under the specified subscription, resource group, profile,
     * and AzureFrontDoor endpoint.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing route with the specified route name under the specified subscription, resource group,
     *     profile, and AzureFrontDoor endpoint.
     */
    Route getById(String id);

    /**
     * Gets an existing route with the specified route name under the specified subscription, resource group, profile,
     * and AzureFrontDoor endpoint.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing route with the specified route name under the specified subscription, resource group,
     *     profile, and AzureFrontDoor endpoint.
     */
    Response<Route> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an existing route with the specified route name under the specified subscription, resource group,
     * profile, and AzureFrontDoor endpoint.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an existing route with the specified route name under the specified subscription, resource group,
     * profile, and AzureFrontDoor endpoint.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Route resource.
     *
     * @param name resource name.
     * @return the first stage of the new Route definition.
     */
    Route.DefinitionStages.Blank define(String name);
}
