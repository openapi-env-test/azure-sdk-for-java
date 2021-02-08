// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.CsmUsageQuotaInner;
import com.azure.resourcemanager.appservice.generated.models.CsmUsageQuota;
import com.azure.resourcemanager.appservice.generated.models.LocalizableString;
import java.time.OffsetDateTime;

public final class CsmUsageQuotaImpl implements CsmUsageQuota {
    private CsmUsageQuotaInner innerObject;

    private final WebSiteManager serviceManager;

    CsmUsageQuotaImpl(CsmUsageQuotaInner innerObject, WebSiteManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String unit() {
        return this.innerModel().unit();
    }

    public OffsetDateTime nextResetTime() {
        return this.innerModel().nextResetTime();
    }

    public Long currentValue() {
        return this.innerModel().currentValue();
    }

    public Long limit() {
        return this.innerModel().limit();
    }

    public LocalizableString name() {
        return this.innerModel().name();
    }

    public CsmUsageQuotaInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
