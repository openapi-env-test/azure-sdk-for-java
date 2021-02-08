// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** VpnClientConnectionHealth properties. */
@Fluent
public final class VpnClientConnectionHealth {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VpnClientConnectionHealth.class);

    /*
     * Total of the Ingress Bytes Transferred in this P2S Vpn connection
     */
    @JsonProperty(value = "totalIngressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long totalIngressBytesTransferred;

    /*
     * Total of the Egress Bytes Transferred in this connection
     */
    @JsonProperty(value = "totalEgressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long totalEgressBytesTransferred;

    /*
     * The total of p2s vpn clients connected at this time to this
     * P2SVpnGateway.
     */
    @JsonProperty(value = "vpnClientConnectionsCount")
    private Integer vpnClientConnectionsCount;

    /*
     * List of allocated ip addresses to the connected p2s vpn clients.
     */
    @JsonProperty(value = "allocatedIpAddresses")
    private List<String> allocatedIpAddresses;

    /**
     * Get the totalIngressBytesTransferred property: Total of the Ingress Bytes Transferred in this P2S Vpn connection.
     *
     * @return the totalIngressBytesTransferred value.
     */
    public Long totalIngressBytesTransferred() {
        return this.totalIngressBytesTransferred;
    }

    /**
     * Get the totalEgressBytesTransferred property: Total of the Egress Bytes Transferred in this connection.
     *
     * @return the totalEgressBytesTransferred value.
     */
    public Long totalEgressBytesTransferred() {
        return this.totalEgressBytesTransferred;
    }

    /**
     * Get the vpnClientConnectionsCount property: The total of p2s vpn clients connected at this time to this
     * P2SVpnGateway.
     *
     * @return the vpnClientConnectionsCount value.
     */
    public Integer vpnClientConnectionsCount() {
        return this.vpnClientConnectionsCount;
    }

    /**
     * Set the vpnClientConnectionsCount property: The total of p2s vpn clients connected at this time to this
     * P2SVpnGateway.
     *
     * @param vpnClientConnectionsCount the vpnClientConnectionsCount value to set.
     * @return the VpnClientConnectionHealth object itself.
     */
    public VpnClientConnectionHealth withVpnClientConnectionsCount(Integer vpnClientConnectionsCount) {
        this.vpnClientConnectionsCount = vpnClientConnectionsCount;
        return this;
    }

    /**
     * Get the allocatedIpAddresses property: List of allocated ip addresses to the connected p2s vpn clients.
     *
     * @return the allocatedIpAddresses value.
     */
    public List<String> allocatedIpAddresses() {
        return this.allocatedIpAddresses;
    }

    /**
     * Set the allocatedIpAddresses property: List of allocated ip addresses to the connected p2s vpn clients.
     *
     * @param allocatedIpAddresses the allocatedIpAddresses value to set.
     * @return the VpnClientConnectionHealth object itself.
     */
    public VpnClientConnectionHealth withAllocatedIpAddresses(List<String> allocatedIpAddresses) {
        this.allocatedIpAddresses = allocatedIpAddresses;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
