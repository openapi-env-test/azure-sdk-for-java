// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.resourcemanager.datamigration.fluent.models.OperationsDefinitionInner;
import java.util.Map;

/** An immutable client-side representation of OperationsDefinition. */
public interface OperationsDefinition {
    /**
     * Gets the name property: The name property.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the isDataAction property: Indicates whether the operation is a data action.
     *
     * @return the isDataAction value.
     */
    Boolean isDataAction();

    /**
     * Gets the display property: The display property.
     *
     * @return the display value.
     */
    OperationsDisplayDefinition display();

    /**
     * Gets the origin property: The origin property.
     *
     * @return the origin value.
     */
    OperationOrigin origin();

    /**
     * Gets the properties property: Dictionary of &lt;AnyObject&gt;.
     *
     * @return the properties value.
     */
    Map<String, Object> properties();

    /**
     * Gets the inner com.azure.resourcemanager.datamigration.fluent.models.OperationsDefinitionInner object.
     *
     * @return the inner object.
     */
    OperationsDefinitionInner innerModel();
}
