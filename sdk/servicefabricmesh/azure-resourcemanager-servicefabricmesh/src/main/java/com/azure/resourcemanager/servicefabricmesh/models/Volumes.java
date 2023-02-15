// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmesh.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Volumes. */
public interface Volumes {
    /**
     * Gets the volume resource with the given name.
     *
     * <p>Gets the information about the volume resource with the given name. The information include the description
     * and other properties of the volume.
     *
     * @param resourceGroupName Azure resource group name.
     * @param volumeResourceName The identity of the volume.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.servicefabricmesh.models.ErrorErrorModelException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about the volume resource with the given name along with {@link Response}.
     */
    Response<VolumeResourceDescription> getByResourceGroupWithResponse(
        String resourceGroupName, String volumeResourceName, Context context);

    /**
     * Gets the volume resource with the given name.
     *
     * <p>Gets the information about the volume resource with the given name. The information include the description
     * and other properties of the volume.
     *
     * @param resourceGroupName Azure resource group name.
     * @param volumeResourceName The identity of the volume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.servicefabricmesh.models.ErrorErrorModelException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about the volume resource with the given name.
     */
    VolumeResourceDescription getByResourceGroup(String resourceGroupName, String volumeResourceName);

    /**
     * Deletes the volume resource.
     *
     * <p>Deletes the volume resource identified by the name.
     *
     * @param resourceGroupName Azure resource group name.
     * @param volumeResourceName The identity of the volume.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.servicefabricmesh.models.ErrorErrorModelException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByResourceGroupWithResponse(
        String resourceGroupName, String volumeResourceName, Context context);

    /**
     * Deletes the volume resource.
     *
     * <p>Deletes the volume resource identified by the name.
     *
     * @param resourceGroupName Azure resource group name.
     * @param volumeResourceName The identity of the volume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.servicefabricmesh.models.ErrorErrorModelException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String volumeResourceName);

    /**
     * Gets all the volume resources in a given resource group.
     *
     * <p>Gets the information about all volume resources in a given resource group. The information include the
     * description and other properties of the Volume.
     *
     * @param resourceGroupName Azure resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.servicefabricmesh.models.ErrorErrorModelException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about all volume resources in a given resource group as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<VolumeResourceDescription> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all the volume resources in a given resource group.
     *
     * <p>Gets the information about all volume resources in a given resource group. The information include the
     * description and other properties of the Volume.
     *
     * @param resourceGroupName Azure resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.servicefabricmesh.models.ErrorErrorModelException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about all volume resources in a given resource group as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<VolumeResourceDescription> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all the volume resources in a given subscription.
     *
     * <p>Gets the information about all volume resources in a given resource group. The information include the
     * description and other properties of the volume.
     *
     * @throws com.azure.resourcemanager.servicefabricmesh.models.ErrorErrorModelException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about all volume resources in a given resource group as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<VolumeResourceDescription> list();

    /**
     * Gets all the volume resources in a given subscription.
     *
     * <p>Gets the information about all volume resources in a given resource group. The information include the
     * description and other properties of the volume.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.servicefabricmesh.models.ErrorErrorModelException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about all volume resources in a given resource group as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<VolumeResourceDescription> list(Context context);

    /**
     * Gets the volume resource with the given name.
     *
     * <p>Gets the information about the volume resource with the given name. The information include the description
     * and other properties of the volume.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.servicefabricmesh.models.ErrorErrorModelException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about the volume resource with the given name along with {@link Response}.
     */
    VolumeResourceDescription getById(String id);

    /**
     * Gets the volume resource with the given name.
     *
     * <p>Gets the information about the volume resource with the given name. The information include the description
     * and other properties of the volume.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.servicefabricmesh.models.ErrorErrorModelException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about the volume resource with the given name along with {@link Response}.
     */
    Response<VolumeResourceDescription> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the volume resource.
     *
     * <p>Deletes the volume resource identified by the name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.servicefabricmesh.models.ErrorErrorModelException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the volume resource.
     *
     * <p>Deletes the volume resource identified by the name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.servicefabricmesh.models.ErrorErrorModelException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new VolumeResourceDescription resource.
     *
     * @param name resource name.
     * @return the first stage of the new VolumeResourceDescription definition.
     */
    VolumeResourceDescription.DefinitionStages.Blank define(String name);
}
