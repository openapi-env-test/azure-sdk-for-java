// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.appcontainers.fluent.models.ContainerAppInner;
import com.azure.resourcemanager.appcontainers.fluent.models.CustomHostnameAnalysisResultInner;
import com.azure.resourcemanager.appcontainers.fluent.models.SecretsCollectionInner;
import com.azure.resourcemanager.appcontainers.models.ContainerAppPatch;

/** An instance of this class provides access to all the operations defined in ContainerAppsClient. */
public interface ContainerAppsClient {
    /**
     * Get the Container Apps in a given subscription.
     *
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Container Apps in a given subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ContainerAppInner> list();

    /**
     * Get the Container Apps in a given subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Container Apps in a given subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ContainerAppInner> list(Context context);

    /**
     * Get the Container Apps in a given resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Container Apps in a given resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ContainerAppInner> listByResourceGroup(String resourceGroupName);

    /**
     * Get the Container Apps in a given resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Container Apps in a given resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ContainerAppInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get the properties of a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param name Name of the Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a Container App.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContainerAppInner getByResourceGroup(String resourceGroupName, String name);

    /**
     * Get the properties of a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param name Name of the Container App.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a Container App along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ContainerAppInner> getByResourceGroupWithResponse(String resourceGroupName, String name, Context context);

    /**
     * Create or update a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param name Name of the Container App.
     * @param containerAppEnvelope Properties used to create a container app.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of container App.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ContainerAppInner>, ContainerAppInner> beginCreateOrUpdate(
        String resourceGroupName, String name, ContainerAppInner containerAppEnvelope);

    /**
     * Create or update a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param name Name of the Container App.
     * @param containerAppEnvelope Properties used to create a container app.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of container App.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ContainerAppInner>, ContainerAppInner> beginCreateOrUpdate(
        String resourceGroupName, String name, ContainerAppInner containerAppEnvelope, Context context);

    /**
     * Create or update a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param name Name of the Container App.
     * @param containerAppEnvelope Properties used to create a container app.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContainerAppInner createOrUpdate(String resourceGroupName, String name, ContainerAppInner containerAppEnvelope);

    /**
     * Create or update a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param name Name of the Container App.
     * @param containerAppEnvelope Properties used to create a container app.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContainerAppInner createOrUpdate(
        String resourceGroupName, String name, ContainerAppInner containerAppEnvelope, Context context);

    /**
     * Delete a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param name Name of the Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String name);

    /**
     * Delete a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param name Name of the Container App.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String name, Context context);

    /**
     * Delete a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param name Name of the Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String name);

    /**
     * Delete a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param name Name of the Container App.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String name, Context context);

    /**
     * Patches a Container App. Currently only patching of tags is supported.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param name Name of the Container App.
     * @param containerAppEnvelope Properties of a container app that need to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContainerAppInner update(String resourceGroupName, String name, ContainerAppPatch containerAppEnvelope);

    /**
     * Patches a Container App. Currently only patching of tags is supported.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param name Name of the Container App.
     * @param containerAppEnvelope Properties of a container app that need to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ContainerAppInner> updateWithResponse(
        String resourceGroupName, String name, ContainerAppPatch containerAppEnvelope, Context context);

    /**
     * Analyzes a custom hostname for a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return custom domain analysis.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomHostnameAnalysisResultInner listCustomHostnameAnalysis(String resourceGroupName, String containerAppName);

    /**
     * Analyzes a custom hostname for a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param customHostname Custom hostname.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return custom domain analysis along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CustomHostnameAnalysisResultInner> listCustomHostnameAnalysisWithResponse(
        String resourceGroupName, String containerAppName, String customHostname, Context context);

    /**
     * List secrets for a container app.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param name Name of the Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App Secrets Collection ARM resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecretsCollectionInner listSecrets(String resourceGroupName, String name);

    /**
     * List secrets for a container app.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param name Name of the Container App.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App Secrets Collection ARM resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SecretsCollectionInner> listSecretsWithResponse(String resourceGroupName, String name, Context context);
}
