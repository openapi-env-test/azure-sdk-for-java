// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databox.models.CloudError;
import com.azure.resourcemanager.databox.models.JobDeliveryInfo;
import com.azure.resourcemanager.databox.models.JobDeliveryType;
import com.azure.resourcemanager.databox.models.JobDetails;
import com.azure.resourcemanager.databox.models.StageName;
import com.azure.resourcemanager.databox.models.TransferType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Job Properties. */
@Fluent
public final class JobProperties {
    /*
     * Type of the data transfer.
     */
    @JsonProperty(value = "transferType", required = true)
    private TransferType transferType;

    /*
     * Describes whether the job is cancellable or not.
     */
    @JsonProperty(value = "isCancellable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isCancellable;

    /*
     * Describes whether the job is deletable or not.
     */
    @JsonProperty(value = "isDeletable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDeletable;

    /*
     * Describes whether the shipping address is editable or not.
     */
    @JsonProperty(value = "isShippingAddressEditable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isShippingAddressEditable;

    /*
     * Is Prepare To Ship Enabled on this job
     */
    @JsonProperty(value = "isPrepareToShipEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isPrepareToShipEnabled;

    /*
     * Name of the stage which is in progress.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private StageName status;

    /*
     * Time at which the job was started in UTC ISO 8601 format.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * Top level error for the job.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private CloudError error;

    /*
     * Details of a job run. This field will only be sent for expand details
     * filter.
     */
    @JsonProperty(value = "details")
    private JobDetails details;

    /*
     * Reason for cancellation.
     */
    @JsonProperty(value = "cancellationReason", access = JsonProperty.Access.WRITE_ONLY)
    private String cancellationReason;

    /*
     * Delivery type of Job.
     */
    @JsonProperty(value = "deliveryType")
    private JobDeliveryType deliveryType;

    /*
     * Delivery Info of Job.
     */
    @JsonProperty(value = "deliveryInfo")
    private JobDeliveryInfo deliveryInfo;

    /*
     * Flag to indicate cancellation of scheduled job.
     */
    @JsonProperty(value = "isCancellableWithoutFee", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isCancellableWithoutFee;

    /**
     * Get the transferType property: Type of the data transfer.
     *
     * @return the transferType value.
     */
    public TransferType transferType() {
        return this.transferType;
    }

    /**
     * Set the transferType property: Type of the data transfer.
     *
     * @param transferType the transferType value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withTransferType(TransferType transferType) {
        this.transferType = transferType;
        return this;
    }

    /**
     * Get the isCancellable property: Describes whether the job is cancellable or not.
     *
     * @return the isCancellable value.
     */
    public Boolean isCancellable() {
        return this.isCancellable;
    }

    /**
     * Get the isDeletable property: Describes whether the job is deletable or not.
     *
     * @return the isDeletable value.
     */
    public Boolean isDeletable() {
        return this.isDeletable;
    }

    /**
     * Get the isShippingAddressEditable property: Describes whether the shipping address is editable or not.
     *
     * @return the isShippingAddressEditable value.
     */
    public Boolean isShippingAddressEditable() {
        return this.isShippingAddressEditable;
    }

    /**
     * Get the isPrepareToShipEnabled property: Is Prepare To Ship Enabled on this job.
     *
     * @return the isPrepareToShipEnabled value.
     */
    public Boolean isPrepareToShipEnabled() {
        return this.isPrepareToShipEnabled;
    }

    /**
     * Get the status property: Name of the stage which is in progress.
     *
     * @return the status value.
     */
    public StageName status() {
        return this.status;
    }

    /**
     * Get the startTime property: Time at which the job was started in UTC ISO 8601 format.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the error property: Top level error for the job.
     *
     * @return the error value.
     */
    public CloudError error() {
        return this.error;
    }

    /**
     * Get the details property: Details of a job run. This field will only be sent for expand details filter.
     *
     * @return the details value.
     */
    public JobDetails details() {
        return this.details;
    }

    /**
     * Set the details property: Details of a job run. This field will only be sent for expand details filter.
     *
     * @param details the details value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withDetails(JobDetails details) {
        this.details = details;
        return this;
    }

    /**
     * Get the cancellationReason property: Reason for cancellation.
     *
     * @return the cancellationReason value.
     */
    public String cancellationReason() {
        return this.cancellationReason;
    }

    /**
     * Get the deliveryType property: Delivery type of Job.
     *
     * @return the deliveryType value.
     */
    public JobDeliveryType deliveryType() {
        return this.deliveryType;
    }

    /**
     * Set the deliveryType property: Delivery type of Job.
     *
     * @param deliveryType the deliveryType value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withDeliveryType(JobDeliveryType deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }

    /**
     * Get the deliveryInfo property: Delivery Info of Job.
     *
     * @return the deliveryInfo value.
     */
    public JobDeliveryInfo deliveryInfo() {
        return this.deliveryInfo;
    }

    /**
     * Set the deliveryInfo property: Delivery Info of Job.
     *
     * @param deliveryInfo the deliveryInfo value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withDeliveryInfo(JobDeliveryInfo deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
        return this;
    }

    /**
     * Get the isCancellableWithoutFee property: Flag to indicate cancellation of scheduled job.
     *
     * @return the isCancellableWithoutFee value.
     */
    public Boolean isCancellableWithoutFee() {
        return this.isCancellableWithoutFee;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (transferType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property transferType in model JobProperties"));
        }
        if (error() != null) {
            error().validate();
        }
        if (details() != null) {
            details().validate();
        }
        if (deliveryInfo() != null) {
            deliveryInfo().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(JobProperties.class);
}
