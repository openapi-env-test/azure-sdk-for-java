// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** IaaS VM workload-specific backup item. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "protectedItemType",
    defaultImpl = AzureIaaSvmProtectedItem.class)
@JsonTypeName("AzureIaaSVMProtectedItem")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "Microsoft.ClassicCompute/virtualMachines",
        value = AzureIaaSClassicComputeVMProtectedItem.class),
    @JsonSubTypes.Type(name = "Microsoft.Compute/virtualMachines", value = AzureIaaSComputeVMProtectedItem.class)
})
@Fluent
public class AzureIaaSvmProtectedItem extends ProtectedItem {
    /*
     * Friendly name of the VM represented by this backup item.
     */
    @JsonProperty(value = "friendlyName", access = JsonProperty.Access.WRITE_ONLY)
    private String friendlyName;

    /*
     * Fully qualified ARM ID of the virtual machine represented by this item.
     */
    @JsonProperty(value = "virtualMachineId", access = JsonProperty.Access.WRITE_ONLY)
    private String virtualMachineId;

    /*
     * Backup status of this backup item.
     */
    @JsonProperty(value = "protectionStatus")
    private String protectionStatus;

    /*
     * Backup state of this backup item.
     */
    @JsonProperty(value = "protectionState")
    private ProtectionState protectionState;

    /*
     * Health status of protected item.
     */
    @JsonProperty(value = "healthStatus", access = JsonProperty.Access.WRITE_ONLY)
    private HealthStatus healthStatus;

    /*
     * Health details on this backup item.
     */
    @JsonProperty(value = "healthDetails")
    private List<AzureIaaSvmHealthDetails> healthDetails;

    /*
     * Health details of different KPIs
     */
    @JsonProperty(value = "kpisHealths")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, KpiResourceHealthDetails> kpisHealths;

    /*
     * Last backup operation status.
     */
    @JsonProperty(value = "lastBackupStatus")
    private String lastBackupStatus;

    /*
     * Timestamp of the last backup operation on this backup item.
     */
    @JsonProperty(value = "lastBackupTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastBackupTime;

    /*
     * Data ID of the protected item.
     */
    @JsonProperty(value = "protectedItemDataId", access = JsonProperty.Access.WRITE_ONLY)
    private String protectedItemDataId;

    /*
     * Additional information for this backup item.
     */
    @JsonProperty(value = "extendedInfo")
    private AzureIaaSvmProtectedItemExtendedInfo extendedInfo;

    /*
     * Extended Properties for Azure IaasVM Backup.
     */
    @JsonProperty(value = "extendedProperties")
    private ExtendedProperties extendedProperties;

    /**
     * Get the friendlyName property: Friendly name of the VM represented by this backup item.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Get the virtualMachineId property: Fully qualified ARM ID of the virtual machine represented by this item.
     *
     * @return the virtualMachineId value.
     */
    public String virtualMachineId() {
        return this.virtualMachineId;
    }

    /**
     * Get the protectionStatus property: Backup status of this backup item.
     *
     * @return the protectionStatus value.
     */
    public String protectionStatus() {
        return this.protectionStatus;
    }

    /**
     * Set the protectionStatus property: Backup status of this backup item.
     *
     * @param protectionStatus the protectionStatus value to set.
     * @return the AzureIaaSvmProtectedItem object itself.
     */
    public AzureIaaSvmProtectedItem withProtectionStatus(String protectionStatus) {
        this.protectionStatus = protectionStatus;
        return this;
    }

    /**
     * Get the protectionState property: Backup state of this backup item.
     *
     * @return the protectionState value.
     */
    public ProtectionState protectionState() {
        return this.protectionState;
    }

    /**
     * Set the protectionState property: Backup state of this backup item.
     *
     * @param protectionState the protectionState value to set.
     * @return the AzureIaaSvmProtectedItem object itself.
     */
    public AzureIaaSvmProtectedItem withProtectionState(ProtectionState protectionState) {
        this.protectionState = protectionState;
        return this;
    }

    /**
     * Get the healthStatus property: Health status of protected item.
     *
     * @return the healthStatus value.
     */
    public HealthStatus healthStatus() {
        return this.healthStatus;
    }

    /**
     * Get the healthDetails property: Health details on this backup item.
     *
     * @return the healthDetails value.
     */
    public List<AzureIaaSvmHealthDetails> healthDetails() {
        return this.healthDetails;
    }

    /**
     * Set the healthDetails property: Health details on this backup item.
     *
     * @param healthDetails the healthDetails value to set.
     * @return the AzureIaaSvmProtectedItem object itself.
     */
    public AzureIaaSvmProtectedItem withHealthDetails(List<AzureIaaSvmHealthDetails> healthDetails) {
        this.healthDetails = healthDetails;
        return this;
    }

    /**
     * Get the kpisHealths property: Health details of different KPIs.
     *
     * @return the kpisHealths value.
     */
    public Map<String, KpiResourceHealthDetails> kpisHealths() {
        return this.kpisHealths;
    }

    /**
     * Set the kpisHealths property: Health details of different KPIs.
     *
     * @param kpisHealths the kpisHealths value to set.
     * @return the AzureIaaSvmProtectedItem object itself.
     */
    public AzureIaaSvmProtectedItem withKpisHealths(Map<String, KpiResourceHealthDetails> kpisHealths) {
        this.kpisHealths = kpisHealths;
        return this;
    }

    /**
     * Get the lastBackupStatus property: Last backup operation status.
     *
     * @return the lastBackupStatus value.
     */
    public String lastBackupStatus() {
        return this.lastBackupStatus;
    }

    /**
     * Set the lastBackupStatus property: Last backup operation status.
     *
     * @param lastBackupStatus the lastBackupStatus value to set.
     * @return the AzureIaaSvmProtectedItem object itself.
     */
    public AzureIaaSvmProtectedItem withLastBackupStatus(String lastBackupStatus) {
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
     * Get the protectedItemDataId property: Data ID of the protected item.
     *
     * @return the protectedItemDataId value.
     */
    public String protectedItemDataId() {
        return this.protectedItemDataId;
    }

    /**
     * Get the extendedInfo property: Additional information for this backup item.
     *
     * @return the extendedInfo value.
     */
    public AzureIaaSvmProtectedItemExtendedInfo extendedInfo() {
        return this.extendedInfo;
    }

    /**
     * Set the extendedInfo property: Additional information for this backup item.
     *
     * @param extendedInfo the extendedInfo value to set.
     * @return the AzureIaaSvmProtectedItem object itself.
     */
    public AzureIaaSvmProtectedItem withExtendedInfo(AzureIaaSvmProtectedItemExtendedInfo extendedInfo) {
        this.extendedInfo = extendedInfo;
        return this;
    }

    /**
     * Get the extendedProperties property: Extended Properties for Azure IaasVM Backup.
     *
     * @return the extendedProperties value.
     */
    public ExtendedProperties extendedProperties() {
        return this.extendedProperties;
    }

    /**
     * Set the extendedProperties property: Extended Properties for Azure IaasVM Backup.
     *
     * @param extendedProperties the extendedProperties value to set.
     * @return the AzureIaaSvmProtectedItem object itself.
     */
    public AzureIaaSvmProtectedItem withExtendedProperties(ExtendedProperties extendedProperties) {
        this.extendedProperties = extendedProperties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSvmProtectedItem withContainerName(String containerName) {
        super.withContainerName(containerName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSvmProtectedItem withSourceResourceId(String sourceResourceId) {
        super.withSourceResourceId(sourceResourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSvmProtectedItem withPolicyId(String policyId) {
        super.withPolicyId(policyId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSvmProtectedItem withLastRecoveryPoint(OffsetDateTime lastRecoveryPoint) {
        super.withLastRecoveryPoint(lastRecoveryPoint);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSvmProtectedItem withBackupSetName(String backupSetName) {
        super.withBackupSetName(backupSetName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSvmProtectedItem withCreateMode(CreateMode createMode) {
        super.withCreateMode(createMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSvmProtectedItem withDeferredDeleteTimeInUtc(OffsetDateTime deferredDeleteTimeInUtc) {
        super.withDeferredDeleteTimeInUtc(deferredDeleteTimeInUtc);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSvmProtectedItem withIsScheduledForDeferredDelete(Boolean isScheduledForDeferredDelete) {
        super.withIsScheduledForDeferredDelete(isScheduledForDeferredDelete);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSvmProtectedItem withDeferredDeleteTimeRemaining(String deferredDeleteTimeRemaining) {
        super.withDeferredDeleteTimeRemaining(deferredDeleteTimeRemaining);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSvmProtectedItem withIsDeferredDeleteScheduleUpcoming(Boolean isDeferredDeleteScheduleUpcoming) {
        super.withIsDeferredDeleteScheduleUpcoming(isDeferredDeleteScheduleUpcoming);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSvmProtectedItem withIsRehydrate(Boolean isRehydrate) {
        super.withIsRehydrate(isRehydrate);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSvmProtectedItem withResourceGuardOperationRequests(List<String> resourceGuardOperationRequests) {
        super.withResourceGuardOperationRequests(resourceGuardOperationRequests);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSvmProtectedItem withIsArchiveEnabled(Boolean isArchiveEnabled) {
        super.withIsArchiveEnabled(isArchiveEnabled);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSvmProtectedItem withPolicyName(String policyName) {
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
        if (healthDetails() != null) {
            healthDetails().forEach(e -> e.validate());
        }
        if (kpisHealths() != null) {
            kpisHealths()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (extendedInfo() != null) {
            extendedInfo().validate();
        }
        if (extendedProperties() != null) {
            extendedProperties().validate();
        }
    }
}
