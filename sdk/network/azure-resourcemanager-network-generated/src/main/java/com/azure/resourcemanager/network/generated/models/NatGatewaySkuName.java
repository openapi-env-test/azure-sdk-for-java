// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Name of Nat Gateway SKU. */
public final class NatGatewaySkuName extends ExpandableStringEnum<NatGatewaySkuName> {
    /** Static value Standard for NatGatewaySkuName. */
    public static final NatGatewaySkuName STANDARD = fromString("Standard");

    /**
     * Creates or finds a NatGatewaySkuName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NatGatewaySkuName.
     */
    @JsonCreator
    public static NatGatewaySkuName fromString(String name) {
        return fromString(name, NatGatewaySkuName.class);
    }

    /**
     * Gets known NatGatewaySkuName values.
     *
     * @return known NatGatewaySkuName values.
     */
    public static Collection<NatGatewaySkuName> values() {
        return values(NatGatewaySkuName.class);
    }
}
