/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.resources.v2019_08_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.resources.v2019_08_01.Deployments;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.azure.management.resources.v2019_08_01.DeploymentExtended;
import com.microsoft.azure.management.resources.v2019_08_01.DeploymentValidateResult;
import com.microsoft.azure.management.resources.v2019_08_01.DeploymentExportResult;
import com.microsoft.azure.management.resources.v2019_08_01.WhatIfOperationResult;
import com.microsoft.azure.management.resources.v2019_08_01.TemplateHashResult;
import com.microsoft.azure.management.resources.v2019_08_01.ScopedDeployment;
import com.microsoft.azure.management.resources.v2019_08_01.DeploymentWhatIf;
import com.microsoft.azure.arm.utils.PagedListConverter;

class DeploymentsImpl extends WrapperImpl<DeploymentsInner> implements Deployments {
    private PagedListConverter<DeploymentExtendedInner, DeploymentExtended> converter;
    private final ResourcesManager manager;

    DeploymentsImpl(ResourcesManager manager) {
        super(manager.inner().deployments());
        this.manager = manager;
        this.converter = new PagedListConverter<DeploymentExtendedInner, DeploymentExtended>() {
            @Override
            public Observable<DeploymentExtended> typeConvertAsync(DeploymentExtendedInner inner) {
                return Observable.just((DeploymentExtended) wrapModel(inner));
            }
        };
    }

    public ResourcesManager manager() {
        return this.manager;
    }

    @Override
    public DeploymentExtendedImpl define(String name) {
        return wrapModel(name);
    }

    private DeploymentExtendedImpl wrapModel(DeploymentExtendedInner inner) {
        return  new DeploymentExtendedImpl(inner, manager());
    }

    private DeploymentExtendedImpl wrapModel(String name) {
        return new DeploymentExtendedImpl(name, this.manager());
    }

    @Override
    public Completable deleteAtScopeAsync(String scope, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.deleteAtScopeAsync(scope, deploymentName).toCompletable();
    }

    @Override
    public Observable<Boolean> checkExistenceAtScopeAsync(String scope, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.checkExistenceAtScopeAsync(scope, deploymentName)
    ;}

    @Override
    public Observable<DeploymentExtended> createOrUpdateAtScopeAsync(String scope, String deploymentName, DeploymentInner parameters) {
        DeploymentsInner client = this.inner();
        return client.createOrUpdateAtScopeAsync(scope, deploymentName, parameters)
        .map(new Func1<DeploymentExtendedInner, DeploymentExtended>() {
            @Override
            public DeploymentExtended call(DeploymentExtendedInner inner) {
                return new DeploymentExtendedImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentExtended> getAtScopeAsync(String scope, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.getAtScopeAsync(scope, deploymentName)
        .map(new Func1<DeploymentExtendedInner, DeploymentExtended>() {
            @Override
            public DeploymentExtended call(DeploymentExtendedInner inner) {
                return new DeploymentExtendedImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable cancelAtScopeAsync(String scope, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.cancelAtScopeAsync(scope, deploymentName).toCompletable();
    }

    @Override
    public Observable<DeploymentValidateResult> validateAtScopeAsync(String scope, String deploymentName, DeploymentInner parameters) {
        DeploymentsInner client = this.inner();
        return client.validateAtScopeAsync(scope, deploymentName, parameters)
        .map(new Func1<DeploymentValidateResultInner, DeploymentValidateResult>() {
            @Override
            public DeploymentValidateResult call(DeploymentValidateResultInner inner) {
                return new DeploymentValidateResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentExportResult> exportTemplateAtScopeAsync(String scope, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.exportTemplateAtScopeAsync(scope, deploymentName)
        .map(new Func1<DeploymentExportResultInner, DeploymentExportResult>() {
            @Override
            public DeploymentExportResult call(DeploymentExportResultInner inner) {
                return new DeploymentExportResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAtTenantScopeAsync(String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.deleteAtTenantScopeAsync(deploymentName).toCompletable();
    }

    @Override
    public Observable<Boolean> checkExistenceAtTenantScopeAsync(String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.checkExistenceAtTenantScopeAsync(deploymentName)
    ;}

    @Override
    public Observable<DeploymentExtended> createOrUpdateAtTenantScopeAsync(String deploymentName, ScopedDeployment parameters) {
        DeploymentsInner client = this.inner();
        return client.createOrUpdateAtTenantScopeAsync(deploymentName, parameters)
        .map(new Func1<DeploymentExtendedInner, DeploymentExtended>() {
            @Override
            public DeploymentExtended call(DeploymentExtendedInner inner) {
                return new DeploymentExtendedImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentExtended> getAtTenantScopeAsync(String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.getAtTenantScopeAsync(deploymentName)
        .map(new Func1<DeploymentExtendedInner, DeploymentExtended>() {
            @Override
            public DeploymentExtended call(DeploymentExtendedInner inner) {
                return new DeploymentExtendedImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable cancelAtTenantScopeAsync(String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.cancelAtTenantScopeAsync(deploymentName).toCompletable();
    }

    @Override
    public Observable<DeploymentValidateResult> validateAtTenantScopeAsync(String deploymentName, ScopedDeployment parameters) {
        DeploymentsInner client = this.inner();
        return client.validateAtTenantScopeAsync(deploymentName, parameters)
        .map(new Func1<DeploymentValidateResultInner, DeploymentValidateResult>() {
            @Override
            public DeploymentValidateResult call(DeploymentValidateResultInner inner) {
                return new DeploymentValidateResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentExportResult> exportTemplateAtTenantScopeAsync(String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.exportTemplateAtTenantScopeAsync(deploymentName)
        .map(new Func1<DeploymentExportResultInner, DeploymentExportResult>() {
            @Override
            public DeploymentExportResult call(DeploymentExportResultInner inner) {
                return new DeploymentExportResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAtManagementGroupScopeAsync(String groupId, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.deleteAtManagementGroupScopeAsync(groupId, deploymentName).toCompletable();
    }

    @Override
    public Observable<Boolean> checkExistenceAtManagementGroupScopeAsync(String groupId, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.checkExistenceAtManagementGroupScopeAsync(groupId, deploymentName)
    ;}

    @Override
    public Observable<DeploymentExtended> createOrUpdateAtManagementGroupScopeAsync(String groupId, String deploymentName, ScopedDeployment parameters) {
        DeploymentsInner client = this.inner();
        return client.createOrUpdateAtManagementGroupScopeAsync(groupId, deploymentName, parameters)
        .map(new Func1<DeploymentExtendedInner, DeploymentExtended>() {
            @Override
            public DeploymentExtended call(DeploymentExtendedInner inner) {
                return new DeploymentExtendedImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentExtended> getAtManagementGroupScopeAsync(String groupId, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.getAtManagementGroupScopeAsync(groupId, deploymentName)
        .map(new Func1<DeploymentExtendedInner, DeploymentExtended>() {
            @Override
            public DeploymentExtended call(DeploymentExtendedInner inner) {
                return new DeploymentExtendedImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable cancelAtManagementGroupScopeAsync(String groupId, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.cancelAtManagementGroupScopeAsync(groupId, deploymentName).toCompletable();
    }

    @Override
    public Observable<DeploymentValidateResult> validateAtManagementGroupScopeAsync(String groupId, String deploymentName, ScopedDeployment parameters) {
        DeploymentsInner client = this.inner();
        return client.validateAtManagementGroupScopeAsync(groupId, deploymentName, parameters)
        .map(new Func1<DeploymentValidateResultInner, DeploymentValidateResult>() {
            @Override
            public DeploymentValidateResult call(DeploymentValidateResultInner inner) {
                return new DeploymentValidateResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentExportResult> exportTemplateAtManagementGroupScopeAsync(String groupId, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.exportTemplateAtManagementGroupScopeAsync(groupId, deploymentName)
        .map(new Func1<DeploymentExportResultInner, DeploymentExportResult>() {
            @Override
            public DeploymentExportResult call(DeploymentExportResultInner inner) {
                return new DeploymentExportResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentExtended> listAtManagementGroupScopeAsync(final String groupId) {
        DeploymentsInner client = this.inner();
        return client.listAtManagementGroupScopeAsync(groupId)
        .flatMapIterable(new Func1<Page<DeploymentExtendedInner>, Iterable<DeploymentExtendedInner>>() {
            @Override
            public Iterable<DeploymentExtendedInner> call(Page<DeploymentExtendedInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DeploymentExtendedInner, DeploymentExtended>() {
            @Override
            public DeploymentExtended call(DeploymentExtendedInner inner) {
                return new DeploymentExtendedImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAtSubscriptionScopeAsync(String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.deleteAtSubscriptionScopeAsync(deploymentName).toCompletable();
    }

    @Override
    public Observable<Boolean> checkExistenceAtSubscriptionScopeAsync(String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.checkExistenceAtSubscriptionScopeAsync(deploymentName)
    ;}

    @Override
    public Observable<DeploymentExtended> createOrUpdateAtSubscriptionScopeAsync(String deploymentName, DeploymentInner parameters) {
        DeploymentsInner client = this.inner();
        return client.createOrUpdateAtSubscriptionScopeAsync(deploymentName, parameters)
        .map(new Func1<DeploymentExtendedInner, DeploymentExtended>() {
            @Override
            public DeploymentExtended call(DeploymentExtendedInner inner) {
                return new DeploymentExtendedImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentExtended> getAtSubscriptionScopeAsync(String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.getAtSubscriptionScopeAsync(deploymentName)
        .map(new Func1<DeploymentExtendedInner, DeploymentExtended>() {
            @Override
            public DeploymentExtended call(DeploymentExtendedInner inner) {
                return new DeploymentExtendedImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable cancelAtSubscriptionScopeAsync(String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.cancelAtSubscriptionScopeAsync(deploymentName).toCompletable();
    }

    @Override
    public Observable<DeploymentValidateResult> validateAtSubscriptionScopeAsync(String deploymentName, DeploymentInner parameters) {
        DeploymentsInner client = this.inner();
        return client.validateAtSubscriptionScopeAsync(deploymentName, parameters)
        .map(new Func1<DeploymentValidateResultInner, DeploymentValidateResult>() {
            @Override
            public DeploymentValidateResult call(DeploymentValidateResultInner inner) {
                return new DeploymentValidateResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<WhatIfOperationResult> whatIfAtSubscriptionScopeAsync(String deploymentName, DeploymentWhatIf parameters) {
        DeploymentsInner client = this.inner();
        return client.whatIfAtSubscriptionScopeAsync(deploymentName, parameters)
        .map(new Func1<WhatIfOperationResultInner, WhatIfOperationResult>() {
            @Override
            public WhatIfOperationResult call(WhatIfOperationResultInner inner) {
                return new WhatIfOperationResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentExportResult> exportTemplateAtSubscriptionScopeAsync(String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.exportTemplateAtSubscriptionScopeAsync(deploymentName)
        .map(new Func1<DeploymentExportResultInner, DeploymentExportResult>() {
            @Override
            public DeploymentExportResult call(DeploymentExportResultInner inner) {
                return new DeploymentExportResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Boolean> checkExistenceAsync(String resourceGroupName, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.checkExistenceAsync(resourceGroupName, deploymentName)
    ;}

    @Override
    public Completable cancelAsync(String resourceGroupName, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.cancelAsync(resourceGroupName, deploymentName).toCompletable();
    }

    @Override
    public Observable<DeploymentValidateResult> validateAsync(String resourceGroupName, String deploymentName, DeploymentInner parameters) {
        DeploymentsInner client = this.inner();
        return client.validateAsync(resourceGroupName, deploymentName, parameters)
        .map(new Func1<DeploymentValidateResultInner, DeploymentValidateResult>() {
            @Override
            public DeploymentValidateResult call(DeploymentValidateResultInner inner) {
                return new DeploymentValidateResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<WhatIfOperationResult> whatIfAsync(String resourceGroupName, String deploymentName, DeploymentWhatIf parameters) {
        DeploymentsInner client = this.inner();
        return client.whatIfAsync(resourceGroupName, deploymentName, parameters)
        .map(new Func1<WhatIfOperationResultInner, WhatIfOperationResult>() {
            @Override
            public WhatIfOperationResult call(WhatIfOperationResultInner inner) {
                return new WhatIfOperationResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentExportResult> exportTemplateAsync(String resourceGroupName, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.exportTemplateAsync(resourceGroupName, deploymentName)
        .map(new Func1<DeploymentExportResultInner, DeploymentExportResult>() {
            @Override
            public DeploymentExportResult call(DeploymentExportResultInner inner) {
                return new DeploymentExportResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentExtended> listAtScopeAsync(final String scope) {
        DeploymentsInner client = this.inner();
        return client.listAtScopeAsync(scope)
        .flatMapIterable(new Func1<Page<DeploymentExtendedInner>, Iterable<DeploymentExtendedInner>>() {
            @Override
            public Iterable<DeploymentExtendedInner> call(Page<DeploymentExtendedInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DeploymentExtendedInner, DeploymentExtended>() {
            @Override
            public DeploymentExtended call(DeploymentExtendedInner inner) {
                return new DeploymentExtendedImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentExtended> listAtTenantScopeAsync() {
        DeploymentsInner client = this.inner();
        return client.listAtTenantScopeAsync()
        .flatMapIterable(new Func1<Page<DeploymentExtendedInner>, Iterable<DeploymentExtendedInner>>() {
            @Override
            public Iterable<DeploymentExtendedInner> call(Page<DeploymentExtendedInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DeploymentExtendedInner, DeploymentExtended>() {
            @Override
            public DeploymentExtended call(DeploymentExtendedInner inner) {
                return new DeploymentExtendedImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<TemplateHashResult> calculateTemplateHashAsync(Object template) {
        DeploymentsInner client = this.inner();
        return client.calculateTemplateHashAsync(template)
        .map(new Func1<TemplateHashResultInner, TemplateHashResult>() {
            @Override
            public TemplateHashResult call(TemplateHashResultInner inner) {
                return new TemplateHashResultImpl(inner, manager());
            }
        });
    }

    @Override
    public PagedList<DeploymentExtended> list() {
        DeploymentsInner client = this.inner();
        return converter.convert(client.list());
    }

    @Override
    public Observable<DeploymentExtended> listAsync() {
        DeploymentsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<DeploymentExtendedInner>, Iterable<DeploymentExtendedInner>>() {
            @Override
            public Iterable<DeploymentExtendedInner> call(Page<DeploymentExtendedInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DeploymentExtendedInner, DeploymentExtended>() {
            @Override
            public DeploymentExtended call(DeploymentExtendedInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<DeploymentExtended> listByResourceGroup(String resourceGroupName) {
        DeploymentsInner client = this.inner();
        return converter.convert(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<DeploymentExtended> listByResourceGroupAsync(String resourceGroupName) {
        DeploymentsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<DeploymentExtendedInner>, Iterable<DeploymentExtendedInner>>() {
            @Override
            public Iterable<DeploymentExtendedInner> call(Page<DeploymentExtendedInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DeploymentExtendedInner, DeploymentExtended>() {
            @Override
            public DeploymentExtended call(DeploymentExtendedInner inner) {
                return wrapModel(inner);
            }
        });
    }

    private Observable<DeploymentExtendedInner> getInnerAsync(String resourceGroupName, String name) {
        DeploymentsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    public DeploymentExtended getByResourceGroup(String resourceGroupName, String name) {
        return getByResourceGroupAsync(resourceGroupName, name).toBlocking().last();
    }

    @Override
    public Observable<DeploymentExtended> getByResourceGroupAsync(String resourceGroupName, String name) {
        return this.getInnerAsync(resourceGroupName, name).flatMap(new Func1<DeploymentExtendedInner, Observable<DeploymentExtended>> () {
            @Override
            public Observable<DeploymentExtended> call(DeploymentExtendedInner innerT) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((DeploymentExtended)wrapModel(innerT));
                }
            }
        });
    }

    @Override
    public ServiceFuture<DeploymentExtended> getByResourceGroupAsync(String resourceGroupName, String name, ServiceCallback<DeploymentExtended> callback) {
        return ServiceFuture.fromBody(getByResourceGroupAsync(resourceGroupName, name), callback);
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
    public void deleteByResourceGroup(String resourceGroupName, String name) {
        this.deleteByResourceGroupAsync(resourceGroupName, name).await();
    }

    @Override
    public Completable deleteByResourceGroupAsync(String resourceGroupName, String name) {
        return this.inner().deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public ServiceFuture<Void> deleteByResourceGroupAsync(String resourceGroupName, String name, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(deleteByResourceGroupAsync(resourceGroupName, name), serviceCallback);
    }

}
