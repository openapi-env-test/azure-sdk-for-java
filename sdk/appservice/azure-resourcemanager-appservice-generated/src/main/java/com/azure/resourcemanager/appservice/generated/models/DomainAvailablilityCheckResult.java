// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.DomainAvailablilityCheckResultInner;

/** An immutable client-side representation of DomainAvailablilityCheckResult. */
public interface DomainAvailablilityCheckResult {
    /**
     * Gets the name property: Name of the domain.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the available property: If true then domain can be purchased using CreateDomain Api.
     *
     * @return the available value.
     */
    Boolean available();

    /**
     * Gets the domainType property: Domain type.
     *
     * @return the domainType value.
     */
    DomainType domainType();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.DomainAvailablilityCheckResultInner
     * object.
     *
     * @return the inner object.
     */
    DomainAvailablilityCheckResultInner innerModel();
}
