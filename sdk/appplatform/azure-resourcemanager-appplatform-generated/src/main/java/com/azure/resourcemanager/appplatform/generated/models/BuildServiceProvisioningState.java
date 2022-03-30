// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BuildServiceProvisioningState. */
public final class BuildServiceProvisioningState extends ExpandableStringEnum<BuildServiceProvisioningState> {
    /** Static value Creating for BuildServiceProvisioningState. */
    public static final BuildServiceProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for BuildServiceProvisioningState. */
    public static final BuildServiceProvisioningState UPDATING = fromString("Updating");

    /** Static value Succeeded for BuildServiceProvisioningState. */
    public static final BuildServiceProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for BuildServiceProvisioningState. */
    public static final BuildServiceProvisioningState FAILED = fromString("Failed");

    /** Static value Deleting for BuildServiceProvisioningState. */
    public static final BuildServiceProvisioningState DELETING = fromString("Deleting");

    /**
     * Creates or finds a BuildServiceProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BuildServiceProvisioningState.
     */
    @JsonCreator
    public static BuildServiceProvisioningState fromString(String name) {
        return fromString(name, BuildServiceProvisioningState.class);
    }

    /** @return known BuildServiceProvisioningState values. */
    public static Collection<BuildServiceProvisioningState> values() {
        return values(BuildServiceProvisioningState.class);
    }
}
