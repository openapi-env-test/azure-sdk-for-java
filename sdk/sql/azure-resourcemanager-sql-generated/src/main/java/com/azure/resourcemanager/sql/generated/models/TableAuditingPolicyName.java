// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TableAuditingPolicyName. */
public final class TableAuditingPolicyName extends ExpandableStringEnum<TableAuditingPolicyName> {
    /** Static value default for TableAuditingPolicyName. */
    public static final TableAuditingPolicyName DEFAULT = fromString("default");

    /**
     * Creates or finds a TableAuditingPolicyName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TableAuditingPolicyName.
     */
    @JsonCreator
    public static TableAuditingPolicyName fromString(String name) {
        return fromString(name, TableAuditingPolicyName.class);
    }

    /** @return known TableAuditingPolicyName values. */
    public static Collection<TableAuditingPolicyName> values() {
        return values(TableAuditingPolicyName.class);
    }
}
