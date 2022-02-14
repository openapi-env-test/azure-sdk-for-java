// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of IpGroups. */
public interface IpGroups {
    /**
     * Gets the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified ipGroups.
     */
    IpGroup getByResourceGroup(String resourceGroupName, String ipGroupsName);

    /**
     * Gets the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param expand Expands resourceIds (of Firewalls/Network Security Groups etc.) back referenced by the IpGroups
     *     resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified ipGroups.
     */
    Response<IpGroup> getByResourceGroupWithResponse(
        String resourceGroupName, String ipGroupsName, String expand, Context context);

    /**
     * Deletes the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String ipGroupsName);

    /**
     * Deletes the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String ipGroupsName, Context context);

    /**
     * Gets all IpGroups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpGroups in a resource group.
     */
    PagedIterable<IpGroup> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all IpGroups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpGroups in a resource group.
     */
    PagedIterable<IpGroup> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all IpGroups in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpGroups in a subscription.
     */
    PagedIterable<IpGroup> list();

    /**
     * Gets all IpGroups in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpGroups in a subscription.
     */
    PagedIterable<IpGroup> list(Context context);

    /**
     * Gets the specified ipGroups.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified ipGroups.
     */
    IpGroup getById(String id);

    /**
     * Gets the specified ipGroups.
     *
     * @param id the resource ID.
     * @param expand Expands resourceIds (of Firewalls/Network Security Groups etc.) back referenced by the IpGroups
     *     resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified ipGroups.
     */
    Response<IpGroup> getByIdWithResponse(String id, String expand, Context context);

    /**
     * Deletes the specified ipGroups.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified ipGroups.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new IpGroup resource.
     *
     * @param name resource name.
     * @return the first stage of the new IpGroup definition.
     */
    IpGroup.DefinitionStages.Blank define(String name);
}
