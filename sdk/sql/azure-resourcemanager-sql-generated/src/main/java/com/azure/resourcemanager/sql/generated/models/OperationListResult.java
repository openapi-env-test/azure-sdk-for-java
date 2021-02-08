// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.resourcemanager.sql.generated.fluent.models.OperationListResultInner;
import java.util.List;

/** An immutable client-side representation of OperationListResult. */
public interface OperationListResult {
    /**
     * Gets the value property: List of SQL operations supported by the SQL resource provider.
     *
     * @return the value value.
     */
    List<Operation> value();

    /**
     * Gets the nextLink property: URL to get the next set of operation list results if there are any.
     *
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.OperationListResultInner object.
     *
     * @return the inner object.
     */
    OperationListResultInner innerModel();
}
