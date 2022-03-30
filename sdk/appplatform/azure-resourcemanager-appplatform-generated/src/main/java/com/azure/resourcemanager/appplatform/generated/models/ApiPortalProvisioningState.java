// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ApiPortalProvisioningState. */
public final class ApiPortalProvisioningState extends ExpandableStringEnum<ApiPortalProvisioningState> {
    /** Static value Creating for ApiPortalProvisioningState. */
    public static final ApiPortalProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for ApiPortalProvisioningState. */
    public static final ApiPortalProvisioningState UPDATING = fromString("Updating");

    /** Static value Succeeded for ApiPortalProvisioningState. */
    public static final ApiPortalProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for ApiPortalProvisioningState. */
    public static final ApiPortalProvisioningState FAILED = fromString("Failed");

    /** Static value Deleting for ApiPortalProvisioningState. */
    public static final ApiPortalProvisioningState DELETING = fromString("Deleting");

    /**
     * Creates or finds a ApiPortalProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ApiPortalProvisioningState.
     */
    @JsonCreator
    public static ApiPortalProvisioningState fromString(String name) {
        return fromString(name, ApiPortalProvisioningState.class);
    }

    /** @return known ApiPortalProvisioningState values. */
    public static Collection<ApiPortalProvisioningState> values() {
        return values(ApiPortalProvisioningState.class);
    }
}
