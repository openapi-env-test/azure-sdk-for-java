// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of the Spring Cloud Gateway Operator. */
@Immutable
public final class GatewayOperatorProperties {
    /*
     * The requested resource quantity for required CPU and Memory.
     */
    @JsonProperty(value = "resourceRequests", access = JsonProperty.Access.WRITE_ONLY)
    private GatewayOperatorResourceRequests resourceRequests;

    /*
     * Collection of instances belong to Spring Cloud Gateway operator.
     */
    @JsonProperty(value = "instances", access = JsonProperty.Access.WRITE_ONLY)
    private List<GatewayInstance> instances;

    /**
     * Get the resourceRequests property: The requested resource quantity for required CPU and Memory.
     *
     * @return the resourceRequests value.
     */
    public GatewayOperatorResourceRequests resourceRequests() {
        return this.resourceRequests;
    }

    /**
     * Get the instances property: Collection of instances belong to Spring Cloud Gateway operator.
     *
     * @return the instances value.
     */
    public List<GatewayInstance> instances() {
        return this.instances;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceRequests() != null) {
            resourceRequests().validate();
        }
        if (instances() != null) {
            instances().forEach(e -> e.validate());
        }
    }
}
