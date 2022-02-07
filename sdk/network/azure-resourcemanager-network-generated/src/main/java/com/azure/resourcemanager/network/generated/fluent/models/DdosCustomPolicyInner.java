// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.ProtocolCustomSettingsFormat;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** A DDoS custom policy in a resource group. */
@Fluent
public final class DdosCustomPolicyInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DdosCustomPolicyInner.class);

    /*
     * Properties of the DDoS custom policy.
     */
    @JsonProperty(value = "properties")
    private DdosCustomPolicyPropertiesFormat innerProperties;

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
     * Get the innerProperties property: Properties of the DDoS custom policy.
     *
     * @return the innerProperties value.
     */
    private DdosCustomPolicyPropertiesFormat innerProperties() {
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
     * @return the DdosCustomPolicyInner object itself.
     */
    public DdosCustomPolicyInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DdosCustomPolicyInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DdosCustomPolicyInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the DDoS custom policy resource. It uniquely
     * identifies the resource, even if the user changes its name or migrate the resource across subscriptions or
     * resource groups.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Get the provisioningState property: The provisioning state of the DDoS custom policy resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the publicIpAddresses property: The list of public IPs associated with the DDoS custom policy resource. This
     * list is read-only.
     *
     * @return the publicIpAddresses value.
     */
    public List<SubResource> publicIpAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpAddresses();
    }

    /**
     * Get the protocolCustomSettings property: The protocol-specific DDoS policy customization parameters.
     *
     * @return the protocolCustomSettings value.
     */
    public List<ProtocolCustomSettingsFormat> protocolCustomSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().protocolCustomSettings();
    }

    /**
     * Set the protocolCustomSettings property: The protocol-specific DDoS policy customization parameters.
     *
     * @param protocolCustomSettings the protocolCustomSettings value to set.
     * @return the DdosCustomPolicyInner object itself.
     */
    public DdosCustomPolicyInner withProtocolCustomSettings(List<ProtocolCustomSettingsFormat> protocolCustomSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DdosCustomPolicyPropertiesFormat();
        }
        this.innerProperties().withProtocolCustomSettings(protocolCustomSettings);
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
