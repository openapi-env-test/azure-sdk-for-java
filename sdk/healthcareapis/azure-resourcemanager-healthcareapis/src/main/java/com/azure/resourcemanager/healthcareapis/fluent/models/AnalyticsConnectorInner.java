// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.healthcareapis.models.AnalyticsConnectorDataDestination;
import com.azure.resourcemanager.healthcareapis.models.AnalyticsConnectorDataSource;
import com.azure.resourcemanager.healthcareapis.models.AnalyticsConnectorMapping;
import com.azure.resourcemanager.healthcareapis.models.ProvisioningState;
import com.azure.resourcemanager.healthcareapis.models.ServiceManagedIdentityIdentity;
import com.azure.resourcemanager.healthcareapis.models.TaggedResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Analytics Connector definition. */
@Fluent
public final class AnalyticsConnectorInner extends TaggedResource {
    /*
     * Analytics Connector configuration.
     */
    @JsonProperty(value = "properties")
    private AnalyticsConnectorProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Setting indicating whether the service has a managed identity associated
     * with it.
     */
    @JsonProperty(value = "identity")
    private ServiceManagedIdentityIdentity identity;

    /**
     * Get the innerProperties property: Analytics Connector configuration.
     *
     * @return the innerProperties value.
     */
    private AnalyticsConnectorProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the identity property: Setting indicating whether the service has a managed identity associated with it.
     *
     * @return the identity value.
     */
    public ServiceManagedIdentityIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Setting indicating whether the service has a managed identity associated with it.
     *
     * @param identity the identity value to set.
     * @return the AnalyticsConnectorInner object itself.
     */
    public AnalyticsConnectorInner withIdentity(ServiceManagedIdentityIdentity identity) {
        this.identity = identity;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AnalyticsConnectorInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AnalyticsConnectorInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AnalyticsConnectorInner withEtag(String etag) {
        super.withEtag(etag);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the dataSourceConfiguration property: Data source for Analytics Connector.
     *
     * @return the dataSourceConfiguration value.
     */
    public AnalyticsConnectorDataSource dataSourceConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().dataSourceConfiguration();
    }

    /**
     * Set the dataSourceConfiguration property: Data source for Analytics Connector.
     *
     * @param dataSourceConfiguration the dataSourceConfiguration value to set.
     * @return the AnalyticsConnectorInner object itself.
     */
    public AnalyticsConnectorInner withDataSourceConfiguration(AnalyticsConnectorDataSource dataSourceConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AnalyticsConnectorProperties();
        }
        this.innerProperties().withDataSourceConfiguration(dataSourceConfiguration);
        return this;
    }

    /**
     * Get the dataMappingConfiguration property: Data mapping configuration for Analytics Connector.
     *
     * @return the dataMappingConfiguration value.
     */
    public AnalyticsConnectorMapping dataMappingConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().dataMappingConfiguration();
    }

    /**
     * Set the dataMappingConfiguration property: Data mapping configuration for Analytics Connector.
     *
     * @param dataMappingConfiguration the dataMappingConfiguration value to set.
     * @return the AnalyticsConnectorInner object itself.
     */
    public AnalyticsConnectorInner withDataMappingConfiguration(AnalyticsConnectorMapping dataMappingConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AnalyticsConnectorProperties();
        }
        this.innerProperties().withDataMappingConfiguration(dataMappingConfiguration);
        return this;
    }

    /**
     * Get the dataDestinationConfiguration property: Data destination configuration for Analytics Connector.
     *
     * @return the dataDestinationConfiguration value.
     */
    public AnalyticsConnectorDataDestination dataDestinationConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().dataDestinationConfiguration();
    }

    /**
     * Set the dataDestinationConfiguration property: Data destination configuration for Analytics Connector.
     *
     * @param dataDestinationConfiguration the dataDestinationConfiguration value to set.
     * @return the AnalyticsConnectorInner object itself.
     */
    public AnalyticsConnectorInner withDataDestinationConfiguration(
        AnalyticsConnectorDataDestination dataDestinationConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AnalyticsConnectorProperties();
        }
        this.innerProperties().withDataDestinationConfiguration(dataDestinationConfiguration);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
