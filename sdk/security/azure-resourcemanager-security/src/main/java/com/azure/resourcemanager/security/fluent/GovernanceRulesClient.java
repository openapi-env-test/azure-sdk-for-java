// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.security.fluent.models.GovernanceRuleInner;
import com.azure.resourcemanager.security.fluent.models.OperationResultAutoGeneratedInner;
import com.azure.resourcemanager.security.models.ExecuteGovernanceRuleParams;
import com.azure.resourcemanager.security.models.GovernanceRulesOperationResultsResponse;

/** An instance of this class provides access to all the operations defined in GovernanceRulesClient. */
public interface GovernanceRulesClient {
    /**
     * Get a list of all relevant governance rules over a scope.
     *
     * @param scope The scope of the Governance rules. Valid scopes are: management group (format:
     *     'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     *     'subscriptions/{subscriptionId}'), or security connector (format:
     *     'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all relevant governance rules over a scope as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GovernanceRuleInner> list(String scope);

    /**
     * Get a list of all relevant governance rules over a scope.
     *
     * @param scope The scope of the Governance rules. Valid scopes are: management group (format:
     *     'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     *     'subscriptions/{subscriptionId}'), or security connector (format:
     *     'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all relevant governance rules over a scope as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GovernanceRuleInner> list(String scope, Context context);

    /**
     * Get a specific governance rule for the requested scope by ruleId.
     *
     * @param scope The scope of the Governance rules. Valid scopes are: management group (format:
     *     'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     *     'subscriptions/{subscriptionId}'), or security connector (format:
     *     'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param ruleId The governance rule key - unique key for the standard governance rule (GUID).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific governance rule for the requested scope by ruleId along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GovernanceRuleInner> getWithResponse(String scope, String ruleId, Context context);

    /**
     * Get a specific governance rule for the requested scope by ruleId.
     *
     * @param scope The scope of the Governance rules. Valid scopes are: management group (format:
     *     'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     *     'subscriptions/{subscriptionId}'), or security connector (format:
     *     'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param ruleId The governance rule key - unique key for the standard governance rule (GUID).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific governance rule for the requested scope by ruleId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GovernanceRuleInner get(String scope, String ruleId);

    /**
     * Creates or updates a governance rule over a given scope.
     *
     * @param scope The scope of the Governance rules. Valid scopes are: management group (format:
     *     'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     *     'subscriptions/{subscriptionId}'), or security connector (format:
     *     'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param ruleId The governance rule key - unique key for the standard governance rule (GUID).
     * @param governanceRule Governance rule over a given scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return governance rule over a given scope along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GovernanceRuleInner> createOrUpdateWithResponse(
        String scope, String ruleId, GovernanceRuleInner governanceRule, Context context);

    /**
     * Creates or updates a governance rule over a given scope.
     *
     * @param scope The scope of the Governance rules. Valid scopes are: management group (format:
     *     'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     *     'subscriptions/{subscriptionId}'), or security connector (format:
     *     'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param ruleId The governance rule key - unique key for the standard governance rule (GUID).
     * @param governanceRule Governance rule over a given scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return governance rule over a given scope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GovernanceRuleInner createOrUpdate(String scope, String ruleId, GovernanceRuleInner governanceRule);

    /**
     * Delete a Governance rule over a given scope.
     *
     * @param scope The scope of the Governance rules. Valid scopes are: management group (format:
     *     'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     *     'subscriptions/{subscriptionId}'), or security connector (format:
     *     'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param ruleId The governance rule key - unique key for the standard governance rule (GUID).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String scope, String ruleId);

    /**
     * Delete a Governance rule over a given scope.
     *
     * @param scope The scope of the Governance rules. Valid scopes are: management group (format:
     *     'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     *     'subscriptions/{subscriptionId}'), or security connector (format:
     *     'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param ruleId The governance rule key - unique key for the standard governance rule (GUID).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String scope, String ruleId, Context context);

    /**
     * Delete a Governance rule over a given scope.
     *
     * @param scope The scope of the Governance rules. Valid scopes are: management group (format:
     *     'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     *     'subscriptions/{subscriptionId}'), or security connector (format:
     *     'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param ruleId The governance rule key - unique key for the standard governance rule (GUID).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String scope, String ruleId);

    /**
     * Delete a Governance rule over a given scope.
     *
     * @param scope The scope of the Governance rules. Valid scopes are: management group (format:
     *     'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     *     'subscriptions/{subscriptionId}'), or security connector (format:
     *     'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param ruleId The governance rule key - unique key for the standard governance rule (GUID).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String scope, String ruleId, Context context);

    /**
     * Execute a governance rule.
     *
     * @param scope The scope of the Governance rules. Valid scopes are: management group (format:
     *     'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     *     'subscriptions/{subscriptionId}'), or security connector (format:
     *     'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param ruleId The governance rule key - unique key for the standard governance rule (GUID).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginExecute(String scope, String ruleId);

    /**
     * Execute a governance rule.
     *
     * @param scope The scope of the Governance rules. Valid scopes are: management group (format:
     *     'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     *     'subscriptions/{subscriptionId}'), or security connector (format:
     *     'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param ruleId The governance rule key - unique key for the standard governance rule (GUID).
     * @param executeGovernanceRuleParams Execute governance rule over a given scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginExecute(
        String scope, String ruleId, ExecuteGovernanceRuleParams executeGovernanceRuleParams, Context context);

    /**
     * Execute a governance rule.
     *
     * @param scope The scope of the Governance rules. Valid scopes are: management group (format:
     *     'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     *     'subscriptions/{subscriptionId}'), or security connector (format:
     *     'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param ruleId The governance rule key - unique key for the standard governance rule (GUID).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void execute(String scope, String ruleId);

    /**
     * Execute a governance rule.
     *
     * @param scope The scope of the Governance rules. Valid scopes are: management group (format:
     *     'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     *     'subscriptions/{subscriptionId}'), or security connector (format:
     *     'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param ruleId The governance rule key - unique key for the standard governance rule (GUID).
     * @param executeGovernanceRuleParams Execute governance rule over a given scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void execute(String scope, String ruleId, ExecuteGovernanceRuleParams executeGovernanceRuleParams, Context context);

    /**
     * Get governance rules long run operation result for the requested scope by ruleId and operationId.
     *
     * @param scope The scope of the Governance rules. Valid scopes are: management group (format:
     *     'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     *     'subscriptions/{subscriptionId}'), or security connector (format:
     *     'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param ruleId The governance rule key - unique key for the standard governance rule (GUID).
     * @param operationId The governance rule long running operation unique key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return governance rules long run operation result for the requested scope by ruleId and operationId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GovernanceRulesOperationResultsResponse operationResultsWithResponse(
        String scope, String ruleId, String operationId, Context context);

    /**
     * Get governance rules long run operation result for the requested scope by ruleId and operationId.
     *
     * @param scope The scope of the Governance rules. Valid scopes are: management group (format:
     *     'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     *     'subscriptions/{subscriptionId}'), or security connector (format:
     *     'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param ruleId The governance rule key - unique key for the standard governance rule (GUID).
     * @param operationId The governance rule long running operation unique key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return governance rules long run operation result for the requested scope by ruleId and operationId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationResultAutoGeneratedInner operationResults(String scope, String ruleId, String operationId);
}
