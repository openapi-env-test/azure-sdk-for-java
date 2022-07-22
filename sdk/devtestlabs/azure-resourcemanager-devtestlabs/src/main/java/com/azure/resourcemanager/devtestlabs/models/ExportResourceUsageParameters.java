// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The parameters of the export operation. */
@Fluent
public final class ExportResourceUsageParameters {
    /*
     * The blob storage absolute sas uri with write permission to the container
     * which the usage data needs to be uploaded to.
     */
    @JsonProperty(value = "blobStorageAbsoluteSasUri")
    private String blobStorageAbsoluteSasUri;

    /*
     * The start time of the usage. If not provided, usage will be reported
     * since the beginning of data collection.
     */
    @JsonProperty(value = "usageStartDate")
    private OffsetDateTime usageStartDate;

    /**
     * Get the blobStorageAbsoluteSasUri property: The blob storage absolute sas uri with write permission to the
     * container which the usage data needs to be uploaded to.
     *
     * @return the blobStorageAbsoluteSasUri value.
     */
    public String blobStorageAbsoluteSasUri() {
        return this.blobStorageAbsoluteSasUri;
    }

    /**
     * Set the blobStorageAbsoluteSasUri property: The blob storage absolute sas uri with write permission to the
     * container which the usage data needs to be uploaded to.
     *
     * @param blobStorageAbsoluteSasUri the blobStorageAbsoluteSasUri value to set.
     * @return the ExportResourceUsageParameters object itself.
     */
    public ExportResourceUsageParameters withBlobStorageAbsoluteSasUri(String blobStorageAbsoluteSasUri) {
        this.blobStorageAbsoluteSasUri = blobStorageAbsoluteSasUri;
        return this;
    }

    /**
     * Get the usageStartDate property: The start time of the usage. If not provided, usage will be reported since the
     * beginning of data collection.
     *
     * @return the usageStartDate value.
     */
    public OffsetDateTime usageStartDate() {
        return this.usageStartDate;
    }

    /**
     * Set the usageStartDate property: The start time of the usage. If not provided, usage will be reported since the
     * beginning of data collection.
     *
     * @param usageStartDate the usageStartDate value to set.
     * @return the ExportResourceUsageParameters object itself.
     */
    public ExportResourceUsageParameters withUsageStartDate(OffsetDateTime usageStartDate) {
        this.usageStartDate = usageStartDate;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
