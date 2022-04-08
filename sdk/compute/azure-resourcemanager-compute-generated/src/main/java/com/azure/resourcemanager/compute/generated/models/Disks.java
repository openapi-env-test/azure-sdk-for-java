// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Disks. */
public interface Disks {
    /**
     * Gets information about a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The maximum name length is 80
     *     characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a disk.
     */
    Disk getByResourceGroup(String resourceGroupName, String diskName);

    /**
     * Gets information about a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The maximum name length is 80
     *     characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a disk along with {@link Response}.
     */
    Response<Disk> getByResourceGroupWithResponse(String resourceGroupName, String diskName, Context context);

    /**
     * Deletes a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The maximum name length is 80
     *     characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String diskName);

    /**
     * Deletes a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The maximum name length is 80
     *     characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String diskName, Context context);

    /**
     * Lists all the disks under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Disks operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Disk> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the disks under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Disks operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Disk> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all the disks under a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Disks operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Disk> list();

    /**
     * Lists all the disks under a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Disks operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Disk> list(Context context);

    /**
     * Grants access to a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The maximum name length is 80
     *     characters.
     * @param grantAccessData Access data object supplied in the body of the get disk access operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a disk access SAS uri.
     */
    AccessUri grantAccess(String resourceGroupName, String diskName, GrantAccessData grantAccessData);

    /**
     * Grants access to a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The maximum name length is 80
     *     characters.
     * @param grantAccessData Access data object supplied in the body of the get disk access operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a disk access SAS uri.
     */
    AccessUri grantAccess(String resourceGroupName, String diskName, GrantAccessData grantAccessData, Context context);

    /**
     * Revokes access to a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The maximum name length is 80
     *     characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void revokeAccess(String resourceGroupName, String diskName);

    /**
     * Revokes access to a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The maximum name length is 80
     *     characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void revokeAccess(String resourceGroupName, String diskName, Context context);

    /**
     * Gets information about a disk.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a disk along with {@link Response}.
     */
    Disk getById(String id);

    /**
     * Gets information about a disk.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a disk along with {@link Response}.
     */
    Response<Disk> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a disk.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a disk.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Disk resource.
     *
     * @param name resource name.
     * @return the first stage of the new Disk definition.
     */
    Disk.DefinitionStages.Blank define(String name);
}
