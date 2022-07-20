// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SecurityPartnerProviderConnectionStatus. */
public final class SecurityPartnerProviderConnectionStatus
    extends ExpandableStringEnum<SecurityPartnerProviderConnectionStatus> {
    /** Static value Unknown for SecurityPartnerProviderConnectionStatus. */
    public static final SecurityPartnerProviderConnectionStatus UNKNOWN = fromString("Unknown");

    /** Static value PartiallyConnected for SecurityPartnerProviderConnectionStatus. */
    public static final SecurityPartnerProviderConnectionStatus PARTIALLY_CONNECTED = fromString("PartiallyConnected");

    /** Static value Connected for SecurityPartnerProviderConnectionStatus. */
    public static final SecurityPartnerProviderConnectionStatus CONNECTED = fromString("Connected");

    /** Static value NotConnected for SecurityPartnerProviderConnectionStatus. */
    public static final SecurityPartnerProviderConnectionStatus NOT_CONNECTED = fromString("NotConnected");

    /**
     * Creates or finds a SecurityPartnerProviderConnectionStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SecurityPartnerProviderConnectionStatus.
     */
    @JsonCreator
    public static SecurityPartnerProviderConnectionStatus fromString(String name) {
        return fromString(name, SecurityPartnerProviderConnectionStatus.class);
    }

    /**
     * Gets known SecurityPartnerProviderConnectionStatus values.
     *
     * @return known SecurityPartnerProviderConnectionStatus values.
     */
    public static Collection<SecurityPartnerProviderConnectionStatus> values() {
        return values(SecurityPartnerProviderConnectionStatus.class);
    }
}
