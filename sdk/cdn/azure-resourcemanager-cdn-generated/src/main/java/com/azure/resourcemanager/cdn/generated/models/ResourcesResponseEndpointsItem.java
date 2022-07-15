// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ResourcesResponseEndpointsItem model. */
@Fluent
public final class ResourcesResponseEndpointsItem {
    /*
     * The id property.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The history property.
     */
    @JsonProperty(value = "history")
    private Boolean history;

    /*
     * The customDomains property.
     */
    @JsonProperty(value = "customDomains")
    private List<ResourcesResponseEndpointsPropertiesItemsItem> customDomains;

    /**
     * Get the id property: The id property.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The id property.
     *
     * @param id the id value to set.
     * @return the ResourcesResponseEndpointsItem object itself.
     */
    public ResourcesResponseEndpointsItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the ResourcesResponseEndpointsItem object itself.
     */
    public ResourcesResponseEndpointsItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the history property: The history property.
     *
     * @return the history value.
     */
    public Boolean history() {
        return this.history;
    }

    /**
     * Set the history property: The history property.
     *
     * @param history the history value to set.
     * @return the ResourcesResponseEndpointsItem object itself.
     */
    public ResourcesResponseEndpointsItem withHistory(Boolean history) {
        this.history = history;
        return this;
    }

    /**
     * Get the customDomains property: The customDomains property.
     *
     * @return the customDomains value.
     */
    public List<ResourcesResponseEndpointsPropertiesItemsItem> customDomains() {
        return this.customDomains;
    }

    /**
     * Set the customDomains property: The customDomains property.
     *
     * @param customDomains the customDomains value to set.
     * @return the ResourcesResponseEndpointsItem object itself.
     */
    public ResourcesResponseEndpointsItem withCustomDomains(
        List<ResourcesResponseEndpointsPropertiesItemsItem> customDomains) {
        this.customDomains = customDomains;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (customDomains() != null) {
            customDomains().forEach(e -> e.validate());
        }
    }
}
