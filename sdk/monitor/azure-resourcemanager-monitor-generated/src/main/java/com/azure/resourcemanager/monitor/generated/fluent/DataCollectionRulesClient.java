// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.DataCollectionRuleResourceInner;
import com.azure.resourcemanager.monitor.generated.models.ResourceForUpdate;

/** An instance of this class provides access to all the operations defined in DataCollectionRulesClient. */
public interface DataCollectionRulesClient {
    /**
     * Lists all data collection rules in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pageable list of resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataCollectionRuleResourceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all data collection rules in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pageable list of resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataCollectionRuleResourceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all data collection rules in the specified subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pageable list of resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataCollectionRuleResourceInner> list();

    /**
     * Lists all data collection rules in the specified subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pageable list of resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataCollectionRuleResourceInner> list(Context context);

    /**
     * Returns the specified data collection rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionRuleName The name of the data collection rule. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of ARM tracked top level resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataCollectionRuleResourceInner getByResourceGroup(String resourceGroupName, String dataCollectionRuleName);

    /**
     * Returns the specified data collection rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionRuleName The name of the data collection rule. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of ARM tracked top level resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataCollectionRuleResourceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String dataCollectionRuleName, Context context);

    /**
     * Creates or updates a data collection rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionRuleName The name of the data collection rule. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of ARM tracked top level resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataCollectionRuleResourceInner create(String resourceGroupName, String dataCollectionRuleName);

    /**
     * Creates or updates a data collection rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionRuleName The name of the data collection rule. The name is case insensitive.
     * @param body The payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of ARM tracked top level resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataCollectionRuleResourceInner> createWithResponse(
        String resourceGroupName, String dataCollectionRuleName, DataCollectionRuleResourceInner body, Context context);

    /**
     * Updates part of a data collection rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionRuleName The name of the data collection rule. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of ARM tracked top level resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataCollectionRuleResourceInner update(String resourceGroupName, String dataCollectionRuleName);

    /**
     * Updates part of a data collection rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionRuleName The name of the data collection rule. The name is case insensitive.
     * @param body The payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of ARM tracked top level resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataCollectionRuleResourceInner> updateWithResponse(
        String resourceGroupName, String dataCollectionRuleName, ResourceForUpdate body, Context context);

    /**
     * Deletes a data collection rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionRuleName The name of the data collection rule. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String dataCollectionRuleName);

    /**
     * Deletes a data collection rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionRuleName The name of the data collection rule. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String dataCollectionRuleName, Context context);
}
