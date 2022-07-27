// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mysqlflexibleserver.models.PerformanceTierServiceLevelObjectives;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Performance tier properties. */
@Fluent
public final class PerformanceTierPropertiesInner {
    /*
     * ID of the performance tier.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Maximum Backup retention in days for the performance tier edition
     */
    @JsonProperty(value = "maxBackupRetentionDays")
    private Integer maxBackupRetentionDays;

    /*
     * Minimum Backup retention in days for the performance tier edition
     */
    @JsonProperty(value = "minBackupRetentionDays")
    private Integer minBackupRetentionDays;

    /*
     * Max storage allowed for a server.
     */
    @JsonProperty(value = "maxStorageMB")
    private Integer maxStorageMB;

    /*
     * Max storage allowed for a server.
     */
    @JsonProperty(value = "minLargeStorageMB")
    private Integer minLargeStorageMB;

    /*
     * Max storage allowed for a server.
     */
    @JsonProperty(value = "maxLargeStorageMB")
    private Integer maxLargeStorageMB;

    /*
     * Max storage allowed for a server.
     */
    @JsonProperty(value = "minStorageMB")
    private Integer minStorageMB;

    /*
     * Service level objectives associated with the performance tier
     */
    @JsonProperty(value = "serviceLevelObjectives")
    private List<PerformanceTierServiceLevelObjectives> serviceLevelObjectives;

    /**
     * Get the id property: ID of the performance tier.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: ID of the performance tier.
     *
     * @param id the id value to set.
     * @return the PerformanceTierPropertiesInner object itself.
     */
    public PerformanceTierPropertiesInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the maxBackupRetentionDays property: Maximum Backup retention in days for the performance tier edition.
     *
     * @return the maxBackupRetentionDays value.
     */
    public Integer maxBackupRetentionDays() {
        return this.maxBackupRetentionDays;
    }

    /**
     * Set the maxBackupRetentionDays property: Maximum Backup retention in days for the performance tier edition.
     *
     * @param maxBackupRetentionDays the maxBackupRetentionDays value to set.
     * @return the PerformanceTierPropertiesInner object itself.
     */
    public PerformanceTierPropertiesInner withMaxBackupRetentionDays(Integer maxBackupRetentionDays) {
        this.maxBackupRetentionDays = maxBackupRetentionDays;
        return this;
    }

    /**
     * Get the minBackupRetentionDays property: Minimum Backup retention in days for the performance tier edition.
     *
     * @return the minBackupRetentionDays value.
     */
    public Integer minBackupRetentionDays() {
        return this.minBackupRetentionDays;
    }

    /**
     * Set the minBackupRetentionDays property: Minimum Backup retention in days for the performance tier edition.
     *
     * @param minBackupRetentionDays the minBackupRetentionDays value to set.
     * @return the PerformanceTierPropertiesInner object itself.
     */
    public PerformanceTierPropertiesInner withMinBackupRetentionDays(Integer minBackupRetentionDays) {
        this.minBackupRetentionDays = minBackupRetentionDays;
        return this;
    }

    /**
     * Get the maxStorageMB property: Max storage allowed for a server.
     *
     * @return the maxStorageMB value.
     */
    public Integer maxStorageMB() {
        return this.maxStorageMB;
    }

    /**
     * Set the maxStorageMB property: Max storage allowed for a server.
     *
     * @param maxStorageMB the maxStorageMB value to set.
     * @return the PerformanceTierPropertiesInner object itself.
     */
    public PerformanceTierPropertiesInner withMaxStorageMB(Integer maxStorageMB) {
        this.maxStorageMB = maxStorageMB;
        return this;
    }

    /**
     * Get the minLargeStorageMB property: Max storage allowed for a server.
     *
     * @return the minLargeStorageMB value.
     */
    public Integer minLargeStorageMB() {
        return this.minLargeStorageMB;
    }

    /**
     * Set the minLargeStorageMB property: Max storage allowed for a server.
     *
     * @param minLargeStorageMB the minLargeStorageMB value to set.
     * @return the PerformanceTierPropertiesInner object itself.
     */
    public PerformanceTierPropertiesInner withMinLargeStorageMB(Integer minLargeStorageMB) {
        this.minLargeStorageMB = minLargeStorageMB;
        return this;
    }

    /**
     * Get the maxLargeStorageMB property: Max storage allowed for a server.
     *
     * @return the maxLargeStorageMB value.
     */
    public Integer maxLargeStorageMB() {
        return this.maxLargeStorageMB;
    }

    /**
     * Set the maxLargeStorageMB property: Max storage allowed for a server.
     *
     * @param maxLargeStorageMB the maxLargeStorageMB value to set.
     * @return the PerformanceTierPropertiesInner object itself.
     */
    public PerformanceTierPropertiesInner withMaxLargeStorageMB(Integer maxLargeStorageMB) {
        this.maxLargeStorageMB = maxLargeStorageMB;
        return this;
    }

    /**
     * Get the minStorageMB property: Max storage allowed for a server.
     *
     * @return the minStorageMB value.
     */
    public Integer minStorageMB() {
        return this.minStorageMB;
    }

    /**
     * Set the minStorageMB property: Max storage allowed for a server.
     *
     * @param minStorageMB the minStorageMB value to set.
     * @return the PerformanceTierPropertiesInner object itself.
     */
    public PerformanceTierPropertiesInner withMinStorageMB(Integer minStorageMB) {
        this.minStorageMB = minStorageMB;
        return this;
    }

    /**
     * Get the serviceLevelObjectives property: Service level objectives associated with the performance tier.
     *
     * @return the serviceLevelObjectives value.
     */
    public List<PerformanceTierServiceLevelObjectives> serviceLevelObjectives() {
        return this.serviceLevelObjectives;
    }

    /**
     * Set the serviceLevelObjectives property: Service level objectives associated with the performance tier.
     *
     * @param serviceLevelObjectives the serviceLevelObjectives value to set.
     * @return the PerformanceTierPropertiesInner object itself.
     */
    public PerformanceTierPropertiesInner withServiceLevelObjectives(
        List<PerformanceTierServiceLevelObjectives> serviceLevelObjectives) {
        this.serviceLevelObjectives = serviceLevelObjectives;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serviceLevelObjectives() != null) {
            serviceLevelObjectives().forEach(e -> e.validate());
        }
    }
}
