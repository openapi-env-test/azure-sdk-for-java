// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BastionHostSkuName. */
public final class BastionHostSkuName extends ExpandableStringEnum<BastionHostSkuName> {
    /** Static value Basic for BastionHostSkuName. */
    public static final BastionHostSkuName BASIC = fromString("Basic");

    /** Static value Standard for BastionHostSkuName. */
    public static final BastionHostSkuName STANDARD = fromString("Standard");

    /**
     * Creates or finds a BastionHostSkuName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BastionHostSkuName.
     */
    @JsonCreator
    public static BastionHostSkuName fromString(String name) {
        return fromString(name, BastionHostSkuName.class);
    }

    /**
     * Gets known BastionHostSkuName values.
     *
     * @return known BastionHostSkuName values.
     */
    public static Collection<BastionHostSkuName> values() {
        return values(BastionHostSkuName.class);
    }
}
