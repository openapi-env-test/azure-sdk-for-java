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
import com.azure.resourcemanager.network.generated.fluent.models.VirtualRouterInner;

/** An instance of this class provides access to all the operations defined in VirtualRoutersClient. */
public interface VirtualRoutersClient {
    /**
     * Deletes the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String virtualRouterName);

    /**
     * Deletes the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String virtualRouterName, Context context);

    /**
     * Deletes the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualRouterName);

    /**
     * Deletes the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualRouterName, Context context);

    /**
     * Gets the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Virtual Router along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualRouterInner> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualRouterName, String expand, Context context);

    /**
     * Gets the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Virtual Router.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualRouterInner getByResourceGroup(String resourceGroupName, String virtualRouterName);

    /**
     * Creates or updates the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param parameters Parameters supplied to the create or update Virtual Router.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of virtualRouter Resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualRouterInner>, VirtualRouterInner> beginCreateOrUpdate(
        String resourceGroupName, String virtualRouterName, VirtualRouterInner parameters);

    /**
     * Creates or updates the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param parameters Parameters supplied to the create or update Virtual Router.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of virtualRouter Resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualRouterInner>, VirtualRouterInner> beginCreateOrUpdate(
        String resourceGroupName, String virtualRouterName, VirtualRouterInner parameters, Context context);

    /**
     * Creates or updates the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param parameters Parameters supplied to the create or update Virtual Router.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualRouter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualRouterInner createOrUpdate(
        String resourceGroupName, String virtualRouterName, VirtualRouterInner parameters);

    /**
     * Creates or updates the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param parameters Parameters supplied to the create or update Virtual Router.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualRouter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualRouterInner createOrUpdate(
        String resourceGroupName, String virtualRouterName, VirtualRouterInner parameters, Context context);

    /**
     * Lists all Virtual Routers in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListVirtualRouters API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualRouterInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all Virtual Routers in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListVirtualRouters API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualRouterInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all the Virtual Routers in a subscription.
     *
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Virtual Routers in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualRouterInner> list();

    /**
     * Gets all the Virtual Routers in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Virtual Routers in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualRouterInner> list(Context context);
}
