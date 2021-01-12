// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.contoso_cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Get5ItemsItem. */
public final class Get5ItemsItem extends ExpandableStringEnum<Get5ItemsItem> {
    /** Static value clientRequestCount for Get5ItemsItem. */
    public static final Get5ItemsItem CLIENT_REQUEST_COUNT = fromString("clientRequestCount");

    /** Static value clientRequestTraffic for Get5ItemsItem. */
    public static final Get5ItemsItem CLIENT_REQUEST_TRAFFIC = fromString("clientRequestTraffic");

    /** Static value clientRequestBandwidth for Get5ItemsItem. */
    public static final Get5ItemsItem CLIENT_REQUEST_BANDWIDTH = fromString("clientRequestBandwidth");

    /** Static value originRequestTraffic for Get5ItemsItem. */
    public static final Get5ItemsItem ORIGIN_REQUEST_TRAFFIC = fromString("originRequestTraffic");

    /** Static value originRequestBandwidth for Get5ItemsItem. */
    public static final Get5ItemsItem ORIGIN_REQUEST_BANDWIDTH = fromString("originRequestBandwidth");

    /**
     * Creates or finds a Get5ItemsItem from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Get5ItemsItem.
     */
    @JsonCreator
    public static Get5ItemsItem fromString(String name) {
        return fromString(name, Get5ItemsItem.class);
    }

    /** @return known Get5ItemsItem values. */
    public static Collection<Get5ItemsItem> values() {
        return values(Get5ItemsItem.class);
    }
}
