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
import com.azure.resourcemanager.network.generated.fluent.models.WebApplicationFirewallPolicyInner;

/** An instance of this class provides access to all the operations defined in WebApplicationFirewallPoliciesClient. */
public interface WebApplicationFirewallPoliciesClient {
    /**
     * Lists all of the protection policies within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list WebApplicationFirewallPolicies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebApplicationFirewallPolicyInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all of the protection policies within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list WebApplicationFirewallPolicies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebApplicationFirewallPolicyInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all the WAF policies in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the WAF policies in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebApplicationFirewallPolicyInner> list();

    /**
     * Gets all the WAF policies in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the WAF policies in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebApplicationFirewallPolicyInner> list(Context context);

    /**
     * Retrieve protection policy with specified name within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param policyName The name of the policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WebApplicationFirewallPolicyInner getByResourceGroup(String resourceGroupName, String policyName);

    /**
     * Retrieve protection policy with specified name within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param policyName The name of the policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WebApplicationFirewallPolicyInner> getByResourceGroupWithResponse(
        String resourceGroupName, String policyName, Context context);

    /**
     * Creates or update policy with specified rule set name within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param policyName The name of the policy.
     * @param parameters Policy to be created.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WebApplicationFirewallPolicyInner createOrUpdate(
        String resourceGroupName, String policyName, WebApplicationFirewallPolicyInner parameters);

    /**
     * Creates or update policy with specified rule set name within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param policyName The name of the policy.
     * @param parameters Policy to be created.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WebApplicationFirewallPolicyInner> createOrUpdateWithResponse(
        String resourceGroupName, String policyName, WebApplicationFirewallPolicyInner parameters, Context context);

    /**
     * Deletes Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param policyName The name of the policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String policyName);

    /**
     * Deletes Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param policyName The name of the policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String policyName, Context context);

    /**
     * Deletes Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param policyName The name of the policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String policyName);

    /**
     * Deletes Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param policyName The name of the policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String policyName, Context context);
}
