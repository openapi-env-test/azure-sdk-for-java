// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base class for provider specific input. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = PolicyProviderSpecificInput.class)
@JsonTypeName("PolicyProviderSpecificInput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "A2ACrossClusterMigration", value = A2ACrossClusterMigrationPolicyCreationInput.class),
    @JsonSubTypes.Type(name = "A2A", value = A2APolicyCreationInput.class),
    @JsonSubTypes.Type(name = "HyperVReplicaAzure", value = HyperVReplicaAzurePolicyInput.class),
    @JsonSubTypes.Type(name = "HyperVReplica2012", value = HyperVReplicaPolicyInput.class),
    @JsonSubTypes.Type(name = "InMageAzureV2", value = InMageAzureV2PolicyInput.class),
    @JsonSubTypes.Type(name = "InMage", value = InMagePolicyInput.class),
    @JsonSubTypes.Type(name = "InMageRcmFailback", value = InMageRcmFailbackPolicyCreationInput.class),
    @JsonSubTypes.Type(name = "InMageRcm", value = InMageRcmPolicyCreationInput.class),
    @JsonSubTypes.Type(name = "VMwareCbt", value = VMwareCbtPolicyCreationInput.class)
})
@Immutable
public class PolicyProviderSpecificInput {
    /** Creates an instance of PolicyProviderSpecificInput class. */
    public PolicyProviderSpecificInput() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
