/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.ApplicationGroup;
import rx.Observable;
import com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.ApplicationGroupPatch;
import com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.ApplicationGroupType;
import rx.functions.Func1;

class ApplicationGroupImpl extends GroupableResourceCoreImpl<ApplicationGroup, ApplicationGroupInner, ApplicationGroupImpl, DesktopVirtualizationManager> implements ApplicationGroup, ApplicationGroup.Definition, ApplicationGroup.Update {
    private ApplicationGroupPatch updateParameter;
    ApplicationGroupImpl(String name, ApplicationGroupInner inner, DesktopVirtualizationManager manager) {
        super(name, inner, manager);
        this.updateParameter = new ApplicationGroupPatch();
    }

    @Override
    public Observable<ApplicationGroup> createResourceAsync() {
        ApplicationGroupsInner client = this.manager().inner().applicationGroups();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<ApplicationGroupInner, ApplicationGroupInner>() {
               @Override
               public ApplicationGroupInner call(ApplicationGroupInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ApplicationGroup> updateResourceAsync() {
        ApplicationGroupsInner client = this.manager().inner().applicationGroups();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<ApplicationGroupInner, ApplicationGroupInner>() {
               @Override
               public ApplicationGroupInner call(ApplicationGroupInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ApplicationGroupInner> getInnerAsync() {
        ApplicationGroupsInner client = this.manager().inner().applicationGroups();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new ApplicationGroupPatch();
    }

    @Override
    public ApplicationGroupType applicationGroupType() {
        return this.inner().applicationGroupType();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String friendlyName() {
        return this.inner().friendlyName();
    }

    @Override
    public String hostPoolArmPath() {
        return this.inner().hostPoolArmPath();
    }

    @Override
    public String workspaceArmPath() {
        return this.inner().workspaceArmPath();
    }

    @Override
    public ApplicationGroupImpl withApplicationGroupType(ApplicationGroupType applicationGroupType) {
        this.inner().withApplicationGroupType(applicationGroupType);
        return this;
    }

    @Override
    public ApplicationGroupImpl withHostPoolArmPath(String hostPoolArmPath) {
        this.inner().withHostPoolArmPath(hostPoolArmPath);
        return this;
    }

    @Override
    public ApplicationGroupImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.inner().withDescription(description);
        } else {
            this.updateParameter.withDescription(description);
        }
        return this;
    }

    @Override
    public ApplicationGroupImpl withFriendlyName(String friendlyName) {
        if (isInCreateMode()) {
            this.inner().withFriendlyName(friendlyName);
        } else {
            this.updateParameter.withFriendlyName(friendlyName);
        }
        return this;
    }

}
