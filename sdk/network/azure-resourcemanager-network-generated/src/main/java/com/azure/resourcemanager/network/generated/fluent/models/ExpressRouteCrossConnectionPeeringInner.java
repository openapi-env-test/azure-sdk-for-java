// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitPeeringConfig;
import com.azure.resourcemanager.network.generated.models.ExpressRoutePeeringState;
import com.azure.resourcemanager.network.generated.models.ExpressRoutePeeringType;
import com.azure.resourcemanager.network.generated.models.Ipv6ExpressRouteCircuitPeeringConfig;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Peering in an ExpressRoute Cross Connection resource. */
@Fluent
public final class ExpressRouteCrossConnectionPeeringInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteCrossConnectionPeeringInner.class);

    /*
     * Properties of the express route cross connection peering.
     */
    @JsonProperty(value = "properties")
    private ExpressRouteCrossConnectionPeeringProperties innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the innerProperties property: Properties of the express route cross connection peering.
     *
     * @return the innerProperties value.
     */
    private ExpressRouteCrossConnectionPeeringProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the ExpressRouteCrossConnectionPeeringInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /** {@inheritDoc} */
    @Override
    public ExpressRouteCrossConnectionPeeringInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the peeringType property: The peering type.
     *
     * @return the peeringType value.
     */
    public ExpressRoutePeeringType peeringType() {
        return this.innerProperties() == null ? null : this.innerProperties().peeringType();
    }

    /**
     * Set the peeringType property: The peering type.
     *
     * @param peeringType the peeringType value to set.
     * @return the ExpressRouteCrossConnectionPeeringInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringInner withPeeringType(ExpressRoutePeeringType peeringType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCrossConnectionPeeringProperties();
        }
        this.innerProperties().withPeeringType(peeringType);
        return this;
    }

    /**
     * Get the state property: The peering state.
     *
     * @return the state value.
     */
    public ExpressRoutePeeringState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: The peering state.
     *
     * @param state the state value to set.
     * @return the ExpressRouteCrossConnectionPeeringInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringInner withState(ExpressRoutePeeringState state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCrossConnectionPeeringProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Get the azureAsn property: The Azure ASN.
     *
     * @return the azureAsn value.
     */
    public Integer azureAsn() {
        return this.innerProperties() == null ? null : this.innerProperties().azureAsn();
    }

    /**
     * Get the peerAsn property: The peer ASN.
     *
     * @return the peerAsn value.
     */
    public Long peerAsn() {
        return this.innerProperties() == null ? null : this.innerProperties().peerAsn();
    }

    /**
     * Set the peerAsn property: The peer ASN.
     *
     * @param peerAsn the peerAsn value to set.
     * @return the ExpressRouteCrossConnectionPeeringInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringInner withPeerAsn(Long peerAsn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCrossConnectionPeeringProperties();
        }
        this.innerProperties().withPeerAsn(peerAsn);
        return this;
    }

    /**
     * Get the primaryPeerAddressPrefix property: The primary address prefix.
     *
     * @return the primaryPeerAddressPrefix value.
     */
    public String primaryPeerAddressPrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().primaryPeerAddressPrefix();
    }

    /**
     * Set the primaryPeerAddressPrefix property: The primary address prefix.
     *
     * @param primaryPeerAddressPrefix the primaryPeerAddressPrefix value to set.
     * @return the ExpressRouteCrossConnectionPeeringInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringInner withPrimaryPeerAddressPrefix(String primaryPeerAddressPrefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCrossConnectionPeeringProperties();
        }
        this.innerProperties().withPrimaryPeerAddressPrefix(primaryPeerAddressPrefix);
        return this;
    }

    /**
     * Get the secondaryPeerAddressPrefix property: The secondary address prefix.
     *
     * @return the secondaryPeerAddressPrefix value.
     */
    public String secondaryPeerAddressPrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().secondaryPeerAddressPrefix();
    }

    /**
     * Set the secondaryPeerAddressPrefix property: The secondary address prefix.
     *
     * @param secondaryPeerAddressPrefix the secondaryPeerAddressPrefix value to set.
     * @return the ExpressRouteCrossConnectionPeeringInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringInner withSecondaryPeerAddressPrefix(String secondaryPeerAddressPrefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCrossConnectionPeeringProperties();
        }
        this.innerProperties().withSecondaryPeerAddressPrefix(secondaryPeerAddressPrefix);
        return this;
    }

    /**
     * Get the primaryAzurePort property: The primary port.
     *
     * @return the primaryAzurePort value.
     */
    public String primaryAzurePort() {
        return this.innerProperties() == null ? null : this.innerProperties().primaryAzurePort();
    }

    /**
     * Get the secondaryAzurePort property: The secondary port.
     *
     * @return the secondaryAzurePort value.
     */
    public String secondaryAzurePort() {
        return this.innerProperties() == null ? null : this.innerProperties().secondaryAzurePort();
    }

    /**
     * Get the sharedKey property: The shared key.
     *
     * @return the sharedKey value.
     */
    public String sharedKey() {
        return this.innerProperties() == null ? null : this.innerProperties().sharedKey();
    }

    /**
     * Set the sharedKey property: The shared key.
     *
     * @param sharedKey the sharedKey value to set.
     * @return the ExpressRouteCrossConnectionPeeringInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringInner withSharedKey(String sharedKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCrossConnectionPeeringProperties();
        }
        this.innerProperties().withSharedKey(sharedKey);
        return this;
    }

    /**
     * Get the vlanId property: The VLAN ID.
     *
     * @return the vlanId value.
     */
    public Integer vlanId() {
        return this.innerProperties() == null ? null : this.innerProperties().vlanId();
    }

    /**
     * Set the vlanId property: The VLAN ID.
     *
     * @param vlanId the vlanId value to set.
     * @return the ExpressRouteCrossConnectionPeeringInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringInner withVlanId(Integer vlanId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCrossConnectionPeeringProperties();
        }
        this.innerProperties().withVlanId(vlanId);
        return this;
    }

    /**
     * Get the microsoftPeeringConfig property: The Microsoft peering configuration.
     *
     * @return the microsoftPeeringConfig value.
     */
    public ExpressRouteCircuitPeeringConfig microsoftPeeringConfig() {
        return this.innerProperties() == null ? null : this.innerProperties().microsoftPeeringConfig();
    }

    /**
     * Set the microsoftPeeringConfig property: The Microsoft peering configuration.
     *
     * @param microsoftPeeringConfig the microsoftPeeringConfig value to set.
     * @return the ExpressRouteCrossConnectionPeeringInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringInner withMicrosoftPeeringConfig(
        ExpressRouteCircuitPeeringConfig microsoftPeeringConfig) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCrossConnectionPeeringProperties();
        }
        this.innerProperties().withMicrosoftPeeringConfig(microsoftPeeringConfig);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the express route cross connection peering
     * resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the gatewayManagerEtag property: The GatewayManager Etag.
     *
     * @return the gatewayManagerEtag value.
     */
    public String gatewayManagerEtag() {
        return this.innerProperties() == null ? null : this.innerProperties().gatewayManagerEtag();
    }

    /**
     * Set the gatewayManagerEtag property: The GatewayManager Etag.
     *
     * @param gatewayManagerEtag the gatewayManagerEtag value to set.
     * @return the ExpressRouteCrossConnectionPeeringInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringInner withGatewayManagerEtag(String gatewayManagerEtag) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCrossConnectionPeeringProperties();
        }
        this.innerProperties().withGatewayManagerEtag(gatewayManagerEtag);
        return this;
    }

    /**
     * Get the lastModifiedBy property: Who was the last to modify the peering.
     *
     * @return the lastModifiedBy value.
     */
    public String lastModifiedBy() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModifiedBy();
    }

    /**
     * Get the ipv6PeeringConfig property: The IPv6 peering configuration.
     *
     * @return the ipv6PeeringConfig value.
     */
    public Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig() {
        return this.innerProperties() == null ? null : this.innerProperties().ipv6PeeringConfig();
    }

    /**
     * Set the ipv6PeeringConfig property: The IPv6 peering configuration.
     *
     * @param ipv6PeeringConfig the ipv6PeeringConfig value to set.
     * @return the ExpressRouteCrossConnectionPeeringInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringInner withIpv6PeeringConfig(
        Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCrossConnectionPeeringProperties();
        }
        this.innerProperties().withIpv6PeeringConfig(ipv6PeeringConfig);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
