// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.SecurityRuleAccess;
import com.azure.resourcemanager.network.generated.models.SecurityRuleDirection;
import com.azure.resourcemanager.network.generated.models.SecurityRuleProtocol;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Security rule resource. */
@Fluent
public final class SecurityRulePropertiesFormat {
    /*
     * A description for this rule. Restricted to 140 chars.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Network protocol this rule applies to.
     */
    @JsonProperty(value = "protocol", required = true)
    private SecurityRuleProtocol protocol;

    /*
     * The source port or range. Integer or range between 0 and 65535. Asterisk
     * '*' can also be used to match all ports.
     */
    @JsonProperty(value = "sourcePortRange")
    private String sourcePortRange;

    /*
     * The destination port or range. Integer or range between 0 and 65535.
     * Asterisk '*' can also be used to match all ports.
     */
    @JsonProperty(value = "destinationPortRange")
    private String destinationPortRange;

    /*
     * The CIDR or source IP range. Asterisk '*' can also be used to match all
     * source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer'
     * and 'Internet' can also be used. If this is an ingress rule, specifies
     * where network traffic originates from.
     */
    @JsonProperty(value = "sourceAddressPrefix")
    private String sourceAddressPrefix;

    /*
     * The CIDR or source IP ranges.
     */
    @JsonProperty(value = "sourceAddressPrefixes")
    private List<String> sourceAddressPrefixes;

    /*
     * The application security group specified as source.
     */
    @JsonProperty(value = "sourceApplicationSecurityGroups")
    private List<ApplicationSecurityGroupInner> sourceApplicationSecurityGroups;

    /*
     * The destination address prefix. CIDR or destination IP range. Asterisk
     * '*' can also be used to match all source IPs. Default tags such as
     * 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used.
     */
    @JsonProperty(value = "destinationAddressPrefix")
    private String destinationAddressPrefix;

    /*
     * The destination address prefixes. CIDR or destination IP ranges.
     */
    @JsonProperty(value = "destinationAddressPrefixes")
    private List<String> destinationAddressPrefixes;

    /*
     * The application security group specified as destination.
     */
    @JsonProperty(value = "destinationApplicationSecurityGroups")
    private List<ApplicationSecurityGroupInner> destinationApplicationSecurityGroups;

    /*
     * The source port ranges.
     */
    @JsonProperty(value = "sourcePortRanges")
    private List<String> sourcePortRanges;

    /*
     * The destination port ranges.
     */
    @JsonProperty(value = "destinationPortRanges")
    private List<String> destinationPortRanges;

    /*
     * The network traffic is allowed or denied.
     */
    @JsonProperty(value = "access", required = true)
    private SecurityRuleAccess access;

    /*
     * The priority of the rule. The value can be between 100 and 4096. The
     * priority number must be unique for each rule in the collection. The
     * lower the priority number, the higher the priority of the rule.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /*
     * The direction of the rule. The direction specifies if rule will be
     * evaluated on incoming or outgoing traffic.
     */
    @JsonProperty(value = "direction", required = true)
    private SecurityRuleDirection direction;

    /*
     * The provisioning state of the security rule resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the description property: A description for this rule. Restricted to 140 chars.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description for this rule. Restricted to 140 chars.
     *
     * @param description the description value to set.
     * @return the SecurityRulePropertiesFormat object itself.
     */
    public SecurityRulePropertiesFormat withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the protocol property: Network protocol this rule applies to.
     *
     * @return the protocol value.
     */
    public SecurityRuleProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Network protocol this rule applies to.
     *
     * @param protocol the protocol value to set.
     * @return the SecurityRulePropertiesFormat object itself.
     */
    public SecurityRulePropertiesFormat withProtocol(SecurityRuleProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the sourcePortRange property: The source port or range. Integer or range between 0 and 65535. Asterisk '*'
     * can also be used to match all ports.
     *
     * @return the sourcePortRange value.
     */
    public String sourcePortRange() {
        return this.sourcePortRange;
    }

    /**
     * Set the sourcePortRange property: The source port or range. Integer or range between 0 and 65535. Asterisk '*'
     * can also be used to match all ports.
     *
     * @param sourcePortRange the sourcePortRange value to set.
     * @return the SecurityRulePropertiesFormat object itself.
     */
    public SecurityRulePropertiesFormat withSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }

    /**
     * Get the destinationPortRange property: The destination port or range. Integer or range between 0 and 65535.
     * Asterisk '*' can also be used to match all ports.
     *
     * @return the destinationPortRange value.
     */
    public String destinationPortRange() {
        return this.destinationPortRange;
    }

    /**
     * Set the destinationPortRange property: The destination port or range. Integer or range between 0 and 65535.
     * Asterisk '*' can also be used to match all ports.
     *
     * @param destinationPortRange the destinationPortRange value to set.
     * @return the SecurityRulePropertiesFormat object itself.
     */
    public SecurityRulePropertiesFormat withDestinationPortRange(String destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
        return this;
    }

    /**
     * Get the sourceAddressPrefix property: The CIDR or source IP range. Asterisk '*' can also be used to match all
     * source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used. If this
     * is an ingress rule, specifies where network traffic originates from.
     *
     * @return the sourceAddressPrefix value.
     */
    public String sourceAddressPrefix() {
        return this.sourceAddressPrefix;
    }

    /**
     * Set the sourceAddressPrefix property: The CIDR or source IP range. Asterisk '*' can also be used to match all
     * source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used. If this
     * is an ingress rule, specifies where network traffic originates from.
     *
     * @param sourceAddressPrefix the sourceAddressPrefix value to set.
     * @return the SecurityRulePropertiesFormat object itself.
     */
    public SecurityRulePropertiesFormat withSourceAddressPrefix(String sourceAddressPrefix) {
        this.sourceAddressPrefix = sourceAddressPrefix;
        return this;
    }

    /**
     * Get the sourceAddressPrefixes property: The CIDR or source IP ranges.
     *
     * @return the sourceAddressPrefixes value.
     */
    public List<String> sourceAddressPrefixes() {
        return this.sourceAddressPrefixes;
    }

    /**
     * Set the sourceAddressPrefixes property: The CIDR or source IP ranges.
     *
     * @param sourceAddressPrefixes the sourceAddressPrefixes value to set.
     * @return the SecurityRulePropertiesFormat object itself.
     */
    public SecurityRulePropertiesFormat withSourceAddressPrefixes(List<String> sourceAddressPrefixes) {
        this.sourceAddressPrefixes = sourceAddressPrefixes;
        return this;
    }

    /**
     * Get the sourceApplicationSecurityGroups property: The application security group specified as source.
     *
     * @return the sourceApplicationSecurityGroups value.
     */
    public List<ApplicationSecurityGroupInner> sourceApplicationSecurityGroups() {
        return this.sourceApplicationSecurityGroups;
    }

    /**
     * Set the sourceApplicationSecurityGroups property: The application security group specified as source.
     *
     * @param sourceApplicationSecurityGroups the sourceApplicationSecurityGroups value to set.
     * @return the SecurityRulePropertiesFormat object itself.
     */
    public SecurityRulePropertiesFormat withSourceApplicationSecurityGroups(
        List<ApplicationSecurityGroupInner> sourceApplicationSecurityGroups) {
        this.sourceApplicationSecurityGroups = sourceApplicationSecurityGroups;
        return this;
    }

    /**
     * Get the destinationAddressPrefix property: The destination address prefix. CIDR or destination IP range. Asterisk
     * '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and
     * 'Internet' can also be used.
     *
     * @return the destinationAddressPrefix value.
     */
    public String destinationAddressPrefix() {
        return this.destinationAddressPrefix;
    }

    /**
     * Set the destinationAddressPrefix property: The destination address prefix. CIDR or destination IP range. Asterisk
     * '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and
     * 'Internet' can also be used.
     *
     * @param destinationAddressPrefix the destinationAddressPrefix value to set.
     * @return the SecurityRulePropertiesFormat object itself.
     */
    public SecurityRulePropertiesFormat withDestinationAddressPrefix(String destinationAddressPrefix) {
        this.destinationAddressPrefix = destinationAddressPrefix;
        return this;
    }

    /**
     * Get the destinationAddressPrefixes property: The destination address prefixes. CIDR or destination IP ranges.
     *
     * @return the destinationAddressPrefixes value.
     */
    public List<String> destinationAddressPrefixes() {
        return this.destinationAddressPrefixes;
    }

    /**
     * Set the destinationAddressPrefixes property: The destination address prefixes. CIDR or destination IP ranges.
     *
     * @param destinationAddressPrefixes the destinationAddressPrefixes value to set.
     * @return the SecurityRulePropertiesFormat object itself.
     */
    public SecurityRulePropertiesFormat withDestinationAddressPrefixes(List<String> destinationAddressPrefixes) {
        this.destinationAddressPrefixes = destinationAddressPrefixes;
        return this;
    }

    /**
     * Get the destinationApplicationSecurityGroups property: The application security group specified as destination.
     *
     * @return the destinationApplicationSecurityGroups value.
     */
    public List<ApplicationSecurityGroupInner> destinationApplicationSecurityGroups() {
        return this.destinationApplicationSecurityGroups;
    }

    /**
     * Set the destinationApplicationSecurityGroups property: The application security group specified as destination.
     *
     * @param destinationApplicationSecurityGroups the destinationApplicationSecurityGroups value to set.
     * @return the SecurityRulePropertiesFormat object itself.
     */
    public SecurityRulePropertiesFormat withDestinationApplicationSecurityGroups(
        List<ApplicationSecurityGroupInner> destinationApplicationSecurityGroups) {
        this.destinationApplicationSecurityGroups = destinationApplicationSecurityGroups;
        return this;
    }

    /**
     * Get the sourcePortRanges property: The source port ranges.
     *
     * @return the sourcePortRanges value.
     */
    public List<String> sourcePortRanges() {
        return this.sourcePortRanges;
    }

    /**
     * Set the sourcePortRanges property: The source port ranges.
     *
     * @param sourcePortRanges the sourcePortRanges value to set.
     * @return the SecurityRulePropertiesFormat object itself.
     */
    public SecurityRulePropertiesFormat withSourcePortRanges(List<String> sourcePortRanges) {
        this.sourcePortRanges = sourcePortRanges;
        return this;
    }

    /**
     * Get the destinationPortRanges property: The destination port ranges.
     *
     * @return the destinationPortRanges value.
     */
    public List<String> destinationPortRanges() {
        return this.destinationPortRanges;
    }

    /**
     * Set the destinationPortRanges property: The destination port ranges.
     *
     * @param destinationPortRanges the destinationPortRanges value to set.
     * @return the SecurityRulePropertiesFormat object itself.
     */
    public SecurityRulePropertiesFormat withDestinationPortRanges(List<String> destinationPortRanges) {
        this.destinationPortRanges = destinationPortRanges;
        return this;
    }

    /**
     * Get the access property: The network traffic is allowed or denied.
     *
     * @return the access value.
     */
    public SecurityRuleAccess access() {
        return this.access;
    }

    /**
     * Set the access property: The network traffic is allowed or denied.
     *
     * @param access the access value to set.
     * @return the SecurityRulePropertiesFormat object itself.
     */
    public SecurityRulePropertiesFormat withAccess(SecurityRuleAccess access) {
        this.access = access;
        return this;
    }

    /**
     * Get the priority property: The priority of the rule. The value can be between 100 and 4096. The priority number
     * must be unique for each rule in the collection. The lower the priority number, the higher the priority of the
     * rule.
     *
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: The priority of the rule. The value can be between 100 and 4096. The priority number
     * must be unique for each rule in the collection. The lower the priority number, the higher the priority of the
     * rule.
     *
     * @param priority the priority value to set.
     * @return the SecurityRulePropertiesFormat object itself.
     */
    public SecurityRulePropertiesFormat withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the direction property: The direction of the rule. The direction specifies if rule will be evaluated on
     * incoming or outgoing traffic.
     *
     * @return the direction value.
     */
    public SecurityRuleDirection direction() {
        return this.direction;
    }

    /**
     * Set the direction property: The direction of the rule. The direction specifies if rule will be evaluated on
     * incoming or outgoing traffic.
     *
     * @param direction the direction value to set.
     * @return the SecurityRulePropertiesFormat object itself.
     */
    public SecurityRulePropertiesFormat withDirection(SecurityRuleDirection direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the security rule resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (protocol() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property protocol in model SecurityRulePropertiesFormat"));
        }
        if (sourceApplicationSecurityGroups() != null) {
            sourceApplicationSecurityGroups().forEach(e -> e.validate());
        }
        if (destinationApplicationSecurityGroups() != null) {
            destinationApplicationSecurityGroups().forEach(e -> e.validate());
        }
        if (access() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property access in model SecurityRulePropertiesFormat"));
        }
        if (direction() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property direction in model SecurityRulePropertiesFormat"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SecurityRulePropertiesFormat.class);
}
