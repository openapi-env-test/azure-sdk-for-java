// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.implementation;

import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.resources.generated.fluent.models.WhatIfOperationResultInner;
import com.azure.resourcemanager.resources.generated.models.WhatIfChange;
import com.azure.resourcemanager.resources.generated.models.WhatIfOperationResult;
import java.util.Collections;
import java.util.List;

public final class WhatIfOperationResultImpl implements WhatIfOperationResult {
    private WhatIfOperationResultInner innerObject;

    private final com.azure.resourcemanager.resources.generated.ResourceManager serviceManager;

    WhatIfOperationResultImpl(
        WhatIfOperationResultInner innerObject,
        com.azure.resourcemanager.resources.generated.ResourceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String status() {
        return this.innerModel().status();
    }

    public ManagementError error() {
        return this.innerModel().error();
    }

    public List<WhatIfChange> changes() {
        List<WhatIfChange> inner = this.innerModel().changes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public WhatIfOperationResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.resources.generated.ResourceManager manager() {
        return this.serviceManager;
    }
}
