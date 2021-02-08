// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.SecurityRuleInner;

/** An instance of this class provides access to all the operations defined in DefaultSecurityRulesClient. */
public interface DefaultSecurityRulesClient {
    /**
     * Gets all default security rules in a network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all default security rules in a network security group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecurityRuleInner> list(String resourceGroupName, String networkSecurityGroupName);

    /**
     * Gets all default security rules in a network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all default security rules in a network security group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecurityRuleInner> list(String resourceGroupName, String networkSecurityGroupName, Context context);

    /**
     * Get the specified default network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param defaultSecurityRuleName The name of the default security rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified default network security rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecurityRuleInner get(String resourceGroupName, String networkSecurityGroupName, String defaultSecurityRuleName);

    /**
     * Get the specified default network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param defaultSecurityRuleName The name of the default security rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified default network security rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SecurityRuleInner> getWithResponse(
        String resourceGroupName, String networkSecurityGroupName, String defaultSecurityRuleName, Context context);
}
