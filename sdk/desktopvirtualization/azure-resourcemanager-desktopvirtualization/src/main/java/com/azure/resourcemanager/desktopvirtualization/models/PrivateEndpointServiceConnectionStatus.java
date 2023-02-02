// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The private endpoint connection status. */
public final class PrivateEndpointServiceConnectionStatus
    extends ExpandableStringEnum<PrivateEndpointServiceConnectionStatus> {
    /** Static value Pending for PrivateEndpointServiceConnectionStatus. */
    public static final PrivateEndpointServiceConnectionStatus PENDING = fromString("Pending");

    /** Static value Approved for PrivateEndpointServiceConnectionStatus. */
    public static final PrivateEndpointServiceConnectionStatus APPROVED = fromString("Approved");

    /** Static value Rejected for PrivateEndpointServiceConnectionStatus. */
    public static final PrivateEndpointServiceConnectionStatus REJECTED = fromString("Rejected");

    /**
     * Creates or finds a PrivateEndpointServiceConnectionStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PrivateEndpointServiceConnectionStatus.
     */
    @JsonCreator
    public static PrivateEndpointServiceConnectionStatus fromString(String name) {
        return fromString(name, PrivateEndpointServiceConnectionStatus.class);
    }

    /**
     * Gets known PrivateEndpointServiceConnectionStatus values.
     *
     * @return known PrivateEndpointServiceConnectionStatus values.
     */
    public static Collection<PrivateEndpointServiceConnectionStatus> values() {
        return values(PrivateEndpointServiceConnectionStatus.class);
    }
}
