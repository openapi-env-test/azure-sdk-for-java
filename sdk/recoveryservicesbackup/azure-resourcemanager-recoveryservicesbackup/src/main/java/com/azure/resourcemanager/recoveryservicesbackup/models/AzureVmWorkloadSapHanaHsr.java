// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Azure VM workload-specific protectable item representing SAP HANA Dbinstance. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectableItemType")
@JsonTypeName("SAPHanaHSR")
@Fluent
public final class AzureVmWorkloadSapHanaHsr extends AzureVmWorkloadProtectableItem {
    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaHsr withParentName(String parentName) {
        super.withParentName(parentName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaHsr withParentUniqueName(String parentUniqueName) {
        super.withParentUniqueName(parentUniqueName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaHsr withServerName(String serverName) {
        super.withServerName(serverName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaHsr withIsAutoProtectable(Boolean isAutoProtectable) {
        super.withIsAutoProtectable(isAutoProtectable);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaHsr withIsAutoProtected(Boolean isAutoProtected) {
        super.withIsAutoProtected(isAutoProtected);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaHsr withSubinquireditemcount(Integer subinquireditemcount) {
        super.withSubinquireditemcount(subinquireditemcount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaHsr withSubprotectableitemcount(Integer subprotectableitemcount) {
        super.withSubprotectableitemcount(subprotectableitemcount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaHsr withPrebackupvalidation(PreBackupValidation prebackupvalidation) {
        super.withPrebackupvalidation(prebackupvalidation);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaHsr withBackupManagementType(String backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaHsr withWorkloadType(String workloadType) {
        super.withWorkloadType(workloadType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaHsr withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapHanaHsr withProtectionState(ProtectionStatus protectionState) {
        super.withProtectionState(protectionState);
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
