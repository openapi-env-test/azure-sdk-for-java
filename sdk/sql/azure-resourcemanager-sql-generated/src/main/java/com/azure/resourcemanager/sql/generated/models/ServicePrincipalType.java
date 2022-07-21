// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServicePrincipalType. */
public final class ServicePrincipalType extends ExpandableStringEnum<ServicePrincipalType> {
    /** Static value None for ServicePrincipalType. */
    public static final ServicePrincipalType NONE = fromString("None");

    /** Static value SystemAssigned for ServicePrincipalType. */
    public static final ServicePrincipalType SYSTEM_ASSIGNED = fromString("SystemAssigned");

    /**
     * Creates or finds a ServicePrincipalType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServicePrincipalType.
     */
    @JsonCreator
    public static ServicePrincipalType fromString(String name) {
        return fromString(name, ServicePrincipalType.class);
    }

    /**
     * Gets known ServicePrincipalType values.
     *
     * @return known ServicePrincipalType values.
     */
    public static Collection<ServicePrincipalType> values() {
        return values(ServicePrincipalType.class);
    }
}
