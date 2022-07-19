// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;

/** MAB workload-specific backup item. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectedItemType")
@JsonTypeName("MabFileFolderProtectedItem")
@Fluent
public final class MabFileFolderProtectedItem extends ProtectedItem {
    /*
     * Friendly name of this backup item.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /*
     * Name of the computer associated with this backup item.
     */
    @JsonProperty(value = "computerName")
    private String computerName;

    /*
     * Status of last backup operation.
     */
    @JsonProperty(value = "lastBackupStatus")
    private String lastBackupStatus;

    /*
     * Timestamp of the last backup operation on this backup item.
     */
    @JsonProperty(value = "lastBackupTime")
    private OffsetDateTime lastBackupTime;

    /*
     * Protected, ProtectionStopped, IRPending or ProtectionError
     */
    @JsonProperty(value = "protectionState")
    private String protectionState;

    /*
     * Sync time for deferred deletion in UTC
     */
    @JsonProperty(value = "deferredDeleteSyncTimeInUTC")
    private Long deferredDeleteSyncTimeInUtc;

    /*
     * Additional information with this backup item.
     */
    @JsonProperty(value = "extendedInfo")
    private MabFileFolderProtectedItemExtendedInfo extendedInfo;

    /**
     * Get the friendlyName property: Friendly name of this backup item.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: Friendly name of this backup item.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the MabFileFolderProtectedItem object itself.
     */
    public MabFileFolderProtectedItem withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the computerName property: Name of the computer associated with this backup item.
     *
     * @return the computerName value.
     */
    public String computerName() {
        return this.computerName;
    }

    /**
     * Set the computerName property: Name of the computer associated with this backup item.
     *
     * @param computerName the computerName value to set.
     * @return the MabFileFolderProtectedItem object itself.
     */
    public MabFileFolderProtectedItem withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * Get the lastBackupStatus property: Status of last backup operation.
     *
     * @return the lastBackupStatus value.
     */
    public String lastBackupStatus() {
        return this.lastBackupStatus;
    }

    /**
     * Set the lastBackupStatus property: Status of last backup operation.
     *
     * @param lastBackupStatus the lastBackupStatus value to set.
     * @return the MabFileFolderProtectedItem object itself.
     */
    public MabFileFolderProtectedItem withLastBackupStatus(String lastBackupStatus) {
        this.lastBackupStatus = lastBackupStatus;
        return this;
    }

    /**
     * Get the lastBackupTime property: Timestamp of the last backup operation on this backup item.
     *
     * @return the lastBackupTime value.
     */
    public OffsetDateTime lastBackupTime() {
        return this.lastBackupTime;
    }

    /**
     * Set the lastBackupTime property: Timestamp of the last backup operation on this backup item.
     *
     * @param lastBackupTime the lastBackupTime value to set.
     * @return the MabFileFolderProtectedItem object itself.
     */
    public MabFileFolderProtectedItem withLastBackupTime(OffsetDateTime lastBackupTime) {
        this.lastBackupTime = lastBackupTime;
        return this;
    }

    /**
     * Get the protectionState property: Protected, ProtectionStopped, IRPending or ProtectionError.
     *
     * @return the protectionState value.
     */
    public String protectionState() {
        return this.protectionState;
    }

    /**
     * Set the protectionState property: Protected, ProtectionStopped, IRPending or ProtectionError.
     *
     * @param protectionState the protectionState value to set.
     * @return the MabFileFolderProtectedItem object itself.
     */
    public MabFileFolderProtectedItem withProtectionState(String protectionState) {
        this.protectionState = protectionState;
        return this;
    }

    /**
     * Get the deferredDeleteSyncTimeInUtc property: Sync time for deferred deletion in UTC.
     *
     * @return the deferredDeleteSyncTimeInUtc value.
     */
    public Long deferredDeleteSyncTimeInUtc() {
        return this.deferredDeleteSyncTimeInUtc;
    }

    /**
     * Set the deferredDeleteSyncTimeInUtc property: Sync time for deferred deletion in UTC.
     *
     * @param deferredDeleteSyncTimeInUtc the deferredDeleteSyncTimeInUtc value to set.
     * @return the MabFileFolderProtectedItem object itself.
     */
    public MabFileFolderProtectedItem withDeferredDeleteSyncTimeInUtc(Long deferredDeleteSyncTimeInUtc) {
        this.deferredDeleteSyncTimeInUtc = deferredDeleteSyncTimeInUtc;
        return this;
    }

    /**
     * Get the extendedInfo property: Additional information with this backup item.
     *
     * @return the extendedInfo value.
     */
    public MabFileFolderProtectedItemExtendedInfo extendedInfo() {
        return this.extendedInfo;
    }

    /**
     * Set the extendedInfo property: Additional information with this backup item.
     *
     * @param extendedInfo the extendedInfo value to set.
     * @return the MabFileFolderProtectedItem object itself.
     */
    public MabFileFolderProtectedItem withExtendedInfo(MabFileFolderProtectedItemExtendedInfo extendedInfo) {
        this.extendedInfo = extendedInfo;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MabFileFolderProtectedItem withContainerName(String containerName) {
        super.withContainerName(containerName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MabFileFolderProtectedItem withSourceResourceId(String sourceResourceId) {
        super.withSourceResourceId(sourceResourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MabFileFolderProtectedItem withPolicyId(String policyId) {
        super.withPolicyId(policyId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MabFileFolderProtectedItem withLastRecoveryPoint(OffsetDateTime lastRecoveryPoint) {
        super.withLastRecoveryPoint(lastRecoveryPoint);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MabFileFolderProtectedItem withBackupSetName(String backupSetName) {
        super.withBackupSetName(backupSetName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MabFileFolderProtectedItem withCreateMode(CreateMode createMode) {
        super.withCreateMode(createMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MabFileFolderProtectedItem withDeferredDeleteTimeInUtc(OffsetDateTime deferredDeleteTimeInUtc) {
        super.withDeferredDeleteTimeInUtc(deferredDeleteTimeInUtc);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MabFileFolderProtectedItem withIsScheduledForDeferredDelete(Boolean isScheduledForDeferredDelete) {
        super.withIsScheduledForDeferredDelete(isScheduledForDeferredDelete);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MabFileFolderProtectedItem withDeferredDeleteTimeRemaining(String deferredDeleteTimeRemaining) {
        super.withDeferredDeleteTimeRemaining(deferredDeleteTimeRemaining);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MabFileFolderProtectedItem withIsDeferredDeleteScheduleUpcoming(Boolean isDeferredDeleteScheduleUpcoming) {
        super.withIsDeferredDeleteScheduleUpcoming(isDeferredDeleteScheduleUpcoming);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MabFileFolderProtectedItem withIsRehydrate(Boolean isRehydrate) {
        super.withIsRehydrate(isRehydrate);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MabFileFolderProtectedItem withResourceGuardOperationRequests(List<String> resourceGuardOperationRequests) {
        super.withResourceGuardOperationRequests(resourceGuardOperationRequests);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MabFileFolderProtectedItem withIsArchiveEnabled(Boolean isArchiveEnabled) {
        super.withIsArchiveEnabled(isArchiveEnabled);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MabFileFolderProtectedItem withPolicyName(String policyName) {
        super.withPolicyName(policyName);
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
        if (extendedInfo() != null) {
            extendedInfo().validate();
        }
    }
}
