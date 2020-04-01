/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01.implementation;

import com.microsoft.azure.management.appservice.v2016_09_01.SkuInfo;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appservice.v2016_09_01.SkuCapacity;
import com.microsoft.azure.management.appservice.v2016_09_01.SkuDescription;

class SkuInfoImpl extends WrapperImpl<SkuInfoInner> implements SkuInfo {
    private final WebManager manager;
    SkuInfoImpl(SkuInfoInner inner, WebManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public WebManager manager() {
        return this.manager;
    }

    @Override
    public SkuCapacity capacity() {
        return this.inner().capacity();
    }

    @Override
    public String resourceType() {
        return this.inner().resourceType();
    }

    @Override
    public SkuDescription sku() {
        return this.inner().sku();
    }

}
