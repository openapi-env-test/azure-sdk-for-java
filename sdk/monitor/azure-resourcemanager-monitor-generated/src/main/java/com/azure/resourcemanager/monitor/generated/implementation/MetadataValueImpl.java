// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.resourcemanager.monitor.generated.fluent.models.LocalizableStringInner;
import com.azure.resourcemanager.monitor.generated.fluent.models.MetadataValueInner;
import com.azure.resourcemanager.monitor.generated.models.LocalizableString;
import com.azure.resourcemanager.monitor.generated.models.MetadataValue;

public final class MetadataValueImpl implements MetadataValue {
    private MetadataValueInner innerObject;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

    MetadataValueImpl(
        MetadataValueInner innerObject, com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public LocalizableString name() {
        LocalizableStringInner inner = this.innerModel().name();
        if (inner != null) {
            return new LocalizableStringImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public String value() {
        return this.innerModel().value();
    }

    public MetadataValueInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }
}
