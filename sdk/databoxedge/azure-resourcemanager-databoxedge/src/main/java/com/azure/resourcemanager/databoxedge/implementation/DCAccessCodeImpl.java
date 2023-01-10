// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.implementation;

import com.azure.resourcemanager.databoxedge.fluent.models.DCAccessCodeInner;
import com.azure.resourcemanager.databoxedge.models.DCAccessCode;

public final class DCAccessCodeImpl implements DCAccessCode {
    private DCAccessCodeInner innerObject;

    private final com.azure.resourcemanager.databoxedge.DataBoxEdgeManager serviceManager;

    DCAccessCodeImpl(
        DCAccessCodeInner innerObject, com.azure.resourcemanager.databoxedge.DataBoxEdgeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String authCode() {
        return this.innerModel().authCode();
    }

    public DCAccessCodeInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.databoxedge.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }
}
