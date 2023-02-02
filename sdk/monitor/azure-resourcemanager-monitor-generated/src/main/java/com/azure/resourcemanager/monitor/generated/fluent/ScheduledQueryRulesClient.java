// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.ScheduledQueryRuleResourceInner;
import com.azure.resourcemanager.monitor.generated.models.ScheduledQueryRuleResourcePatch;

/** An instance of this class provides access to all the operations defined in ScheduledQueryRulesClient. */
public interface ScheduledQueryRulesClient {
    /**
     * Retrieve a scheduled query rule definitions in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of scheduled query rule resources as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScheduledQueryRuleResourceInner> list();

    /**
     * Retrieve a scheduled query rule definitions in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of scheduled query rule resources as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScheduledQueryRuleResourceInner> list(Context context);

    /**
     * Retrieve scheduled query rule definitions in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of scheduled query rule resources as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScheduledQueryRuleResourceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Retrieve scheduled query rule definitions in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of scheduled query rule resources as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScheduledQueryRuleResourceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Retrieve an scheduled query rule definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the scheduled query rule resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ScheduledQueryRuleResourceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String ruleName, Context context);

    /**
     * Retrieve an scheduled query rule definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the scheduled query rule resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScheduledQueryRuleResourceInner getByResourceGroup(String resourceGroupName, String ruleName);

    /**
     * Creates or updates a scheduled query rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param parameters The parameters of the rule to create or update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the scheduled query rule resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ScheduledQueryRuleResourceInner> createOrUpdateWithResponse(
        String resourceGroupName, String ruleName, ScheduledQueryRuleResourceInner parameters, Context context);

    /**
     * Creates or updates a scheduled query rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param parameters The parameters of the rule to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the scheduled query rule resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScheduledQueryRuleResourceInner createOrUpdate(
        String resourceGroupName, String ruleName, ScheduledQueryRuleResourceInner parameters);

    /**
     * Update a scheduled query rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param parameters The parameters of the rule to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the scheduled query rule resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ScheduledQueryRuleResourceInner> updateWithResponse(
        String resourceGroupName, String ruleName, ScheduledQueryRuleResourcePatch parameters, Context context);

    /**
     * Update a scheduled query rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param parameters The parameters of the rule to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the scheduled query rule resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScheduledQueryRuleResourceInner update(
        String resourceGroupName, String ruleName, ScheduledQueryRuleResourcePatch parameters);

    /**
     * Deletes a scheduled query rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String ruleName, Context context);

    /**
     * Deletes a scheduled query rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String ruleName);
}
