// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.DomainAvailablilityCheckResultInner;
import com.azure.resourcemanager.appservice.generated.models.DomainAvailablilityCheckResult;
import com.azure.resourcemanager.appservice.generated.models.DomainType;

public final class DomainAvailablilityCheckResultImpl implements DomainAvailablilityCheckResult {
    private DomainAvailablilityCheckResultInner innerObject;

    private final WebSiteManager serviceManager;

    DomainAvailablilityCheckResultImpl(DomainAvailablilityCheckResultInner innerObject, WebSiteManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public Boolean available() {
        return this.innerModel().available();
    }

    public DomainType domainType() {
        return this.innerModel().domainType();
    }

    public DomainAvailablilityCheckResultInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
