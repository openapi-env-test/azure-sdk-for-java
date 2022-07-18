// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PublicNetworkAccessFlag. */
public final class PublicNetworkAccessFlag extends ExpandableStringEnum<PublicNetworkAccessFlag> {
    /** Static value Enabled for PublicNetworkAccessFlag. */
    public static final PublicNetworkAccessFlag ENABLED = fromString("Enabled");

    /** Static value Disabled for PublicNetworkAccessFlag. */
    public static final PublicNetworkAccessFlag DISABLED = fromString("Disabled");

    /**
     * Creates or finds a PublicNetworkAccessFlag from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PublicNetworkAccessFlag.
     */
    @JsonCreator
    public static PublicNetworkAccessFlag fromString(String name) {
        return fromString(name, PublicNetworkAccessFlag.class);
    }

    /**
     * Gets known PublicNetworkAccessFlag values.
     *
     * @return known PublicNetworkAccessFlag values.
     */
    public static Collection<PublicNetworkAccessFlag> values() {
        return values(PublicNetworkAccessFlag.class);
    }
}
