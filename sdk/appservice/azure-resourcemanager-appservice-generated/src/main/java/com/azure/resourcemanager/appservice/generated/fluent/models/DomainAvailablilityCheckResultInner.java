// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.DomainType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Domain availablility check result. */
@Fluent
public final class DomainAvailablilityCheckResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DomainAvailablilityCheckResultInner.class);

    /*
     * Name of the domain
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * If true then domain can be purchased using CreateDomain Api
     */
    @JsonProperty(value = "available")
    private Boolean available;

    /*
     * Domain type
     */
    @JsonProperty(value = "domainType")
    private DomainType domainType;

    /**
     * Get the name property: Name of the domain.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the domain.
     *
     * @param name the name value to set.
     * @return the DomainAvailablilityCheckResultInner object itself.
     */
    public DomainAvailablilityCheckResultInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the available property: If true then domain can be purchased using CreateDomain Api.
     *
     * @return the available value.
     */
    public Boolean available() {
        return this.available;
    }

    /**
     * Set the available property: If true then domain can be purchased using CreateDomain Api.
     *
     * @param available the available value to set.
     * @return the DomainAvailablilityCheckResultInner object itself.
     */
    public DomainAvailablilityCheckResultInner withAvailable(Boolean available) {
        this.available = available;
        return this;
    }

    /**
     * Get the domainType property: Domain type.
     *
     * @return the domainType value.
     */
    public DomainType domainType() {
        return this.domainType;
    }

    /**
     * Set the domainType property: Domain type.
     *
     * @param domainType the domainType value to set.
     * @return the DomainAvailablilityCheckResultInner object itself.
     */
    public DomainAvailablilityCheckResultInner withDomainType(DomainType domainType) {
        this.domainType = domainType;
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
