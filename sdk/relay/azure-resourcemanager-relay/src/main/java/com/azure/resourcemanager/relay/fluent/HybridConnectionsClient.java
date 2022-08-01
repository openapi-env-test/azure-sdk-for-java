// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.relay.fluent.models.AccessKeysInner;
import com.azure.resourcemanager.relay.fluent.models.AuthorizationRuleInner;
import com.azure.resourcemanager.relay.fluent.models.HybridConnectionInner;
import com.azure.resourcemanager.relay.models.RegenerateAccessKeyParameters;

/** An instance of this class provides access to all the operations defined in HybridConnectionsClient. */
public interface HybridConnectionsClient {
    /**
     * Authorization rules for a hybrid connection.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the list namespace operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AuthorizationRuleInner> listAuthorizationRules(
        String resourceGroupName, String namespaceName, String hybridConnectionName);

    /**
     * Authorization rules for a hybrid connection.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the list namespace operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AuthorizationRuleInner> listAuthorizationRules(
        String resourceGroupName, String namespaceName, String hybridConnectionName, Context context);

    /**
     * Creates or updates an authorization rule for a hybrid connection.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters The authorization rule parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in a List or Get AuthorizationRule operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AuthorizationRuleInner createOrUpdateAuthorizationRule(
        String resourceGroupName,
        String namespaceName,
        String hybridConnectionName,
        String authorizationRuleName,
        AuthorizationRuleInner parameters);

    /**
     * Creates or updates an authorization rule for a hybrid connection.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters The authorization rule parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in a List or Get AuthorizationRule operation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AuthorizationRuleInner> createOrUpdateAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String hybridConnectionName,
        String authorizationRuleName,
        AuthorizationRuleInner parameters,
        Context context);

    /**
     * Deletes a hybrid connection authorization rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteAuthorizationRule(
        String resourceGroupName, String namespaceName, String hybridConnectionName, String authorizationRuleName);

    /**
     * Deletes a hybrid connection authorization rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String hybridConnectionName,
        String authorizationRuleName,
        Context context);

    /**
     * Hybrid connection authorization rule for a hybrid connection by name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in a List or Get AuthorizationRule operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AuthorizationRuleInner getAuthorizationRule(
        String resourceGroupName, String namespaceName, String hybridConnectionName, String authorizationRuleName);

    /**
     * Hybrid connection authorization rule for a hybrid connection by name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in a List or Get AuthorizationRule operation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AuthorizationRuleInner> getAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String hybridConnectionName,
        String authorizationRuleName,
        Context context);

    /**
     * Primary and secondary connection strings to the hybrid connection.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/Relay Connection String.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessKeysInner listKeys(
        String resourceGroupName, String namespaceName, String hybridConnectionName, String authorizationRuleName);

    /**
     * Primary and secondary connection strings to the hybrid connection.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/Relay Connection String along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccessKeysInner> listKeysWithResponse(
        String resourceGroupName,
        String namespaceName,
        String hybridConnectionName,
        String authorizationRuleName,
        Context context);

    /**
     * Regenerates the primary or secondary connection strings to the hybrid connection.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters supplied to regenerate authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/Relay Connection String.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessKeysInner regenerateKeys(
        String resourceGroupName,
        String namespaceName,
        String hybridConnectionName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters);

    /**
     * Regenerates the primary or secondary connection strings to the hybrid connection.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters supplied to regenerate authorization rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/Relay Connection String along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccessKeysInner> regenerateKeysWithResponse(
        String resourceGroupName,
        String namespaceName,
        String hybridConnectionName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters,
        Context context);

    /**
     * Lists the hybrid connection within the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the list hybrid connection operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HybridConnectionInner> listByNamespace(String resourceGroupName, String namespaceName);

    /**
     * Lists the hybrid connection within the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the list hybrid connection operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HybridConnectionInner> listByNamespace(
        String resourceGroupName, String namespaceName, Context context);

    /**
     * Creates or updates a service hybrid connection. This operation is idempotent.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param parameters Parameters supplied to create a hybrid connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of hybrid connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HybridConnectionInner createOrUpdate(
        String resourceGroupName, String namespaceName, String hybridConnectionName, HybridConnectionInner parameters);

    /**
     * Creates or updates a service hybrid connection. This operation is idempotent.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param parameters Parameters supplied to create a hybrid connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of hybrid connection resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<HybridConnectionInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String namespaceName,
        String hybridConnectionName,
        HybridConnectionInner parameters,
        Context context);

    /**
     * Deletes a hybrid connection.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String namespaceName, String hybridConnectionName);

    /**
     * Deletes a hybrid connection.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String namespaceName, String hybridConnectionName, Context context);

    /**
     * Returns the description for the specified hybrid connection.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of hybrid connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HybridConnectionInner get(String resourceGroupName, String namespaceName, String hybridConnectionName);

    /**
     * Returns the description for the specified hybrid connection.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of hybrid connection resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<HybridConnectionInner> getWithResponse(
        String resourceGroupName, String namespaceName, String hybridConnectionName, Context context);
}
