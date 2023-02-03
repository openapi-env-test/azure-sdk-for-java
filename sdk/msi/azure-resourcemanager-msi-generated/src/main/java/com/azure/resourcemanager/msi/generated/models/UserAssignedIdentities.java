// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.msi.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of UserAssignedIdentities. */
public interface UserAssignedIdentities {
    /**
     * Lists all the userAssignedIdentities available under the specified subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return values returned by the List operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Identity> list();

    /**
     * Lists all the userAssignedIdentities available under the specified subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return values returned by the List operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Identity> list(Context context);

    /**
     * Lists all the userAssignedIdentities available under the specified ResourceGroup.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return values returned by the List operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Identity> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the userAssignedIdentities available under the specified ResourceGroup.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return values returned by the List operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Identity> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the identity.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @param resourceName The name of the identity resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the identity along with {@link Response}.
     */
    Response<Identity> getByResourceGroupWithResponse(String resourceGroupName, String resourceName, Context context);

    /**
     * Gets the identity.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @param resourceName The name of the identity resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the identity.
     */
    Identity getByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Deletes the identity.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @param resourceName The name of the identity resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByResourceGroupWithResponse(String resourceGroupName, String resourceName, Context context);

    /**
     * Deletes the identity.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @param resourceName The name of the identity resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Gets the identity.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the identity along with {@link Response}.
     */
    Identity getById(String id);

    /**
     * Gets the identity.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the identity along with {@link Response}.
     */
    Response<Identity> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the identity.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the identity.
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
     * Begins definition for a new Identity resource.
     *
     * @param name resource name.
     * @return the first stage of the new Identity definition.
     */
    Identity.DefinitionStages.Blank define(String name);
}
