// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Status for a SessionHost. */
public final class Status extends ExpandableStringEnum<Status> {
    /** Static value Available for Status. */
    public static final Status AVAILABLE = fromString("Available");

    /** Static value Unavailable for Status. */
    public static final Status UNAVAILABLE = fromString("Unavailable");

    /** Static value Shutdown for Status. */
    public static final Status SHUTDOWN = fromString("Shutdown");

    /** Static value Disconnected for Status. */
    public static final Status DISCONNECTED = fromString("Disconnected");

    /** Static value Upgrading for Status. */
    public static final Status UPGRADING = fromString("Upgrading");

    /** Static value UpgradeFailed for Status. */
    public static final Status UPGRADE_FAILED = fromString("UpgradeFailed");

    /** Static value NoHeartbeat for Status. */
    public static final Status NO_HEARTBEAT = fromString("NoHeartbeat");

    /** Static value NotJoinedToDomain for Status. */
    public static final Status NOT_JOINED_TO_DOMAIN = fromString("NotJoinedToDomain");

    /** Static value DomainTrustRelationshipLost for Status. */
    public static final Status DOMAIN_TRUST_RELATIONSHIP_LOST = fromString("DomainTrustRelationshipLost");

    /** Static value SxSStackListenerNotReady for Status. */
    public static final Status SX_SSTACK_LISTENER_NOT_READY = fromString("SxSStackListenerNotReady");

    /** Static value FSLogixNotHealthy for Status. */
    public static final Status FSLOGIX_NOT_HEALTHY = fromString("FSLogixNotHealthy");

    /** Static value NeedsAssistance for Status. */
    public static final Status NEEDS_ASSISTANCE = fromString("NeedsAssistance");

    /**
     * Creates or finds a Status from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Status.
     */
    @JsonCreator
    public static Status fromString(String name) {
        return fromString(name, Status.class);
    }

    /**
     * Gets known Status values.
     *
     * @return known Status values.
     */
    public static Collection<Status> values() {
        return values(Status.class);
    }
}
