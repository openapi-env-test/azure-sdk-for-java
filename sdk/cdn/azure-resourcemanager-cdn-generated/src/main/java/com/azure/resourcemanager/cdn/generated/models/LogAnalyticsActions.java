// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LogAnalyticsActions. */
public final class LogAnalyticsActions extends ExpandableStringEnum<LogAnalyticsActions> {
    /** Static value allow for LogAnalyticsActions. */
    public static final LogAnalyticsActions ALLOW = fromString("allow");

    /** Static value block for LogAnalyticsActions. */
    public static final LogAnalyticsActions BLOCK = fromString("block");

    /** Static value log for LogAnalyticsActions. */
    public static final LogAnalyticsActions LOG = fromString("log");

    /** Static value redirect for LogAnalyticsActions. */
    public static final LogAnalyticsActions REDIRECT = fromString("redirect");

    /**
     * Creates or finds a LogAnalyticsActions from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LogAnalyticsActions.
     */
    @JsonCreator
    public static LogAnalyticsActions fromString(String name) {
        return fromString(name, LogAnalyticsActions.class);
    }

    /** @return known LogAnalyticsActions values. */
    public static Collection<LogAnalyticsActions> values() {
        return values(LogAnalyticsActions.class);
    }
}
