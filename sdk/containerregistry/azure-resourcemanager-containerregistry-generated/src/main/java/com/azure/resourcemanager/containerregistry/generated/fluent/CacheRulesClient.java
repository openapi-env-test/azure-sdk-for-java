// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.CacheRuleInner;
import com.azure.resourcemanager.containerregistry.generated.models.CacheRuleUpdateParameters;

/** An instance of this class provides access to all the operations defined in CacheRulesClient. */
public interface CacheRulesClient {
    /**
     * Lists all cache rule resources for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list cache rules for a container registry as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CacheRuleInner> list(String resourceGroupName, String registryName);

    /**
     * Lists all cache rule resources for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list cache rules for a container registry as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CacheRuleInner> list(String resourceGroupName, String registryName, Context context);

    /**
     * Gets the properties of the specified cache rule resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param cacheRuleName The name of the cache rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified cache rule resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CacheRuleInner> getWithResponse(
        String resourceGroupName, String registryName, String cacheRuleName, Context context);

    /**
     * Gets the properties of the specified cache rule resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param cacheRuleName The name of the cache rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified cache rule resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CacheRuleInner get(String resourceGroupName, String registryName, String cacheRuleName);

    /**
     * Creates a cache rule for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param cacheRuleName The name of the cache rule.
     * @param cacheRuleCreateParameters The parameters for creating a cache rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an object that represents a cache rule for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CacheRuleInner>, CacheRuleInner> beginCreate(
        String resourceGroupName, String registryName, String cacheRuleName, CacheRuleInner cacheRuleCreateParameters);

    /**
     * Creates a cache rule for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param cacheRuleName The name of the cache rule.
     * @param cacheRuleCreateParameters The parameters for creating a cache rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an object that represents a cache rule for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CacheRuleInner>, CacheRuleInner> beginCreate(
        String resourceGroupName,
        String registryName,
        String cacheRuleName,
        CacheRuleInner cacheRuleCreateParameters,
        Context context);

    /**
     * Creates a cache rule for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param cacheRuleName The name of the cache rule.
     * @param cacheRuleCreateParameters The parameters for creating a cache rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a cache rule for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CacheRuleInner create(
        String resourceGroupName, String registryName, String cacheRuleName, CacheRuleInner cacheRuleCreateParameters);

    /**
     * Creates a cache rule for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param cacheRuleName The name of the cache rule.
     * @param cacheRuleCreateParameters The parameters for creating a cache rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a cache rule for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CacheRuleInner create(
        String resourceGroupName,
        String registryName,
        String cacheRuleName,
        CacheRuleInner cacheRuleCreateParameters,
        Context context);

    /**
     * Deletes a cache rule resource from a container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param cacheRuleName The name of the cache rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String registryName, String cacheRuleName);

    /**
     * Deletes a cache rule resource from a container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param cacheRuleName The name of the cache rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String registryName, String cacheRuleName, Context context);

    /**
     * Deletes a cache rule resource from a container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param cacheRuleName The name of the cache rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String registryName, String cacheRuleName);

    /**
     * Deletes a cache rule resource from a container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param cacheRuleName The name of the cache rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String registryName, String cacheRuleName, Context context);

    /**
     * Updates a cache rule for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param cacheRuleName The name of the cache rule.
     * @param cacheRuleUpdateParameters The parameters for updating a cache rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an object that represents a cache rule for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CacheRuleInner>, CacheRuleInner> beginUpdate(
        String resourceGroupName,
        String registryName,
        String cacheRuleName,
        CacheRuleUpdateParameters cacheRuleUpdateParameters);

    /**
     * Updates a cache rule for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param cacheRuleName The name of the cache rule.
     * @param cacheRuleUpdateParameters The parameters for updating a cache rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an object that represents a cache rule for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CacheRuleInner>, CacheRuleInner> beginUpdate(
        String resourceGroupName,
        String registryName,
        String cacheRuleName,
        CacheRuleUpdateParameters cacheRuleUpdateParameters,
        Context context);

    /**
     * Updates a cache rule for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param cacheRuleName The name of the cache rule.
     * @param cacheRuleUpdateParameters The parameters for updating a cache rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a cache rule for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CacheRuleInner update(
        String resourceGroupName,
        String registryName,
        String cacheRuleName,
        CacheRuleUpdateParameters cacheRuleUpdateParameters);

    /**
     * Updates a cache rule for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param cacheRuleName The name of the cache rule.
     * @param cacheRuleUpdateParameters The parameters for updating a cache rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a cache rule for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CacheRuleInner update(
        String resourceGroupName,
        String registryName,
        String cacheRuleName,
        CacheRuleUpdateParameters cacheRuleUpdateParameters,
        Context context);
}
