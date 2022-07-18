// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.servicebus.generated.fluent.models.SBAuthorizationRuleInner;

/** Resource collection API of Queues. */
public interface Queues {
    /**
     * Gets all authorization rules for a queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all authorization rules for a queue as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SBAuthorizationRule> listAuthorizationRules(
        String resourceGroupName, String namespaceName, String queueName);

    /**
     * Gets all authorization rules for a queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all authorization rules for a queue as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SBAuthorizationRule> listAuthorizationRules(
        String resourceGroupName, String namespaceName, String queueName, Context context);

    /**
     * Creates an authorization rule for a queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters The shared access authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace authorization rule.
     */
    SBAuthorizationRule createOrUpdateAuthorizationRule(
        String resourceGroupName,
        String namespaceName,
        String queueName,
        String authorizationRuleName,
        SBAuthorizationRuleInner parameters);

    /**
     * Creates an authorization rule for a queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters The shared access authorization rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace authorization rule along with {@link Response}.
     */
    Response<SBAuthorizationRule> createOrUpdateAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String queueName,
        String authorizationRuleName,
        SBAuthorizationRuleInner parameters,
        Context context);

    /**
     * Deletes a queue authorization rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteAuthorizationRule(
        String resourceGroupName, String namespaceName, String queueName, String authorizationRuleName);

    /**
     * Deletes a queue authorization rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String queueName,
        String authorizationRuleName,
        Context context);

    /**
     * Gets an authorization rule for a queue by rule name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an authorization rule for a queue by rule name.
     */
    SBAuthorizationRule getAuthorizationRule(
        String resourceGroupName, String namespaceName, String queueName, String authorizationRuleName);

    /**
     * Gets an authorization rule for a queue by rule name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an authorization rule for a queue by rule name along with {@link Response}.
     */
    Response<SBAuthorizationRule> getAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String queueName,
        String authorizationRuleName,
        Context context);

    /**
     * Primary and secondary connection strings to the queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/ServiceBus Connection String.
     */
    AccessKeys listKeys(String resourceGroupName, String namespaceName, String queueName, String authorizationRuleName);

    /**
     * Primary and secondary connection strings to the queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/ServiceBus Connection String along with {@link Response}.
     */
    Response<AccessKeys> listKeysWithResponse(
        String resourceGroupName,
        String namespaceName,
        String queueName,
        String authorizationRuleName,
        Context context);

    /**
     * Regenerates the primary or secondary connection strings to the queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters supplied to regenerate the authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/ServiceBus Connection String.
     */
    AccessKeys regenerateKeys(
        String resourceGroupName,
        String namespaceName,
        String queueName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters);

    /**
     * Regenerates the primary or secondary connection strings to the queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters supplied to regenerate the authorization rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/ServiceBus Connection String along with {@link Response}.
     */
    Response<AccessKeys> regenerateKeysWithResponse(
        String resourceGroupName,
        String namespaceName,
        String queueName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters,
        Context context);

    /**
     * Gets the queues within a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the queues within a namespace as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SBQueue> listByNamespace(String resourceGroupName, String namespaceName);

    /**
     * Gets the queues within a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param skip Skip is only used if a previous operation returned a partial result. If a previous response contains
     *     a nextLink element, the value of the nextLink element will include a skip parameter that specifies a starting
     *     point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N usageDetails.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the queues within a namespace as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SBQueue> listByNamespace(
        String resourceGroupName, String namespaceName, Integer skip, Integer top, Context context);

    /**
     * Deletes a queue from the specified namespace in a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String namespaceName, String queueName);

    /**
     * Deletes a queue from the specified namespace in a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String namespaceName, String queueName, Context context);

    /**
     * Returns a description for the specified queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of queue Resource.
     */
    SBQueue get(String resourceGroupName, String namespaceName, String queueName);

    /**
     * Returns a description for the specified queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of queue Resource along with {@link Response}.
     */
    Response<SBQueue> getWithResponse(
        String resourceGroupName, String namespaceName, String queueName, Context context);

    /**
     * Returns a description for the specified queue.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of queue Resource along with {@link Response}.
     */
    SBQueue getById(String id);

    /**
     * Returns a description for the specified queue.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of queue Resource along with {@link Response}.
     */
    Response<SBQueue> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a queue from the specified namespace in a resource group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a queue from the specified namespace in a resource group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new SBQueue resource.
     *
     * @param name resource name.
     * @return the first stage of the new SBQueue definition.
     */
    SBQueue.DefinitionStages.Blank define(String name);
}
