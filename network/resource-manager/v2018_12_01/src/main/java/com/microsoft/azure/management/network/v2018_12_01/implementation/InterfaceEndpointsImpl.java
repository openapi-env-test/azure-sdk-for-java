/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2018_12_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2018_12_01.InterfaceEndpoints;
import com.microsoft.azure.management.network.v2018_12_01.InterfaceEndpoint;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class InterfaceEndpointsImpl extends GroupableResourcesCoreImpl<InterfaceEndpoint, InterfaceEndpointImpl, InterfaceEndpointInner, InterfaceEndpointsInner, NetworkManager>  implements InterfaceEndpoints {
    protected InterfaceEndpointsImpl(NetworkManager manager) {
        super(manager.inner().interfaceEndpoints(), manager);
    }

    @Override
    protected Observable<InterfaceEndpointInner> getInnerAsync(String resourceGroupName, String name) {
        InterfaceEndpointsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        InterfaceEndpointsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<InterfaceEndpoint> listByResourceGroup(String resourceGroupName) {
        InterfaceEndpointsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<InterfaceEndpoint> listByResourceGroupAsync(String resourceGroupName) {
        InterfaceEndpointsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<InterfaceEndpointInner>, Iterable<InterfaceEndpointInner>>() {
            @Override
            public Iterable<InterfaceEndpointInner> call(Page<InterfaceEndpointInner> page) {
                return page.items();
            }
        })
        .map(new Func1<InterfaceEndpointInner, InterfaceEndpoint>() {
            @Override
            public InterfaceEndpoint call(InterfaceEndpointInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<InterfaceEndpoint> list() {
        InterfaceEndpointsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<InterfaceEndpoint> listAsync() {
        InterfaceEndpointsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<InterfaceEndpointInner>, Iterable<InterfaceEndpointInner>>() {
            @Override
            public Iterable<InterfaceEndpointInner> call(Page<InterfaceEndpointInner> page) {
                return page.items();
            }
        })
        .map(new Func1<InterfaceEndpointInner, InterfaceEndpoint>() {
            @Override
            public InterfaceEndpoint call(InterfaceEndpointInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public InterfaceEndpointImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected InterfaceEndpointImpl wrapModel(InterfaceEndpointInner inner) {
        return  new InterfaceEndpointImpl(inner.name(), inner, manager());
    }

    @Override
    protected InterfaceEndpointImpl wrapModel(String name) {
        return new InterfaceEndpointImpl(name, new InterfaceEndpointInner(), this.manager());
    }

}
