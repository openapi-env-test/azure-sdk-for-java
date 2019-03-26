/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.imagebuilder.v2019_02_01_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.imagebuilder.v2019_02_01_preview.ImageTemplate;
import rx.Observable;
import com.microsoft.azure.management.imagebuilder.v2019_02_01_preview.ImageTemplateSource;
import java.util.List;
import com.microsoft.azure.management.imagebuilder.v2019_02_01_preview.ImageTemplateCustomizer;
import com.microsoft.azure.management.imagebuilder.v2019_02_01_preview.ImageTemplateDistributor;
import com.microsoft.azure.management.imagebuilder.v2019_02_01_preview.ProvisioningError;
import com.microsoft.azure.management.imagebuilder.v2019_02_01_preview.ImageTemplateLastRunStatus;

class ImageTemplateImpl extends GroupableResourceCoreImpl<ImageTemplate, ImageTemplateInner, ImageTemplateImpl, VirtualMachineImagesManager> implements ImageTemplate, ImageTemplate.Definition, ImageTemplate.Update {
    ImageTemplateImpl(String name, ImageTemplateInner inner, VirtualMachineImagesManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<ImageTemplate> createResourceAsync() {
        VirtualMachineImageTemplatesInner client = this.manager().inner().virtualMachineImageTemplates();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ImageTemplate> updateResourceAsync() {
        VirtualMachineImageTemplatesInner client = this.manager().inner().virtualMachineImageTemplates();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ImageTemplateInner> getInnerAsync() {
        VirtualMachineImageTemplatesInner client = this.manager().inner().virtualMachineImageTemplates();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<ImageTemplateCustomizer> customize() {
        return this.inner().customize();
    }

    @Override
    public List<ImageTemplateDistributor> distribute() {
        return this.inner().distribute();
    }

    @Override
    public ImageTemplateLastRunStatus lastRunStatus() {
        return this.inner().lastRunStatus();
    }

    @Override
    public ProvisioningError provisioningError() {
        return this.inner().provisioningError();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public ImageTemplateSource source() {
        return this.inner().source();
    }

    @Override
    public ImageTemplateImpl withDistribute(List<ImageTemplateDistributor> distribute) {
        this.inner().withDistribute(distribute);
        return this;
    }

    @Override
    public ImageTemplateImpl withSource(ImageTemplateSource source) {
        this.inner().withSource(source);
        return this;
    }

    @Override
    public ImageTemplateImpl withCustomize(List<ImageTemplateCustomizer> customize) {
        this.inner().withCustomize(customize);
        return this;
    }

}
