// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The state of Sql Agent. */
public final class SqlAgentConfigurationPropertiesState
    extends ExpandableStringEnum<SqlAgentConfigurationPropertiesState> {
    /** Static value Enabled for SqlAgentConfigurationPropertiesState. */
    public static final SqlAgentConfigurationPropertiesState ENABLED = fromString("Enabled");

    /** Static value Disabled for SqlAgentConfigurationPropertiesState. */
    public static final SqlAgentConfigurationPropertiesState DISABLED = fromString("Disabled");

    /**
     * Creates or finds a SqlAgentConfigurationPropertiesState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SqlAgentConfigurationPropertiesState.
     */
    @JsonCreator
    public static SqlAgentConfigurationPropertiesState fromString(String name) {
        return fromString(name, SqlAgentConfigurationPropertiesState.class);
    }

    /**
     * Gets known SqlAgentConfigurationPropertiesState values.
     *
     * @return known SqlAgentConfigurationPropertiesState values.
     */
    public static Collection<SqlAgentConfigurationPropertiesState> values() {
        return values(SqlAgentConfigurationPropertiesState.class);
    }
}
