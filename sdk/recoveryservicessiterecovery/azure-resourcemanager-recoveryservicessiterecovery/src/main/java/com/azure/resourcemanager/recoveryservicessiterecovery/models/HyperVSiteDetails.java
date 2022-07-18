// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** HyperVSite fabric specific details. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("HyperVSite")
@Fluent
public final class HyperVSiteDetails extends FabricSpecificDetails {
    /*
     * The list of Hyper-V hosts associated with the fabric.
     */
    @JsonProperty(value = "hyperVHosts")
    private List<HyperVHostDetails> hyperVHosts;

    /**
     * Get the hyperVHosts property: The list of Hyper-V hosts associated with the fabric.
     *
     * @return the hyperVHosts value.
     */
    public List<HyperVHostDetails> hyperVHosts() {
        return this.hyperVHosts;
    }

    /**
     * Set the hyperVHosts property: The list of Hyper-V hosts associated with the fabric.
     *
     * @param hyperVHosts the hyperVHosts value to set.
     * @return the HyperVSiteDetails object itself.
     */
    public HyperVSiteDetails withHyperVHosts(List<HyperVHostDetails> hyperVHosts) {
        this.hyperVHosts = hyperVHosts;
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
        if (hyperVHosts() != null) {
            hyperVHosts().forEach(e -> e.validate());
        }
    }
}
