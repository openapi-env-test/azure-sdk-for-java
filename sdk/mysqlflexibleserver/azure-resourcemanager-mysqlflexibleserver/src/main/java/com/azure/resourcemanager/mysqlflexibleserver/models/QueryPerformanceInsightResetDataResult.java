// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.QueryPerformanceInsightResetDataResultInner;

/** An immutable client-side representation of QueryPerformanceInsightResetDataResult. */
public interface QueryPerformanceInsightResetDataResult {
    /**
     * Gets the status property: Indicates result of the operation.
     *
     * @return the status value.
     */
    QueryPerformanceInsightResetDataResultState status();

    /**
     * Gets the message property: operation message.
     *
     * @return the message value.
     */
    String message();

    /**
     * Gets the inner
     * com.azure.resourcemanager.mysqlflexibleserver.fluent.models.QueryPerformanceInsightResetDataResultInner object.
     *
     * @return the inner object.
     */
    QueryPerformanceInsightResetDataResultInner innerModel();
}
