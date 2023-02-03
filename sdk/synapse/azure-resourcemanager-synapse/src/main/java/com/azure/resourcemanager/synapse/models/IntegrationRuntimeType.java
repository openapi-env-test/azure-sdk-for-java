// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The type of integration runtime. */
public final class IntegrationRuntimeType extends ExpandableStringEnum<IntegrationRuntimeType> {
    /** Static value Managed for IntegrationRuntimeType. */
    public static final IntegrationRuntimeType MANAGED = fromString("Managed");

    /** Static value SelfHosted for IntegrationRuntimeType. */
    public static final IntegrationRuntimeType SELF_HOSTED = fromString("SelfHosted");

    /**
     * Creates or finds a IntegrationRuntimeType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IntegrationRuntimeType.
     */
    @JsonCreator
    public static IntegrationRuntimeType fromString(String name) {
        return fromString(name, IntegrationRuntimeType.class);
    }

    /**
     * Gets known IntegrationRuntimeType values.
     *
     * @return known IntegrationRuntimeType values.
     */
    public static Collection<IntegrationRuntimeType> values() {
        return values(IntegrationRuntimeType.class);
    }
}
