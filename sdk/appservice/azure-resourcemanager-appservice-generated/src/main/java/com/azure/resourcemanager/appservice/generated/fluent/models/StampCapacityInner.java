// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.ComputeModeOptions;
import com.azure.resourcemanager.appservice.generated.models.WorkerSizeOptions;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Stamp capacity information. */
@Fluent
public final class StampCapacityInner {
    /*
     * Name of the stamp.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Available capacity (# of machines, bytes of storage etc...).
     */
    @JsonProperty(value = "availableCapacity")
    private Long availableCapacity;

    /*
     * Total capacity (# of machines, bytes of storage etc...).
     */
    @JsonProperty(value = "totalCapacity")
    private Long totalCapacity;

    /*
     * Name of the unit.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /*
     * Shared/dedicated workers.
     */
    @JsonProperty(value = "computeMode")
    private ComputeModeOptions computeMode;

    /*
     * Size of the machines.
     */
    @JsonProperty(value = "workerSize")
    private WorkerSizeOptions workerSize;

    /*
     * Size ID of machines:
     * 0 - Small
     * 1 - Medium
     * 2 - Large
     */
    @JsonProperty(value = "workerSizeId")
    private Integer workerSizeId;

    /*
     * If <code>true</code>, it includes basic apps.
     * Basic apps are not used for capacity allocation.
     */
    @JsonProperty(value = "excludeFromCapacityAllocation")
    private Boolean excludeFromCapacityAllocation;

    /*
     * <code>true</code> if capacity is applicable for all apps; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "isApplicableForAllComputeModes")
    private Boolean isApplicableForAllComputeModes;

    /*
     * Shared or Dedicated.
     */
    @JsonProperty(value = "siteMode")
    private String siteMode;

    /*
     * Is this a linux stamp capacity
     */
    @JsonProperty(value = "isLinux")
    private Boolean isLinux;

    /**
     * Get the name property: Name of the stamp.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the stamp.
     *
     * @param name the name value to set.
     * @return the StampCapacityInner object itself.
     */
    public StampCapacityInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the availableCapacity property: Available capacity (# of machines, bytes of storage etc...).
     *
     * @return the availableCapacity value.
     */
    public Long availableCapacity() {
        return this.availableCapacity;
    }

    /**
     * Set the availableCapacity property: Available capacity (# of machines, bytes of storage etc...).
     *
     * @param availableCapacity the availableCapacity value to set.
     * @return the StampCapacityInner object itself.
     */
    public StampCapacityInner withAvailableCapacity(Long availableCapacity) {
        this.availableCapacity = availableCapacity;
        return this;
    }

    /**
     * Get the totalCapacity property: Total capacity (# of machines, bytes of storage etc...).
     *
     * @return the totalCapacity value.
     */
    public Long totalCapacity() {
        return this.totalCapacity;
    }

    /**
     * Set the totalCapacity property: Total capacity (# of machines, bytes of storage etc...).
     *
     * @param totalCapacity the totalCapacity value to set.
     * @return the StampCapacityInner object itself.
     */
    public StampCapacityInner withTotalCapacity(Long totalCapacity) {
        this.totalCapacity = totalCapacity;
        return this;
    }

    /**
     * Get the unit property: Name of the unit.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: Name of the unit.
     *
     * @param unit the unit value to set.
     * @return the StampCapacityInner object itself.
     */
    public StampCapacityInner withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the computeMode property: Shared/dedicated workers.
     *
     * @return the computeMode value.
     */
    public ComputeModeOptions computeMode() {
        return this.computeMode;
    }

    /**
     * Set the computeMode property: Shared/dedicated workers.
     *
     * @param computeMode the computeMode value to set.
     * @return the StampCapacityInner object itself.
     */
    public StampCapacityInner withComputeMode(ComputeModeOptions computeMode) {
        this.computeMode = computeMode;
        return this;
    }

    /**
     * Get the workerSize property: Size of the machines.
     *
     * @return the workerSize value.
     */
    public WorkerSizeOptions workerSize() {
        return this.workerSize;
    }

    /**
     * Set the workerSize property: Size of the machines.
     *
     * @param workerSize the workerSize value to set.
     * @return the StampCapacityInner object itself.
     */
    public StampCapacityInner withWorkerSize(WorkerSizeOptions workerSize) {
        this.workerSize = workerSize;
        return this;
    }

    /**
     * Get the workerSizeId property: Size ID of machines: 0 - Small 1 - Medium 2 - Large.
     *
     * @return the workerSizeId value.
     */
    public Integer workerSizeId() {
        return this.workerSizeId;
    }

    /**
     * Set the workerSizeId property: Size ID of machines: 0 - Small 1 - Medium 2 - Large.
     *
     * @param workerSizeId the workerSizeId value to set.
     * @return the StampCapacityInner object itself.
     */
    public StampCapacityInner withWorkerSizeId(Integer workerSizeId) {
        this.workerSizeId = workerSizeId;
        return this;
    }

    /**
     * Get the excludeFromCapacityAllocation property: If &lt;code&gt;true&lt;/code&gt;, it includes basic apps. Basic
     * apps are not used for capacity allocation.
     *
     * @return the excludeFromCapacityAllocation value.
     */
    public Boolean excludeFromCapacityAllocation() {
        return this.excludeFromCapacityAllocation;
    }

    /**
     * Set the excludeFromCapacityAllocation property: If &lt;code&gt;true&lt;/code&gt;, it includes basic apps. Basic
     * apps are not used for capacity allocation.
     *
     * @param excludeFromCapacityAllocation the excludeFromCapacityAllocation value to set.
     * @return the StampCapacityInner object itself.
     */
    public StampCapacityInner withExcludeFromCapacityAllocation(Boolean excludeFromCapacityAllocation) {
        this.excludeFromCapacityAllocation = excludeFromCapacityAllocation;
        return this;
    }

    /**
     * Get the isApplicableForAllComputeModes property: &lt;code&gt;true&lt;/code&gt; if capacity is applicable for all
     * apps; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isApplicableForAllComputeModes value.
     */
    public Boolean isApplicableForAllComputeModes() {
        return this.isApplicableForAllComputeModes;
    }

    /**
     * Set the isApplicableForAllComputeModes property: &lt;code&gt;true&lt;/code&gt; if capacity is applicable for all
     * apps; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param isApplicableForAllComputeModes the isApplicableForAllComputeModes value to set.
     * @return the StampCapacityInner object itself.
     */
    public StampCapacityInner withIsApplicableForAllComputeModes(Boolean isApplicableForAllComputeModes) {
        this.isApplicableForAllComputeModes = isApplicableForAllComputeModes;
        return this;
    }

    /**
     * Get the siteMode property: Shared or Dedicated.
     *
     * @return the siteMode value.
     */
    public String siteMode() {
        return this.siteMode;
    }

    /**
     * Set the siteMode property: Shared or Dedicated.
     *
     * @param siteMode the siteMode value to set.
     * @return the StampCapacityInner object itself.
     */
    public StampCapacityInner withSiteMode(String siteMode) {
        this.siteMode = siteMode;
        return this;
    }

    /**
     * Get the isLinux property: Is this a linux stamp capacity.
     *
     * @return the isLinux value.
     */
    public Boolean isLinux() {
        return this.isLinux;
    }

    /**
     * Set the isLinux property: Is this a linux stamp capacity.
     *
     * @param isLinux the isLinux value to set.
     * @return the StampCapacityInner object itself.
     */
    public StampCapacityInner withIsLinux(Boolean isLinux) {
        this.isLinux = isLinux;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
