// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayWafDynamicManifestResultInner;
import java.util.List;

/** An immutable client-side representation of ApplicationGatewayWafDynamicManifestResult. */
public interface ApplicationGatewayWafDynamicManifestResult {
    /**
     * Gets the id property: Resource ID.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Resource name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: Resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the availableRuleSets property: The available rulesets.
     *
     * @return the availableRuleSets value.
     */
    List<ApplicationGatewayFirewallManifestRuleSet> availableRuleSets();

    /**
     * Gets the ruleSetType property: The type of the web application firewall rule set.
     *
     * @return the ruleSetType value.
     */
    String ruleSetType();

    /**
     * Gets the ruleSetVersion property: The version of the web application firewall rule set type.
     *
     * @return the ruleSetVersion value.
     */
    String ruleSetVersion();

    /**
     * Gets the inner
     * com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayWafDynamicManifestResultInner object.
     *
     * @return the inner object.
     */
    ApplicationGatewayWafDynamicManifestResultInner innerModel();
}
