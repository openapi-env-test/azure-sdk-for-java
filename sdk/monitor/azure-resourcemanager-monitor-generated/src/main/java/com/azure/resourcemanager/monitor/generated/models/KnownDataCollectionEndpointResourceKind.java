// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The kind of the resource. */
public final class KnownDataCollectionEndpointResourceKind
    extends ExpandableStringEnum<KnownDataCollectionEndpointResourceKind> {
    /** Static value Linux for KnownDataCollectionEndpointResourceKind. */
    public static final KnownDataCollectionEndpointResourceKind LINUX = fromString("Linux");

    /** Static value Windows for KnownDataCollectionEndpointResourceKind. */
    public static final KnownDataCollectionEndpointResourceKind WINDOWS = fromString("Windows");

    /**
     * Creates or finds a KnownDataCollectionEndpointResourceKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding KnownDataCollectionEndpointResourceKind.
     */
    @JsonCreator
    public static KnownDataCollectionEndpointResourceKind fromString(String name) {
        return fromString(name, KnownDataCollectionEndpointResourceKind.class);
    }

    /**
     * Gets known KnownDataCollectionEndpointResourceKind values.
     *
     * @return known KnownDataCollectionEndpointResourceKind values.
     */
    public static Collection<KnownDataCollectionEndpointResourceKind> values() {
        return values(KnownDataCollectionEndpointResourceKind.class);
    }
}
