// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Azure Firewall FQDN Tag Resource. */
@Fluent
public final class AzureFirewallFqdnTagInner extends Resource {
    /*
     * Properties of the azure firewall FQDN tag.
     */
    @JsonProperty(value = "properties")
    private AzureFirewallFqdnTagPropertiesFormat innerProperties;

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
     * Get the innerProperties property: Properties of the azure firewall FQDN tag.
     *
     * @return the innerProperties value.
     */
    private AzureFirewallFqdnTagPropertiesFormat innerProperties() {
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
     * @return the AzureFirewallFqdnTagInner object itself.
     */
    public AzureFirewallFqdnTagInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFirewallFqdnTagInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFirewallFqdnTagInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the Azure firewall FQDN tag resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the fqdnTagName property: The name of this FQDN Tag.
     *
     * @return the fqdnTagName value.
     */
    public String fqdnTagName() {
        return this.innerProperties() == null ? null : this.innerProperties().fqdnTagName();
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
