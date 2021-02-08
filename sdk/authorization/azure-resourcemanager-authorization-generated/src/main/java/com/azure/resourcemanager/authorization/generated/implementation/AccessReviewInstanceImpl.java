// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.implementation;

import com.azure.resourcemanager.authorization.generated.AuthorizationManager;
import com.azure.resourcemanager.authorization.generated.fluent.models.AccessReviewInstanceInner;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewInstance;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewInstanceStatus;
import java.time.OffsetDateTime;

public final class AccessReviewInstanceImpl implements AccessReviewInstance {
    private AccessReviewInstanceInner innerObject;

    private final AuthorizationManager serviceManager;

    AccessReviewInstanceImpl(AccessReviewInstanceInner innerObject, AuthorizationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public AccessReviewInstanceStatus status() {
        return this.innerModel().status();
    }

    public OffsetDateTime startDateTime() {
        return this.innerModel().startDateTime();
    }

    public OffsetDateTime endDateTime() {
        return this.innerModel().endDateTime();
    }

    public AccessReviewInstanceInner innerModel() {
        return this.innerObject;
    }

    private AuthorizationManager manager() {
        return this.serviceManager;
    }
}
