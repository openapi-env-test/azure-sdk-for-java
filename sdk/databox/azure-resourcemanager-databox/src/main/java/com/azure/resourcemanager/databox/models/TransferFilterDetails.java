// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Details of the filtering the transfer of data. */
@Fluent
public final class TransferFilterDetails {
    /*
     * Type of the account of data.
     */
    @JsonProperty(value = "dataAccountType", required = true)
    private DataAccountType dataAccountType;

    /*
     * Filter details to transfer blobs.
     */
    @JsonProperty(value = "blobFilterDetails")
    private BlobFilterDetails blobFilterDetails;

    /*
     * Filter details to transfer Azure files.
     */
    @JsonProperty(value = "azureFileFilterDetails")
    private AzureFileFilterDetails azureFileFilterDetails;

    /*
     * Details of the filter files to be used for data transfer.
     */
    @JsonProperty(value = "filterFileDetails")
    private List<FilterFileDetails> filterFileDetails;

    /**
     * Get the dataAccountType property: Type of the account of data.
     *
     * @return the dataAccountType value.
     */
    public DataAccountType dataAccountType() {
        return this.dataAccountType;
    }

    /**
     * Set the dataAccountType property: Type of the account of data.
     *
     * @param dataAccountType the dataAccountType value to set.
     * @return the TransferFilterDetails object itself.
     */
    public TransferFilterDetails withDataAccountType(DataAccountType dataAccountType) {
        this.dataAccountType = dataAccountType;
        return this;
    }

    /**
     * Get the blobFilterDetails property: Filter details to transfer blobs.
     *
     * @return the blobFilterDetails value.
     */
    public BlobFilterDetails blobFilterDetails() {
        return this.blobFilterDetails;
    }

    /**
     * Set the blobFilterDetails property: Filter details to transfer blobs.
     *
     * @param blobFilterDetails the blobFilterDetails value to set.
     * @return the TransferFilterDetails object itself.
     */
    public TransferFilterDetails withBlobFilterDetails(BlobFilterDetails blobFilterDetails) {
        this.blobFilterDetails = blobFilterDetails;
        return this;
    }

    /**
     * Get the azureFileFilterDetails property: Filter details to transfer Azure files.
     *
     * @return the azureFileFilterDetails value.
     */
    public AzureFileFilterDetails azureFileFilterDetails() {
        return this.azureFileFilterDetails;
    }

    /**
     * Set the azureFileFilterDetails property: Filter details to transfer Azure files.
     *
     * @param azureFileFilterDetails the azureFileFilterDetails value to set.
     * @return the TransferFilterDetails object itself.
     */
    public TransferFilterDetails withAzureFileFilterDetails(AzureFileFilterDetails azureFileFilterDetails) {
        this.azureFileFilterDetails = azureFileFilterDetails;
        return this;
    }

    /**
     * Get the filterFileDetails property: Details of the filter files to be used for data transfer.
     *
     * @return the filterFileDetails value.
     */
    public List<FilterFileDetails> filterFileDetails() {
        return this.filterFileDetails;
    }

    /**
     * Set the filterFileDetails property: Details of the filter files to be used for data transfer.
     *
     * @param filterFileDetails the filterFileDetails value to set.
     * @return the TransferFilterDetails object itself.
     */
    public TransferFilterDetails withFilterFileDetails(List<FilterFileDetails> filterFileDetails) {
        this.filterFileDetails = filterFileDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataAccountType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property dataAccountType in model TransferFilterDetails"));
        }
        if (blobFilterDetails() != null) {
            blobFilterDetails().validate();
        }
        if (azureFileFilterDetails() != null) {
            azureFileFilterDetails().validate();
        }
        if (filterFileDetails() != null) {
            filterFileDetails().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TransferFilterDetails.class);
}
