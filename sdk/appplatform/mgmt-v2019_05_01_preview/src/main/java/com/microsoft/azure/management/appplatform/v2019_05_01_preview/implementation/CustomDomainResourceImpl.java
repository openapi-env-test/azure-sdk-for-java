/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2019_05_01_preview.implementation;

import com.microsoft.azure.management.appplatform.v2019_05_01_preview.CustomDomainResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.appplatform.v2019_05_01_preview.CustomDomainProperties;

class CustomDomainResourceImpl extends CreatableUpdatableImpl<CustomDomainResource, CustomDomainResourceInner, CustomDomainResourceImpl> implements CustomDomainResource, CustomDomainResource.Definition, CustomDomainResource.Update {
    private final AppPlatformManager manager;
    private String resourceGroupName;
    private String serviceName;
    private String appName;
    private String domainName;

    CustomDomainResourceImpl(String name, AppPlatformManager manager) {
        super(name, new CustomDomainResourceInner());
        this.manager = manager;
        // Set resource name
        this.domainName = name;
        //
    }

    CustomDomainResourceImpl(CustomDomainResourceInner inner, AppPlatformManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.domainName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "Spring");
        this.appName = IdParsingUtils.getValueFromIdByName(inner.id(), "apps");
        this.domainName = IdParsingUtils.getValueFromIdByName(inner.id(), "domains");
        //
    }

    @Override
    public AppPlatformManager manager() {
        return this.manager;
    }

    @Override
    public Observable<CustomDomainResource> createResourceAsync() {
        CustomDomainsInner client = this.manager().inner().customDomains();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.appName, this.domainName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<CustomDomainResource> updateResourceAsync() {
        CustomDomainsInner client = this.manager().inner().customDomains();
        return client.patchAsync(this.resourceGroupName, this.serviceName, this.appName, this.domainName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<CustomDomainResourceInner> getInnerAsync() {
        CustomDomainsInner client = this.manager().inner().customDomains();
        return client.getAsync(this.resourceGroupName, this.serviceName, this.appName, this.domainName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public CustomDomainProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public CustomDomainResourceImpl withExistingApp(String resourceGroupName, String serviceName, String appName) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        this.appName = appName;
        return this;
    }

    @Override
    public CustomDomainResourceImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public CustomDomainResourceImpl withProperties(CustomDomainProperties properties) {
        this.inner().withProperties(properties);
        return this;
    }

}
