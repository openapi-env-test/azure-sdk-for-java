// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** VPN authentication types enabled for the virtual network gateway. */
public final class VpnAuthenticationType extends ExpandableStringEnum<VpnAuthenticationType> {
    /** Static value Certificate for VpnAuthenticationType. */
    public static final VpnAuthenticationType CERTIFICATE = fromString("Certificate");

    /** Static value Radius for VpnAuthenticationType. */
    public static final VpnAuthenticationType RADIUS = fromString("Radius");

    /** Static value AAD for VpnAuthenticationType. */
    public static final VpnAuthenticationType AAD = fromString("AAD");

    /**
     * Creates a new instance of VpnAuthenticationType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VpnAuthenticationType() {
    }

    /**
     * Creates or finds a VpnAuthenticationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VpnAuthenticationType.
     */
    @JsonCreator
    public static VpnAuthenticationType fromString(String name) {
        return fromString(name, VpnAuthenticationType.class);
    }

    /**
     * Gets known VpnAuthenticationType values.
     *
     * @return known VpnAuthenticationType values.
     */
    public static Collection<VpnAuthenticationType> values() {
        return values(VpnAuthenticationType.class);
    }
}
