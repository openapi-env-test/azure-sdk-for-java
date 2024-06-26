// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.reservations.models.QuotaRequestState;
import com.azure.resourcemanager.reservations.models.SubRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Quota request details. */
@Fluent
public final class QuotaRequestDetailsInner extends ProxyResource {
    /*
     * Quota request details.
     */
    @JsonProperty(value = "properties")
    private QuotaRequestProperties innerProperties;

    /** Creates an instance of QuotaRequestDetailsInner class. */
    public QuotaRequestDetailsInner() {
    }

    /**
     * Get the innerProperties property: Quota request details.
     *
     * @return the innerProperties value.
     */
    private QuotaRequestProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the provisioningState property: The quota request status.
     *
     * @return the provisioningState value.
     */
    public QuotaRequestState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: The quota request status.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the QuotaRequestDetailsInner object itself.
     */
    public QuotaRequestDetailsInner withProvisioningState(QuotaRequestState provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QuotaRequestProperties();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Get the message property: User friendly status message.
     *
     * @return the message value.
     */
    public String message() {
        return this.innerProperties() == null ? null : this.innerProperties().message();
    }

    /**
     * Get the requestSubmitTime property: The time when the quota request was submitted using format:
     * yyyy-MM-ddTHH:mm:ssZ as specified by the ISO 8601 standard.
     *
     * @return the requestSubmitTime value.
     */
    public OffsetDateTime requestSubmitTime() {
        return this.innerProperties() == null ? null : this.innerProperties().requestSubmitTime();
    }

    /**
     * Get the value property: The quotaRequests.
     *
     * @return the value value.
     */
    public List<SubRequest> value() {
        return this.innerProperties() == null ? null : this.innerProperties().value();
    }

    /**
     * Set the value property: The quotaRequests.
     *
     * @param value the value value to set.
     * @return the QuotaRequestDetailsInner object itself.
     */
    public QuotaRequestDetailsInner withValue(List<SubRequest> value) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QuotaRequestProperties();
        }
        this.innerProperties().withValue(value);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
