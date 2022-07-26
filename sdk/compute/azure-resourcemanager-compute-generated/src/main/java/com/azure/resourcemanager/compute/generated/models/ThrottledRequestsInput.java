// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import java.time.OffsetDateTime;

/** Api request input for LogAnalytics getThrottledRequests Api. */
@Fluent
public final class ThrottledRequestsInput extends LogAnalyticsInputBase {
    /** {@inheritDoc} */
    @Override
    public ThrottledRequestsInput withBlobContainerSasUri(String blobContainerSasUri) {
        super.withBlobContainerSasUri(blobContainerSasUri);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ThrottledRequestsInput withFromTime(OffsetDateTime fromTime) {
        super.withFromTime(fromTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ThrottledRequestsInput withToTime(OffsetDateTime toTime) {
        super.withToTime(toTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ThrottledRequestsInput withGroupByThrottlePolicy(Boolean groupByThrottlePolicy) {
        super.withGroupByThrottlePolicy(groupByThrottlePolicy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ThrottledRequestsInput withGroupByOperationName(Boolean groupByOperationName) {
        super.withGroupByOperationName(groupByOperationName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ThrottledRequestsInput withGroupByResourceName(Boolean groupByResourceName) {
        super.withGroupByResourceName(groupByResourceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ThrottledRequestsInput withGroupByClientApplicationId(Boolean groupByClientApplicationId) {
        super.withGroupByClientApplicationId(groupByClientApplicationId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ThrottledRequestsInput withGroupByUserAgent(Boolean groupByUserAgent) {
        super.withGroupByUserAgent(groupByUserAgent);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
