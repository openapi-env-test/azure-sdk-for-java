// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetPublicIpAddressConfigurationProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a virtual machines scale set IP Configuration's PublicIPAddress configuration. */
@Fluent
public final class VirtualMachineScaleSetPublicIpAddressConfiguration {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetPublicIpAddressConfiguration.class);

    /*
     * The publicIP address configuration name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Describes a virtual machines scale set IP Configuration's
     * PublicIPAddress configuration
     */
    @JsonProperty(value = "properties")
    private VirtualMachineScaleSetPublicIpAddressConfigurationProperties innerProperties;

    /*
     * Describes the public IP Sku
     */
    @JsonProperty(value = "sku")
    private PublicIpAddressSku sku;

    /**
     * Get the name property: The publicIP address configuration name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The publicIP address configuration name.
     *
     * @param name the name value to set.
     * @return the VirtualMachineScaleSetPublicIpAddressConfiguration object itself.
     */
    public VirtualMachineScaleSetPublicIpAddressConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: Describes a virtual machines scale set IP Configuration's PublicIPAddress
     * configuration.
     *
     * @return the innerProperties value.
     */
    private VirtualMachineScaleSetPublicIpAddressConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sku property: Describes the public IP Sku.
     *
     * @return the sku value.
     */
    public PublicIpAddressSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Describes the public IP Sku.
     *
     * @param sku the sku value to set.
     * @return the VirtualMachineScaleSetPublicIpAddressConfiguration object itself.
     */
    public VirtualMachineScaleSetPublicIpAddressConfiguration withSku(PublicIpAddressSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the idleTimeoutInMinutes property: The idle timeout of the public IP address.
     *
     * @return the idleTimeoutInMinutes value.
     */
    public Integer idleTimeoutInMinutes() {
        return this.innerProperties() == null ? null : this.innerProperties().idleTimeoutInMinutes();
    }

    /**
     * Set the idleTimeoutInMinutes property: The idle timeout of the public IP address.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the VirtualMachineScaleSetPublicIpAddressConfiguration object itself.
     */
    public VirtualMachineScaleSetPublicIpAddressConfiguration withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetPublicIpAddressConfigurationProperties();
        }
        this.innerProperties().withIdleTimeoutInMinutes(idleTimeoutInMinutes);
        return this;
    }

    /**
     * Get the dnsSettings property: The dns settings to be applied on the publicIP addresses .
     *
     * @return the dnsSettings value.
     */
    public VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings dnsSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsSettings();
    }

    /**
     * Set the dnsSettings property: The dns settings to be applied on the publicIP addresses .
     *
     * @param dnsSettings the dnsSettings value to set.
     * @return the VirtualMachineScaleSetPublicIpAddressConfiguration object itself.
     */
    public VirtualMachineScaleSetPublicIpAddressConfiguration withDnsSettings(
        VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings dnsSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetPublicIpAddressConfigurationProperties();
        }
        this.innerProperties().withDnsSettings(dnsSettings);
        return this;
    }

    /**
     * Get the ipTags property: The list of IP tags associated with the public IP address.
     *
     * @return the ipTags value.
     */
    public List<VirtualMachineScaleSetIpTag> ipTags() {
        return this.innerProperties() == null ? null : this.innerProperties().ipTags();
    }

    /**
     * Set the ipTags property: The list of IP tags associated with the public IP address.
     *
     * @param ipTags the ipTags value to set.
     * @return the VirtualMachineScaleSetPublicIpAddressConfiguration object itself.
     */
    public VirtualMachineScaleSetPublicIpAddressConfiguration withIpTags(List<VirtualMachineScaleSetIpTag> ipTags) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetPublicIpAddressConfigurationProperties();
        }
        this.innerProperties().withIpTags(ipTags);
        return this;
    }

    /**
     * Get the publicIpPrefix property: The PublicIPPrefix from which to allocate publicIP addresses.
     *
     * @return the publicIpPrefix value.
     */
    public SubResource publicIpPrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpPrefix();
    }

    /**
     * Set the publicIpPrefix property: The PublicIPPrefix from which to allocate publicIP addresses.
     *
     * @param publicIpPrefix the publicIpPrefix value to set.
     * @return the VirtualMachineScaleSetPublicIpAddressConfiguration object itself.
     */
    public VirtualMachineScaleSetPublicIpAddressConfiguration withPublicIpPrefix(SubResource publicIpPrefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetPublicIpAddressConfigurationProperties();
        }
        this.innerProperties().withPublicIpPrefix(publicIpPrefix);
        return this;
    }

    /**
     * Get the publicIpAddressVersion property: Available from Api-Version 2019-07-01 onwards, it represents whether the
     * specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     *
     * @return the publicIpAddressVersion value.
     */
    public IpVersion publicIpAddressVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpAddressVersion();
    }

    /**
     * Set the publicIpAddressVersion property: Available from Api-Version 2019-07-01 onwards, it represents whether the
     * specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     *
     * @param publicIpAddressVersion the publicIpAddressVersion value to set.
     * @return the VirtualMachineScaleSetPublicIpAddressConfiguration object itself.
     */
    public VirtualMachineScaleSetPublicIpAddressConfiguration withPublicIpAddressVersion(
        IpVersion publicIpAddressVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetPublicIpAddressConfigurationProperties();
        }
        this.innerProperties().withPublicIpAddressVersion(publicIpAddressVersion);
        return this;
    }

    /**
     * Get the deleteOption property: Specify what happens to the public IP when the VM is deleted.
     *
     * @return the deleteOption value.
     */
    public DeleteOptions deleteOption() {
        return this.innerProperties() == null ? null : this.innerProperties().deleteOption();
    }

    /**
     * Set the deleteOption property: Specify what happens to the public IP when the VM is deleted.
     *
     * @param deleteOption the deleteOption value to set.
     * @return the VirtualMachineScaleSetPublicIpAddressConfiguration object itself.
     */
    public VirtualMachineScaleSetPublicIpAddressConfiguration withDeleteOption(DeleteOptions deleteOption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetPublicIpAddressConfigurationProperties();
        }
        this.innerProperties().withDeleteOption(deleteOption);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model VirtualMachineScaleSetPublicIpAddressConfiguration"));
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }
}
