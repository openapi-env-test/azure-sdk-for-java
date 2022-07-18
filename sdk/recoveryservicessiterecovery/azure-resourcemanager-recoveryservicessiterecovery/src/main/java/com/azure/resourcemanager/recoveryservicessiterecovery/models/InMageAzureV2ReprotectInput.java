// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** InMageAzureV2 specific provider input. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMageAzureV2")
@Fluent
public final class InMageAzureV2ReprotectInput extends ReverseReplicationProviderSpecificInput {
    /*
     * The Master target Id.
     */
    @JsonProperty(value = "masterTargetId")
    private String masterTargetId;

    /*
     * The Process Server Id.
     */
    @JsonProperty(value = "processServerId")
    private String processServerId;

    /*
     * The storage account id.
     */
    @JsonProperty(value = "storageAccountId")
    private String storageAccountId;

    /*
     * The CS account Id.
     */
    @JsonProperty(value = "runAsAccountId")
    private String runAsAccountId;

    /*
     * The Policy Id.
     */
    @JsonProperty(value = "policyId")
    private String policyId;

    /*
     * The storage account to be used for logging during replication.
     */
    @JsonProperty(value = "logStorageAccountId")
    private String logStorageAccountId;

    /*
     * The disks to include list.
     */
    @JsonProperty(value = "disksToInclude")
    private List<String> disksToInclude;

    /**
     * Get the masterTargetId property: The Master target Id.
     *
     * @return the masterTargetId value.
     */
    public String masterTargetId() {
        return this.masterTargetId;
    }

    /**
     * Set the masterTargetId property: The Master target Id.
     *
     * @param masterTargetId the masterTargetId value to set.
     * @return the InMageAzureV2ReprotectInput object itself.
     */
    public InMageAzureV2ReprotectInput withMasterTargetId(String masterTargetId) {
        this.masterTargetId = masterTargetId;
        return this;
    }

    /**
     * Get the processServerId property: The Process Server Id.
     *
     * @return the processServerId value.
     */
    public String processServerId() {
        return this.processServerId;
    }

    /**
     * Set the processServerId property: The Process Server Id.
     *
     * @param processServerId the processServerId value to set.
     * @return the InMageAzureV2ReprotectInput object itself.
     */
    public InMageAzureV2ReprotectInput withProcessServerId(String processServerId) {
        this.processServerId = processServerId;
        return this;
    }

    /**
     * Get the storageAccountId property: The storage account id.
     *
     * @return the storageAccountId value.
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    /**
     * Set the storageAccountId property: The storage account id.
     *
     * @param storageAccountId the storageAccountId value to set.
     * @return the InMageAzureV2ReprotectInput object itself.
     */
    public InMageAzureV2ReprotectInput withStorageAccountId(String storageAccountId) {
        this.storageAccountId = storageAccountId;
        return this;
    }

    /**
     * Get the runAsAccountId property: The CS account Id.
     *
     * @return the runAsAccountId value.
     */
    public String runAsAccountId() {
        return this.runAsAccountId;
    }

    /**
     * Set the runAsAccountId property: The CS account Id.
     *
     * @param runAsAccountId the runAsAccountId value to set.
     * @return the InMageAzureV2ReprotectInput object itself.
     */
    public InMageAzureV2ReprotectInput withRunAsAccountId(String runAsAccountId) {
        this.runAsAccountId = runAsAccountId;
        return this;
    }

    /**
     * Get the policyId property: The Policy Id.
     *
     * @return the policyId value.
     */
    public String policyId() {
        return this.policyId;
    }

    /**
     * Set the policyId property: The Policy Id.
     *
     * @param policyId the policyId value to set.
     * @return the InMageAzureV2ReprotectInput object itself.
     */
    public InMageAzureV2ReprotectInput withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * Get the logStorageAccountId property: The storage account to be used for logging during replication.
     *
     * @return the logStorageAccountId value.
     */
    public String logStorageAccountId() {
        return this.logStorageAccountId;
    }

    /**
     * Set the logStorageAccountId property: The storage account to be used for logging during replication.
     *
     * @param logStorageAccountId the logStorageAccountId value to set.
     * @return the InMageAzureV2ReprotectInput object itself.
     */
    public InMageAzureV2ReprotectInput withLogStorageAccountId(String logStorageAccountId) {
        this.logStorageAccountId = logStorageAccountId;
        return this;
    }

    /**
     * Get the disksToInclude property: The disks to include list.
     *
     * @return the disksToInclude value.
     */
    public List<String> disksToInclude() {
        return this.disksToInclude;
    }

    /**
     * Set the disksToInclude property: The disks to include list.
     *
     * @param disksToInclude the disksToInclude value to set.
     * @return the InMageAzureV2ReprotectInput object itself.
     */
    public InMageAzureV2ReprotectInput withDisksToInclude(List<String> disksToInclude) {
        this.disksToInclude = disksToInclude;
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
