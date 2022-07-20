// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.PeerRouteListInner;
import java.util.List;

/** An immutable client-side representation of PeerRouteList. */
public interface PeerRouteList {
    /**
     * Gets the value property: List of peer routes.
     *
     * @return the value value.
     */
    List<PeerRoute> value();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.PeerRouteListInner object.
     *
     * @return the inner object.
     */
    PeerRouteListInner innerModel();
}
