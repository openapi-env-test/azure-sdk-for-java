// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.singularity.models;

import com.azure.resourcemanager.singularity.fluent.models.InstanceTypeSeriesQuotaListInner;
import java.util.List;

/** An immutable client-side representation of InstanceTypeSeriesQuotaList. */
public interface InstanceTypeSeriesQuotaList {
    /**
     * Gets the value property: One page of the list.
     *
     * @return the value value.
     */
    List<InstanceTypeSeriesQuota> value();

    /**
     * Gets the nextLink property: URI to fetch the next page of the list.
     *
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner com.azure.resourcemanager.singularity.fluent.models.InstanceTypeSeriesQuotaListInner object.
     *
     * @return the inner object.
     */
    InstanceTypeSeriesQuotaListInner innerModel();
}
