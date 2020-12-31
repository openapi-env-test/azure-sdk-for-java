// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.implementation;

import com.azure.resourcemanager.confluent.ConfluentManager;
import com.azure.resourcemanager.confluent.fluent.models.ConfluentAgreementResourceInner;
import com.azure.resourcemanager.confluent.models.ConfluentAgreementProperties;
import com.azure.resourcemanager.confluent.models.ConfluentAgreementResource;

public final class ConfluentAgreementResourceImpl implements ConfluentAgreementResource {
    private ConfluentAgreementResourceInner innerObject;

    private final ConfluentManager serviceManager;

    ConfluentAgreementResourceImpl(ConfluentAgreementResourceInner innerObject, ConfluentManager serviceManager) {
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

    public ConfluentAgreementProperties properties() {
        return this.innerModel().properties();
    }

    public ConfluentAgreementResourceInner innerModel() {
        return this.innerObject;
    }

    private ConfluentManager manager() {
        return this.serviceManager;
    }
}
