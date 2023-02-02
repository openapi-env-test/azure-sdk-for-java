// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Status of the operation. */
public final class ExchangeOperationResultStatus extends ExpandableStringEnum<ExchangeOperationResultStatus> {
    /** Static value Succeeded for ExchangeOperationResultStatus. */
    public static final ExchangeOperationResultStatus SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for ExchangeOperationResultStatus. */
    public static final ExchangeOperationResultStatus FAILED = fromString("Failed");

    /** Static value Cancelled for ExchangeOperationResultStatus. */
    public static final ExchangeOperationResultStatus CANCELLED = fromString("Cancelled");

    /** Static value PendingRefunds for ExchangeOperationResultStatus. */
    public static final ExchangeOperationResultStatus PENDING_REFUNDS = fromString("PendingRefunds");

    /** Static value PendingPurchases for ExchangeOperationResultStatus. */
    public static final ExchangeOperationResultStatus PENDING_PURCHASES = fromString("PendingPurchases");

    /**
     * Creates or finds a ExchangeOperationResultStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExchangeOperationResultStatus.
     */
    @JsonCreator
    public static ExchangeOperationResultStatus fromString(String name) {
        return fromString(name, ExchangeOperationResultStatus.class);
    }

    /**
     * Gets known ExchangeOperationResultStatus values.
     *
     * @return known ExchangeOperationResultStatus values.
     */
    public static Collection<ExchangeOperationResultStatus> values() {
        return values(ExchangeOperationResultStatus.class);
    }
}
