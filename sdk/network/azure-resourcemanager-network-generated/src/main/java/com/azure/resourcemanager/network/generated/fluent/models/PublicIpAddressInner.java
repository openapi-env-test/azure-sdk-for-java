// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.DdosSettings;
import com.azure.resourcemanager.network.generated.models.IpAllocationMethod;
import com.azure.resourcemanager.network.generated.models.IpTag;
import com.azure.resourcemanager.network.generated.models.IpVersion;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.PublicIpAddressDnsSettings;
import com.azure.resourcemanager.network.generated.models.PublicIpAddressSku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Public IP address resource. */
@JsonFlatten
@Fluent
public class PublicIpAddressInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PublicIpAddressInner.class);

    /*
     * The public IP address SKU.
     */
    @JsonProperty(value = "sku")
    private PublicIpAddressSku sku;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * A list of availability zones denoting the IP allocated for the resource
     * needs to come from.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * The public IP address allocation method.
     */
    @JsonProperty(value = "properties.publicIPAllocationMethod")
    private IpAllocationMethod publicIpAllocationMethod;

    /*
     * The public IP address version.
     */
    @JsonProperty(value = "properties.publicIPAddressVersion")
    private IpVersion publicIpAddressVersion;

    /*
     * The IP configuration associated with the public IP address.
     */
    @JsonProperty(value = "properties.ipConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private IpConfigurationInner ipConfiguration;

    /*
     * The FQDN of the DNS record associated with the public IP address.
     */
    @JsonProperty(value = "properties.dnsSettings")
    private PublicIpAddressDnsSettings dnsSettings;

    /*
     * The DDoS protection custom policy associated with the public IP address.
     */
    @JsonProperty(value = "properties.ddosSettings")
    private DdosSettings ddosSettings;

    /*
     * The list of tags associated with the public IP address.
     */
    @JsonProperty(value = "properties.ipTags")
    private List<IpTag> ipTags;

    /*
     * The IP address associated with the public IP address resource.
     */
    @JsonProperty(value = "properties.ipAddress")
    private String ipAddress;

    /*
     * The Public IP Prefix this Public IP Address should be allocated from.
     */
    @JsonProperty(value = "properties.publicIPPrefix")
    private SubResource publicIpPrefix;

    /*
     * The idle timeout of the public IP address.
     */
    @JsonProperty(value = "properties.idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /*
     * The resource GUID property of the public IP address resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the public IP address resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the sku property: The public IP address SKU.
     *
     * @return the sku value.
     */
    public PublicIpAddressSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The public IP address SKU.
     *
     * @param sku the sku value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withSku(PublicIpAddressSku sku) {
        this.sku = sku;
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

    /**
     * Get the zones property: A list of availability zones denoting the IP allocated for the resource needs to come
     * from.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: A list of availability zones denoting the IP allocated for the resource needs to come
     * from.
     *
     * @param zones the zones value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the publicIpAllocationMethod property: The public IP address allocation method.
     *
     * @return the publicIpAllocationMethod value.
     */
    public IpAllocationMethod publicIpAllocationMethod() {
        return this.publicIpAllocationMethod;
    }

    /**
     * Set the publicIpAllocationMethod property: The public IP address allocation method.
     *
     * @param publicIpAllocationMethod the publicIpAllocationMethod value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withPublicIpAllocationMethod(IpAllocationMethod publicIpAllocationMethod) {
        this.publicIpAllocationMethod = publicIpAllocationMethod;
        return this;
    }

    /**
     * Get the publicIpAddressVersion property: The public IP address version.
     *
     * @return the publicIpAddressVersion value.
     */
    public IpVersion publicIpAddressVersion() {
        return this.publicIpAddressVersion;
    }

    /**
     * Set the publicIpAddressVersion property: The public IP address version.
     *
     * @param publicIpAddressVersion the publicIpAddressVersion value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withPublicIpAddressVersion(IpVersion publicIpAddressVersion) {
        this.publicIpAddressVersion = publicIpAddressVersion;
        return this;
    }

    /**
     * Get the ipConfiguration property: The IP configuration associated with the public IP address.
     *
     * @return the ipConfiguration value.
     */
    public IpConfigurationInner ipConfiguration() {
        return this.ipConfiguration;
    }

    /**
     * Get the dnsSettings property: The FQDN of the DNS record associated with the public IP address.
     *
     * @return the dnsSettings value.
     */
    public PublicIpAddressDnsSettings dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dnsSettings property: The FQDN of the DNS record associated with the public IP address.
     *
     * @param dnsSettings the dnsSettings value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withDnsSettings(PublicIpAddressDnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the ddosSettings property: The DDoS protection custom policy associated with the public IP address.
     *
     * @return the ddosSettings value.
     */
    public DdosSettings ddosSettings() {
        return this.ddosSettings;
    }

    /**
     * Set the ddosSettings property: The DDoS protection custom policy associated with the public IP address.
     *
     * @param ddosSettings the ddosSettings value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withDdosSettings(DdosSettings ddosSettings) {
        this.ddosSettings = ddosSettings;
        return this;
    }

    /**
     * Get the ipTags property: The list of tags associated with the public IP address.
     *
     * @return the ipTags value.
     */
    public List<IpTag> ipTags() {
        return this.ipTags;
    }

    /**
     * Set the ipTags property: The list of tags associated with the public IP address.
     *
     * @param ipTags the ipTags value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withIpTags(List<IpTag> ipTags) {
        this.ipTags = ipTags;
        return this;
    }

    /**
     * Get the ipAddress property: The IP address associated with the public IP address resource.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: The IP address associated with the public IP address resource.
     *
     * @param ipAddress the ipAddress value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the publicIpPrefix property: The Public IP Prefix this Public IP Address should be allocated from.
     *
     * @return the publicIpPrefix value.
     */
    public SubResource publicIpPrefix() {
        return this.publicIpPrefix;
    }

    /**
     * Set the publicIpPrefix property: The Public IP Prefix this Public IP Address should be allocated from.
     *
     * @param publicIpPrefix the publicIpPrefix value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withPublicIpPrefix(SubResource publicIpPrefix) {
        this.publicIpPrefix = publicIpPrefix;
        return this;
    }

    /**
     * Get the idleTimeoutInMinutes property: The idle timeout of the public IP address.
     *
     * @return the idleTimeoutInMinutes value.
     */
    public Integer idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idleTimeoutInMinutes property: The idle timeout of the public IP address.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the public IP address resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the public IP address resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
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
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PublicIpAddressInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PublicIpAddressInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (ipConfiguration() != null) {
            ipConfiguration().validate();
        }
        if (dnsSettings() != null) {
            dnsSettings().validate();
        }
        if (ddosSettings() != null) {
            ddosSettings().validate();
        }
        if (ipTags() != null) {
            ipTags().forEach(e -> e.validate());
        }
    }
}
