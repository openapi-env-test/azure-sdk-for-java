// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PrivateLinkServiceConnectionStateStatus. */
public final class PrivateLinkServiceConnectionStateStatus
    extends ExpandableStringEnum<PrivateLinkServiceConnectionStateStatus> {
    /** Static value Approved for PrivateLinkServiceConnectionStateStatus. */
    public static final PrivateLinkServiceConnectionStateStatus APPROVED = fromString("Approved");

    /** Static value Pending for PrivateLinkServiceConnectionStateStatus. */
    public static final PrivateLinkServiceConnectionStateStatus PENDING = fromString("Pending");

    /** Static value Rejected for PrivateLinkServiceConnectionStateStatus. */
    public static final PrivateLinkServiceConnectionStateStatus REJECTED = fromString("Rejected");

    /** Static value Disconnected for PrivateLinkServiceConnectionStateStatus. */
    public static final PrivateLinkServiceConnectionStateStatus DISCONNECTED = fromString("Disconnected");

    /**
     * Creates or finds a PrivateLinkServiceConnectionStateStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PrivateLinkServiceConnectionStateStatus.
     */
    @JsonCreator
    public static PrivateLinkServiceConnectionStateStatus fromString(String name) {
        return fromString(name, PrivateLinkServiceConnectionStateStatus.class);
    }

    /**
     * Gets known PrivateLinkServiceConnectionStateStatus values.
     *
     * @return known PrivateLinkServiceConnectionStateStatus values.
     */
    public static Collection<PrivateLinkServiceConnectionStateStatus> values() {
        return values(PrivateLinkServiceConnectionStateStatus.class);
    }
}
