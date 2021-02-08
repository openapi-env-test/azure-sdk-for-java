// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** DNS settings of a network interface. */
@Fluent
public final class NetworkInterfaceDnsSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkInterfaceDnsSettings.class);

    /*
     * List of DNS servers IP addresses. Use 'AzureProvidedDNS' to switch to
     * azure provided DNS resolution. 'AzureProvidedDNS' value cannot be
     * combined with other IPs, it must be the only value in dnsServers
     * collection.
     */
    @JsonProperty(value = "dnsServers")
    private List<String> dnsServers;

    /*
     * If the VM that uses this NIC is part of an Availability Set, then this
     * list will have the union of all DNS servers from all NICs that are part
     * of the Availability Set. This property is what is configured on each of
     * those VMs.
     */
    @JsonProperty(value = "appliedDnsServers")
    private List<String> appliedDnsServers;

    /*
     * Relative DNS name for this NIC used for internal communications between
     * VMs in the same virtual network.
     */
    @JsonProperty(value = "internalDnsNameLabel")
    private String internalDnsNameLabel;

    /*
     * Fully qualified DNS name supporting internal communications between VMs
     * in the same virtual network.
     */
    @JsonProperty(value = "internalFqdn")
    private String internalFqdn;

    /*
     * Even if internalDnsNameLabel is not specified, a DNS entry is created
     * for the primary NIC of the VM. This DNS name can be constructed by
     * concatenating the VM name with the value of internalDomainNameSuffix.
     */
    @JsonProperty(value = "internalDomainNameSuffix")
    private String internalDomainNameSuffix;

    /**
     * Get the dnsServers property: List of DNS servers IP addresses. Use 'AzureProvidedDNS' to switch to azure provided
     * DNS resolution. 'AzureProvidedDNS' value cannot be combined with other IPs, it must be the only value in
     * dnsServers collection.
     *
     * @return the dnsServers value.
     */
    public List<String> dnsServers() {
        return this.dnsServers;
    }

    /**
     * Set the dnsServers property: List of DNS servers IP addresses. Use 'AzureProvidedDNS' to switch to azure provided
     * DNS resolution. 'AzureProvidedDNS' value cannot be combined with other IPs, it must be the only value in
     * dnsServers collection.
     *
     * @param dnsServers the dnsServers value to set.
     * @return the NetworkInterfaceDnsSettings object itself.
     */
    public NetworkInterfaceDnsSettings withDnsServers(List<String> dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }

    /**
     * Get the appliedDnsServers property: If the VM that uses this NIC is part of an Availability Set, then this list
     * will have the union of all DNS servers from all NICs that are part of the Availability Set. This property is what
     * is configured on each of those VMs.
     *
     * @return the appliedDnsServers value.
     */
    public List<String> appliedDnsServers() {
        return this.appliedDnsServers;
    }

    /**
     * Set the appliedDnsServers property: If the VM that uses this NIC is part of an Availability Set, then this list
     * will have the union of all DNS servers from all NICs that are part of the Availability Set. This property is what
     * is configured on each of those VMs.
     *
     * @param appliedDnsServers the appliedDnsServers value to set.
     * @return the NetworkInterfaceDnsSettings object itself.
     */
    public NetworkInterfaceDnsSettings withAppliedDnsServers(List<String> appliedDnsServers) {
        this.appliedDnsServers = appliedDnsServers;
        return this;
    }

    /**
     * Get the internalDnsNameLabel property: Relative DNS name for this NIC used for internal communications between
     * VMs in the same virtual network.
     *
     * @return the internalDnsNameLabel value.
     */
    public String internalDnsNameLabel() {
        return this.internalDnsNameLabel;
    }

    /**
     * Set the internalDnsNameLabel property: Relative DNS name for this NIC used for internal communications between
     * VMs in the same virtual network.
     *
     * @param internalDnsNameLabel the internalDnsNameLabel value to set.
     * @return the NetworkInterfaceDnsSettings object itself.
     */
    public NetworkInterfaceDnsSettings withInternalDnsNameLabel(String internalDnsNameLabel) {
        this.internalDnsNameLabel = internalDnsNameLabel;
        return this;
    }

    /**
     * Get the internalFqdn property: Fully qualified DNS name supporting internal communications between VMs in the
     * same virtual network.
     *
     * @return the internalFqdn value.
     */
    public String internalFqdn() {
        return this.internalFqdn;
    }

    /**
     * Set the internalFqdn property: Fully qualified DNS name supporting internal communications between VMs in the
     * same virtual network.
     *
     * @param internalFqdn the internalFqdn value to set.
     * @return the NetworkInterfaceDnsSettings object itself.
     */
    public NetworkInterfaceDnsSettings withInternalFqdn(String internalFqdn) {
        this.internalFqdn = internalFqdn;
        return this;
    }

    /**
     * Get the internalDomainNameSuffix property: Even if internalDnsNameLabel is not specified, a DNS entry is created
     * for the primary NIC of the VM. This DNS name can be constructed by concatenating the VM name with the value of
     * internalDomainNameSuffix.
     *
     * @return the internalDomainNameSuffix value.
     */
    public String internalDomainNameSuffix() {
        return this.internalDomainNameSuffix;
    }

    /**
     * Set the internalDomainNameSuffix property: Even if internalDnsNameLabel is not specified, a DNS entry is created
     * for the primary NIC of the VM. This DNS name can be constructed by concatenating the VM name with the value of
     * internalDomainNameSuffix.
     *
     * @param internalDomainNameSuffix the internalDomainNameSuffix value to set.
     * @return the NetworkInterfaceDnsSettings object itself.
     */
    public NetworkInterfaceDnsSettings withInternalDomainNameSuffix(String internalDomainNameSuffix) {
        this.internalDomainNameSuffix = internalDomainNameSuffix;
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
