// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SyncMemberDbType. */
public final class SyncMemberDbType extends ExpandableStringEnum<SyncMemberDbType> {
    /** Static value AzureSqlDatabase for SyncMemberDbType. */
    public static final SyncMemberDbType AZURE_SQL_DATABASE = fromString("AzureSqlDatabase");

    /** Static value SqlServerDatabase for SyncMemberDbType. */
    public static final SyncMemberDbType SQL_SERVER_DATABASE = fromString("SqlServerDatabase");

    /**
     * Creates or finds a SyncMemberDbType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SyncMemberDbType.
     */
    @JsonCreator
    public static SyncMemberDbType fromString(String name) {
        return fromString(name, SyncMemberDbType.class);
    }

    /**
     * Gets known SyncMemberDbType values.
     *
     * @return known SyncMemberDbType values.
     */
    public static Collection<SyncMemberDbType> values() {
        return values(SyncMemberDbType.class);
    }
}
