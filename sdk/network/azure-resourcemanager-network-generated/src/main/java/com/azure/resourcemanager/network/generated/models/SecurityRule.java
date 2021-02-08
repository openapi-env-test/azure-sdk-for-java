// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.SecurityRuleInner;
import java.util.List;

/** An immutable client-side representation of SecurityRule. */
public interface SecurityRule {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the description property: A description for this rule. Restricted to 140 chars.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the protocol property: Network protocol this rule applies to. Possible values are 'Tcp', 'Udp', and '*'.
     *
     * @return the protocol value.
     */
    SecurityRuleProtocol protocol();

    /**
     * Gets the sourcePortRange property: The source port or range. Integer or range between 0 and 65535. Asterisk '*'
     * can also be used to match all ports.
     *
     * @return the sourcePortRange value.
     */
    String sourcePortRange();

    /**
     * Gets the destinationPortRange property: The destination port or range. Integer or range between 0 and 65535.
     * Asterisk '*' can also be used to match all ports.
     *
     * @return the destinationPortRange value.
     */
    String destinationPortRange();

    /**
     * Gets the sourceAddressPrefix property: The CIDR or source IP range. Asterisk '*' can also be used to match all
     * source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used. If this
     * is an ingress rule, specifies where network traffic originates from.
     *
     * @return the sourceAddressPrefix value.
     */
    String sourceAddressPrefix();

    /**
     * Gets the sourceAddressPrefixes property: The CIDR or source IP ranges.
     *
     * @return the sourceAddressPrefixes value.
     */
    List<String> sourceAddressPrefixes();

    /**
     * Gets the sourceApplicationSecurityGroups property: The application security group specified as source.
     *
     * @return the sourceApplicationSecurityGroups value.
     */
    List<ApplicationSecurityGroup> sourceApplicationSecurityGroups();

    /**
     * Gets the destinationAddressPrefix property: The destination address prefix. CIDR or destination IP range.
     * Asterisk '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer'
     * and 'Internet' can also be used.
     *
     * @return the destinationAddressPrefix value.
     */
    String destinationAddressPrefix();

    /**
     * Gets the destinationAddressPrefixes property: The destination address prefixes. CIDR or destination IP ranges.
     *
     * @return the destinationAddressPrefixes value.
     */
    List<String> destinationAddressPrefixes();

    /**
     * Gets the destinationApplicationSecurityGroups property: The application security group specified as destination.
     *
     * @return the destinationApplicationSecurityGroups value.
     */
    List<ApplicationSecurityGroup> destinationApplicationSecurityGroups();

    /**
     * Gets the sourcePortRanges property: The source port ranges.
     *
     * @return the sourcePortRanges value.
     */
    List<String> sourcePortRanges();

    /**
     * Gets the destinationPortRanges property: The destination port ranges.
     *
     * @return the destinationPortRanges value.
     */
    List<String> destinationPortRanges();

    /**
     * Gets the access property: The network traffic is allowed or denied. Possible values are: 'Allow' and 'Deny'.
     *
     * @return the access value.
     */
    SecurityRuleAccess access();

    /**
     * Gets the priority property: The priority of the rule. The value can be between 100 and 4096. The priority number
     * must be unique for each rule in the collection. The lower the priority number, the higher the priority of the
     * rule.
     *
     * @return the priority value.
     */
    Integer priority();

    /**
     * Gets the direction property: The direction of the rule. The direction specifies if rule will be evaluated on
     * incoming or outgoing traffic. Possible values are: 'Inbound' and 'Outbound'.
     *
     * @return the direction value.
     */
    SecurityRuleDirection direction();

    /**
     * Gets the provisioningState property: The provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.SecurityRuleInner object.
     *
     * @return the inner object.
     */
    SecurityRuleInner innerModel();
}
