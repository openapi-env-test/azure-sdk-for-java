// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** InMage Azure v2 specific protection profile details. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMageAzureV2")
@Fluent
public final class InMageAzureV2PolicyDetails extends PolicyProviderSpecificDetails {
    /*
     * The crash consistent snapshot frequency in minutes.
     */
    @JsonProperty(value = "crashConsistentFrequencyInMinutes")
    private Integer crashConsistentFrequencyInMinutes;

    /*
     * The recovery point threshold in minutes.
     */
    @JsonProperty(value = "recoveryPointThresholdInMinutes")
    private Integer recoveryPointThresholdInMinutes;

    /*
     * The duration in minutes until which the recovery points need to be
     * stored.
     */
    @JsonProperty(value = "recoveryPointHistory")
    private Integer recoveryPointHistory;

    /*
     * The app consistent snapshot frequency in minutes.
     */
    @JsonProperty(value = "appConsistentFrequencyInMinutes")
    private Integer appConsistentFrequencyInMinutes;

    /*
     * A value indicating whether multi-VM sync has to be enabled.
     */
    @JsonProperty(value = "multiVmSyncStatus")
    private String multiVmSyncStatus;

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
     * @return the InMageAzureV2PolicyDetails object itself.
     */
    public InMageAzureV2PolicyDetails withCrashConsistentFrequencyInMinutes(Integer crashConsistentFrequencyInMinutes) {
        this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
        return this;
    }

    /**
     * Get the recoveryPointThresholdInMinutes property: The recovery point threshold in minutes.
     *
     * @return the recoveryPointThresholdInMinutes value.
     */
    public Integer recoveryPointThresholdInMinutes() {
        return this.recoveryPointThresholdInMinutes;
    }

    /**
     * Set the recoveryPointThresholdInMinutes property: The recovery point threshold in minutes.
     *
     * @param recoveryPointThresholdInMinutes the recoveryPointThresholdInMinutes value to set.
     * @return the InMageAzureV2PolicyDetails object itself.
     */
    public InMageAzureV2PolicyDetails withRecoveryPointThresholdInMinutes(Integer recoveryPointThresholdInMinutes) {
        this.recoveryPointThresholdInMinutes = recoveryPointThresholdInMinutes;
        return this;
    }

    /**
     * Get the recoveryPointHistory property: The duration in minutes until which the recovery points need to be stored.
     *
     * @return the recoveryPointHistory value.
     */
    public Integer recoveryPointHistory() {
        return this.recoveryPointHistory;
    }

    /**
     * Set the recoveryPointHistory property: The duration in minutes until which the recovery points need to be stored.
     *
     * @param recoveryPointHistory the recoveryPointHistory value to set.
     * @return the InMageAzureV2PolicyDetails object itself.
     */
    public InMageAzureV2PolicyDetails withRecoveryPointHistory(Integer recoveryPointHistory) {
        this.recoveryPointHistory = recoveryPointHistory;
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
     * @return the InMageAzureV2PolicyDetails object itself.
     */
    public InMageAzureV2PolicyDetails withAppConsistentFrequencyInMinutes(Integer appConsistentFrequencyInMinutes) {
        this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
        return this;
    }

    /**
     * Get the multiVmSyncStatus property: A value indicating whether multi-VM sync has to be enabled.
     *
     * @return the multiVmSyncStatus value.
     */
    public String multiVmSyncStatus() {
        return this.multiVmSyncStatus;
    }

    /**
     * Set the multiVmSyncStatus property: A value indicating whether multi-VM sync has to be enabled.
     *
     * @param multiVmSyncStatus the multiVmSyncStatus value to set.
     * @return the InMageAzureV2PolicyDetails object itself.
     */
    public InMageAzureV2PolicyDetails withMultiVmSyncStatus(String multiVmSyncStatus) {
        this.multiVmSyncStatus = multiVmSyncStatus;
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
