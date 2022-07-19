// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for NetworkPolicy. */
public final class NetworkPolicy extends ExpandableStringEnum<NetworkPolicy> {
    /** Static value calico for NetworkPolicy. */
    public static final NetworkPolicy CALICO = fromString("calico");

    /** Static value azure for NetworkPolicy. */
    public static final NetworkPolicy AZURE = fromString("azure");

    /**
     * Creates or finds a NetworkPolicy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NetworkPolicy.
     */
    @JsonCreator
    public static NetworkPolicy fromString(String name) {
        return fromString(name, NetworkPolicy.class);
    }

    /**
     * Gets known NetworkPolicy values.
     *
     * @return known NetworkPolicy values.
     */
    public static Collection<NetworkPolicy> values() {
        return values(NetworkPolicy.class);
    }
}
