// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.models;

import com.azure.resourcemanager.appconfiguration.fluent.models.OperationDefinitionInner;

/** An immutable client-side representation of OperationDefinition. */
public interface OperationDefinition {
    /**
     * Gets the name property: Operation name: {provider}/{resource}/{operation}.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the display property: The display information for the configuration store operation.
     *
     * @return the display value.
     */
    OperationDefinitionDisplay display();

    /**
     * Gets the inner com.azure.resourcemanager.appconfiguration.fluent.models.OperationDefinitionInner object.
     *
     * @return the inner object.
     */
    OperationDefinitionInner innerModel();
}
