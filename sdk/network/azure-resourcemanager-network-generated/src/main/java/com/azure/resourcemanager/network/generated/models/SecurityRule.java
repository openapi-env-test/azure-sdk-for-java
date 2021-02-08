// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.SecurityRuleInner;

/** An immutable client-side representation of SecurityRule. */
public interface SecurityRule {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Gets name of the resource that is unique within a resource group. This name can be used
     * to access the resource.
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
     * Gets the description property: Gets or sets a description for this rule. Restricted to 140 chars.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the protocol property: Gets or sets Network protocol this rule applies to. Can be Tcp, Udp or All(*).
     *
     * @return the protocol value.
     */
    SecurityRuleProtocol protocol();

    /**
     * Gets the sourcePortRange property: Gets or sets Source Port or Range. Integer or range between 0 and 65535.
     * Asterisk '*' can also be used to match all ports.
     *
     * @return the sourcePortRange value.
     */
    String sourcePortRange();

    /**
     * Gets the destinationPortRange property: Gets or sets Destination Port or Range. Integer or range between 0 and
     * 65535. Asterisk '*' can also be used to match all ports.
     *
     * @return the destinationPortRange value.
     */
    String destinationPortRange();

    /**
     * Gets the sourceAddressPrefix property: Gets or sets source address prefix. CIDR or source IP range. Asterisk '*'
     * can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and
     * 'Internet' can also be used. If this is an ingress rule, specifies where network traffic originates from.
     *
     * @return the sourceAddressPrefix value.
     */
    String sourceAddressPrefix();

    /**
     * Gets the destinationAddressPrefix property: Gets or sets destination address prefix. CIDR or source IP range.
     * Asterisk '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer'
     * and 'Internet' can also be used.
     *
     * @return the destinationAddressPrefix value.
     */
    String destinationAddressPrefix();

    /**
     * Gets the access property: Gets or sets network traffic is allowed or denied. Possible values are 'Allow' and
     * 'Deny'.
     *
     * @return the access value.
     */
    SecurityRuleAccess access();

    /**
     * Gets the priority property: Gets or sets the priority of the rule. The value can be between 100 and 4096. The
     * priority number must be unique for each rule in the collection. The lower the priority number, the higher the
     * priority of the rule.
     *
     * @return the priority value.
     */
    Integer priority();

    /**
     * Gets the direction property: Gets or sets the direction of the rule.InBound or Outbound. The direction specifies
     * if rule will be evaluated on incoming or outgoing traffic.
     *
     * @return the direction value.
     */
    SecurityRuleDirection direction();

    /**
     * Gets the provisioningState property: Gets or sets Provisioning state of the PublicIP resource
     * Updating/Deleting/Failed.
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
