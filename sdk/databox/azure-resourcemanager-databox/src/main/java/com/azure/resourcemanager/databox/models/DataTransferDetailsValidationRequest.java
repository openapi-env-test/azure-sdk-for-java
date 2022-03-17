// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Request to validate export and import data details. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "validationType")
@JsonTypeName("ValidateDataTransferDetails")
@Fluent
public final class DataTransferDetailsValidationRequest extends ValidationInputRequest {
    /*
     * List of DataTransfer details to be used to export data from azure.
     */
    @JsonProperty(value = "dataExportDetails")
    private List<DataExportDetails> dataExportDetails;

    /*
     * List of DataTransfer details to be used to import data to azure.
     */
    @JsonProperty(value = "dataImportDetails")
    private List<DataImportDetails> dataImportDetails;

    /*
     * Device type.
     */
    @JsonProperty(value = "deviceType", required = true)
    private SkuName deviceType;

    /*
     * Type of the transfer.
     */
    @JsonProperty(value = "transferType", required = true)
    private TransferType transferType;

    /**
     * Get the dataExportDetails property: List of DataTransfer details to be used to export data from azure.
     *
     * @return the dataExportDetails value.
     */
    public List<DataExportDetails> dataExportDetails() {
        return this.dataExportDetails;
    }

    /**
     * Set the dataExportDetails property: List of DataTransfer details to be used to export data from azure.
     *
     * @param dataExportDetails the dataExportDetails value to set.
     * @return the DataTransferDetailsValidationRequest object itself.
     */
    public DataTransferDetailsValidationRequest withDataExportDetails(List<DataExportDetails> dataExportDetails) {
        this.dataExportDetails = dataExportDetails;
        return this;
    }

    /**
     * Get the dataImportDetails property: List of DataTransfer details to be used to import data to azure.
     *
     * @return the dataImportDetails value.
     */
    public List<DataImportDetails> dataImportDetails() {
        return this.dataImportDetails;
    }

    /**
     * Set the dataImportDetails property: List of DataTransfer details to be used to import data to azure.
     *
     * @param dataImportDetails the dataImportDetails value to set.
     * @return the DataTransferDetailsValidationRequest object itself.
     */
    public DataTransferDetailsValidationRequest withDataImportDetails(List<DataImportDetails> dataImportDetails) {
        this.dataImportDetails = dataImportDetails;
        return this;
    }

    /**
     * Get the deviceType property: Device type.
     *
     * @return the deviceType value.
     */
    public SkuName deviceType() {
        return this.deviceType;
    }

    /**
     * Set the deviceType property: Device type.
     *
     * @param deviceType the deviceType value to set.
     * @return the DataTransferDetailsValidationRequest object itself.
     */
    public DataTransferDetailsValidationRequest withDeviceType(SkuName deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * Get the transferType property: Type of the transfer.
     *
     * @return the transferType value.
     */
    public TransferType transferType() {
        return this.transferType;
    }

    /**
     * Set the transferType property: Type of the transfer.
     *
     * @param transferType the transferType value to set.
     * @return the DataTransferDetailsValidationRequest object itself.
     */
    public DataTransferDetailsValidationRequest withTransferType(TransferType transferType) {
        this.transferType = transferType;
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
        if (dataExportDetails() != null) {
            dataExportDetails().forEach(e -> e.validate());
        }
        if (dataImportDetails() != null) {
            dataImportDetails().forEach(e -> e.validate());
        }
        if (deviceType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property deviceType in model DataTransferDetailsValidationRequest"));
        }
        if (transferType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property transferType in model DataTransferDetailsValidationRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DataTransferDetailsValidationRequest.class);
}
