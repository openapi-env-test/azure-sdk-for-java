/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ID of the ExpressRouteConnection.
 */
public class ExpressRouteConnectionId {
    /**
     * The ID of the ExpressRouteConnection.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Get the ID of the ExpressRouteConnection.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

}
