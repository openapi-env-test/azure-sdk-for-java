// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for HybridComputeProvisioningState. */
public final class HybridComputeProvisioningState extends ExpandableStringEnum<HybridComputeProvisioningState> {
    /** Static value Valid for HybridComputeProvisioningState. */
    public static final HybridComputeProvisioningState VALID = fromString("Valid");

    /** Static value Invalid for HybridComputeProvisioningState. */
    public static final HybridComputeProvisioningState INVALID = fromString("Invalid");

    /** Static value Expired for HybridComputeProvisioningState. */
    public static final HybridComputeProvisioningState EXPIRED = fromString("Expired");

    /**
     * Creates or finds a HybridComputeProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HybridComputeProvisioningState.
     */
    @JsonCreator
    public static HybridComputeProvisioningState fromString(String name) {
        return fromString(name, HybridComputeProvisioningState.class);
    }

    /**
     * Gets known HybridComputeProvisioningState values.
     *
     * @return known HybridComputeProvisioningState values.
     */
    public static Collection<HybridComputeProvisioningState> values() {
        return values(HybridComputeProvisioningState.class);
    }
}
