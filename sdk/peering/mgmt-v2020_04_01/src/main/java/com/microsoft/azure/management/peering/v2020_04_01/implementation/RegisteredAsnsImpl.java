/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.peering.v2020_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.peering.v2020_04_01.RegisteredAsns;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.peering.v2020_04_01.PeeringRegisteredAsn;

class RegisteredAsnsImpl extends WrapperImpl<RegisteredAsnsInner> implements RegisteredAsns {
    private final PeeringManager manager;

    RegisteredAsnsImpl(PeeringManager manager) {
        super(manager.inner().registeredAsns());
        this.manager = manager;
    }

    public PeeringManager manager() {
        return this.manager;
    }

    @Override
    public PeeringRegisteredAsnImpl define(String name) {
        return wrapModel(name);
    }

    private PeeringRegisteredAsnImpl wrapModel(PeeringRegisteredAsnInner inner) {
        return  new PeeringRegisteredAsnImpl(inner, manager());
    }

    private PeeringRegisteredAsnImpl wrapModel(String name) {
        return new PeeringRegisteredAsnImpl(name, this.manager());
    }

    @Override
    public Observable<PeeringRegisteredAsn> listByPeeringAsync(final String resourceGroupName, final String peeringName) {
        RegisteredAsnsInner client = this.inner();
        return client.listByPeeringAsync(resourceGroupName, peeringName)
        .flatMapIterable(new Func1<Page<PeeringRegisteredAsnInner>, Iterable<PeeringRegisteredAsnInner>>() {
            @Override
            public Iterable<PeeringRegisteredAsnInner> call(Page<PeeringRegisteredAsnInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PeeringRegisteredAsnInner, PeeringRegisteredAsn>() {
            @Override
            public PeeringRegisteredAsn call(PeeringRegisteredAsnInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<PeeringRegisteredAsn> getAsync(String resourceGroupName, String peeringName, String registeredAsnName) {
        RegisteredAsnsInner client = this.inner();
        return client.getAsync(resourceGroupName, peeringName, registeredAsnName)
        .flatMap(new Func1<PeeringRegisteredAsnInner, Observable<PeeringRegisteredAsn>>() {
            @Override
            public Observable<PeeringRegisteredAsn> call(PeeringRegisteredAsnInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((PeeringRegisteredAsn)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String peeringName, String registeredAsnName) {
        RegisteredAsnsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, peeringName, registeredAsnName).toCompletable();
    }

}
