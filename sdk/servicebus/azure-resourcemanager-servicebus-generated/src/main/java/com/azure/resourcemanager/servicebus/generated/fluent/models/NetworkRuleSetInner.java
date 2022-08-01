// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.servicebus.generated.models.DefaultAction;
import com.azure.resourcemanager.servicebus.generated.models.NWRuleSetIpRules;
import com.azure.resourcemanager.servicebus.generated.models.NWRuleSetVirtualNetworkRules;
import com.azure.resourcemanager.servicebus.generated.models.PublicNetworkAccessFlag;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Description of NetworkRuleSet resource. */
@Fluent
public final class NetworkRuleSetInner extends ProxyResource {
    /*
     * NetworkRuleSet properties
     */
    @JsonProperty(value = "properties")
    private NetworkRuleSetProperties innerProperties;

    /*
     * The system meta data relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The geo-location where the resource lives
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * Get the innerProperties property: NetworkRuleSet properties.
     *
     * @return the innerProperties value.
     */
    private NetworkRuleSetProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the trustedServiceAccessEnabled property: Value that indicates whether Trusted Service Access is Enabled or
     * not.
     *
     * @return the trustedServiceAccessEnabled value.
     */
    public Boolean trustedServiceAccessEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().trustedServiceAccessEnabled();
    }

    /**
     * Set the trustedServiceAccessEnabled property: Value that indicates whether Trusted Service Access is Enabled or
     * not.
     *
     * @param trustedServiceAccessEnabled the trustedServiceAccessEnabled value to set.
     * @return the NetworkRuleSetInner object itself.
     */
    public NetworkRuleSetInner withTrustedServiceAccessEnabled(Boolean trustedServiceAccessEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkRuleSetProperties();
        }
        this.innerProperties().withTrustedServiceAccessEnabled(trustedServiceAccessEnabled);
        return this;
    }

    /**
     * Get the defaultAction property: Default Action for Network Rule Set.
     *
     * @return the defaultAction value.
     */
    public DefaultAction defaultAction() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultAction();
    }

    /**
     * Set the defaultAction property: Default Action for Network Rule Set.
     *
     * @param defaultAction the defaultAction value to set.
     * @return the NetworkRuleSetInner object itself.
     */
    public NetworkRuleSetInner withDefaultAction(DefaultAction defaultAction) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkRuleSetProperties();
        }
        this.innerProperties().withDefaultAction(defaultAction);
        return this;
    }

    /**
     * Get the virtualNetworkRules property: List VirtualNetwork Rules.
     *
     * @return the virtualNetworkRules value.
     */
    public List<NWRuleSetVirtualNetworkRules> virtualNetworkRules() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetworkRules();
    }

    /**
     * Set the virtualNetworkRules property: List VirtualNetwork Rules.
     *
     * @param virtualNetworkRules the virtualNetworkRules value to set.
     * @return the NetworkRuleSetInner object itself.
     */
    public NetworkRuleSetInner withVirtualNetworkRules(List<NWRuleSetVirtualNetworkRules> virtualNetworkRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkRuleSetProperties();
        }
        this.innerProperties().withVirtualNetworkRules(virtualNetworkRules);
        return this;
    }

    /**
     * Get the ipRules property: List of IpRules.
     *
     * @return the ipRules value.
     */
    public List<NWRuleSetIpRules> ipRules() {
        return this.innerProperties() == null ? null : this.innerProperties().ipRules();
    }

    /**
     * Set the ipRules property: List of IpRules.
     *
     * @param ipRules the ipRules value to set.
     * @return the NetworkRuleSetInner object itself.
     */
    public NetworkRuleSetInner withIpRules(List<NWRuleSetIpRules> ipRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkRuleSetProperties();
        }
        this.innerProperties().withIpRules(ipRules);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccessFlag publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the NetworkRuleSetInner object itself.
     */
    public NetworkRuleSetInner withPublicNetworkAccess(PublicNetworkAccessFlag publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkRuleSetProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
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
