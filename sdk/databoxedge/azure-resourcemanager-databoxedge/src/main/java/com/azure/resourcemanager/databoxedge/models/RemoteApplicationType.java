// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Remote application type. */
public final class RemoteApplicationType extends ExpandableStringEnum<RemoteApplicationType> {
    /** Static value Powershell for RemoteApplicationType. */
    public static final RemoteApplicationType POWERSHELL = fromString("Powershell");

    /** Static value WAC for RemoteApplicationType. */
    public static final RemoteApplicationType WAC = fromString("WAC");

    /** Static value LocalUI for RemoteApplicationType. */
    public static final RemoteApplicationType LOCAL_UI = fromString("LocalUI");

    /** Static value AllApplications for RemoteApplicationType. */
    public static final RemoteApplicationType ALL_APPLICATIONS = fromString("AllApplications");

    /**
     * Creates or finds a RemoteApplicationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RemoteApplicationType.
     */
    @JsonCreator
    public static RemoteApplicationType fromString(String name) {
        return fromString(name, RemoteApplicationType.class);
    }

    /**
     * Gets known RemoteApplicationType values.
     *
     * @return known RemoteApplicationType values.
     */
    public static Collection<RemoteApplicationType> values() {
        return values(RemoteApplicationType.class);
    }
}
