// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of MhsmPrivateEndpointConnections. */
public interface MhsmPrivateEndpointConnections {
    /**
     * The List operation gets information about the private endpoint connections associated with the managed HSM Pool.
     *
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name Name of the managed HSM Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connections associated with a managed HSM Pools as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<MhsmPrivateEndpointConnection> listByResource(String resourceGroupName, String name);

    /**
     * The List operation gets information about the private endpoint connections associated with the managed HSM Pool.
     *
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name Name of the managed HSM Pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connections associated with a managed HSM Pools as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<MhsmPrivateEndpointConnection> listByResource(String resourceGroupName, String name, Context context);

    /**
     * Gets the specified private endpoint connection associated with the managed HSM Pool.
     *
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name Name of the managed HSM Pool.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the managed hsm
     *     pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the managed HSM Pool along with {@link
     *     Response}.
     */
    Response<MhsmPrivateEndpointConnection> getWithResponse(
        String resourceGroupName, String name, String privateEndpointConnectionName, Context context);

    /**
     * Gets the specified private endpoint connection associated with the managed HSM Pool.
     *
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name Name of the managed HSM Pool.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the managed hsm
     *     pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the managed HSM Pool.
     */
    MhsmPrivateEndpointConnection get(String resourceGroupName, String name, String privateEndpointConnectionName);

    /**
     * Deletes the specified private endpoint connection associated with the managed hsm pool.
     *
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name Name of the managed HSM Pool.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the managed hsm
     *     pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection resource.
     */
    MhsmPrivateEndpointConnection delete(String resourceGroupName, String name, String privateEndpointConnectionName);

    /**
     * Deletes the specified private endpoint connection associated with the managed hsm pool.
     *
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name Name of the managed HSM Pool.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the managed hsm
     *     pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection resource.
     */
    MhsmPrivateEndpointConnection delete(
        String resourceGroupName, String name, String privateEndpointConnectionName, Context context);

    /**
     * Gets the specified private endpoint connection associated with the managed HSM Pool.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the managed HSM Pool along with {@link
     *     Response}.
     */
    MhsmPrivateEndpointConnection getById(String id);

    /**
     * Gets the specified private endpoint connection associated with the managed HSM Pool.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the managed HSM Pool along with {@link
     *     Response}.
     */
    Response<MhsmPrivateEndpointConnection> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified private endpoint connection associated with the managed hsm pool.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection resource.
     */
    MhsmPrivateEndpointConnection deleteById(String id);

    /**
     * Deletes the specified private endpoint connection associated with the managed hsm pool.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection resource.
     */
    MhsmPrivateEndpointConnection deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new MhsmPrivateEndpointConnection resource.
     *
     * @param name resource name.
     * @return the first stage of the new MhsmPrivateEndpointConnection definition.
     */
    MhsmPrivateEndpointConnection.DefinitionStages.Blank define(String name);
}
