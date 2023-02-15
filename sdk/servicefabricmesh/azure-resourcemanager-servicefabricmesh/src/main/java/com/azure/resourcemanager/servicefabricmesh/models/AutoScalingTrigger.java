// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmesh.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes the trigger for performing auto scaling operation. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "kind",
    defaultImpl = AutoScalingTrigger.class)
@JsonTypeName("AutoScalingTrigger")
@JsonSubTypes({@JsonSubTypes.Type(name = "AverageLoad", value = AverageLoadScalingTrigger.class)})
@Immutable
public class AutoScalingTrigger {
    /** Creates an instance of AutoScalingTrigger class. */
    public AutoScalingTrigger() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
