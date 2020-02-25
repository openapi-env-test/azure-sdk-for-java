/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2018_07_01_preview.IntegrationAccountAssemblies;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowTriggerCallbackUrl;
import com.microsoft.azure.management.logic.v2018_07_01_preview.AssemblyDefinition;

class IntegrationAccountAssembliesImpl extends WrapperImpl<IntegrationAccountAssembliesInner> implements IntegrationAccountAssemblies {
    private final LogicManager manager;

    IntegrationAccountAssembliesImpl(LogicManager manager) {
        super(manager.inner().integrationAccountAssemblies());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public AssemblyDefinitionImpl define(String name) {
        return wrapModel(name);
    }

    private AssemblyDefinitionImpl wrapModel(AssemblyDefinitionInner inner) {
        return  new AssemblyDefinitionImpl(inner, manager());
    }

    private AssemblyDefinitionImpl wrapModel(String name) {
        return new AssemblyDefinitionImpl(name, this.manager());
    }

    @Override
    public Observable<WorkflowTriggerCallbackUrl> listContentCallbackUrlAsync(String resourceGroupName, String integrationAccountName, String assemblyArtifactName) {
        IntegrationAccountAssembliesInner client = this.inner();
        return client.listContentCallbackUrlAsync(resourceGroupName, integrationAccountName, assemblyArtifactName)
        .map(new Func1<WorkflowTriggerCallbackUrlInner, WorkflowTriggerCallbackUrl>() {
            @Override
            public WorkflowTriggerCallbackUrl call(WorkflowTriggerCallbackUrlInner inner) {
                return new WorkflowTriggerCallbackUrlImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<AssemblyDefinition> listAsync(String resourceGroupName, String integrationAccountName) {
        IntegrationAccountAssembliesInner client = this.inner();
        return client.listAsync(resourceGroupName, integrationAccountName)
        .flatMap(new Func1<List<AssemblyDefinitionInner>, Observable<AssemblyDefinitionInner>>() {
            @Override
            public Observable<AssemblyDefinitionInner> call(List<AssemblyDefinitionInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<AssemblyDefinitionInner, AssemblyDefinition>() {
            @Override
            public AssemblyDefinition call(AssemblyDefinitionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<AssemblyDefinition> getAsync(String resourceGroupName, String integrationAccountName, String assemblyArtifactName) {
        IntegrationAccountAssembliesInner client = this.inner();
        return client.getAsync(resourceGroupName, integrationAccountName, assemblyArtifactName)
        .flatMap(new Func1<AssemblyDefinitionInner, Observable<AssemblyDefinition>>() {
            @Override
            public Observable<AssemblyDefinition> call(AssemblyDefinitionInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((AssemblyDefinition)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String integrationAccountName, String assemblyArtifactName) {
        IntegrationAccountAssembliesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, integrationAccountName, assemblyArtifactName).toCompletable();
    }

}
