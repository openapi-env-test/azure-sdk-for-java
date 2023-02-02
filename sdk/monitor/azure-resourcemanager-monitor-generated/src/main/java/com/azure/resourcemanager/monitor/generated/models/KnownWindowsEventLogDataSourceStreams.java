// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for KnownWindowsEventLogDataSourceStreams. */
public final class KnownWindowsEventLogDataSourceStreams
    extends ExpandableStringEnum<KnownWindowsEventLogDataSourceStreams> {
    /** Static value Microsoft-WindowsEvent for KnownWindowsEventLogDataSourceStreams. */
    public static final KnownWindowsEventLogDataSourceStreams MICROSOFT_WINDOWS_EVENT =
        fromString("Microsoft-WindowsEvent");

    /** Static value Microsoft-Event for KnownWindowsEventLogDataSourceStreams. */
    public static final KnownWindowsEventLogDataSourceStreams MICROSOFT_EVENT = fromString("Microsoft-Event");

    /**
     * Creates or finds a KnownWindowsEventLogDataSourceStreams from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding KnownWindowsEventLogDataSourceStreams.
     */
    @JsonCreator
    public static KnownWindowsEventLogDataSourceStreams fromString(String name) {
        return fromString(name, KnownWindowsEventLogDataSourceStreams.class);
    }

    /**
     * Gets known KnownWindowsEventLogDataSourceStreams values.
     *
     * @return known KnownWindowsEventLogDataSourceStreams values.
     */
    public static Collection<KnownWindowsEventLogDataSourceStreams> values() {
        return values(KnownWindowsEventLogDataSourceStreams.class);
    }
}
