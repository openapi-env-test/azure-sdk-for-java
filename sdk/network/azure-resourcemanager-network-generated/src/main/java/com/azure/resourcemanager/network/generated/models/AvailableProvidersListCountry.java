// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Country details. */
@Fluent
public final class AvailableProvidersListCountry {
    /*
     * The country name.
     */
    @JsonProperty(value = "countryName")
    private String countryName;

    /*
     * A list of Internet service providers.
     */
    @JsonProperty(value = "providers")
    private List<String> providers;

    /*
     * List of available states in the country.
     */
    @JsonProperty(value = "states")
    private List<AvailableProvidersListState> states;

    /** Creates an instance of AvailableProvidersListCountry class. */
    public AvailableProvidersListCountry() {
    }

    /**
     * Get the countryName property: The country name.
     *
     * @return the countryName value.
     */
    public String countryName() {
        return this.countryName;
    }

    /**
     * Set the countryName property: The country name.
     *
     * @param countryName the countryName value to set.
     * @return the AvailableProvidersListCountry object itself.
     */
    public AvailableProvidersListCountry withCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    /**
     * Get the providers property: A list of Internet service providers.
     *
     * @return the providers value.
     */
    public List<String> providers() {
        return this.providers;
    }

    /**
     * Set the providers property: A list of Internet service providers.
     *
     * @param providers the providers value to set.
     * @return the AvailableProvidersListCountry object itself.
     */
    public AvailableProvidersListCountry withProviders(List<String> providers) {
        this.providers = providers;
        return this;
    }

    /**
     * Get the states property: List of available states in the country.
     *
     * @return the states value.
     */
    public List<AvailableProvidersListState> states() {
        return this.states;
    }

    /**
     * Set the states property: List of available states in the country.
     *
     * @param states the states value to set.
     * @return the AvailableProvidersListCountry object itself.
     */
    public AvailableProvidersListCountry withStates(List<AvailableProvidersListState> states) {
        this.states = states;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (states() != null) {
            states().forEach(e -> e.validate());
        }
    }
}
