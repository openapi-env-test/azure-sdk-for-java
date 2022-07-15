// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cdn.generated.models.ContinentsResponseContinentsItem;
import com.azure.resourcemanager.cdn.generated.models.ContinentsResponseCountryOrRegionsItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Continents Response. */
@Fluent
public final class ContinentsResponseInner {
    /*
     * The continents property.
     */
    @JsonProperty(value = "continents")
    private List<ContinentsResponseContinentsItem> continents;

    /*
     * The countryOrRegions property.
     */
    @JsonProperty(value = "countryOrRegions")
    private List<ContinentsResponseCountryOrRegionsItem> countryOrRegions;

    /**
     * Get the continents property: The continents property.
     *
     * @return the continents value.
     */
    public List<ContinentsResponseContinentsItem> continents() {
        return this.continents;
    }

    /**
     * Set the continents property: The continents property.
     *
     * @param continents the continents value to set.
     * @return the ContinentsResponseInner object itself.
     */
    public ContinentsResponseInner withContinents(List<ContinentsResponseContinentsItem> continents) {
        this.continents = continents;
        return this;
    }

    /**
     * Get the countryOrRegions property: The countryOrRegions property.
     *
     * @return the countryOrRegions value.
     */
    public List<ContinentsResponseCountryOrRegionsItem> countryOrRegions() {
        return this.countryOrRegions;
    }

    /**
     * Set the countryOrRegions property: The countryOrRegions property.
     *
     * @param countryOrRegions the countryOrRegions value to set.
     * @return the ContinentsResponseInner object itself.
     */
    public ContinentsResponseInner withCountryOrRegions(List<ContinentsResponseCountryOrRegionsItem> countryOrRegions) {
        this.countryOrRegions = countryOrRegions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (continents() != null) {
            continents().forEach(e -> e.validate());
        }
        if (countryOrRegions() != null) {
            countryOrRegions().forEach(e -> e.validate());
        }
    }
}
