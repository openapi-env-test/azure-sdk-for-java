// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.GatewayRouteListResultInner;
import java.util.List;

/** An immutable client-side representation of GatewayRouteListResult. */
public interface GatewayRouteListResult {
    /**
     * Gets the value property: List of gateway routes.
     *
     * @return the value value.
     */
    List<GatewayRoute> value();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.GatewayRouteListResultInner object.
     *
     * @return the inner object.
     */
    GatewayRouteListResultInner innerModel();
}
