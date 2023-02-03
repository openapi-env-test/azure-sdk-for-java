// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Specifies the behavior of the managed disk when the VM gets deleted i.e whether the managed disk is deleted or
 * detached. Supported values:&lt;br&gt;&lt;br&gt; **Delete** If this value is used, the managed disk is deleted when VM
 * gets deleted.&lt;br&gt;&lt;br&gt; **Detach** If this value is used, the managed disk is retained after VM gets
 * deleted.&lt;br&gt;&lt;br&gt; Minimum api-version: 2021-03-01.
 */
public final class DiskDeleteOptionTypes extends ExpandableStringEnum<DiskDeleteOptionTypes> {
    /** Static value Delete for DiskDeleteOptionTypes. */
    public static final DiskDeleteOptionTypes DELETE = fromString("Delete");

    /** Static value Detach for DiskDeleteOptionTypes. */
    public static final DiskDeleteOptionTypes DETACH = fromString("Detach");

    /**
     * Creates or finds a DiskDeleteOptionTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DiskDeleteOptionTypes.
     */
    @JsonCreator
    public static DiskDeleteOptionTypes fromString(String name) {
        return fromString(name, DiskDeleteOptionTypes.class);
    }

    /**
     * Gets known DiskDeleteOptionTypes values.
     *
     * @return known DiskDeleteOptionTypes values.
     */
    public static Collection<DiskDeleteOptionTypes> values() {
        return values(DiskDeleteOptionTypes.class);
    }
}
