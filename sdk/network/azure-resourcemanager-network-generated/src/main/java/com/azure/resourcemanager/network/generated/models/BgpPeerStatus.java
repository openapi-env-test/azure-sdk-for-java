// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** BGP peer status details. */
@Immutable
public final class BgpPeerStatus {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BgpPeerStatus.class);

    /*
     * The virtual network gateway's local address.
     */
    @JsonProperty(value = "localAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String localAddress;

    /*
     * The remote BGP peer.
     */
    @JsonProperty(value = "neighbor", access = JsonProperty.Access.WRITE_ONLY)
    private String neighbor;

    /*
     * The autonomous system number of the remote BGP peer.
     */
    @JsonProperty(value = "asn", access = JsonProperty.Access.WRITE_ONLY)
    private Integer asn;

    /*
     * The BGP peer state.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private BgpPeerState state;

    /*
     * For how long the peering has been up.
     */
    @JsonProperty(value = "connectedDuration", access = JsonProperty.Access.WRITE_ONLY)
    private String connectedDuration;

    /*
     * The number of routes learned from this peer.
     */
    @JsonProperty(value = "routesReceived", access = JsonProperty.Access.WRITE_ONLY)
    private Long routesReceived;

    /*
     * The number of BGP messages sent.
     */
    @JsonProperty(value = "messagesSent", access = JsonProperty.Access.WRITE_ONLY)
    private Long messagesSent;

    /*
     * The number of BGP messages received.
     */
    @JsonProperty(value = "messagesReceived", access = JsonProperty.Access.WRITE_ONLY)
    private Long messagesReceived;

    /**
     * Get the localAddress property: The virtual network gateway's local address.
     *
     * @return the localAddress value.
     */
    public String localAddress() {
        return this.localAddress;
    }

    /**
     * Get the neighbor property: The remote BGP peer.
     *
     * @return the neighbor value.
     */
    public String neighbor() {
        return this.neighbor;
    }

    /**
     * Get the asn property: The autonomous system number of the remote BGP peer.
     *
     * @return the asn value.
     */
    public Integer asn() {
        return this.asn;
    }

    /**
     * Get the state property: The BGP peer state.
     *
     * @return the state value.
     */
    public BgpPeerState state() {
        return this.state;
    }

    /**
     * Get the connectedDuration property: For how long the peering has been up.
     *
     * @return the connectedDuration value.
     */
    public String connectedDuration() {
        return this.connectedDuration;
    }

    /**
     * Get the routesReceived property: The number of routes learned from this peer.
     *
     * @return the routesReceived value.
     */
    public Long routesReceived() {
        return this.routesReceived;
    }

    /**
     * Get the messagesSent property: The number of BGP messages sent.
     *
     * @return the messagesSent value.
     */
    public Long messagesSent() {
        return this.messagesSent;
    }

    /**
     * Get the messagesReceived property: The number of BGP messages received.
     *
     * @return the messagesReceived value.
     */
    public Long messagesReceived() {
        return this.messagesReceived;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
