// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.elasticsan.fluent.models.VolumeGroupInner;
import com.azure.resourcemanager.elasticsan.models.VolumeGroupUpdate;

/** An instance of this class provides access to all the operations defined in VolumeGroupsClient. */
public interface VolumeGroupsClient {
    /**
     * List VolumeGroups.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Volume Groups as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VolumeGroupInner> listByElasticSan(String resourceGroupName, String elasticSanName);

    /**
     * List VolumeGroups.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Volume Groups as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VolumeGroupInner> listByElasticSan(String resourceGroupName, String elasticSanName, Context context);

    /**
     * Create a Volume Group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param parameters Volume Group object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of response for Volume Group request.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VolumeGroupInner>, VolumeGroupInner> beginCreate(
        String resourceGroupName, String elasticSanName, String volumeGroupName, VolumeGroupInner parameters);

    /**
     * Create a Volume Group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param parameters Volume Group object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of response for Volume Group request.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VolumeGroupInner>, VolumeGroupInner> beginCreate(
        String resourceGroupName,
        String elasticSanName,
        String volumeGroupName,
        VolumeGroupInner parameters,
        Context context);

    /**
     * Create a Volume Group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param parameters Volume Group object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for Volume Group request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VolumeGroupInner create(
        String resourceGroupName, String elasticSanName, String volumeGroupName, VolumeGroupInner parameters);

    /**
     * Create a Volume Group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param parameters Volume Group object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for Volume Group request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VolumeGroupInner create(
        String resourceGroupName,
        String elasticSanName,
        String volumeGroupName,
        VolumeGroupInner parameters,
        Context context);

    /**
     * Update an VolumeGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param parameters Volume Group object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of response for Volume Group request.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VolumeGroupInner>, VolumeGroupInner> beginUpdate(
        String resourceGroupName, String elasticSanName, String volumeGroupName, VolumeGroupUpdate parameters);

    /**
     * Update an VolumeGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param parameters Volume Group object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of response for Volume Group request.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VolumeGroupInner>, VolumeGroupInner> beginUpdate(
        String resourceGroupName,
        String elasticSanName,
        String volumeGroupName,
        VolumeGroupUpdate parameters,
        Context context);

    /**
     * Update an VolumeGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param parameters Volume Group object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for Volume Group request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VolumeGroupInner update(
        String resourceGroupName, String elasticSanName, String volumeGroupName, VolumeGroupUpdate parameters);

    /**
     * Update an VolumeGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param parameters Volume Group object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for Volume Group request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VolumeGroupInner update(
        String resourceGroupName,
        String elasticSanName,
        String volumeGroupName,
        VolumeGroupUpdate parameters,
        Context context);

    /**
     * Delete an VolumeGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param forceDeleteVolumesAndSnapshots Required if the Volume Group has associated volumes and snapshots.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName,
        String elasticSanName,
        String volumeGroupName,
        Boolean forceDeleteVolumesAndSnapshots);

    /**
     * Delete an VolumeGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param forceDeleteVolumesAndSnapshots Required if the Volume Group has associated volumes and snapshots.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName,
        String elasticSanName,
        String volumeGroupName,
        Boolean forceDeleteVolumesAndSnapshots,
        Context context);

    /**
     * Delete an VolumeGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param forceDeleteVolumesAndSnapshots Required if the Volume Group has associated volumes and snapshots.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName,
        String elasticSanName,
        String volumeGroupName,
        Boolean forceDeleteVolumesAndSnapshots);

    /**
     * Delete an VolumeGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String elasticSanName, String volumeGroupName);

    /**
     * Delete an VolumeGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param forceDeleteVolumesAndSnapshots Required if the Volume Group has associated volumes and snapshots.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName,
        String elasticSanName,
        String volumeGroupName,
        Boolean forceDeleteVolumesAndSnapshots,
        Context context);

    /**
     * Get an VolumeGroups.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an VolumeGroups.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VolumeGroupInner get(String resourceGroupName, String elasticSanName, String volumeGroupName);

    /**
     * Get an VolumeGroups.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an VolumeGroups along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VolumeGroupInner> getWithResponse(
        String resourceGroupName, String elasticSanName, String volumeGroupName, Context context);
}
