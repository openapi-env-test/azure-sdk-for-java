// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Snapshots. */
public interface Snapshots {
    /**
     * List Snapshots in a VolumeGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Snapshots as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Snapshot> listByVolumeGroup(String resourceGroupName, String elasticSanName, String volumeGroupName);

    /**
     * List Snapshots in a VolumeGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param filter Specify $filter='volumeName eq &lt;volume name&gt;' to filter on volume.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Snapshots as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Snapshot> listByVolumeGroup(
        String resourceGroupName, String elasticSanName, String volumeGroupName, String filter, Context context);

    /**
     * Delete an Volume.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param snapshotName The name of the snapshot within the given subscription, resource and volume group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String elasticSanName, String volumeGroupName, String snapshotName);

    /**
     * Delete an Volume.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param snapshotName The name of the snapshot within the given subscription, resource and volume group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName, String elasticSanName, String volumeGroupName, String snapshotName, Context context);

    /**
     * Get a Volume Snapshot.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param snapshotName The name of the snapshot within the given subscription, resource and volume group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Volume Snapshot.
     */
    Snapshot get(String resourceGroupName, String elasticSanName, String volumeGroupName, String snapshotName);

    /**
     * Get a Volume Snapshot.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param snapshotName The name of the snapshot within the given subscription, resource and volume group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Volume Snapshot along with {@link Response}.
     */
    Response<Snapshot> getWithResponse(
        String resourceGroupName, String elasticSanName, String volumeGroupName, String snapshotName, Context context);

    /**
     * Export a volume to a different Volume Group in same San account or different San account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param snapshotName The name of the snapshot within the given subscription, resource and volume group.
     * @param parameters Snapshot object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for Volume Snapshot request.
     */
    Snapshot export(
        String resourceGroupName,
        String elasticSanName,
        String volumeGroupName,
        String snapshotName,
        ExportSnapshot parameters);

    /**
     * Export a volume to a different Volume Group in same San account or different San account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param snapshotName The name of the snapshot within the given subscription, resource and volume group.
     * @param parameters Snapshot object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for Volume Snapshot request.
     */
    Snapshot export(
        String resourceGroupName,
        String elasticSanName,
        String volumeGroupName,
        String snapshotName,
        ExportSnapshot parameters,
        Context context);

    /**
     * Get a Volume Snapshot.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Volume Snapshot along with {@link Response}.
     */
    Snapshot getById(String id);

    /**
     * Get a Volume Snapshot.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Volume Snapshot along with {@link Response}.
     */
    Response<Snapshot> getByIdWithResponse(String id, Context context);

    /**
     * Delete an Volume.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete an Volume.
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
