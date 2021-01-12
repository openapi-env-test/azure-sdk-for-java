// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.contoso_cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CustomHttpsProvisioningState. */
public final class CustomHttpsProvisioningState extends ExpandableStringEnum<CustomHttpsProvisioningState> {
    /** Static value Enabling for CustomHttpsProvisioningState. */
    public static final CustomHttpsProvisioningState ENABLING = fromString("Enabling");

    /** Static value Enabled for CustomHttpsProvisioningState. */
    public static final CustomHttpsProvisioningState ENABLED = fromString("Enabled");

    /** Static value Disabling for CustomHttpsProvisioningState. */
    public static final CustomHttpsProvisioningState DISABLING = fromString("Disabling");

    /** Static value Disabled for CustomHttpsProvisioningState. */
    public static final CustomHttpsProvisioningState DISABLED = fromString("Disabled");

    /** Static value Failed for CustomHttpsProvisioningState. */
    public static final CustomHttpsProvisioningState FAILED = fromString("Failed");

    /**
     * Creates or finds a CustomHttpsProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CustomHttpsProvisioningState.
     */
    @JsonCreator
    public static CustomHttpsProvisioningState fromString(String name) {
        return fromString(name, CustomHttpsProvisioningState.class);
    }

    /** @return known CustomHttpsProvisioningState values. */
    public static Collection<CustomHttpsProvisioningState> values() {
        return values(CustomHttpsProvisioningState.class);
    }
}
