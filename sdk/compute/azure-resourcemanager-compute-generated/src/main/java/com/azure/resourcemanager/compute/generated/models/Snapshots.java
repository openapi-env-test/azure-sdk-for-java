// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Snapshots. */
public interface Snapshots {
    /**
     * Gets information about a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The max name length is 80
     *     characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a snapshot.
     */
    Snapshot getByResourceGroup(String resourceGroupName, String snapshotName);

    /**
     * Gets information about a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The max name length is 80
     *     characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a snapshot.
     */
    Response<Snapshot> getByResourceGroupWithResponse(String resourceGroupName, String snapshotName, Context context);

    /**
     * Deletes a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The max name length is 80
     *     characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String snapshotName);

    /**
     * Deletes a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The max name length is 80
     *     characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String snapshotName, Context context);

    /**
     * Lists snapshots under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Snapshots operation response.
     */
    PagedIterable<Snapshot> listByResourceGroup(String resourceGroupName);

    /**
     * Lists snapshots under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Snapshots operation response.
     */
    PagedIterable<Snapshot> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists snapshots under a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Snapshots operation response.
     */
    PagedIterable<Snapshot> list();

    /**
     * Lists snapshots under a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Snapshots operation response.
     */
    PagedIterable<Snapshot> list(Context context);

    /**
     * Grants access to a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The max name length is 80
     *     characters.
     * @param grantAccessData Access data object supplied in the body of the get snapshot access operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a disk access SAS uri.
     */
    AccessUri grantAccess(String resourceGroupName, String snapshotName, GrantAccessData grantAccessData);

    /**
     * Grants access to a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The max name length is 80
     *     characters.
     * @param grantAccessData Access data object supplied in the body of the get snapshot access operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a disk access SAS uri.
     */
    AccessUri grantAccess(
        String resourceGroupName, String snapshotName, GrantAccessData grantAccessData, Context context);

    /**
     * Revokes access to a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The max name length is 80
     *     characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void revokeAccess(String resourceGroupName, String snapshotName);

    /**
     * Revokes access to a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The max name length is 80
     *     characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void revokeAccess(String resourceGroupName, String snapshotName, Context context);

    /**
     * Gets information about a snapshot.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a snapshot.
     */
    Snapshot getById(String id);

    /**
     * Gets information about a snapshot.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a snapshot.
     */
    Response<Snapshot> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a snapshot.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a snapshot.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Snapshot resource.
     *
     * @param name resource name.
     * @return the first stage of the new Snapshot definition.
     */
    Snapshot.DefinitionStages.Blank define(String name);
}
