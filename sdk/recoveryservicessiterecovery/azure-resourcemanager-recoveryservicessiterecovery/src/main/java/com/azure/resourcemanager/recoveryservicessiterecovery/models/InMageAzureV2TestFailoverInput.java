// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** InMageAzureV2 provider specific input for test failover. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMageAzureV2")
@Fluent
public final class InMageAzureV2TestFailoverInput extends TestFailoverProviderSpecificInput {
    /*
     * The recovery point id to be passed to test failover to a particular
     * recovery point. In case of latest recovery point, null should be passed.
     */
    @JsonProperty(value = "recoveryPointId")
    private String recoveryPointId;

    /**
     * Get the recoveryPointId property: The recovery point id to be passed to test failover to a particular recovery
     * point. In case of latest recovery point, null should be passed.
     *
     * @return the recoveryPointId value.
     */
    public String recoveryPointId() {
        return this.recoveryPointId;
    }

    /**
     * Set the recoveryPointId property: The recovery point id to be passed to test failover to a particular recovery
     * point. In case of latest recovery point, null should be passed.
     *
     * @param recoveryPointId the recoveryPointId value to set.
     * @return the InMageAzureV2TestFailoverInput object itself.
     */
    public InMageAzureV2TestFailoverInput withRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
