// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Full view of network features for an app (presently VNET integration and Hybrid Connections). */
@JsonFlatten
@Immutable
public class NetworkFeaturesInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkFeaturesInner.class);

    /*
     * The Virtual Network name.
     */
    @JsonProperty(value = "properties.virtualNetworkName", access = JsonProperty.Access.WRITE_ONLY)
    private String virtualNetworkName;

    /*
     * The Virtual Network summary view.
     */
    @JsonProperty(value = "properties.virtualNetworkConnection", access = JsonProperty.Access.WRITE_ONLY)
    private VnetInfoInner virtualNetworkConnection;

    /*
     * The Hybrid Connections summary view.
     */
    @JsonProperty(value = "properties.hybridConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<RelayServiceConnectionEntityInner> hybridConnections;

    /*
     * The Hybrid Connection V2 (Service Bus) view.
     */
    @JsonProperty(value = "properties.hybridConnectionsV2", access = JsonProperty.Access.WRITE_ONLY)
    private List<HybridConnectionInner> hybridConnectionsV2;

    /**
     * Get the virtualNetworkName property: The Virtual Network name.
     *
     * @return the virtualNetworkName value.
     */
    public String virtualNetworkName() {
        return this.virtualNetworkName;
    }

    /**
     * Get the virtualNetworkConnection property: The Virtual Network summary view.
     *
     * @return the virtualNetworkConnection value.
     */
    public VnetInfoInner virtualNetworkConnection() {
        return this.virtualNetworkConnection;
    }

    /**
     * Get the hybridConnections property: The Hybrid Connections summary view.
     *
     * @return the hybridConnections value.
     */
    public List<RelayServiceConnectionEntityInner> hybridConnections() {
        return this.hybridConnections;
    }

    /**
     * Get the hybridConnectionsV2 property: The Hybrid Connection V2 (Service Bus) view.
     *
     * @return the hybridConnectionsV2 value.
     */
    public List<HybridConnectionInner> hybridConnectionsV2() {
        return this.hybridConnectionsV2;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkFeaturesInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (virtualNetworkConnection() != null) {
            virtualNetworkConnection().validate();
        }
        if (hybridConnections() != null) {
            hybridConnections().forEach(e -> e.validate());
        }
        if (hybridConnectionsV2() != null) {
            hybridConnectionsV2().forEach(e -> e.validate());
        }
    }
}
