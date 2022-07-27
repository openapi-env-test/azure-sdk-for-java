// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.sql.generated.fluent.models.ElasticPoolUpdateProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** An elastic pool update. */
@Fluent
public final class ElasticPoolUpdate {
    /*
     * An ARM Resource SKU.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private ElasticPoolUpdateProperties innerProperties;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /**
     * Get the sku property: An ARM Resource SKU.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: An ARM Resource SKU.
     *
     * @param sku the sku value to set.
     * @return the ElasticPoolUpdate object itself.
     */
    public ElasticPoolUpdate withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private ElasticPoolUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the ElasticPoolUpdate object itself.
     */
    public ElasticPoolUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the maxSizeBytes property: The storage limit for the database elastic pool in bytes.
     *
     * @return the maxSizeBytes value.
     */
    public Long maxSizeBytes() {
        return this.innerProperties() == null ? null : this.innerProperties().maxSizeBytes();
    }

    /**
     * Set the maxSizeBytes property: The storage limit for the database elastic pool in bytes.
     *
     * @param maxSizeBytes the maxSizeBytes value to set.
     * @return the ElasticPoolUpdate object itself.
     */
    public ElasticPoolUpdate withMaxSizeBytes(Long maxSizeBytes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ElasticPoolUpdateProperties();
        }
        this.innerProperties().withMaxSizeBytes(maxSizeBytes);
        return this;
    }

    /**
     * Get the perDatabaseSettings property: The per database settings for the elastic pool.
     *
     * @return the perDatabaseSettings value.
     */
    public ElasticPoolPerDatabaseSettings perDatabaseSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().perDatabaseSettings();
    }

    /**
     * Set the perDatabaseSettings property: The per database settings for the elastic pool.
     *
     * @param perDatabaseSettings the perDatabaseSettings value to set.
     * @return the ElasticPoolUpdate object itself.
     */
    public ElasticPoolUpdate withPerDatabaseSettings(ElasticPoolPerDatabaseSettings perDatabaseSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ElasticPoolUpdateProperties();
        }
        this.innerProperties().withPerDatabaseSettings(perDatabaseSettings);
        return this;
    }

    /**
     * Get the zoneRedundant property: Whether or not this elastic pool is zone redundant, which means the replicas of
     * this elastic pool will be spread across multiple availability zones.
     *
     * @return the zoneRedundant value.
     */
    public Boolean zoneRedundant() {
        return this.innerProperties() == null ? null : this.innerProperties().zoneRedundant();
    }

    /**
     * Set the zoneRedundant property: Whether or not this elastic pool is zone redundant, which means the replicas of
     * this elastic pool will be spread across multiple availability zones.
     *
     * @param zoneRedundant the zoneRedundant value to set.
     * @return the ElasticPoolUpdate object itself.
     */
    public ElasticPoolUpdate withZoneRedundant(Boolean zoneRedundant) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ElasticPoolUpdateProperties();
        }
        this.innerProperties().withZoneRedundant(zoneRedundant);
        return this;
    }

    /**
     * Get the licenseType property: The license type to apply for this elastic pool.
     *
     * @return the licenseType value.
     */
    public ElasticPoolLicenseType licenseType() {
        return this.innerProperties() == null ? null : this.innerProperties().licenseType();
    }

    /**
     * Set the licenseType property: The license type to apply for this elastic pool.
     *
     * @param licenseType the licenseType value to set.
     * @return the ElasticPoolUpdate object itself.
     */
    public ElasticPoolUpdate withLicenseType(ElasticPoolLicenseType licenseType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ElasticPoolUpdateProperties();
        }
        this.innerProperties().withLicenseType(licenseType);
        return this;
    }

    /**
     * Get the maintenanceConfigurationId property: Maintenance configuration id assigned to the elastic pool. This
     * configuration defines the period when the maintenance updates will will occur.
     *
     * @return the maintenanceConfigurationId value.
     */
    public String maintenanceConfigurationId() {
        return this.innerProperties() == null ? null : this.innerProperties().maintenanceConfigurationId();
    }

    /**
     * Set the maintenanceConfigurationId property: Maintenance configuration id assigned to the elastic pool. This
     * configuration defines the period when the maintenance updates will will occur.
     *
     * @param maintenanceConfigurationId the maintenanceConfigurationId value to set.
     * @return the ElasticPoolUpdate object itself.
     */
    public ElasticPoolUpdate withMaintenanceConfigurationId(String maintenanceConfigurationId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ElasticPoolUpdateProperties();
        }
        this.innerProperties().withMaintenanceConfigurationId(maintenanceConfigurationId);
        return this;
    }

    /**
     * Get the highAvailabilityReplicaCount property: The number of secondary replicas associated with the elastic pool
     * that are used to provide high availability. Applicable only to Hyperscale elastic pools.
     *
     * @return the highAvailabilityReplicaCount value.
     */
    public Integer highAvailabilityReplicaCount() {
        return this.innerProperties() == null ? null : this.innerProperties().highAvailabilityReplicaCount();
    }

    /**
     * Set the highAvailabilityReplicaCount property: The number of secondary replicas associated with the elastic pool
     * that are used to provide high availability. Applicable only to Hyperscale elastic pools.
     *
     * @param highAvailabilityReplicaCount the highAvailabilityReplicaCount value to set.
     * @return the ElasticPoolUpdate object itself.
     */
    public ElasticPoolUpdate withHighAvailabilityReplicaCount(Integer highAvailabilityReplicaCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ElasticPoolUpdateProperties();
        }
        this.innerProperties().withHighAvailabilityReplicaCount(highAvailabilityReplicaCount);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
