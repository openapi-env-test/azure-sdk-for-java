/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.policyinsights.v2019_10_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.policyinsights.v2019_10_01.PolicyTrackedResources;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.policyinsights.v2019_10_01.PolicyTrackedResource;

class PolicyTrackedResourcesImpl extends WrapperImpl<PolicyTrackedResourcesInner> implements PolicyTrackedResources {
    private final PolicyInsightsManager manager;

    PolicyTrackedResourcesImpl(PolicyInsightsManager manager) {
        super(manager.inner().policyTrackedResources());
        this.manager = manager;
    }

    public PolicyInsightsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PolicyTrackedResource> listQueryResultsForManagementGroupAsync(final String managementGroupName) {
        PolicyTrackedResourcesInner client = this.inner();
        return client.listQueryResultsForManagementGroupAsync(managementGroupName)
        .flatMapIterable(new Func1<Page<PolicyTrackedResourceInner>, Iterable<PolicyTrackedResourceInner>>() {
            @Override
            public Iterable<PolicyTrackedResourceInner> call(Page<PolicyTrackedResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PolicyTrackedResourceInner, PolicyTrackedResource>() {
            @Override
            public PolicyTrackedResource call(PolicyTrackedResourceInner inner) {
                return new PolicyTrackedResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PolicyTrackedResource> listQueryResultsForSubscriptionAsync(final String subscriptionId) {
        PolicyTrackedResourcesInner client = this.inner();
        return client.listQueryResultsForSubscriptionAsync(subscriptionId)
        .flatMapIterable(new Func1<Page<PolicyTrackedResourceInner>, Iterable<PolicyTrackedResourceInner>>() {
            @Override
            public Iterable<PolicyTrackedResourceInner> call(Page<PolicyTrackedResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PolicyTrackedResourceInner, PolicyTrackedResource>() {
            @Override
            public PolicyTrackedResource call(PolicyTrackedResourceInner inner) {
                return new PolicyTrackedResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PolicyTrackedResource> listQueryResultsForResourceGroupAsync(final String resourceGroupName, final String subscriptionId) {
        PolicyTrackedResourcesInner client = this.inner();
        return client.listQueryResultsForResourceGroupAsync(resourceGroupName, subscriptionId)
        .flatMapIterable(new Func1<Page<PolicyTrackedResourceInner>, Iterable<PolicyTrackedResourceInner>>() {
            @Override
            public Iterable<PolicyTrackedResourceInner> call(Page<PolicyTrackedResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PolicyTrackedResourceInner, PolicyTrackedResource>() {
            @Override
            public PolicyTrackedResource call(PolicyTrackedResourceInner inner) {
                return new PolicyTrackedResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PolicyTrackedResource> listQueryResultsForResourceAsync(final String resourceId) {
        PolicyTrackedResourcesInner client = this.inner();
        return client.listQueryResultsForResourceAsync(resourceId)
        .flatMapIterable(new Func1<Page<PolicyTrackedResourceInner>, Iterable<PolicyTrackedResourceInner>>() {
            @Override
            public Iterable<PolicyTrackedResourceInner> call(Page<PolicyTrackedResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PolicyTrackedResourceInner, PolicyTrackedResource>() {
            @Override
            public PolicyTrackedResource call(PolicyTrackedResourceInner inner) {
                return new PolicyTrackedResourceImpl(inner, manager());
            }
        });
    }

}
