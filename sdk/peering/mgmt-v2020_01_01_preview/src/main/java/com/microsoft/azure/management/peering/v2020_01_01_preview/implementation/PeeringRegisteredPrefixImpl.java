/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2020_01_01_preview.implementation;

import com.microsoft.azure.management.peering.v2020_01_01_preview.PeeringRegisteredPrefix;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.peering.v2020_01_01_preview.PrefixValidationState;
import com.microsoft.azure.management.peering.v2020_01_01_preview.ProvisioningState;

class PeeringRegisteredPrefixImpl extends CreatableUpdatableImpl<PeeringRegisteredPrefix, PeeringRegisteredPrefixInner, PeeringRegisteredPrefixImpl> implements PeeringRegisteredPrefix, PeeringRegisteredPrefix.Definition, PeeringRegisteredPrefix.Update {
    private final PeeringManager manager;
    private String resourceGroupName;
    private String peeringName;
    private String registeredPrefixName;
    private String cprefix;
    private String uprefix;

    PeeringRegisteredPrefixImpl(String name, PeeringManager manager) {
        super(name, new PeeringRegisteredPrefixInner());
        this.manager = manager;
        // Set resource name
        this.registeredPrefixName = name;
        //
    }

    PeeringRegisteredPrefixImpl(PeeringRegisteredPrefixInner inner, PeeringManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.registeredPrefixName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.peeringName = IdParsingUtils.getValueFromIdByName(inner.id(), "peerings");
        this.registeredPrefixName = IdParsingUtils.getValueFromIdByName(inner.id(), "registeredPrefixes");
        //
    }

    @Override
    public PeeringManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PeeringRegisteredPrefix> createResourceAsync() {
        RegisteredPrefixesInner client = this.manager().inner().registeredPrefixes();
        return client.createOrUpdateAsync(this.resourceGroupName, this.peeringName, this.registeredPrefixName, this.cprefix)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<PeeringRegisteredPrefix> updateResourceAsync() {
        RegisteredPrefixesInner client = this.manager().inner().registeredPrefixes();
        return client.createOrUpdateAsync(this.resourceGroupName, this.peeringName, this.registeredPrefixName, this.uprefix)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PeeringRegisteredPrefixInner> getInnerAsync() {
        RegisteredPrefixesInner client = this.manager().inner().registeredPrefixes();
        return client.getAsync(this.resourceGroupName, this.peeringName, this.registeredPrefixName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String errorMessage() {
        return this.inner().errorMessage();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String peeringServicePrefixKey() {
        return this.inner().peeringServicePrefixKey();
    }

    @Override
    public String prefix() {
        return this.inner().prefix();
    }

    @Override
    public PrefixValidationState prefixValidationState() {
        return this.inner().prefixValidationState();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public PeeringRegisteredPrefixImpl withExistingPeering(String resourceGroupName, String peeringName) {
        this.resourceGroupName = resourceGroupName;
        this.peeringName = peeringName;
        return this;
    }

    @Override
    public PeeringRegisteredPrefixImpl withPrefix(String prefix) {
        if (isInCreateMode()) {
            this.cprefix = prefix;
        } else {
            this.uprefix = prefix;
        }
        return this;
    }

}
