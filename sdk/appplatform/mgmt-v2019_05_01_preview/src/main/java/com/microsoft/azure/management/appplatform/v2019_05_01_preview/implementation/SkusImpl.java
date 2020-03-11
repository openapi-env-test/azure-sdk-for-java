/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.appplatform.v2019_05_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appplatform.v2019_05_01_preview.Skus;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.appplatform.v2019_05_01_preview.ResourceTypeSkuCollection;

class SkusImpl extends WrapperImpl<SkusInner> implements Skus {
    private final AppPlatformManager manager;

    SkusImpl(AppPlatformManager manager) {
        super(manager.inner().skus());
        this.manager = manager;
    }

    public AppPlatformManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ResourceTypeSkuCollection> listServiceSkuAsync() {
        SkusInner client = this.inner();
        return client.listServiceSkuAsync()
        .map(new Func1<ResourceTypeSkuCollectionInner, ResourceTypeSkuCollection>() {
            @Override
            public ResourceTypeSkuCollection call(ResourceTypeSkuCollectionInner inner) {
                return new ResourceTypeSkuCollectionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ResourceTypeSkuCollection> listDeploymentSkuAsync() {
        SkusInner client = this.inner();
        return client.listDeploymentSkuAsync()
        .map(new Func1<ResourceTypeSkuCollectionInner, ResourceTypeSkuCollection>() {
            @Override
            public ResourceTypeSkuCollection call(ResourceTypeSkuCollectionInner inner) {
                return new ResourceTypeSkuCollectionImpl(inner, manager());
            }
        });
    }

}
