// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The table temporal type. */
public final class TableTemporalType extends ExpandableStringEnum<TableTemporalType> {
    /** Static value NonTemporalTable for TableTemporalType. */
    public static final TableTemporalType NON_TEMPORAL_TABLE = fromString("NonTemporalTable");

    /** Static value HistoryTable for TableTemporalType. */
    public static final TableTemporalType HISTORY_TABLE = fromString("HistoryTable");

    /** Static value SystemVersionedTemporalTable for TableTemporalType. */
    public static final TableTemporalType SYSTEM_VERSIONED_TEMPORAL_TABLE = fromString("SystemVersionedTemporalTable");

    /**
     * Creates or finds a TableTemporalType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TableTemporalType.
     */
    @JsonCreator
    public static TableTemporalType fromString(String name) {
        return fromString(name, TableTemporalType.class);
    }

    /**
     * Gets known TableTemporalType values.
     *
     * @return known TableTemporalType values.
     */
    public static Collection<TableTemporalType> values() {
        return values(TableTemporalType.class);
    }
}
