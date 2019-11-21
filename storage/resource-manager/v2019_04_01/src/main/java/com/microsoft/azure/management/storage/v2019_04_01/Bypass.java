/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_04_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for Bypass.
 */
public final class Bypass extends ExpandableStringEnum<Bypass> {
    /** Static value None for Bypass. */
    public static final Bypass NONE = fromString("None");

    /** Static value Logging for Bypass. */
    public static final Bypass LOGGING = fromString("Logging");

    /** Static value Metrics for Bypass. */
    public static final Bypass METRICS = fromString("Metrics");

    /** Static value AzureServices for Bypass. */
    public static final Bypass AZURE_SERVICES = fromString("AzureServices");

    /**
     * Creates or finds a Bypass from its string representation.
     * @param name a name to look for
     * @return the corresponding Bypass
     */
    @JsonCreator
    public static Bypass fromString(String name) {
        return fromString(name, Bypass.class);
    }

    /**
     * @return known Bypass values
     */
    public static Collection<Bypass> values() {
        return values(Bypass.class);
    }
}
