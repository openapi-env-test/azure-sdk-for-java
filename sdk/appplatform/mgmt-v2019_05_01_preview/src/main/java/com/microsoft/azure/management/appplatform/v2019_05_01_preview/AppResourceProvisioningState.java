/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2019_05_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AppResourceProvisioningState.
 */
public final class AppResourceProvisioningState extends ExpandableStringEnum<AppResourceProvisioningState> {
    /** Static value Succeeded for AppResourceProvisioningState. */
    public static final AppResourceProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for AppResourceProvisioningState. */
    public static final AppResourceProvisioningState FAILED = fromString("Failed");

    /** Static value Creating for AppResourceProvisioningState. */
    public static final AppResourceProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for AppResourceProvisioningState. */
    public static final AppResourceProvisioningState UPDATING = fromString("Updating");

    /**
     * Creates or finds a AppResourceProvisioningState from its string representation.
     * @param name a name to look for
     * @return the corresponding AppResourceProvisioningState
     */
    @JsonCreator
    public static AppResourceProvisioningState fromString(String name) {
        return fromString(name, AppResourceProvisioningState.class);
    }

    /**
     * @return known AppResourceProvisioningState values
     */
    public static Collection<AppResourceProvisioningState> values() {
        return values(AppResourceProvisioningState.class);
    }
}
