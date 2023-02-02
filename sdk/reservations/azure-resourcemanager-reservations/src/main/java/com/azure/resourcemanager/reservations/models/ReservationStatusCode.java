// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ReservationStatusCode. */
public final class ReservationStatusCode extends ExpandableStringEnum<ReservationStatusCode> {
    /** Static value None for ReservationStatusCode. */
    public static final ReservationStatusCode NONE = fromString("None");

    /** Static value Pending for ReservationStatusCode. */
    public static final ReservationStatusCode PENDING = fromString("Pending");

    /** Static value Processing for ReservationStatusCode. */
    public static final ReservationStatusCode PROCESSING = fromString("Processing");

    /** Static value Active for ReservationStatusCode. */
    public static final ReservationStatusCode ACTIVE = fromString("Active");

    /** Static value PurchaseError for ReservationStatusCode. */
    public static final ReservationStatusCode PURCHASE_ERROR = fromString("PurchaseError");

    /** Static value PaymentInstrumentError for ReservationStatusCode. */
    public static final ReservationStatusCode PAYMENT_INSTRUMENT_ERROR = fromString("PaymentInstrumentError");

    /** Static value Split for ReservationStatusCode. */
    public static final ReservationStatusCode SPLIT = fromString("Split");

    /** Static value Merged for ReservationStatusCode. */
    public static final ReservationStatusCode MERGED = fromString("Merged");

    /** Static value Expired for ReservationStatusCode. */
    public static final ReservationStatusCode EXPIRED = fromString("Expired");

    /** Static value Succeeded for ReservationStatusCode. */
    public static final ReservationStatusCode SUCCEEDED = fromString("Succeeded");

    /**
     * Creates or finds a ReservationStatusCode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReservationStatusCode.
     */
    @JsonCreator
    public static ReservationStatusCode fromString(String name) {
        return fromString(name, ReservationStatusCode.class);
    }

    /**
     * Gets known ReservationStatusCode values.
     *
     * @return known ReservationStatusCode values.
     */
    public static Collection<ReservationStatusCode> values() {
        return values(ReservationStatusCode.class);
    }
}
