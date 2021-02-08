// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** IP security restriction on an app. */
@Fluent
public final class IpSecurityRestriction {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IpSecurityRestriction.class);

    /*
     * IP address the security restriction is valid for.
     * It can be in form of pure ipv4 address (required SubnetMask property) or
     * CIDR notation such as ipv4/mask (leading bit match). For CIDR,
     * SubnetMask property must not be specified.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /*
     * Subnet mask for the range of IP addresses the restriction is valid for.
     */
    @JsonProperty(value = "subnetMask")
    private String subnetMask;

    /*
     * Virtual network resource id
     */
    @JsonProperty(value = "vnetSubnetResourceId")
    private String vnetSubnetResourceId;

    /*
     * (internal) Vnet traffic tag
     */
    @JsonProperty(value = "vnetTrafficTag")
    private Integer vnetTrafficTag;

    /*
     * (internal) Subnet traffic tag
     */
    @JsonProperty(value = "subnetTrafficTag")
    private Integer subnetTrafficTag;

    /*
     * Allow or Deny access for this IP range.
     */
    @JsonProperty(value = "action")
    private String action;

    /*
     * Defines what this IP filter will be used for. This is to support IP
     * filtering on proxies.
     */
    @JsonProperty(value = "tag")
    private IpFilterTag tag;

    /*
     * Priority of IP restriction rule.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /*
     * IP restriction rule name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * IP restriction rule description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the ipAddress property: IP address the security restriction is valid for. It can be in form of pure ipv4
     * address (required SubnetMask property) or CIDR notation such as ipv4/mask (leading bit match). For CIDR,
     * SubnetMask property must not be specified.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: IP address the security restriction is valid for. It can be in form of pure ipv4
     * address (required SubnetMask property) or CIDR notation such as ipv4/mask (leading bit match). For CIDR,
     * SubnetMask property must not be specified.
     *
     * @param ipAddress the ipAddress value to set.
     * @return the IpSecurityRestriction object itself.
     */
    public IpSecurityRestriction withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the subnetMask property: Subnet mask for the range of IP addresses the restriction is valid for.
     *
     * @return the subnetMask value.
     */
    public String subnetMask() {
        return this.subnetMask;
    }

    /**
     * Set the subnetMask property: Subnet mask for the range of IP addresses the restriction is valid for.
     *
     * @param subnetMask the subnetMask value to set.
     * @return the IpSecurityRestriction object itself.
     */
    public IpSecurityRestriction withSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
        return this;
    }

    /**
     * Get the vnetSubnetResourceId property: Virtual network resource id.
     *
     * @return the vnetSubnetResourceId value.
     */
    public String vnetSubnetResourceId() {
        return this.vnetSubnetResourceId;
    }

    /**
     * Set the vnetSubnetResourceId property: Virtual network resource id.
     *
     * @param vnetSubnetResourceId the vnetSubnetResourceId value to set.
     * @return the IpSecurityRestriction object itself.
     */
    public IpSecurityRestriction withVnetSubnetResourceId(String vnetSubnetResourceId) {
        this.vnetSubnetResourceId = vnetSubnetResourceId;
        return this;
    }

    /**
     * Get the vnetTrafficTag property: (internal) Vnet traffic tag.
     *
     * @return the vnetTrafficTag value.
     */
    public Integer vnetTrafficTag() {
        return this.vnetTrafficTag;
    }

    /**
     * Set the vnetTrafficTag property: (internal) Vnet traffic tag.
     *
     * @param vnetTrafficTag the vnetTrafficTag value to set.
     * @return the IpSecurityRestriction object itself.
     */
    public IpSecurityRestriction withVnetTrafficTag(Integer vnetTrafficTag) {
        this.vnetTrafficTag = vnetTrafficTag;
        return this;
    }

    /**
     * Get the subnetTrafficTag property: (internal) Subnet traffic tag.
     *
     * @return the subnetTrafficTag value.
     */
    public Integer subnetTrafficTag() {
        return this.subnetTrafficTag;
    }

    /**
     * Set the subnetTrafficTag property: (internal) Subnet traffic tag.
     *
     * @param subnetTrafficTag the subnetTrafficTag value to set.
     * @return the IpSecurityRestriction object itself.
     */
    public IpSecurityRestriction withSubnetTrafficTag(Integer subnetTrafficTag) {
        this.subnetTrafficTag = subnetTrafficTag;
        return this;
    }

    /**
     * Get the action property: Allow or Deny access for this IP range.
     *
     * @return the action value.
     */
    public String action() {
        return this.action;
    }

    /**
     * Set the action property: Allow or Deny access for this IP range.
     *
     * @param action the action value to set.
     * @return the IpSecurityRestriction object itself.
     */
    public IpSecurityRestriction withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Get the tag property: Defines what this IP filter will be used for. This is to support IP filtering on proxies.
     *
     * @return the tag value.
     */
    public IpFilterTag tag() {
        return this.tag;
    }

    /**
     * Set the tag property: Defines what this IP filter will be used for. This is to support IP filtering on proxies.
     *
     * @param tag the tag value to set.
     * @return the IpSecurityRestriction object itself.
     */
    public IpSecurityRestriction withTag(IpFilterTag tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get the priority property: Priority of IP restriction rule.
     *
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority of IP restriction rule.
     *
     * @param priority the priority value to set.
     * @return the IpSecurityRestriction object itself.
     */
    public IpSecurityRestriction withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the name property: IP restriction rule name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: IP restriction rule name.
     *
     * @param name the name value to set.
     * @return the IpSecurityRestriction object itself.
     */
    public IpSecurityRestriction withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: IP restriction rule description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: IP restriction rule description.
     *
     * @param description the description value to set.
     * @return the IpSecurityRestriction object itself.
     */
    public IpSecurityRestriction withDescription(String description) {
        this.description = description;
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
