// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.sms.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SmsSendOptions model. */
@Fluent
public final class SmsSendOptions {
    /*
     * Enable this flag to receive a delivery report for this message on the
     * Azure Resource EventGrid.
     */
    @JsonProperty(value = "enableDeliveryReport", required = true)
    private boolean deliveryReportEnabled;

    /*
     * Use this field to provide metadata that will then be sent back in the
     * corresponding Delivery Report.
     */
    @JsonProperty(value = "tag")
    private String tag;

    /**
     * Get the deliveryReportEnabled property: Enable this flag to receive a delivery report for this message on the
     * Azure Resource EventGrid.
     *
     * @return the deliveryReportEnabled value.
     */
    public boolean isDeliveryReportEnabled() {
        return this.deliveryReportEnabled;
    }

    /**
     * Set the deliveryReportEnabled property: Enable this flag to receive a delivery report for this message on the
     * Azure Resource EventGrid.
     *
     * @param deliveryReportEnabled the deliveryReportEnabled value to set.
     * @return the SmsSendOptions object itself.
     */
    public SmsSendOptions setDeliveryReportEnabled(boolean deliveryReportEnabled) {
        this.deliveryReportEnabled = deliveryReportEnabled;
        return this;
    }

    /**
     * Get the tag property: Use this field to provide metadata that will then be sent back in the corresponding
     * Delivery Report.
     *
     * @return the tag value.
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * Set the tag property: Use this field to provide metadata that will then be sent back in the corresponding
     * Delivery Report.
     *
     * @param tag the tag value to set.
     * @return the SmsSendOptions object itself.
     */
    public SmsSendOptions setTag(String tag) {
        this.tag = tag;
        return this;
    }
}
