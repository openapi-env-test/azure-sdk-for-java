/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SecurityRuleDirection.
 */
public final class SecurityRuleDirection extends ExpandableStringEnum<SecurityRuleDirection> {
    /** Static value Inbound for SecurityRuleDirection. */
    public static final SecurityRuleDirection INBOUND = fromString("Inbound");

    /** Static value Outbound for SecurityRuleDirection. */
    public static final SecurityRuleDirection OUTBOUND = fromString("Outbound");

    /**
     * Creates or finds a SecurityRuleDirection from its string representation.
     * @param name a name to look for
     * @return the corresponding SecurityRuleDirection
     */
    @JsonCreator
    public static SecurityRuleDirection fromString(String name) {
        return fromString(name, SecurityRuleDirection.class);
    }

    /**
     * @return known SecurityRuleDirection values
     */
    public static Collection<SecurityRuleDirection> values() {
        return values(SecurityRuleDirection.class);
    }
}
