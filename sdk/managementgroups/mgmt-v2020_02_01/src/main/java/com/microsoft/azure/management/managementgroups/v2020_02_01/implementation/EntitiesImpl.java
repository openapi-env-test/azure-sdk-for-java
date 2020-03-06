/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.managementgroups.v2020_02_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.managementgroups.v2020_02_01.Entities;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.managementgroups.v2020_02_01.EntityInfo;

class EntitiesImpl extends WrapperImpl<EntitiesInner> implements Entities {
    private final ManagementManager manager;

    EntitiesImpl(ManagementManager manager) {
        super(manager.inner().entities());
        this.manager = manager;
    }

    public ManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<EntityInfo> listAsync() {
        EntitiesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<EntityInfoInner>, Iterable<EntityInfoInner>>() {
            @Override
            public Iterable<EntityInfoInner> call(Page<EntityInfoInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EntityInfoInner, EntityInfo>() {
            @Override
            public EntityInfo call(EntityInfoInner inner) {
                return new EntityInfoImpl(inner, manager());
            }
        });
    }

}
