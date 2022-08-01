// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.appconfiguration.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * The configuration store along with all resource properties. The Configuration Store will have all information to
 * begin utilizing it.
 */
@Fluent
public final class ConfigurationStoreInner extends Resource {
    /*
     * The properties of a configuration store.
     */
    @JsonProperty(value = "properties")
    private ConfigurationStoreProperties innerProperties;

    /**
     * Get the innerProperties property: The properties of a configuration store.
     *
     * @return the innerProperties value.
     */
    private ConfigurationStoreProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ConfigurationStoreInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ConfigurationStoreInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the configuration store.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the creationDate property: The creation date of configuration store.
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().creationDate();
    }

    /**
     * Get the endpoint property: The DNS endpoint where the configuration store API will be available.
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().endpoint();
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
