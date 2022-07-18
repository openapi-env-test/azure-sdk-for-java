// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** InMageRcm specific policy details. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMageRcm")
@Fluent
public final class InMageRcmPolicyDetails extends PolicyProviderSpecificDetails {
    /*
     * The duration in minutes until which the recovery points need to be
     * stored.
     */
    @JsonProperty(value = "recoveryPointHistoryInMinutes")
    private Integer recoveryPointHistoryInMinutes;

    /*
     * The app consistent snapshot frequency in minutes.
     */
    @JsonProperty(value = "appConsistentFrequencyInMinutes")
    private Integer appConsistentFrequencyInMinutes;

    /*
     * The crash consistent snapshot frequency in minutes.
     */
    @JsonProperty(value = "crashConsistentFrequencyInMinutes")
    private Integer crashConsistentFrequencyInMinutes;

    /*
     * A value indicating whether multi-VM sync has to be enabled.
     */
    @JsonProperty(value = "enableMultiVmSync")
    private String enableMultiVmSync;

    /**
     * Get the recoveryPointHistoryInMinutes property: The duration in minutes until which the recovery points need to
     * be stored.
     *
     * @return the recoveryPointHistoryInMinutes value.
     */
    public Integer recoveryPointHistoryInMinutes() {
        return this.recoveryPointHistoryInMinutes;
    }

    /**
     * Set the recoveryPointHistoryInMinutes property: The duration in minutes until which the recovery points need to
     * be stored.
     *
     * @param recoveryPointHistoryInMinutes the recoveryPointHistoryInMinutes value to set.
     * @return the InMageRcmPolicyDetails object itself.
     */
    public InMageRcmPolicyDetails withRecoveryPointHistoryInMinutes(Integer recoveryPointHistoryInMinutes) {
        this.recoveryPointHistoryInMinutes = recoveryPointHistoryInMinutes;
        return this;
    }

    /**
     * Get the appConsistentFrequencyInMinutes property: The app consistent snapshot frequency in minutes.
     *
     * @return the appConsistentFrequencyInMinutes value.
     */
    public Integer appConsistentFrequencyInMinutes() {
        return this.appConsistentFrequencyInMinutes;
    }

    /**
     * Set the appConsistentFrequencyInMinutes property: The app consistent snapshot frequency in minutes.
     *
     * @param appConsistentFrequencyInMinutes the appConsistentFrequencyInMinutes value to set.
     * @return the InMageRcmPolicyDetails object itself.
     */
    public InMageRcmPolicyDetails withAppConsistentFrequencyInMinutes(Integer appConsistentFrequencyInMinutes) {
        this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
        return this;
    }

    /**
     * Get the crashConsistentFrequencyInMinutes property: The crash consistent snapshot frequency in minutes.
     *
     * @return the crashConsistentFrequencyInMinutes value.
     */
    public Integer crashConsistentFrequencyInMinutes() {
        return this.crashConsistentFrequencyInMinutes;
    }

    /**
     * Set the crashConsistentFrequencyInMinutes property: The crash consistent snapshot frequency in minutes.
     *
     * @param crashConsistentFrequencyInMinutes the crashConsistentFrequencyInMinutes value to set.
     * @return the InMageRcmPolicyDetails object itself.
     */
    public InMageRcmPolicyDetails withCrashConsistentFrequencyInMinutes(Integer crashConsistentFrequencyInMinutes) {
        this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
        return this;
    }

    /**
     * Get the enableMultiVmSync property: A value indicating whether multi-VM sync has to be enabled.
     *
     * @return the enableMultiVmSync value.
     */
    public String enableMultiVmSync() {
        return this.enableMultiVmSync;
    }

    /**
     * Set the enableMultiVmSync property: A value indicating whether multi-VM sync has to be enabled.
     *
     * @param enableMultiVmSync the enableMultiVmSync value to set.
     * @return the InMageRcmPolicyDetails object itself.
     */
    public InMageRcmPolicyDetails withEnableMultiVmSync(String enableMultiVmSync) {
        this.enableMultiVmSync = enableMultiVmSync;
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
