// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TrustedAccessRoleBindingProvisioningState. */
public final class TrustedAccessRoleBindingProvisioningState
    extends ExpandableStringEnum<TrustedAccessRoleBindingProvisioningState> {
    /** Static value Succeeded for TrustedAccessRoleBindingProvisioningState. */
    public static final TrustedAccessRoleBindingProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for TrustedAccessRoleBindingProvisioningState. */
    public static final TrustedAccessRoleBindingProvisioningState FAILED = fromString("Failed");

    /** Static value Updating for TrustedAccessRoleBindingProvisioningState. */
    public static final TrustedAccessRoleBindingProvisioningState UPDATING = fromString("Updating");

    /** Static value Deleting for TrustedAccessRoleBindingProvisioningState. */
    public static final TrustedAccessRoleBindingProvisioningState DELETING = fromString("Deleting");

    /**
     * Creates or finds a TrustedAccessRoleBindingProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TrustedAccessRoleBindingProvisioningState.
     */
    @JsonCreator
    public static TrustedAccessRoleBindingProvisioningState fromString(String name) {
        return fromString(name, TrustedAccessRoleBindingProvisioningState.class);
    }

    /**
     * Gets known TrustedAccessRoleBindingProvisioningState values.
     *
     * @return known TrustedAccessRoleBindingProvisioningState values.
     */
    public static Collection<TrustedAccessRoleBindingProvisioningState> values() {
        return values(TrustedAccessRoleBindingProvisioningState.class);
    }
}
