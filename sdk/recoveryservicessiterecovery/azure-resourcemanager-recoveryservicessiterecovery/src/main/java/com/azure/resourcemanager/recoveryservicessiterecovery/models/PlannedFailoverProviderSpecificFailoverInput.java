// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Provider specific failover input. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = PlannedFailoverProviderSpecificFailoverInput.class)
@JsonTypeName("PlannedFailoverProviderSpecificFailoverInput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "HyperVReplicaAzureFailback", value = HyperVReplicaAzureFailbackProviderInput.class),
    @JsonSubTypes.Type(name = "HyperVReplicaAzure", value = HyperVReplicaAzurePlannedFailoverProviderInput.class),
    @JsonSubTypes.Type(name = "InMageRcmFailback", value = InMageRcmFailbackPlannedFailoverProviderInput.class)
})
@Immutable
public class PlannedFailoverProviderSpecificFailoverInput {
    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
