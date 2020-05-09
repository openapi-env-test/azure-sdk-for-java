/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.logic.v2019_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2019_05_01.IntegrationAccountPartners;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.logic.v2019_05_01.WorkflowTriggerCallbackUrl;
import com.microsoft.azure.management.logic.v2019_05_01.GetCallbackUrlParameters;
import com.microsoft.azure.management.logic.v2019_05_01.IntegrationAccountPartner;

class IntegrationAccountPartnersImpl extends WrapperImpl<IntegrationAccountPartnersInner> implements IntegrationAccountPartners {
    private final LogicManager manager;

    IntegrationAccountPartnersImpl(LogicManager manager) {
        super(manager.inner().integrationAccountPartners());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public IntegrationAccountPartnerImpl define(String name) {
        return wrapModel(name);
    }

    private IntegrationAccountPartnerImpl wrapModel(IntegrationAccountPartnerInner inner) {
        return  new IntegrationAccountPartnerImpl(inner, manager());
    }

    private IntegrationAccountPartnerImpl wrapModel(String name) {
        return new IntegrationAccountPartnerImpl(name, this.manager());
    }

    @Override
    public Observable<WorkflowTriggerCallbackUrl> listContentCallbackUrlAsync(String resourceGroupName, String integrationAccountName, String partnerName, GetCallbackUrlParameters listContentCallbackUrl) {
        IntegrationAccountPartnersInner client = this.inner();
        return client.listContentCallbackUrlAsync(resourceGroupName, integrationAccountName, partnerName, listContentCallbackUrl)
        .map(new Func1<WorkflowTriggerCallbackUrlInner, WorkflowTriggerCallbackUrl>() {
            @Override
            public WorkflowTriggerCallbackUrl call(WorkflowTriggerCallbackUrlInner inner) {
                return new WorkflowTriggerCallbackUrlImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<IntegrationAccountPartner> listAsync(final String resourceGroupName, final String integrationAccountName) {
        IntegrationAccountPartnersInner client = this.inner();
        return client.listAsync(resourceGroupName, integrationAccountName)
        .flatMapIterable(new Func1<Page<IntegrationAccountPartnerInner>, Iterable<IntegrationAccountPartnerInner>>() {
            @Override
            public Iterable<IntegrationAccountPartnerInner> call(Page<IntegrationAccountPartnerInner> page) {
                return page.items();
            }
        })
        .map(new Func1<IntegrationAccountPartnerInner, IntegrationAccountPartner>() {
            @Override
            public IntegrationAccountPartner call(IntegrationAccountPartnerInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<IntegrationAccountPartner> getAsync(String resourceGroupName, String integrationAccountName, String partnerName) {
        IntegrationAccountPartnersInner client = this.inner();
        return client.getAsync(resourceGroupName, integrationAccountName, partnerName)
        .flatMap(new Func1<IntegrationAccountPartnerInner, Observable<IntegrationAccountPartner>>() {
            @Override
            public Observable<IntegrationAccountPartner> call(IntegrationAccountPartnerInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((IntegrationAccountPartner)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String integrationAccountName, String partnerName) {
        IntegrationAccountPartnersInner client = this.inner();
        return client.deleteAsync(resourceGroupName, integrationAccountName, partnerName).toCompletable();
    }

}
