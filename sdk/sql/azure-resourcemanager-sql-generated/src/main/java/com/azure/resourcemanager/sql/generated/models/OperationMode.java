// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OperationMode. */
public final class OperationMode extends ExpandableStringEnum<OperationMode> {
    /** Static value PolybaseImport for OperationMode. */
    public static final OperationMode POLYBASE_IMPORT = fromString("PolybaseImport");

    /**
     * Creates or finds a OperationMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OperationMode.
     */
    @JsonCreator
    public static OperationMode fromString(String name) {
        return fromString(name, OperationMode.class);
    }

    /**
     * Gets known OperationMode values.
     *
     * @return known OperationMode values.
     */
    public static Collection<OperationMode> values() {
        return values(OperationMode.class);
    }
}
