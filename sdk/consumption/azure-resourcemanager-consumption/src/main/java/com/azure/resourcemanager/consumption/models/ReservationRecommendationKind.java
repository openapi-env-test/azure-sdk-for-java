// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ReservationRecommendationKind. */
public final class ReservationRecommendationKind extends ExpandableStringEnum<ReservationRecommendationKind> {
    /** Static value legacy for ReservationRecommendationKind. */
    public static final ReservationRecommendationKind LEGACY = fromString("legacy");

    /** Static value modern for ReservationRecommendationKind. */
    public static final ReservationRecommendationKind MODERN = fromString("modern");

    /**
     * Creates or finds a ReservationRecommendationKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReservationRecommendationKind.
     */
    @JsonCreator
    public static ReservationRecommendationKind fromString(String name) {
        return fromString(name, ReservationRecommendationKind.class);
    }

    /**
     * Gets known ReservationRecommendationKind values.
     *
     * @return known ReservationRecommendationKind values.
     */
    public static Collection<ReservationRecommendationKind> values() {
        return values(ReservationRecommendationKind.class);
    }
}
