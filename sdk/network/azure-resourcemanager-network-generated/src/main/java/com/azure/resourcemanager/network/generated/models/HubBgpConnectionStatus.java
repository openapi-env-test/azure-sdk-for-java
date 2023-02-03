// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The current state of the VirtualHub to Peer. */
public final class HubBgpConnectionStatus extends ExpandableStringEnum<HubBgpConnectionStatus> {
    /** Static value Unknown for HubBgpConnectionStatus. */
    public static final HubBgpConnectionStatus UNKNOWN = fromString("Unknown");

    /** Static value Connecting for HubBgpConnectionStatus. */
    public static final HubBgpConnectionStatus CONNECTING = fromString("Connecting");

    /** Static value Connected for HubBgpConnectionStatus. */
    public static final HubBgpConnectionStatus CONNECTED = fromString("Connected");

    /** Static value NotConnected for HubBgpConnectionStatus. */
    public static final HubBgpConnectionStatus NOT_CONNECTED = fromString("NotConnected");

    /**
     * Creates or finds a HubBgpConnectionStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HubBgpConnectionStatus.
     */
    @JsonCreator
    public static HubBgpConnectionStatus fromString(String name) {
        return fromString(name, HubBgpConnectionStatus.class);
    }

    /**
     * Gets known HubBgpConnectionStatus values.
     *
     * @return known HubBgpConnectionStatus values.
     */
    public static Collection<HubBgpConnectionStatus> values() {
        return values(HubBgpConnectionStatus.class);
    }
}
