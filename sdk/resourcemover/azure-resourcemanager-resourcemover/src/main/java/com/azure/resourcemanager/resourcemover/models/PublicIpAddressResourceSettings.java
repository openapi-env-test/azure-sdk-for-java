// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** Defines the public IP address resource settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resourceType")
@JsonTypeName("Microsoft.Network/publicIPAddresses")
@Fluent
public final class PublicIpAddressResourceSettings extends ResourceSettings {
    /*
     * Gets or sets the Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Gets or sets the domain name label.
     */
    @JsonProperty(value = "domainNameLabel")
    private String domainNameLabel;

    /*
     * Gets or sets the fully qualified domain name.
     */
    @JsonProperty(value = "fqdn")
    private String fqdn;

    /*
     * Gets or sets public IP allocation method.
     */
    @JsonProperty(value = "publicIpAllocationMethod")
    private String publicIpAllocationMethod;

    /*
     * Gets or sets public IP sku.
     */
    @JsonProperty(value = "sku")
    private String sku;

    /*
     * Gets or sets public IP zones.
     */
    @JsonProperty(value = "zones")
    private String zones;

    /**
     * Get the tags property: Gets or sets the Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Gets or sets the Resource tags.
     *
     * @param tags the tags value to set.
     * @return the PublicIpAddressResourceSettings object itself.
     */
    public PublicIpAddressResourceSettings withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the domainNameLabel property: Gets or sets the domain name label.
     *
     * @return the domainNameLabel value.
     */
    public String domainNameLabel() {
        return this.domainNameLabel;
    }

    /**
     * Set the domainNameLabel property: Gets or sets the domain name label.
     *
     * @param domainNameLabel the domainNameLabel value to set.
     * @return the PublicIpAddressResourceSettings object itself.
     */
    public PublicIpAddressResourceSettings withDomainNameLabel(String domainNameLabel) {
        this.domainNameLabel = domainNameLabel;
        return this;
    }

    /**
     * Get the fqdn property: Gets or sets the fully qualified domain name.
     *
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Set the fqdn property: Gets or sets the fully qualified domain name.
     *
     * @param fqdn the fqdn value to set.
     * @return the PublicIpAddressResourceSettings object itself.
     */
    public PublicIpAddressResourceSettings withFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Get the publicIpAllocationMethod property: Gets or sets public IP allocation method.
     *
     * @return the publicIpAllocationMethod value.
     */
    public String publicIpAllocationMethod() {
        return this.publicIpAllocationMethod;
    }

    /**
     * Set the publicIpAllocationMethod property: Gets or sets public IP allocation method.
     *
     * @param publicIpAllocationMethod the publicIpAllocationMethod value to set.
     * @return the PublicIpAddressResourceSettings object itself.
     */
    public PublicIpAddressResourceSettings withPublicIpAllocationMethod(String publicIpAllocationMethod) {
        this.publicIpAllocationMethod = publicIpAllocationMethod;
        return this;
    }

    /**
     * Get the sku property: Gets or sets public IP sku.
     *
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Gets or sets public IP sku.
     *
     * @param sku the sku value to set.
     * @return the PublicIpAddressResourceSettings object itself.
     */
    public PublicIpAddressResourceSettings withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the zones property: Gets or sets public IP zones.
     *
     * @return the zones value.
     */
    public String zones() {
        return this.zones;
    }

    /**
     * Set the zones property: Gets or sets public IP zones.
     *
     * @param zones the zones value to set.
     * @return the PublicIpAddressResourceSettings object itself.
     */
    public PublicIpAddressResourceSettings withZones(String zones) {
        this.zones = zones;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PublicIpAddressResourceSettings withTargetResourceName(String targetResourceName) {
        super.withTargetResourceName(targetResourceName);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
