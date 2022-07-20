// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LotSource. */
public final class LotSource extends ExpandableStringEnum<LotSource> {
    /** Static value PurchasedCredit for LotSource. */
    public static final LotSource PURCHASED_CREDIT = fromString("PurchasedCredit");

    /** Static value PromotionalCredit for LotSource. */
    public static final LotSource PROMOTIONAL_CREDIT = fromString("PromotionalCredit");

    /** Static value ConsumptionCommitment for LotSource. */
    public static final LotSource CONSUMPTION_COMMITMENT = fromString("ConsumptionCommitment");

    /**
     * Creates or finds a LotSource from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LotSource.
     */
    @JsonCreator
    public static LotSource fromString(String name) {
        return fromString(name, LotSource.class);
    }

    /**
     * Gets known LotSource values.
     *
     * @return known LotSource values.
     */
    public static Collection<LotSource> values() {
        return values(LotSource.class);
    }
}
