// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.AddressSpace;
import com.azure.resourcemanager.network.generated.models.BgpSettings;
import com.azure.resourcemanager.network.generated.models.DeviceProperties;
import com.azure.resourcemanager.network.generated.models.O365PolicyProperties;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** VpnSite Resource. */
@Fluent
public final class VpnSiteInner extends Resource {
    /*
     * Properties of the VPN site.
     */
    @JsonProperty(value = "properties")
    private VpnSiteProperties innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the innerProperties property: Properties of the VPN site.
     *
     * @return the innerProperties value.
     */
    private VpnSiteProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VpnSiteInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VpnSiteInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the virtualWan property: The VirtualWAN to which the vpnSite belongs.
     *
     * @return the virtualWan value.
     */
    public SubResource virtualWan() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualWan();
    }

    /**
     * Set the virtualWan property: The VirtualWAN to which the vpnSite belongs.
     *
     * @param virtualWan the virtualWan value to set.
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withVirtualWan(SubResource virtualWan) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnSiteProperties();
        }
        this.innerProperties().withVirtualWan(virtualWan);
        return this;
    }

    /**
     * Get the deviceProperties property: The device properties.
     *
     * @return the deviceProperties value.
     */
    public DeviceProperties deviceProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().deviceProperties();
    }

    /**
     * Set the deviceProperties property: The device properties.
     *
     * @param deviceProperties the deviceProperties value to set.
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withDeviceProperties(DeviceProperties deviceProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnSiteProperties();
        }
        this.innerProperties().withDeviceProperties(deviceProperties);
        return this;
    }

    /**
     * Get the ipAddress property: The ip-address for the vpn-site.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().ipAddress();
    }

    /**
     * Set the ipAddress property: The ip-address for the vpn-site.
     *
     * @param ipAddress the ipAddress value to set.
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withIpAddress(String ipAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnSiteProperties();
        }
        this.innerProperties().withIpAddress(ipAddress);
        return this;
    }

    /**
     * Get the siteKey property: The key for vpn-site that can be used for connections.
     *
     * @return the siteKey value.
     */
    public String siteKey() {
        return this.innerProperties() == null ? null : this.innerProperties().siteKey();
    }

    /**
     * Set the siteKey property: The key for vpn-site that can be used for connections.
     *
     * @param siteKey the siteKey value to set.
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withSiteKey(String siteKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnSiteProperties();
        }
        this.innerProperties().withSiteKey(siteKey);
        return this;
    }

    /**
     * Get the addressSpace property: The AddressSpace that contains an array of IP address ranges.
     *
     * @return the addressSpace value.
     */
    public AddressSpace addressSpace() {
        return this.innerProperties() == null ? null : this.innerProperties().addressSpace();
    }

    /**
     * Set the addressSpace property: The AddressSpace that contains an array of IP address ranges.
     *
     * @param addressSpace the addressSpace value to set.
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withAddressSpace(AddressSpace addressSpace) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnSiteProperties();
        }
        this.innerProperties().withAddressSpace(addressSpace);
        return this;
    }

    /**
     * Get the bgpProperties property: The set of bgp properties.
     *
     * @return the bgpProperties value.
     */
    public BgpSettings bgpProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().bgpProperties();
    }

    /**
     * Set the bgpProperties property: The set of bgp properties.
     *
     * @param bgpProperties the bgpProperties value to set.
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withBgpProperties(BgpSettings bgpProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnSiteProperties();
        }
        this.innerProperties().withBgpProperties(bgpProperties);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VPN site resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the isSecuritySite property: IsSecuritySite flag.
     *
     * @return the isSecuritySite value.
     */
    public Boolean isSecuritySite() {
        return this.innerProperties() == null ? null : this.innerProperties().isSecuritySite();
    }

    /**
     * Set the isSecuritySite property: IsSecuritySite flag.
     *
     * @param isSecuritySite the isSecuritySite value to set.
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withIsSecuritySite(Boolean isSecuritySite) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnSiteProperties();
        }
        this.innerProperties().withIsSecuritySite(isSecuritySite);
        return this;
    }

    /**
     * Get the vpnSiteLinks property: List of all vpn site links.
     *
     * @return the vpnSiteLinks value.
     */
    public List<VpnSiteLinkInner> vpnSiteLinks() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnSiteLinks();
    }

    /**
     * Set the vpnSiteLinks property: List of all vpn site links.
     *
     * @param vpnSiteLinks the vpnSiteLinks value to set.
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withVpnSiteLinks(List<VpnSiteLinkInner> vpnSiteLinks) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnSiteProperties();
        }
        this.innerProperties().withVpnSiteLinks(vpnSiteLinks);
        return this;
    }

    /**
     * Get the o365Policy property: Office365 Policy.
     *
     * @return the o365Policy value.
     */
    public O365PolicyProperties o365Policy() {
        return this.innerProperties() == null ? null : this.innerProperties().o365Policy();
    }

    /**
     * Set the o365Policy property: Office365 Policy.
     *
     * @param o365Policy the o365Policy value to set.
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withO365Policy(O365PolicyProperties o365Policy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnSiteProperties();
        }
        this.innerProperties().withO365Policy(o365Policy);
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
