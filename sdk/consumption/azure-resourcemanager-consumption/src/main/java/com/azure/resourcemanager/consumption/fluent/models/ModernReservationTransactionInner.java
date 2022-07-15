// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.models.ReservationTransactionResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/** Modern Reservation transaction resource. */
@Fluent
public final class ModernReservationTransactionInner extends ReservationTransactionResource {
    /*
     * The properties of a modern reservation transaction.
     */
    @JsonProperty(value = "properties", required = true)
    private ModernReservationTransactionProperties innerProperties = new ModernReservationTransactionProperties();

    /**
     * Get the innerProperties property: The properties of a modern reservation transaction.
     *
     * @return the innerProperties value.
     */
    private ModernReservationTransactionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the amount property: The charge of the transaction.
     *
     * @return the amount value.
     */
    public BigDecimal amount() {
        return this.innerProperties() == null ? null : this.innerProperties().amount();
    }

    /**
     * Get the armSkuName property: This is the ARM Sku name. It can be used to join with the serviceType field in
     * additional info in usage records.
     *
     * @return the armSkuName value.
     */
    public String armSkuName() {
        return this.innerProperties() == null ? null : this.innerProperties().armSkuName();
    }

    /**
     * Get the billingFrequency property: The billing frequency, which can be either one-time or recurring.
     *
     * @return the billingFrequency value.
     */
    public String billingFrequency() {
        return this.innerProperties() == null ? null : this.innerProperties().billingFrequency();
    }

    /**
     * Get the billingProfileId property: Billing profile Id.
     *
     * @return the billingProfileId value.
     */
    public String billingProfileId() {
        return this.innerProperties() == null ? null : this.innerProperties().billingProfileId();
    }

    /**
     * Get the billingProfileName property: Billing profile name.
     *
     * @return the billingProfileName value.
     */
    public String billingProfileName() {
        return this.innerProperties() == null ? null : this.innerProperties().billingProfileName();
    }

    /**
     * Get the currency property: The ISO currency in which the transaction is charged, for example, USD.
     *
     * @return the currency value.
     */
    public String currency() {
        return this.innerProperties() == null ? null : this.innerProperties().currency();
    }

    /**
     * Get the description property: The description of the transaction.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Get the eventDate property: The date of the transaction.
     *
     * @return the eventDate value.
     */
    public OffsetDateTime eventDate() {
        return this.innerProperties() == null ? null : this.innerProperties().eventDate();
    }

    /**
     * Get the eventType property: The type of the transaction (Purchase, Cancel or Refund).
     *
     * @return the eventType value.
     */
    public String eventType() {
        return this.innerProperties() == null ? null : this.innerProperties().eventType();
    }

    /**
     * Get the invoice property: Invoice Number.
     *
     * @return the invoice value.
     */
    public String invoice() {
        return this.innerProperties() == null ? null : this.innerProperties().invoice();
    }

    /**
     * Get the invoiceId property: Invoice Id as on the invoice where the specific transaction appears.
     *
     * @return the invoiceId value.
     */
    public String invoiceId() {
        return this.innerProperties() == null ? null : this.innerProperties().invoiceId();
    }

    /**
     * Get the invoiceSectionId property: Invoice Section Id.
     *
     * @return the invoiceSectionId value.
     */
    public String invoiceSectionId() {
        return this.innerProperties() == null ? null : this.innerProperties().invoiceSectionId();
    }

    /**
     * Get the invoiceSectionName property: Invoice Section Name.
     *
     * @return the invoiceSectionName value.
     */
    public String invoiceSectionName() {
        return this.innerProperties() == null ? null : this.innerProperties().invoiceSectionName();
    }

    /**
     * Get the purchasingSubscriptionGuid property: The subscription guid that makes the transaction.
     *
     * @return the purchasingSubscriptionGuid value.
     */
    public UUID purchasingSubscriptionGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().purchasingSubscriptionGuid();
    }

    /**
     * Get the purchasingSubscriptionName property: The subscription name that makes the transaction.
     *
     * @return the purchasingSubscriptionName value.
     */
    public String purchasingSubscriptionName() {
        return this.innerProperties() == null ? null : this.innerProperties().purchasingSubscriptionName();
    }

    /**
     * Get the quantity property: The quantity of the transaction.
     *
     * @return the quantity value.
     */
    public BigDecimal quantity() {
        return this.innerProperties() == null ? null : this.innerProperties().quantity();
    }

    /**
     * Get the region property: The region of the transaction.
     *
     * @return the region value.
     */
    public String region() {
        return this.innerProperties() == null ? null : this.innerProperties().region();
    }

    /**
     * Get the reservationOrderId property: The reservation order ID is the identifier for a reservation purchase. Each
     * reservation order ID represents a single purchase transaction. A reservation order contains reservations. The
     * reservation order specifies the VM size and region for the reservations.
     *
     * @return the reservationOrderId value.
     */
    public String reservationOrderId() {
        return this.innerProperties() == null ? null : this.innerProperties().reservationOrderId();
    }

    /**
     * Get the reservationOrderName property: The name of the reservation order.
     *
     * @return the reservationOrderName value.
     */
    public String reservationOrderName() {
        return this.innerProperties() == null ? null : this.innerProperties().reservationOrderName();
    }

    /**
     * Get the term property: This is the term of the transaction.
     *
     * @return the term value.
     */
    public String term() {
        return this.innerProperties() == null ? null : this.innerProperties().term();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model ModernReservationTransactionInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ModernReservationTransactionInner.class);
}
