// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.contoso_cdn.models;

import com.azure.resourcemanager.contoso_cdn.fluent.models.ManagedRuleSetDefinitionInner;
import java.util.List;

/** An immutable client-side representation of ManagedRuleSetDefinition. */
public interface ManagedRuleSetDefinition {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the sku property: The pricing tier (defines a CDN provider, feature list and rate) of the
     * CdnWebApplicationFirewallPolicy.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the provisioningState property: Provisioning state of the managed rule set.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the ruleSetType property: Type of the managed rule set.
     *
     * @return the ruleSetType value.
     */
    String ruleSetType();

    /**
     * Gets the ruleSetVersion property: Version of the managed rule set type.
     *
     * @return the ruleSetVersion value.
     */
    String ruleSetVersion();

    /**
     * Gets the ruleGroups property: Rule groups of the managed rule set.
     *
     * @return the ruleGroups value.
     */
    List<ManagedRuleGroupDefinition> ruleGroups();

    /**
     * Gets the inner com.azure.resourcemanager.contoso_cdn.fluent.models.ManagedRuleSetDefinitionInner object.
     *
     * @return the inner object.
     */
    ManagedRuleSetDefinitionInner innerModel();
}
