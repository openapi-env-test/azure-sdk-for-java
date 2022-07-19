// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The ResourceConfiguration model. */
@Fluent
public class ResourceConfiguration {
    /*
     * Optional number of instances or nodes used by the compute target.
     */
    @JsonProperty(value = "instanceCount")
    private Integer instanceCount;

    /*
     * Optional type of VM used as supported by the compute target.
     */
    @JsonProperty(value = "instanceType")
    private String instanceType;

    /*
     * Additional properties bag.
     */
    @JsonProperty(value = "properties")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> properties;

    /**
     * Get the instanceCount property: Optional number of instances or nodes used by the compute target.
     *
     * @return the instanceCount value.
     */
    public Integer instanceCount() {
        return this.instanceCount;
    }

    /**
     * Set the instanceCount property: Optional number of instances or nodes used by the compute target.
     *
     * @param instanceCount the instanceCount value to set.
     * @return the ResourceConfiguration object itself.
     */
    public ResourceConfiguration withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * Get the instanceType property: Optional type of VM used as supported by the compute target.
     *
     * @return the instanceType value.
     */
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Set the instanceType property: Optional type of VM used as supported by the compute target.
     *
     * @param instanceType the instanceType value to set.
     * @return the ResourceConfiguration object itself.
     */
    public ResourceConfiguration withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * Get the properties property: Additional properties bag.
     *
     * @return the properties value.
     */
    public Map<String, Object> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Additional properties bag.
     *
     * @param properties the properties value to set.
     * @return the ResourceConfiguration object itself.
     */
    public ResourceConfiguration withProperties(Map<String, Object> properties) {
        this.properties = properties;
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
