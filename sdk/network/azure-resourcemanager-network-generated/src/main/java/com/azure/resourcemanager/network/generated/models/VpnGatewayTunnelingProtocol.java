// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VpnGatewayTunnelingProtocol. */
public final class VpnGatewayTunnelingProtocol extends ExpandableStringEnum<VpnGatewayTunnelingProtocol> {
    /** Static value IkeV2 for VpnGatewayTunnelingProtocol. */
    public static final VpnGatewayTunnelingProtocol IKE_V2 = fromString("IkeV2");

    /** Static value OpenVPN for VpnGatewayTunnelingProtocol. */
    public static final VpnGatewayTunnelingProtocol OPEN_VPN = fromString("OpenVPN");

    /**
     * Creates or finds a VpnGatewayTunnelingProtocol from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VpnGatewayTunnelingProtocol.
     */
    @JsonCreator
    public static VpnGatewayTunnelingProtocol fromString(String name) {
        return fromString(name, VpnGatewayTunnelingProtocol.class);
    }

    /**
     * Gets known VpnGatewayTunnelingProtocol values.
     *
     * @return known VpnGatewayTunnelingProtocol values.
     */
    public static Collection<VpnGatewayTunnelingProtocol> values() {
        return values(VpnGatewayTunnelingProtocol.class);
    }
}
