// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DecisionTargetType. */
public final class DecisionTargetType extends ExpandableStringEnum<DecisionTargetType> {
    /** Static value user for DecisionTargetType. */
    public static final DecisionTargetType USER = fromString("user");

    /** Static value servicePrincipal for DecisionTargetType. */
    public static final DecisionTargetType SERVICE_PRINCIPAL = fromString("servicePrincipal");

    /**
     * Creates or finds a DecisionTargetType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DecisionTargetType.
     */
    @JsonCreator
    public static DecisionTargetType fromString(String name) {
        return fromString(name, DecisionTargetType.class);
    }

    /** @return known DecisionTargetType values. */
    public static Collection<DecisionTargetType> values() {
        return values(DecisionTargetType.class);
    }
}
