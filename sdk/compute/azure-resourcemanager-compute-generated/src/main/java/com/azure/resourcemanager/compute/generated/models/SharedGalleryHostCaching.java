// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SharedGalleryHostCaching. */
public final class SharedGalleryHostCaching extends ExpandableStringEnum<SharedGalleryHostCaching> {
    /** Static value None for SharedGalleryHostCaching. */
    public static final SharedGalleryHostCaching NONE = fromString("None");

    /** Static value ReadOnly for SharedGalleryHostCaching. */
    public static final SharedGalleryHostCaching READ_ONLY = fromString("ReadOnly");

    /** Static value ReadWrite for SharedGalleryHostCaching. */
    public static final SharedGalleryHostCaching READ_WRITE = fromString("ReadWrite");

    /**
     * Creates or finds a SharedGalleryHostCaching from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SharedGalleryHostCaching.
     */
    @JsonCreator
    public static SharedGalleryHostCaching fromString(String name) {
        return fromString(name, SharedGalleryHostCaching.class);
    }

    /**
     * Gets known SharedGalleryHostCaching values.
     *
     * @return known SharedGalleryHostCaching values.
     */
    public static Collection<SharedGalleryHostCaching> values() {
        return values(SharedGalleryHostCaching.class);
    }
}
