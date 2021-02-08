// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.DomainType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Domain availability check result. */
@Fluent
public final class DomainAvailablilityCheckResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DomainAvailablilityCheckResultInner.class);

    /*
     * Name of the domain.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * <code>true</code> if domain can be purchased using CreateDomain API;
     * otherwise, <code>false</code>.
     */
    @JsonProperty(value = "available")
    private Boolean available;

    /*
     * Valid values are Regular domain: Azure will charge the full price of
     * domain registration, SoftDeleted: Purchasing this domain will simply
     * restore it and this operation will not cost anything.
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
     * Get the available property: &lt;code&gt;true&lt;/code&gt; if domain can be purchased using CreateDomain API;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the available value.
     */
    public Boolean available() {
        return this.available;
    }

    /**
     * Set the available property: &lt;code&gt;true&lt;/code&gt; if domain can be purchased using CreateDomain API;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param available the available value to set.
     * @return the DomainAvailablilityCheckResultInner object itself.
     */
    public DomainAvailablilityCheckResultInner withAvailable(Boolean available) {
        this.available = available;
        return this;
    }

    /**
     * Get the domainType property: Valid values are Regular domain: Azure will charge the full price of domain
     * registration, SoftDeleted: Purchasing this domain will simply restore it and this operation will not cost
     * anything.
     *
     * @return the domainType value.
     */
    public DomainType domainType() {
        return this.domainType;
    }

    /**
     * Set the domainType property: Valid values are Regular domain: Azure will charge the full price of domain
     * registration, SoftDeleted: Purchasing this domain will simply restore it and this operation will not cost
     * anything.
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
