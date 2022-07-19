// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Azure VM workload-specific protected item representing SAP HANA Database. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectedItemType")
@JsonTypeName("AzureVmWorkloadSAPHanaDatabase")
@Fluent
public final class AzureVmWorkloadSapHanaDatabaseProtectedItem extends AzureVmWorkloadProtectedItem {
    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withServerName(String serverName) {
        super.withServerName(serverName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withParentName(String parentName) {
        super.withParentName(parentName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withParentType(String parentType) {
        super.withParentType(parentType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withProtectionState(ProtectionState protectionState) {
        super.withProtectionState(protectionState);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withLastBackupStatus(LastBackupStatus lastBackupStatus) {
        super.withLastBackupStatus(lastBackupStatus);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withLastBackupTime(OffsetDateTime lastBackupTime) {
        super.withLastBackupTime(lastBackupTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withLastBackupErrorDetail(ErrorDetail lastBackupErrorDetail) {
        super.withLastBackupErrorDetail(lastBackupErrorDetail);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withProtectedItemDataSourceId(String protectedItemDataSourceId) {
        super.withProtectedItemDataSourceId(protectedItemDataSourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withProtectedItemHealthStatus(
        ProtectedItemHealthStatus protectedItemHealthStatus) {
        super.withProtectedItemHealthStatus(protectedItemHealthStatus);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withExtendedInfo(
        AzureVmWorkloadProtectedItemExtendedInfo extendedInfo) {
        super.withExtendedInfo(extendedInfo);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withKpisHealths(
        Map<String, KpiResourceHealthDetails> kpisHealths) {
        super.withKpisHealths(kpisHealths);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withContainerName(String containerName) {
        super.withContainerName(containerName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withSourceResourceId(String sourceResourceId) {
        super.withSourceResourceId(sourceResourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withPolicyId(String policyId) {
        super.withPolicyId(policyId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withLastRecoveryPoint(OffsetDateTime lastRecoveryPoint) {
        super.withLastRecoveryPoint(lastRecoveryPoint);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withBackupSetName(String backupSetName) {
        super.withBackupSetName(backupSetName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withCreateMode(CreateMode createMode) {
        super.withCreateMode(createMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withDeferredDeleteTimeInUtc(
        OffsetDateTime deferredDeleteTimeInUtc) {
        super.withDeferredDeleteTimeInUtc(deferredDeleteTimeInUtc);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withIsScheduledForDeferredDelete(
        Boolean isScheduledForDeferredDelete) {
        super.withIsScheduledForDeferredDelete(isScheduledForDeferredDelete);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withDeferredDeleteTimeRemaining(
        String deferredDeleteTimeRemaining) {
        super.withDeferredDeleteTimeRemaining(deferredDeleteTimeRemaining);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withIsDeferredDeleteScheduleUpcoming(
        Boolean isDeferredDeleteScheduleUpcoming) {
        super.withIsDeferredDeleteScheduleUpcoming(isDeferredDeleteScheduleUpcoming);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withIsRehydrate(Boolean isRehydrate) {
        super.withIsRehydrate(isRehydrate);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withResourceGuardOperationRequests(
        List<String> resourceGuardOperationRequests) {
        super.withResourceGuardOperationRequests(resourceGuardOperationRequests);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withIsArchiveEnabled(Boolean isArchiveEnabled) {
        super.withIsArchiveEnabled(isArchiveEnabled);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaDatabaseProtectedItem withPolicyName(String policyName) {
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
    }
}
