// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ExpressRouteCircuitPeeringAdvertisedPublicPrefixState. */
public final class ExpressRouteCircuitPeeringAdvertisedPublicPrefixState
    extends ExpandableStringEnum<ExpressRouteCircuitPeeringAdvertisedPublicPrefixState> {
    /** Static value NotConfigured for ExpressRouteCircuitPeeringAdvertisedPublicPrefixState. */
    public static final ExpressRouteCircuitPeeringAdvertisedPublicPrefixState NOT_CONFIGURED =
        fromString("NotConfigured");

    /** Static value Configuring for ExpressRouteCircuitPeeringAdvertisedPublicPrefixState. */
    public static final ExpressRouteCircuitPeeringAdvertisedPublicPrefixState CONFIGURING = fromString("Configuring");

    /** Static value Configured for ExpressRouteCircuitPeeringAdvertisedPublicPrefixState. */
    public static final ExpressRouteCircuitPeeringAdvertisedPublicPrefixState CONFIGURED = fromString("Configured");

    /** Static value ValidationNeeded for ExpressRouteCircuitPeeringAdvertisedPublicPrefixState. */
    public static final ExpressRouteCircuitPeeringAdvertisedPublicPrefixState VALIDATION_NEEDED =
        fromString("ValidationNeeded");

    /**
     * Creates or finds a ExpressRouteCircuitPeeringAdvertisedPublicPrefixState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExpressRouteCircuitPeeringAdvertisedPublicPrefixState.
     */
    @JsonCreator
    public static ExpressRouteCircuitPeeringAdvertisedPublicPrefixState fromString(String name) {
        return fromString(name, ExpressRouteCircuitPeeringAdvertisedPublicPrefixState.class);
    }

    /**
     * Gets known ExpressRouteCircuitPeeringAdvertisedPublicPrefixState values.
     *
     * @return known ExpressRouteCircuitPeeringAdvertisedPublicPrefixState values.
     */
    public static Collection<ExpressRouteCircuitPeeringAdvertisedPublicPrefixState> values() {
        return values(ExpressRouteCircuitPeeringAdvertisedPublicPrefixState.class);
    }
}
