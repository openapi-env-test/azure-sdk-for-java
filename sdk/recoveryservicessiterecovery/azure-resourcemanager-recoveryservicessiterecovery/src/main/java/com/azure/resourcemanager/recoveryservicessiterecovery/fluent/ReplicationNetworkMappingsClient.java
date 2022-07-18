// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.NetworkMappingInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.CreateNetworkMappingInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UpdateNetworkMappingInput;

/** An instance of this class provides access to all the operations defined in ReplicationNetworkMappingsClient. */
public interface ReplicationNetworkMappingsClient {
    /**
     * Lists all ASR network mappings for the specified network.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Primary fabric name.
     * @param networkName Primary network name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of network mappings as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkMappingInner> listByReplicationNetworks(
        String resourceName, String resourceGroupName, String fabricName, String networkName);

    /**
     * Lists all ASR network mappings for the specified network.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Primary fabric name.
     * @param networkName Primary network name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of network mappings as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkMappingInner> listByReplicationNetworks(
        String resourceName, String resourceGroupName, String fabricName, String networkName, Context context);

    /**
     * Gets the details of an ASR network mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Primary fabric name.
     * @param networkName Primary network name.
     * @param networkMappingName Network mapping name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an ASR network mapping.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkMappingInner get(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String networkName,
        String networkMappingName);

    /**
     * Gets the details of an ASR network mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Primary fabric name.
     * @param networkName Primary network name.
     * @param networkMappingName Network mapping name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an ASR network mapping along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NetworkMappingInner> getWithResponse(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String networkName,
        String networkMappingName,
        Context context);

    /**
     * The operation to create an ASR network mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Primary fabric name.
     * @param networkName Primary network name.
     * @param networkMappingName Network mapping name.
     * @param input Create network mapping input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of network Mapping model.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NetworkMappingInner>, NetworkMappingInner> beginCreate(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String networkName,
        String networkMappingName,
        CreateNetworkMappingInput input);

    /**
     * The operation to create an ASR network mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Primary fabric name.
     * @param networkName Primary network name.
     * @param networkMappingName Network mapping name.
     * @param input Create network mapping input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of network Mapping model.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NetworkMappingInner>, NetworkMappingInner> beginCreate(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String networkName,
        String networkMappingName,
        CreateNetworkMappingInput input,
        Context context);

    /**
     * The operation to create an ASR network mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Primary fabric name.
     * @param networkName Primary network name.
     * @param networkMappingName Network mapping name.
     * @param input Create network mapping input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network Mapping model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkMappingInner create(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String networkName,
        String networkMappingName,
        CreateNetworkMappingInput input);

    /**
     * The operation to create an ASR network mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Primary fabric name.
     * @param networkName Primary network name.
     * @param networkMappingName Network mapping name.
     * @param input Create network mapping input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network Mapping model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkMappingInner create(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String networkName,
        String networkMappingName,
        CreateNetworkMappingInput input,
        Context context);

    /**
     * The operation to delete a network mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Primary fabric name.
     * @param networkName Primary network name.
     * @param networkMappingName ARM Resource Name for network mapping.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String networkName,
        String networkMappingName);

    /**
     * The operation to delete a network mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Primary fabric name.
     * @param networkName Primary network name.
     * @param networkMappingName ARM Resource Name for network mapping.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String networkName,
        String networkMappingName,
        Context context);

    /**
     * The operation to delete a network mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Primary fabric name.
     * @param networkName Primary network name.
     * @param networkMappingName ARM Resource Name for network mapping.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String networkName,
        String networkMappingName);

    /**
     * The operation to delete a network mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Primary fabric name.
     * @param networkName Primary network name.
     * @param networkMappingName ARM Resource Name for network mapping.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String networkName,
        String networkMappingName,
        Context context);

    /**
     * The operation to update an ASR network mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Primary fabric name.
     * @param networkName Primary network name.
     * @param networkMappingName Network mapping name.
     * @param input Update network mapping input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of network Mapping model.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NetworkMappingInner>, NetworkMappingInner> beginUpdate(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String networkName,
        String networkMappingName,
        UpdateNetworkMappingInput input);

    /**
     * The operation to update an ASR network mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Primary fabric name.
     * @param networkName Primary network name.
     * @param networkMappingName Network mapping name.
     * @param input Update network mapping input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of network Mapping model.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NetworkMappingInner>, NetworkMappingInner> beginUpdate(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String networkName,
        String networkMappingName,
        UpdateNetworkMappingInput input,
        Context context);

    /**
     * The operation to update an ASR network mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Primary fabric name.
     * @param networkName Primary network name.
     * @param networkMappingName Network mapping name.
     * @param input Update network mapping input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network Mapping model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkMappingInner update(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String networkName,
        String networkMappingName,
        UpdateNetworkMappingInput input);

    /**
     * The operation to update an ASR network mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Primary fabric name.
     * @param networkName Primary network name.
     * @param networkMappingName Network mapping name.
     * @param input Update network mapping input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network Mapping model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkMappingInner update(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String networkName,
        String networkMappingName,
        UpdateNetworkMappingInput input,
        Context context);

    /**
     * Lists all ASR network mappings in the vault.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of network mappings as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkMappingInner> list(String resourceName, String resourceGroupName);

    /**
     * Lists all ASR network mappings in the vault.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of network mappings as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkMappingInner> list(String resourceName, String resourceGroupName, Context context);
}
