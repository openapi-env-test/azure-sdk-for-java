// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerlockbox.implementation;

import com.azure.resourcemanager.customerlockbox.fluent.models.ApprovalInner;
import com.azure.resourcemanager.customerlockbox.models.Approval;
import com.azure.resourcemanager.customerlockbox.models.Decision;

public final class ApprovalImpl implements Approval {
    private ApprovalInner innerObject;

    private final com.azure.resourcemanager.customerlockbox.CustomerLockboxManager serviceManager;

    ApprovalImpl(
        ApprovalInner innerObject, com.azure.resourcemanager.customerlockbox.CustomerLockboxManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Decision decision() {
        return this.innerModel().decision();
    }

    public String reason() {
        return this.innerModel().reason();
    }

    public ApprovalInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.customerlockbox.CustomerLockboxManager manager() {
        return this.serviceManager;
    }
}
