// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Recovery plan InMage failover input. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMage")
@Fluent
public final class RecoveryPlanInMageFailoverInput extends RecoveryPlanProviderSpecificFailoverInput {
    /*
     * The recovery point type.
     */
    @JsonProperty(value = "recoveryPointType", required = true)
    private RpInMageRecoveryPointType recoveryPointType;

    /**
     * Get the recoveryPointType property: The recovery point type.
     *
     * @return the recoveryPointType value.
     */
    public RpInMageRecoveryPointType recoveryPointType() {
        return this.recoveryPointType;
    }

    /**
     * Set the recoveryPointType property: The recovery point type.
     *
     * @param recoveryPointType the recoveryPointType value to set.
     * @return the RecoveryPlanInMageFailoverInput object itself.
     */
    public RecoveryPlanInMageFailoverInput withRecoveryPointType(RpInMageRecoveryPointType recoveryPointType) {
        this.recoveryPointType = recoveryPointType;
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
        if (recoveryPointType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property recoveryPointType in model RecoveryPlanInMageFailoverInput"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RecoveryPlanInMageFailoverInput.class);
}
