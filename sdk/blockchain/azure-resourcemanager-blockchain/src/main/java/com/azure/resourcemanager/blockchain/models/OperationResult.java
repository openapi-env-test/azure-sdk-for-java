// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.blockchain.models;

import com.azure.resourcemanager.blockchain.fluent.models.OperationResultInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of OperationResult. */
public interface OperationResult {
    /**
     * Gets the name property: Gets or sets the operation name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the startTime property: Gets or sets the operation start time.
     *
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the endTime property: Gets or sets the operation end time.
     *
     * @return the endTime value.
     */
    OffsetDateTime endTime();

    /**
     * Gets the inner com.azure.resourcemanager.blockchain.fluent.models.OperationResultInner object.
     *
     * @return the inner object.
     */
    OperationResultInner innerModel();
}
