// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for GovernanceRuleType. */
public final class GovernanceRuleType extends ExpandableStringEnum<GovernanceRuleType> {
    /** Static value Integrated for GovernanceRuleType. */
    public static final GovernanceRuleType INTEGRATED = fromString("Integrated");

    /** Static value ServiceNow for GovernanceRuleType. */
    public static final GovernanceRuleType SERVICE_NOW = fromString("ServiceNow");

    /**
     * Creates or finds a GovernanceRuleType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GovernanceRuleType.
     */
    @JsonCreator
    public static GovernanceRuleType fromString(String name) {
        return fromString(name, GovernanceRuleType.class);
    }

    /**
     * Gets known GovernanceRuleType values.
     *
     * @return known GovernanceRuleType values.
     */
    public static Collection<GovernanceRuleType> values() {
        return values(GovernanceRuleType.class);
    }
}
