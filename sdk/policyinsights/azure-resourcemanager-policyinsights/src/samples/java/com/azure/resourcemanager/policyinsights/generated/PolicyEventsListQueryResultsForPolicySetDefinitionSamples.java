// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.policyinsights.models.PolicyEventsResourceType;

/** Samples for PolicyEvents ListQueryResultsForPolicySetDefinition. */
public final class PolicyEventsListQueryResultsForPolicySetDefinitionSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2019-10-01/examples/PolicyEvents_QuerySubscriptionLevelPolicySetDefinitionScope.json
     */
    /**
     * Sample code: Query at subscription level policy set definition scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAtSubscriptionLevelPolicySetDefinitionScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForPolicySetDefinition(
                PolicyEventsResourceType.DEFAULT,
                "3e3807c1-65c9-49e0-a406-82d8ae3e338c",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2019-10-01/examples/PolicyEvents_QuerySubscriptionLevelPolicySetDefinitionScopeNextLink.json
     */
    /**
     * Sample code: Query at subscription level policy set definition scope with next link.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAtSubscriptionLevelPolicySetDefinitionScopeWithNextLink(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForPolicySetDefinition(
                PolicyEventsResourceType.DEFAULT,
                "3e3807c1-65c9-49e0-a406-82d8ae3e338c",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                "WpmWfBSvPhkAK6QD",
                Context.NONE);
    }
}
