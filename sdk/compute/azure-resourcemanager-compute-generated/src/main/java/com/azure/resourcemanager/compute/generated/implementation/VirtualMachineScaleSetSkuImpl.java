// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetSkuInner;
import com.azure.resourcemanager.compute.generated.models.Sku;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetSku;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetSkuCapacity;

public final class VirtualMachineScaleSetSkuImpl implements VirtualMachineScaleSetSku {
    private VirtualMachineScaleSetSkuInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    VirtualMachineScaleSetSkuImpl(
        VirtualMachineScaleSetSkuInner innerObject,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String resourceType() {
        return this.innerModel().resourceType();
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public VirtualMachineScaleSetSkuCapacity capacity() {
        return this.innerModel().capacity();
    }

    public VirtualMachineScaleSetSkuInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}
