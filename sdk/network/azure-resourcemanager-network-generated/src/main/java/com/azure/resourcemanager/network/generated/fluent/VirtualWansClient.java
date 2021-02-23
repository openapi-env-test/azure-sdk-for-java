// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualWanInner;
import com.azure.resourcemanager.network.generated.models.TagsObject;

/** An instance of this class provides access to all the operations defined in VirtualWansClient. */
public interface VirtualWansClient {
    /**
     * Retrieves the details of a VirtualWAN.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWAN being retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualWAN Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualWanInner getByResourceGroup(String resourceGroupName, String virtualWanName);

    /**
     * Retrieves the details of a VirtualWAN.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWAN being retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualWAN Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualWanInner> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualWanName, Context context);

    /**
     * Creates a VirtualWAN resource if it doesn't exist else updates the existing VirtualWAN.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWAN being created or updated.
     * @param wanParameters Parameters supplied to create or update VirtualWAN.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualWAN Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VirtualWanInner>, VirtualWanInner> beginCreateOrUpdate(
        String resourceGroupName, String virtualWanName, VirtualWanInner wanParameters);

    /**
     * Creates a VirtualWAN resource if it doesn't exist else updates the existing VirtualWAN.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWAN being created or updated.
     * @param wanParameters Parameters supplied to create or update VirtualWAN.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualWAN Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VirtualWanInner>, VirtualWanInner> beginCreateOrUpdate(
        String resourceGroupName, String virtualWanName, VirtualWanInner wanParameters, Context context);

    /**
     * Creates a VirtualWAN resource if it doesn't exist else updates the existing VirtualWAN.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWAN being created or updated.
     * @param wanParameters Parameters supplied to create or update VirtualWAN.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualWAN Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualWanInner createOrUpdate(String resourceGroupName, String virtualWanName, VirtualWanInner wanParameters);

    /**
     * Creates a VirtualWAN resource if it doesn't exist else updates the existing VirtualWAN.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWAN being created or updated.
     * @param wanParameters Parameters supplied to create or update VirtualWAN.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualWAN Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualWanInner createOrUpdate(
        String resourceGroupName, String virtualWanName, VirtualWanInner wanParameters, Context context);

    /**
     * Updates a VirtualWAN tags.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWAN being updated.
     * @param wanParameters Parameters supplied to Update VirtualWAN tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualWAN Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualWanInner updateTags(String resourceGroupName, String virtualWanName, TagsObject wanParameters);

    /**
     * Updates a VirtualWAN tags.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWAN being updated.
     * @param wanParameters Parameters supplied to Update VirtualWAN tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualWAN Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualWanInner> updateTagsWithResponse(
        String resourceGroupName, String virtualWanName, TagsObject wanParameters, Context context);

    /**
     * Deletes a VirtualWAN.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWAN being deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String virtualWanName);

    /**
     * Deletes a VirtualWAN.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWAN being deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String virtualWanName, Context context);

    /**
     * Deletes a VirtualWAN.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWAN being deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualWanName);

    /**
     * Deletes a VirtualWAN.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWAN being deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualWanName, Context context);

    /**
     * Lists all the VirtualWANs in a resource group.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VirtualWANs.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualWanInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the VirtualWANs in a resource group.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VirtualWANs.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualWanInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all the VirtualWANs in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VirtualWANs.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualWanInner> list();

    /**
     * Lists all the VirtualWANs in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VirtualWANs.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualWanInner> list(Context context);
}
