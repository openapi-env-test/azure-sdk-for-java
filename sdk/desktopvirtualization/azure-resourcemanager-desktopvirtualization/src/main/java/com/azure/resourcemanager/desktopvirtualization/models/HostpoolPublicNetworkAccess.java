// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for HostpoolPublicNetworkAccess. */
public final class HostpoolPublicNetworkAccess extends ExpandableStringEnum<HostpoolPublicNetworkAccess> {
    /** Static value Enabled for HostpoolPublicNetworkAccess. */
    public static final HostpoolPublicNetworkAccess ENABLED = fromString("Enabled");

    /** Static value Disabled for HostpoolPublicNetworkAccess. */
    public static final HostpoolPublicNetworkAccess DISABLED = fromString("Disabled");

    /** Static value EnabledForSessionHostsOnly for HostpoolPublicNetworkAccess. */
    public static final HostpoolPublicNetworkAccess ENABLED_FOR_SESSION_HOSTS_ONLY =
        fromString("EnabledForSessionHostsOnly");

    /** Static value EnabledForClientsOnly for HostpoolPublicNetworkAccess. */
    public static final HostpoolPublicNetworkAccess ENABLED_FOR_CLIENTS_ONLY = fromString("EnabledForClientsOnly");

    /**
     * Creates or finds a HostpoolPublicNetworkAccess from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HostpoolPublicNetworkAccess.
     */
    @JsonCreator
    public static HostpoolPublicNetworkAccess fromString(String name) {
        return fromString(name, HostpoolPublicNetworkAccess.class);
    }

    /**
     * Gets known HostpoolPublicNetworkAccess values.
     *
     * @return known HostpoolPublicNetworkAccess values.
     */
    public static Collection<HostpoolPublicNetworkAccess> values() {
        return values(HostpoolPublicNetworkAccess.class);
    }
}
