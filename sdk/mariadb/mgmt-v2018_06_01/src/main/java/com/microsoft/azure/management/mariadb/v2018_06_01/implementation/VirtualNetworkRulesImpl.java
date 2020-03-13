/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.mariadb.v2018_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.mariadb.v2018_06_01.VirtualNetworkRules;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.mariadb.v2018_06_01.VirtualNetworkRule;

class VirtualNetworkRulesImpl extends WrapperImpl<VirtualNetworkRulesInner> implements VirtualNetworkRules {
    private final MariaDBManager manager;

    VirtualNetworkRulesImpl(MariaDBManager manager) {
        super(manager.inner().virtualNetworkRules());
        this.manager = manager;
    }

    public MariaDBManager manager() {
        return this.manager;
    }

    @Override
    public VirtualNetworkRuleImpl define(String name) {
        return wrapModel(name);
    }

    private VirtualNetworkRuleImpl wrapModel(VirtualNetworkRuleInner inner) {
        return  new VirtualNetworkRuleImpl(inner, manager());
    }

    private VirtualNetworkRuleImpl wrapModel(String name) {
        return new VirtualNetworkRuleImpl(name, this.manager());
    }

    @Override
    public Observable<VirtualNetworkRule> listByServerAsync(final String resourceGroupName, final String serverName) {
        VirtualNetworkRulesInner client = this.inner();
        return client.listByServerAsync(resourceGroupName, serverName)
        .flatMapIterable(new Func1<Page<VirtualNetworkRuleInner>, Iterable<VirtualNetworkRuleInner>>() {
            @Override
            public Iterable<VirtualNetworkRuleInner> call(Page<VirtualNetworkRuleInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualNetworkRuleInner, VirtualNetworkRule>() {
            @Override
            public VirtualNetworkRule call(VirtualNetworkRuleInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<VirtualNetworkRule> getAsync(String resourceGroupName, String serverName, String virtualNetworkRuleName) {
        VirtualNetworkRulesInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, virtualNetworkRuleName)
        .flatMap(new Func1<VirtualNetworkRuleInner, Observable<VirtualNetworkRule>>() {
            @Override
            public Observable<VirtualNetworkRule> call(VirtualNetworkRuleInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((VirtualNetworkRule)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serverName, String virtualNetworkRuleName) {
        VirtualNetworkRulesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serverName, virtualNetworkRuleName).toCompletable();
    }

}
