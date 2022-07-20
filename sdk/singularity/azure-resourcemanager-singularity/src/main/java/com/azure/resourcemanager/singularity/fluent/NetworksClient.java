// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.singularity.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.singularity.fluent.models.NetworkResourceDescriptionInner;

/** An instance of this class provides access to all the operations defined in NetworksClient. */
public interface NetworksClient {
    /**
     * Creates a network resource with the specified name and properties. If a network resource with the same name
     * exists, then it is updated with the specified properties.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param accountName The name of the Singularity account.
     * @param networkResourceName The name of the Singularity network resource.
     * @param body Singularity network information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.singularity.models.ErrorModelPropertiesException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a network resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NetworkResourceDescriptionInner>, NetworkResourceDescriptionInner> beginCreateOrUpdate(
        String resourceGroupName, String accountName, String networkResourceName, NetworkResourceDescriptionInner body);

    /**
     * Creates a network resource with the specified name and properties. If a network resource with the same name
     * exists, then it is updated with the specified properties.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param accountName The name of the Singularity account.
     * @param networkResourceName The name of the Singularity network resource.
     * @param body Singularity network information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.singularity.models.ErrorModelPropertiesException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a network resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NetworkResourceDescriptionInner>, NetworkResourceDescriptionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String accountName,
        String networkResourceName,
        NetworkResourceDescriptionInner body,
        Context context);

    /**
     * Creates a network resource with the specified name and properties. If a network resource with the same name
     * exists, then it is updated with the specified properties.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param accountName The name of the Singularity account.
     * @param networkResourceName The name of the Singularity network resource.
     * @param body Singularity network information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.singularity.models.ErrorModelPropertiesException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkResourceDescriptionInner createOrUpdate(
        String resourceGroupName, String accountName, String networkResourceName, NetworkResourceDescriptionInner body);

    /**
     * Creates a network resource with the specified name and properties. If a network resource with the same name
     * exists, then it is updated with the specified properties.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param accountName The name of the Singularity account.
     * @param networkResourceName The name of the Singularity network resource.
     * @param body Singularity network information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.singularity.models.ErrorModelPropertiesException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkResourceDescriptionInner createOrUpdate(
        String resourceGroupName,
        String accountName,
        String networkResourceName,
        NetworkResourceDescriptionInner body,
        Context context);

    /**
     * If a network resource with the same name exists, then it is updated with the specified properties.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param accountName The name of the Singularity account.
     * @param networkResourceName The name of the Singularity network resource.
     * @param body Singularity network information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.singularity.models.ErrorModelPropertiesException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a network resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NetworkResourceDescriptionInner>, NetworkResourceDescriptionInner> beginUpdate(
        String resourceGroupName, String accountName, String networkResourceName, NetworkResourceDescriptionInner body);

    /**
     * If a network resource with the same name exists, then it is updated with the specified properties.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param accountName The name of the Singularity account.
     * @param networkResourceName The name of the Singularity network resource.
     * @param body Singularity network information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.singularity.models.ErrorModelPropertiesException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a network resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NetworkResourceDescriptionInner>, NetworkResourceDescriptionInner> beginUpdate(
        String resourceGroupName,
        String accountName,
        String networkResourceName,
        NetworkResourceDescriptionInner body,
        Context context);

    /**
     * If a network resource with the same name exists, then it is updated with the specified properties.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param accountName The name of the Singularity account.
     * @param networkResourceName The name of the Singularity network resource.
     * @param body Singularity network information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.singularity.models.ErrorModelPropertiesException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkResourceDescriptionInner update(
        String resourceGroupName, String accountName, String networkResourceName, NetworkResourceDescriptionInner body);

    /**
     * If a network resource with the same name exists, then it is updated with the specified properties.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param accountName The name of the Singularity account.
     * @param networkResourceName The name of the Singularity network resource.
     * @param body Singularity network information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.singularity.models.ErrorModelPropertiesException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkResourceDescriptionInner update(
        String resourceGroupName,
        String accountName,
        String networkResourceName,
        NetworkResourceDescriptionInner body,
        Context context);

    /**
     * Gets information about the network resource with the given name.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param accountName The name of the Singularity account.
     * @param networkResourceName The name of the Singularity network resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.singularity.models.ErrorModelPropertiesException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the network resource with the given name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkResourceDescriptionInner get(String resourceGroupName, String accountName, String networkResourceName);

    /**
     * Gets information about the network resource with the given name.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param accountName The name of the Singularity account.
     * @param networkResourceName The name of the Singularity network resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.singularity.models.ErrorModelPropertiesException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the network resource with the given name along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NetworkResourceDescriptionInner> getWithResponse(
        String resourceGroupName, String accountName, String networkResourceName, Context context);

    /**
     * Deletes the network resource identified by the name.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param accountName The name of the Singularity account.
     * @param networkResourceName The name of the Singularity network resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.singularity.models.ErrorModelPropertiesException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String accountName, String networkResourceName);

    /**
     * Deletes the network resource identified by the name.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param accountName The name of the Singularity account.
     * @param networkResourceName The name of the Singularity network resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.singularity.models.ErrorModelPropertiesException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String accountName, String networkResourceName, Context context);

    /**
     * Deletes the network resource identified by the name.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param accountName The name of the Singularity account.
     * @param networkResourceName The name of the Singularity network resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.singularity.models.ErrorModelPropertiesException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String networkResourceName);

    /**
     * Deletes the network resource identified by the name.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param accountName The name of the Singularity account.
     * @param networkResourceName The name of the Singularity network resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.singularity.models.ErrorModelPropertiesException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String networkResourceName, Context context);

    /**
     * Gets information about all network resources in a given account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param accountName The name of the Singularity account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.singularity.models.ErrorModelPropertiesException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all network resources in a given account as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkResourceDescriptionInner> listByAccount(String resourceGroupName, String accountName);

    /**
     * Gets information about all network resources in a given account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param accountName The name of the Singularity account.
     * @param continuationToken The continuationToken parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.singularity.models.ErrorModelPropertiesException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all network resources in a given account as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkResourceDescriptionInner> listByAccount(
        String resourceGroupName, String accountName, String continuationToken, Context context);
}
