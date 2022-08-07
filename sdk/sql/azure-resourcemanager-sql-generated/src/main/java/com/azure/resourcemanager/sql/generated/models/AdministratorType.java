// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AdministratorType. */
public final class AdministratorType extends ExpandableStringEnum<AdministratorType> {
    /** Static value ActiveDirectory for AdministratorType. */
    public static final AdministratorType ACTIVE_DIRECTORY = fromString("ActiveDirectory");

    /**
     * Creates or finds a AdministratorType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AdministratorType.
     */
    @JsonCreator
    public static AdministratorType fromString(String name) {
        return fromString(name, AdministratorType.class);
    }

    /**
     * Gets known AdministratorType values.
     *
     * @return known AdministratorType values.
     */
    public static Collection<AdministratorType> values() {
        return values(AdministratorType.class);
    }
}
