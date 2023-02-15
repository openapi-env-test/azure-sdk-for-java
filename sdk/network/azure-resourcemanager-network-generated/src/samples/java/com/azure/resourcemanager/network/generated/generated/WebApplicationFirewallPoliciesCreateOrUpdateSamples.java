// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.models.ActionType;
import com.azure.resourcemanager.network.generated.models.ExclusionManagedRule;
import com.azure.resourcemanager.network.generated.models.ExclusionManagedRuleGroup;
import com.azure.resourcemanager.network.generated.models.ExclusionManagedRuleSet;
import com.azure.resourcemanager.network.generated.models.ManagedRuleEnabledState;
import com.azure.resourcemanager.network.generated.models.ManagedRuleGroupOverride;
import com.azure.resourcemanager.network.generated.models.ManagedRuleOverride;
import com.azure.resourcemanager.network.generated.models.ManagedRuleSet;
import com.azure.resourcemanager.network.generated.models.ManagedRulesDefinition;
import com.azure.resourcemanager.network.generated.models.MatchCondition;
import com.azure.resourcemanager.network.generated.models.MatchVariable;
import com.azure.resourcemanager.network.generated.models.OwaspCrsExclusionEntry;
import com.azure.resourcemanager.network.generated.models.OwaspCrsExclusionEntryMatchVariable;
import com.azure.resourcemanager.network.generated.models.OwaspCrsExclusionEntrySelectorMatchOperator;
import com.azure.resourcemanager.network.generated.models.WebApplicationFirewallAction;
import com.azure.resourcemanager.network.generated.models.WebApplicationFirewallCustomRule;
import com.azure.resourcemanager.network.generated.models.WebApplicationFirewallMatchVariable;
import com.azure.resourcemanager.network.generated.models.WebApplicationFirewallOperator;
import com.azure.resourcemanager.network.generated.models.WebApplicationFirewallRuleType;
import java.util.Arrays;

/** Samples for WebApplicationFirewallPolicies CreateOrUpdate. */
public final class WebApplicationFirewallPoliciesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/WafPolicyCreateOrUpdate.json
     */
    /**
     * Sample code: Creates or updates a WAF policy within a resource group.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createsOrUpdatesAWAFPolicyWithinAResourceGroup(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .webApplicationFirewallPolicies()
            .define("Policy1")
            .withRegion("WestUs")
            .withExistingResourceGroup("rg1")
            .withCustomRules(
                Arrays
                    .asList(
                        new WebApplicationFirewallCustomRule()
                            .withName("Rule1")
                            .withPriority(1)
                            .withRuleType(WebApplicationFirewallRuleType.MATCH_RULE)
                            .withMatchConditions(
                                Arrays
                                    .asList(
                                        new MatchCondition()
                                            .withMatchVariables(
                                                Arrays
                                                    .asList(
                                                        new MatchVariable()
                                                            .withVariableName(
                                                                WebApplicationFirewallMatchVariable.REMOTE_ADDR)))
                                            .withOperator(WebApplicationFirewallOperator.IPMATCH)
                                            .withMatchValues(Arrays.asList("192.168.1.0/24", "10.0.0.0/24"))))
                            .withAction(WebApplicationFirewallAction.BLOCK),
                        new WebApplicationFirewallCustomRule()
                            .withName("Rule2")
                            .withPriority(2)
                            .withRuleType(WebApplicationFirewallRuleType.MATCH_RULE)
                            .withMatchConditions(
                                Arrays
                                    .asList(
                                        new MatchCondition()
                                            .withMatchVariables(
                                                Arrays
                                                    .asList(
                                                        new MatchVariable()
                                                            .withVariableName(
                                                                WebApplicationFirewallMatchVariable.REMOTE_ADDR)))
                                            .withOperator(WebApplicationFirewallOperator.IPMATCH)
                                            .withMatchValues(Arrays.asList("192.168.1.0/24")),
                                        new MatchCondition()
                                            .withMatchVariables(
                                                Arrays
                                                    .asList(
                                                        new MatchVariable()
                                                            .withVariableName(
                                                                WebApplicationFirewallMatchVariable.REQUEST_HEADERS)
                                                            .withSelector("UserAgent")))
                                            .withOperator(WebApplicationFirewallOperator.CONTAINS)
                                            .withMatchValues(Arrays.asList("Windows"))))
                            .withAction(WebApplicationFirewallAction.BLOCK)))
            .withManagedRules(
                new ManagedRulesDefinition()
                    .withExclusions(
                        Arrays
                            .asList(
                                new OwaspCrsExclusionEntry()
                                    .withMatchVariable(OwaspCrsExclusionEntryMatchVariable.REQUEST_ARG_NAMES)
                                    .withSelectorMatchOperator(OwaspCrsExclusionEntrySelectorMatchOperator.STARTS_WITH)
                                    .withSelector("hello")
                                    .withExclusionManagedRuleSets(
                                        Arrays
                                            .asList(
                                                new ExclusionManagedRuleSet()
                                                    .withRuleSetType("OWASP")
                                                    .withRuleSetVersion("3.2")
                                                    .withRuleGroups(
                                                        Arrays
                                                            .asList(
                                                                new ExclusionManagedRuleGroup()
                                                                    .withRuleGroupName(
                                                                        "REQUEST-930-APPLICATION-ATTACK-LFI")
                                                                    .withRules(
                                                                        Arrays
                                                                            .asList(
                                                                                new ExclusionManagedRule()
                                                                                    .withRuleId("930120"))),
                                                                new ExclusionManagedRuleGroup()
                                                                    .withRuleGroupName(
                                                                        "REQUEST-932-APPLICATION-ATTACK-RCE"))))),
                                new OwaspCrsExclusionEntry()
                                    .withMatchVariable(OwaspCrsExclusionEntryMatchVariable.REQUEST_ARG_NAMES)
                                    .withSelectorMatchOperator(OwaspCrsExclusionEntrySelectorMatchOperator.ENDS_WITH)
                                    .withSelector("hello")
                                    .withExclusionManagedRuleSets(
                                        Arrays
                                            .asList(
                                                new ExclusionManagedRuleSet()
                                                    .withRuleSetType("OWASP")
                                                    .withRuleSetVersion("3.1")
                                                    .withRuleGroups(Arrays.asList()))),
                                new OwaspCrsExclusionEntry()
                                    .withMatchVariable(OwaspCrsExclusionEntryMatchVariable.REQUEST_ARG_NAMES)
                                    .withSelectorMatchOperator(OwaspCrsExclusionEntrySelectorMatchOperator.STARTS_WITH)
                                    .withSelector("test"),
                                new OwaspCrsExclusionEntry()
                                    .withMatchVariable(OwaspCrsExclusionEntryMatchVariable.REQUEST_ARG_VALUES)
                                    .withSelectorMatchOperator(OwaspCrsExclusionEntrySelectorMatchOperator.STARTS_WITH)
                                    .withSelector("test")))
                    .withManagedRuleSets(
                        Arrays
                            .asList(
                                new ManagedRuleSet()
                                    .withRuleSetType("OWASP")
                                    .withRuleSetVersion("3.2")
                                    .withRuleGroupOverrides(
                                        Arrays
                                            .asList(
                                                new ManagedRuleGroupOverride()
                                                    .withRuleGroupName("REQUEST-931-APPLICATION-ATTACK-RFI")
                                                    .withRules(
                                                        Arrays
                                                            .asList(
                                                                new ManagedRuleOverride()
                                                                    .withRuleId("931120")
                                                                    .withState(ManagedRuleEnabledState.ENABLED)
                                                                    .withAction(ActionType.LOG),
                                                                new ManagedRuleOverride()
                                                                    .withRuleId("931130")
                                                                    .withState(ManagedRuleEnabledState.DISABLED)
                                                                    .withAction(ActionType.ANOMALY_SCORING))))))))
            .create();
    }
}
