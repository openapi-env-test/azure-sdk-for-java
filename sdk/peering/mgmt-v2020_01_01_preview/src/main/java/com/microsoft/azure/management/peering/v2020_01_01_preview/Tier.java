/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2020_01_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for Tier.
 */
public final class Tier extends ExpandableStringEnum<Tier> {
    /** Static value Basic for Tier. */
    public static final Tier BASIC = fromString("Basic");

    /** Static value Premium for Tier. */
    public static final Tier PREMIUM = fromString("Premium");

    /**
     * Creates or finds a Tier from its string representation.
     * @param name a name to look for
     * @return the corresponding Tier
     */
    @JsonCreator
    public static Tier fromString(String name) {
        return fromString(name, Tier.class);
    }

    /**
     * @return known Tier values
     */
    public static Collection<Tier> values() {
        return values(Tier.class);
    }
}
