// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.advisor.models.CpuThreshold;
import com.azure.resourcemanager.advisor.models.DigestConfig;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Configuration data properties. */
@Fluent
public final class ConfigDataProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConfigDataProperties.class);

    /*
     * Exclude the resource from Advisor evaluations. Valid values: False
     * (default) or True.
     */
    @JsonProperty(value = "exclude")
    private Boolean exclude;

    /*
     * Minimum percentage threshold for Advisor low CPU utilization evaluation.
     * Valid only for subscriptions. Valid values: 5 (default), 10, 15 or 20.
     */
    @JsonProperty(value = "lowCpuThreshold")
    private CpuThreshold lowCpuThreshold;

    /*
     * Advisor digest configuration. Valid only for subscriptions
     */
    @JsonProperty(value = "digests")
    private List<DigestConfig> digests;

    /**
     * Get the exclude property: Exclude the resource from Advisor evaluations. Valid values: False (default) or True.
     *
     * @return the exclude value.
     */
    public Boolean exclude() {
        return this.exclude;
    }

    /**
     * Set the exclude property: Exclude the resource from Advisor evaluations. Valid values: False (default) or True.
     *
     * @param exclude the exclude value to set.
     * @return the ConfigDataProperties object itself.
     */
    public ConfigDataProperties withExclude(Boolean exclude) {
        this.exclude = exclude;
        return this;
    }

    /**
     * Get the lowCpuThreshold property: Minimum percentage threshold for Advisor low CPU utilization evaluation. Valid
     * only for subscriptions. Valid values: 5 (default), 10, 15 or 20.
     *
     * @return the lowCpuThreshold value.
     */
    public CpuThreshold lowCpuThreshold() {
        return this.lowCpuThreshold;
    }

    /**
     * Set the lowCpuThreshold property: Minimum percentage threshold for Advisor low CPU utilization evaluation. Valid
     * only for subscriptions. Valid values: 5 (default), 10, 15 or 20.
     *
     * @param lowCpuThreshold the lowCpuThreshold value to set.
     * @return the ConfigDataProperties object itself.
     */
    public ConfigDataProperties withLowCpuThreshold(CpuThreshold lowCpuThreshold) {
        this.lowCpuThreshold = lowCpuThreshold;
        return this;
    }

    /**
     * Get the digests property: Advisor digest configuration. Valid only for subscriptions.
     *
     * @return the digests value.
     */
    public List<DigestConfig> digests() {
        return this.digests;
    }

    /**
     * Set the digests property: Advisor digest configuration. Valid only for subscriptions.
     *
     * @param digests the digests value to set.
     * @return the ConfigDataProperties object itself.
     */
    public ConfigDataProperties withDigests(List<DigestConfig> digests) {
        this.digests = digests;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (digests() != null) {
            digests().forEach(e -> e.validate());
        }
    }
}
