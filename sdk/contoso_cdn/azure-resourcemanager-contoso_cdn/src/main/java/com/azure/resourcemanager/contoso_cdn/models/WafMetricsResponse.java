// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.contoso_cdn.models;

import com.azure.resourcemanager.contoso_cdn.fluent.models.WafMetricsResponseInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of WafMetricsResponse. */
public interface WafMetricsResponse {
    /**
     * Gets the dateTimeBegin property: The dateTimeBegin property.
     *
     * @return the dateTimeBegin value.
     */
    OffsetDateTime dateTimeBegin();

    /**
     * Gets the dateTimeEnd property: The dateTimeEnd property.
     *
     * @return the dateTimeEnd value.
     */
    OffsetDateTime dateTimeEnd();

    /**
     * Gets the granularity property: The granularity property.
     *
     * @return the granularity value.
     */
    WafMetricsResponseGranularity granularity();

    /**
     * Gets the series property: The series property.
     *
     * @return the series value.
     */
    List<WafMetricsResponseSeriesItem> series();

    /**
     * Gets the inner com.azure.resourcemanager.contoso_cdn.fluent.models.WafMetricsResponseInner object.
     *
     * @return the inner object.
     */
    WafMetricsResponseInner innerModel();
}
