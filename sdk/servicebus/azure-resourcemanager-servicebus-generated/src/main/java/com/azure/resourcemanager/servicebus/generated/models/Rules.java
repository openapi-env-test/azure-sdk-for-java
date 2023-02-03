// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Rules. */
public interface Rules {
    /**
     * List all the rules within given topic-subscription.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param subscriptionName The subscription name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List rule operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Rule> listBySubscriptions(
        String resourceGroupName, String namespaceName, String topicName, String subscriptionName);

    /**
     * List all the rules within given topic-subscription.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param subscriptionName The subscription name.
     * @param skip Skip is only used if a previous operation returned a partial result. If a previous response contains
     *     a nextLink element, the value of the nextLink element will include a skip parameter that specifies a starting
     *     point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N usageDetails.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List rule operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Rule> listBySubscriptions(
        String resourceGroupName,
        String namespaceName,
        String topicName,
        String subscriptionName,
        Integer skip,
        Integer top,
        Context context);

    /**
     * Deletes an existing rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param subscriptionName The subscription name.
     * @param ruleName The rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String namespaceName,
        String topicName,
        String subscriptionName,
        String ruleName,
        Context context);

    /**
     * Deletes an existing rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param subscriptionName The subscription name.
     * @param ruleName The rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName, String namespaceName, String topicName, String subscriptionName, String ruleName);

    /**
     * Retrieves the description for the specified rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param subscriptionName The subscription name.
     * @param ruleName The rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of Rule Resource along with {@link Response}.
     */
    Response<Rule> getWithResponse(
        String resourceGroupName,
        String namespaceName,
        String topicName,
        String subscriptionName,
        String ruleName,
        Context context);

    /**
     * Retrieves the description for the specified rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param subscriptionName The subscription name.
     * @param ruleName The rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of Rule Resource.
     */
    Rule get(
        String resourceGroupName, String namespaceName, String topicName, String subscriptionName, String ruleName);

    /**
     * Retrieves the description for the specified rule.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of Rule Resource along with {@link Response}.
     */
    Rule getById(String id);

    /**
     * Retrieves the description for the specified rule.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of Rule Resource along with {@link Response}.
     */
    Response<Rule> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an existing rule.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an existing rule.
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
     * Begins definition for a new Rule resource.
     *
     * @param name resource name.
     * @return the first stage of the new Rule definition.
     */
    Rule.DefinitionStages.Blank define(String name);
}
