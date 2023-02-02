// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.sql.generated.models.ElasticPoolLicenseType;
import com.azure.resourcemanager.sql.generated.models.ElasticPoolPerDatabaseSettings;
import com.azure.resourcemanager.sql.generated.models.ElasticPoolState;
import com.azure.resourcemanager.sql.generated.models.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** An elastic pool. */
@Fluent
public final class ElasticPoolInner extends Resource {
    /*
     * The elastic pool SKU.
     *
     * The list of SKUs may vary by region and support offer. To determine the SKUs (including the SKU name,
     * tier/edition, family, and capacity) that are available to your subscription in an Azure region, use the
     * `Capabilities_ListByLocation` REST API or the following command:
     *
     * ```azurecli
     * az sql elastic-pool list-editions -l <location> -o table
     * ````
     *
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Kind of elastic pool. This is metadata used for the Azure portal experience.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private ElasticPoolProperties innerProperties;

    /** Creates an instance of ElasticPoolInner class. */
    public ElasticPoolInner() {
    }

    /**
     * Get the sku property: The elastic pool SKU.
     *
     * <p>The list of SKUs may vary by region and support offer. To determine the SKUs (including the SKU name,
     * tier/edition, family, and capacity) that are available to your subscription in an Azure region, use the
     * `Capabilities_ListByLocation` REST API or the following command:
     *
     * <p>```azurecli az sql elastic-pool list-editions -l &lt;location&gt; -o table ````.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The elastic pool SKU.
     *
     * <p>The list of SKUs may vary by region and support offer. To determine the SKUs (including the SKU name,
     * tier/edition, family, and capacity) that are available to your subscription in an Azure region, use the
     * `Capabilities_ListByLocation` REST API or the following command:
     *
     * <p>```azurecli az sql elastic-pool list-editions -l &lt;location&gt; -o table ````.
     *
     * @param sku the sku value to set.
     * @return the ElasticPoolInner object itself.
     */
    public ElasticPoolInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the kind property: Kind of elastic pool. This is metadata used for the Azure portal experience.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private ElasticPoolProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ElasticPoolInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ElasticPoolInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the state property: The state of the elastic pool.
     *
     * @return the state value.
     */
    public ElasticPoolState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Get the creationDate property: The creation date of the elastic pool (ISO8601 format).
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().creationDate();
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
     * @return the ElasticPoolInner object itself.
     */
    public ElasticPoolInner withMaxSizeBytes(Long maxSizeBytes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ElasticPoolProperties();
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
     * @return the ElasticPoolInner object itself.
     */
    public ElasticPoolInner withPerDatabaseSettings(ElasticPoolPerDatabaseSettings perDatabaseSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ElasticPoolProperties();
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
     * @return the ElasticPoolInner object itself.
     */
    public ElasticPoolInner withZoneRedundant(Boolean zoneRedundant) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ElasticPoolProperties();
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
     * @return the ElasticPoolInner object itself.
     */
    public ElasticPoolInner withLicenseType(ElasticPoolLicenseType licenseType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ElasticPoolProperties();
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
     * @return the ElasticPoolInner object itself.
     */
    public ElasticPoolInner withMaintenanceConfigurationId(String maintenanceConfigurationId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ElasticPoolProperties();
        }
        this.innerProperties().withMaintenanceConfigurationId(maintenanceConfigurationId);
        return this;
    }

    /**
     * Get the highAvailabilityReplicaCount property: The number of secondary replicas associated with the elastic pool
     * that are used to provide high availability.
     *
     * @return the highAvailabilityReplicaCount value.
     */
    public Integer highAvailabilityReplicaCount() {
        return this.innerProperties() == null ? null : this.innerProperties().highAvailabilityReplicaCount();
    }

    /**
     * Set the highAvailabilityReplicaCount property: The number of secondary replicas associated with the elastic pool
     * that are used to provide high availability.
     *
     * @param highAvailabilityReplicaCount the highAvailabilityReplicaCount value to set.
     * @return the ElasticPoolInner object itself.
     */
    public ElasticPoolInner withHighAvailabilityReplicaCount(Integer highAvailabilityReplicaCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ElasticPoolProperties();
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
