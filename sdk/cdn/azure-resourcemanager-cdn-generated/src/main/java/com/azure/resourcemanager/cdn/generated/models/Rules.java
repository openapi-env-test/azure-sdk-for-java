// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Rules. */
public interface Rules {
    /**
     * Lists all of the existing delivery rules within a rule set.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param ruleSetName Name of the rule set under the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list rules as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Rule> listByRuleSet(String resourceGroupName, String profileName, String ruleSetName);

    /**
     * Lists all of the existing delivery rules within a rule set.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param ruleSetName Name of the rule set under the profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list rules as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Rule> listByRuleSet(
        String resourceGroupName, String profileName, String ruleSetName, Context context);

    /**
     * Gets an existing delivery rule within a rule set.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param ruleSetName Name of the rule set under the profile.
     * @param ruleName Name of the delivery rule which is unique within the endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing delivery rule within a rule set.
     */
    Rule get(String resourceGroupName, String profileName, String ruleSetName, String ruleName);

    /**
     * Gets an existing delivery rule within a rule set.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param ruleSetName Name of the rule set under the profile.
     * @param ruleName Name of the delivery rule which is unique within the endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing delivery rule within a rule set along with {@link Response}.
     */
    Response<Rule> getWithResponse(
        String resourceGroupName, String profileName, String ruleSetName, String ruleName, Context context);

    /**
     * Deletes an existing delivery rule within a rule set.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param ruleSetName Name of the rule set under the profile.
     * @param ruleName Name of the delivery rule which is unique within the endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String profileName, String ruleSetName, String ruleName);

    /**
     * Deletes an existing delivery rule within a rule set.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param ruleSetName Name of the rule set under the profile.
     * @param ruleName Name of the delivery rule which is unique within the endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String profileName, String ruleSetName, String ruleName, Context context);

    /**
     * Gets an existing delivery rule within a rule set.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing delivery rule within a rule set along with {@link Response}.
     */
    Rule getById(String id);

    /**
     * Gets an existing delivery rule within a rule set.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing delivery rule within a rule set along with {@link Response}.
     */
    Response<Rule> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an existing delivery rule within a rule set.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an existing delivery rule within a rule set.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Rule resource.
     *
     * @param name resource name.
     * @return the first stage of the new Rule definition.
     */
    Rule.DefinitionStages.Blank define(String name);
}
