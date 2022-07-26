// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DiffDiskPlacement. */
public final class DiffDiskPlacement extends ExpandableStringEnum<DiffDiskPlacement> {
    /** Static value CacheDisk for DiffDiskPlacement. */
    public static final DiffDiskPlacement CACHE_DISK = fromString("CacheDisk");

    /** Static value ResourceDisk for DiffDiskPlacement. */
    public static final DiffDiskPlacement RESOURCE_DISK = fromString("ResourceDisk");

    /**
     * Creates or finds a DiffDiskPlacement from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DiffDiskPlacement.
     */
    @JsonCreator
    public static DiffDiskPlacement fromString(String name) {
        return fromString(name, DiffDiskPlacement.class);
    }

    /**
     * Gets known DiffDiskPlacement values.
     *
     * @return known DiffDiskPlacement values.
     */
    public static Collection<DiffDiskPlacement> values() {
        return values(DiffDiskPlacement.class);
    }
}
