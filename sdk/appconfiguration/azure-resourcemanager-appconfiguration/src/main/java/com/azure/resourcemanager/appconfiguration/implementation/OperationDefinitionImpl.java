// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.implementation;

import com.azure.resourcemanager.appconfiguration.fluent.models.OperationDefinitionInner;
import com.azure.resourcemanager.appconfiguration.models.OperationDefinition;
import com.azure.resourcemanager.appconfiguration.models.OperationDefinitionDisplay;

public final class OperationDefinitionImpl implements OperationDefinition {
    private OperationDefinitionInner innerObject;

    private final com.azure.resourcemanager.appconfiguration.AppConfigurationManager serviceManager;

    OperationDefinitionImpl(
        OperationDefinitionInner innerObject,
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationDefinitionDisplay display() {
        return this.innerModel().display();
    }

    public OperationDefinitionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager() {
        return this.serviceManager;
    }
}
