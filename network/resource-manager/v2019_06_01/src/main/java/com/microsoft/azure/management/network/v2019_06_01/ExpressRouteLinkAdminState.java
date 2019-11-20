/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ExpressRouteLinkAdminState.
 */
public final class ExpressRouteLinkAdminState extends ExpandableStringEnum<ExpressRouteLinkAdminState> {
    /** Static value Enabled for ExpressRouteLinkAdminState. */
    public static final ExpressRouteLinkAdminState ENABLED = fromString("Enabled");

    /** Static value Disabled for ExpressRouteLinkAdminState. */
    public static final ExpressRouteLinkAdminState DISABLED = fromString("Disabled");

    /**
     * Creates or finds a ExpressRouteLinkAdminState from its string representation.
     * @param name a name to look for
     * @return the corresponding ExpressRouteLinkAdminState
     */
    @JsonCreator
    public static ExpressRouteLinkAdminState fromString(String name) {
        return fromString(name, ExpressRouteLinkAdminState.class);
    }

    /**
     * @return known ExpressRouteLinkAdminState values
     */
    public static Collection<ExpressRouteLinkAdminState> values() {
        return values(ExpressRouteLinkAdminState.class);
    }
}
