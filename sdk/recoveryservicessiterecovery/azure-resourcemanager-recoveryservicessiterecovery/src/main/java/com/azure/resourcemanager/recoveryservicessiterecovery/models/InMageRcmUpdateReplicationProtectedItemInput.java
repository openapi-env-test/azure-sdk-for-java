// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** InMageRcm provider specific input to update replication protected item. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMageRcm")
@Fluent
public final class InMageRcmUpdateReplicationProtectedItemInput extends UpdateReplicationProtectedItemProviderInput {
    /*
     * The target VM name.
     */
    @JsonProperty(value = "targetVmName")
    private String targetVmName;

    /*
     * The target VM size.
     */
    @JsonProperty(value = "targetVmSize")
    private String targetVmSize;

    /*
     * The target resource group ARM Id.
     */
    @JsonProperty(value = "targetResourceGroupId")
    private String targetResourceGroupId;

    /*
     * The target availability set ARM Id.
     */
    @JsonProperty(value = "targetAvailabilitySetId")
    private String targetAvailabilitySetId;

    /*
     * The target availability zone.
     */
    @JsonProperty(value = "targetAvailabilityZone")
    private String targetAvailabilityZone;

    /*
     * The target proximity placement group Id.
     */
    @JsonProperty(value = "targetProximityPlacementGroupId")
    private String targetProximityPlacementGroupId;

    /*
     * The target boot diagnostics storage account ARM Id.
     */
    @JsonProperty(value = "targetBootDiagnosticsStorageAccountId")
    private String targetBootDiagnosticsStorageAccountId;

    /*
     * The target network ARM Id.
     */
    @JsonProperty(value = "targetNetworkId")
    private String targetNetworkId;

    /*
     * The test network ARM Id.
     */
    @JsonProperty(value = "testNetworkId")
    private String testNetworkId;

    /*
     * The list of NIC details.
     */
    @JsonProperty(value = "vmNics")
    private List<InMageRcmNicInput> vmNics;

    /*
     * The license type.
     */
    @JsonProperty(value = "licenseType")
    private LicenseType licenseType;

    /**
     * Get the targetVmName property: The target VM name.
     *
     * @return the targetVmName value.
     */
    public String targetVmName() {
        return this.targetVmName;
    }

    /**
     * Set the targetVmName property: The target VM name.
     *
     * @param targetVmName the targetVmName value to set.
     * @return the InMageRcmUpdateReplicationProtectedItemInput object itself.
     */
    public InMageRcmUpdateReplicationProtectedItemInput withTargetVmName(String targetVmName) {
        this.targetVmName = targetVmName;
        return this;
    }

    /**
     * Get the targetVmSize property: The target VM size.
     *
     * @return the targetVmSize value.
     */
    public String targetVmSize() {
        return this.targetVmSize;
    }

    /**
     * Set the targetVmSize property: The target VM size.
     *
     * @param targetVmSize the targetVmSize value to set.
     * @return the InMageRcmUpdateReplicationProtectedItemInput object itself.
     */
    public InMageRcmUpdateReplicationProtectedItemInput withTargetVmSize(String targetVmSize) {
        this.targetVmSize = targetVmSize;
        return this;
    }

    /**
     * Get the targetResourceGroupId property: The target resource group ARM Id.
     *
     * @return the targetResourceGroupId value.
     */
    public String targetResourceGroupId() {
        return this.targetResourceGroupId;
    }

    /**
     * Set the targetResourceGroupId property: The target resource group ARM Id.
     *
     * @param targetResourceGroupId the targetResourceGroupId value to set.
     * @return the InMageRcmUpdateReplicationProtectedItemInput object itself.
     */
    public InMageRcmUpdateReplicationProtectedItemInput withTargetResourceGroupId(String targetResourceGroupId) {
        this.targetResourceGroupId = targetResourceGroupId;
        return this;
    }

    /**
     * Get the targetAvailabilitySetId property: The target availability set ARM Id.
     *
     * @return the targetAvailabilitySetId value.
     */
    public String targetAvailabilitySetId() {
        return this.targetAvailabilitySetId;
    }

    /**
     * Set the targetAvailabilitySetId property: The target availability set ARM Id.
     *
     * @param targetAvailabilitySetId the targetAvailabilitySetId value to set.
     * @return the InMageRcmUpdateReplicationProtectedItemInput object itself.
     */
    public InMageRcmUpdateReplicationProtectedItemInput withTargetAvailabilitySetId(String targetAvailabilitySetId) {
        this.targetAvailabilitySetId = targetAvailabilitySetId;
        return this;
    }

    /**
     * Get the targetAvailabilityZone property: The target availability zone.
     *
     * @return the targetAvailabilityZone value.
     */
    public String targetAvailabilityZone() {
        return this.targetAvailabilityZone;
    }

    /**
     * Set the targetAvailabilityZone property: The target availability zone.
     *
     * @param targetAvailabilityZone the targetAvailabilityZone value to set.
     * @return the InMageRcmUpdateReplicationProtectedItemInput object itself.
     */
    public InMageRcmUpdateReplicationProtectedItemInput withTargetAvailabilityZone(String targetAvailabilityZone) {
        this.targetAvailabilityZone = targetAvailabilityZone;
        return this;
    }

    /**
     * Get the targetProximityPlacementGroupId property: The target proximity placement group Id.
     *
     * @return the targetProximityPlacementGroupId value.
     */
    public String targetProximityPlacementGroupId() {
        return this.targetProximityPlacementGroupId;
    }

    /**
     * Set the targetProximityPlacementGroupId property: The target proximity placement group Id.
     *
     * @param targetProximityPlacementGroupId the targetProximityPlacementGroupId value to set.
     * @return the InMageRcmUpdateReplicationProtectedItemInput object itself.
     */
    public InMageRcmUpdateReplicationProtectedItemInput withTargetProximityPlacementGroupId(
        String targetProximityPlacementGroupId) {
        this.targetProximityPlacementGroupId = targetProximityPlacementGroupId;
        return this;
    }

    /**
     * Get the targetBootDiagnosticsStorageAccountId property: The target boot diagnostics storage account ARM Id.
     *
     * @return the targetBootDiagnosticsStorageAccountId value.
     */
    public String targetBootDiagnosticsStorageAccountId() {
        return this.targetBootDiagnosticsStorageAccountId;
    }

    /**
     * Set the targetBootDiagnosticsStorageAccountId property: The target boot diagnostics storage account ARM Id.
     *
     * @param targetBootDiagnosticsStorageAccountId the targetBootDiagnosticsStorageAccountId value to set.
     * @return the InMageRcmUpdateReplicationProtectedItemInput object itself.
     */
    public InMageRcmUpdateReplicationProtectedItemInput withTargetBootDiagnosticsStorageAccountId(
        String targetBootDiagnosticsStorageAccountId) {
        this.targetBootDiagnosticsStorageAccountId = targetBootDiagnosticsStorageAccountId;
        return this;
    }

    /**
     * Get the targetNetworkId property: The target network ARM Id.
     *
     * @return the targetNetworkId value.
     */
    public String targetNetworkId() {
        return this.targetNetworkId;
    }

    /**
     * Set the targetNetworkId property: The target network ARM Id.
     *
     * @param targetNetworkId the targetNetworkId value to set.
     * @return the InMageRcmUpdateReplicationProtectedItemInput object itself.
     */
    public InMageRcmUpdateReplicationProtectedItemInput withTargetNetworkId(String targetNetworkId) {
        this.targetNetworkId = targetNetworkId;
        return this;
    }

    /**
     * Get the testNetworkId property: The test network ARM Id.
     *
     * @return the testNetworkId value.
     */
    public String testNetworkId() {
        return this.testNetworkId;
    }

    /**
     * Set the testNetworkId property: The test network ARM Id.
     *
     * @param testNetworkId the testNetworkId value to set.
     * @return the InMageRcmUpdateReplicationProtectedItemInput object itself.
     */
    public InMageRcmUpdateReplicationProtectedItemInput withTestNetworkId(String testNetworkId) {
        this.testNetworkId = testNetworkId;
        return this;
    }

    /**
     * Get the vmNics property: The list of NIC details.
     *
     * @return the vmNics value.
     */
    public List<InMageRcmNicInput> vmNics() {
        return this.vmNics;
    }

    /**
     * Set the vmNics property: The list of NIC details.
     *
     * @param vmNics the vmNics value to set.
     * @return the InMageRcmUpdateReplicationProtectedItemInput object itself.
     */
    public InMageRcmUpdateReplicationProtectedItemInput withVmNics(List<InMageRcmNicInput> vmNics) {
        this.vmNics = vmNics;
        return this;
    }

    /**
     * Get the licenseType property: The license type.
     *
     * @return the licenseType value.
     */
    public LicenseType licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: The license type.
     *
     * @param licenseType the licenseType value to set.
     * @return the InMageRcmUpdateReplicationProtectedItemInput object itself.
     */
    public InMageRcmUpdateReplicationProtectedItemInput withLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
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
        if (vmNics() != null) {
            vmNics().forEach(e -> e.validate());
        }
    }
}
