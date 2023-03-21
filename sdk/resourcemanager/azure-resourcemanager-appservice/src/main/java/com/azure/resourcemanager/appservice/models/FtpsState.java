// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** State of FTP / FTPS service. */
public final class FtpsState extends ExpandableStringEnum<FtpsState> {
    /** Static value AllAllowed for FtpsState. */
    public static final FtpsState ALL_ALLOWED = fromString("AllAllowed");

    /** Static value FtpsOnly for FtpsState. */
    public static final FtpsState FTPS_ONLY = fromString("FtpsOnly");

    /** Static value Disabled for FtpsState. */
    public static final FtpsState DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of FtpsState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FtpsState() {
    }

    /**
     * Creates or finds a FtpsState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FtpsState.
     */
    @JsonCreator
    public static FtpsState fromString(String name) {
        return fromString(name, FtpsState.class);
    }

    /**
     * Gets known FtpsState values.
     *
     * @return known FtpsState values.
     */
    public static Collection<FtpsState> values() {
        return values(FtpsState.class);
    }
}
