// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The PremierAddOnRequest model. */
@Fluent
public final class PremierAddOnRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PremierAddOnRequest.class);

    /*
     * Geo region resource belongs to e.g. SouthCentralUS, SouthEastAsia
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Tags associated with resource
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * Azure resource manager plan
     */
    @JsonProperty(value = "plan")
    private ArmPlan plan;

    /*
     * Resource specific properties
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /*
     * Sku description of the resource
     */
    @JsonProperty(value = "sku")
    private SkuDescription sku;

    /**
     * Get the location property: Geo region resource belongs to e.g. SouthCentralUS, SouthEastAsia.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Geo region resource belongs to e.g. SouthCentralUS, SouthEastAsia.
     *
     * @param location the location value to set.
     * @return the PremierAddOnRequest object itself.
     */
    public PremierAddOnRequest withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: Tags associated with resource.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Tags associated with resource.
     *
     * @param tags the tags value to set.
     * @return the PremierAddOnRequest object itself.
     */
    public PremierAddOnRequest withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the plan property: Azure resource manager plan.
     *
     * @return the plan value.
     */
    public ArmPlan plan() {
        return this.plan;
    }

    /**
     * Set the plan property: Azure resource manager plan.
     *
     * @param plan the plan value to set.
     * @return the PremierAddOnRequest object itself.
     */
    public PremierAddOnRequest withPlan(ArmPlan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the properties property: Resource specific properties.
     *
     * @return the properties value.
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Resource specific properties.
     *
     * @param properties the properties value to set.
     * @return the PremierAddOnRequest object itself.
     */
    public PremierAddOnRequest withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the sku property: Sku description of the resource.
     *
     * @return the sku value.
     */
    public SkuDescription sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Sku description of the resource.
     *
     * @param sku the sku value to set.
     * @return the PremierAddOnRequest object itself.
     */
    public PremierAddOnRequest withSku(SkuDescription sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (plan() != null) {
            plan().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }
}
