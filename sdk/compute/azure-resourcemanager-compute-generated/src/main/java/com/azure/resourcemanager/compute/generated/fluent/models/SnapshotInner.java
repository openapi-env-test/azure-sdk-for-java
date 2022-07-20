// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.compute.generated.models.CopyCompletionError;
import com.azure.resourcemanager.compute.generated.models.CreationData;
import com.azure.resourcemanager.compute.generated.models.DataAccessAuthMode;
import com.azure.resourcemanager.compute.generated.models.DiskSecurityProfile;
import com.azure.resourcemanager.compute.generated.models.DiskState;
import com.azure.resourcemanager.compute.generated.models.Encryption;
import com.azure.resourcemanager.compute.generated.models.EncryptionSettingsCollection;
import com.azure.resourcemanager.compute.generated.models.ExtendedLocation;
import com.azure.resourcemanager.compute.generated.models.HyperVGeneration;
import com.azure.resourcemanager.compute.generated.models.NetworkAccessPolicy;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.compute.generated.models.PurchasePlanAutoGenerated;
import com.azure.resourcemanager.compute.generated.models.SnapshotSku;
import com.azure.resourcemanager.compute.generated.models.SupportedCapabilities;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Snapshot resource. */
@Fluent
public final class SnapshotInner extends Resource {
    /*
     * Unused. Always Null.
     */
    @JsonProperty(value = "managedBy", access = JsonProperty.Access.WRITE_ONLY)
    private String managedBy;

    /*
     * The snapshots sku name. Can be Standard_LRS, Premium_LRS, or
     * Standard_ZRS. This is an optional parameter for incremental snapshot and
     * the default behavior is the SKU will be set to the same sku as the
     * previous snapshot
     */
    @JsonProperty(value = "sku")
    private SnapshotSku sku;

    /*
     * The extended location where the snapshot will be created. Extended
     * location cannot be changed.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /*
     * Snapshot resource properties.
     */
    @JsonProperty(value = "properties")
    private SnapshotProperties innerProperties;

    /**
     * Get the managedBy property: Unused. Always Null.
     *
     * @return the managedBy value.
     */
    public String managedBy() {
        return this.managedBy;
    }

    /**
     * Get the sku property: The snapshots sku name. Can be Standard_LRS, Premium_LRS, or Standard_ZRS. This is an
     * optional parameter for incremental snapshot and the default behavior is the SKU will be set to the same sku as
     * the previous snapshot.
     *
     * @return the sku value.
     */
    public SnapshotSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The snapshots sku name. Can be Standard_LRS, Premium_LRS, or Standard_ZRS. This is an
     * optional parameter for incremental snapshot and the default behavior is the SKU will be set to the same sku as
     * the previous snapshot.
     *
     * @param sku the sku value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withSku(SnapshotSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the extendedLocation property: The extended location where the snapshot will be created. Extended location
     * cannot be changed.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location where the snapshot will be created. Extended location
     * cannot be changed.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the innerProperties property: Snapshot resource properties.
     *
     * @return the innerProperties value.
     */
    private SnapshotProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public SnapshotInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SnapshotInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the timeCreated property: The time when the snapshot was created.
     *
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.innerProperties() == null ? null : this.innerProperties().timeCreated();
    }

    /**
     * Get the osType property: The Operating System type.
     *
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.innerProperties() == null ? null : this.innerProperties().osType();
    }

    /**
     * Set the osType property: The Operating System type.
     *
     * @param osType the osType value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withOsType(OperatingSystemTypes osType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withOsType(osType);
        return this;
    }

    /**
     * Get the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     *
     * @return the hyperVGeneration value.
     */
    public HyperVGeneration hyperVGeneration() {
        return this.innerProperties() == null ? null : this.innerProperties().hyperVGeneration();
    }

    /**
     * Set the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     *
     * @param hyperVGeneration the hyperVGeneration value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withHyperVGeneration(HyperVGeneration hyperVGeneration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withHyperVGeneration(hyperVGeneration);
        return this;
    }

    /**
     * Get the purchasePlan property: Purchase plan information for the image from which the source disk for the
     * snapshot was originally created.
     *
     * @return the purchasePlan value.
     */
    public PurchasePlanAutoGenerated purchasePlan() {
        return this.innerProperties() == null ? null : this.innerProperties().purchasePlan();
    }

    /**
     * Set the purchasePlan property: Purchase plan information for the image from which the source disk for the
     * snapshot was originally created.
     *
     * @param purchasePlan the purchasePlan value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withPurchasePlan(PurchasePlanAutoGenerated purchasePlan) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withPurchasePlan(purchasePlan);
        return this;
    }

    /**
     * Get the supportedCapabilities property: List of supported capabilities for the image from which the source disk
     * from the snapshot was originally created.
     *
     * @return the supportedCapabilities value.
     */
    public SupportedCapabilities supportedCapabilities() {
        return this.innerProperties() == null ? null : this.innerProperties().supportedCapabilities();
    }

    /**
     * Set the supportedCapabilities property: List of supported capabilities for the image from which the source disk
     * from the snapshot was originally created.
     *
     * @param supportedCapabilities the supportedCapabilities value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withSupportedCapabilities(SupportedCapabilities supportedCapabilities) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withSupportedCapabilities(supportedCapabilities);
        return this;
    }

    /**
     * Get the creationData property: Disk source information. CreationData information cannot be changed after the disk
     * has been created.
     *
     * @return the creationData value.
     */
    public CreationData creationData() {
        return this.innerProperties() == null ? null : this.innerProperties().creationData();
    }

    /**
     * Set the creationData property: Disk source information. CreationData information cannot be changed after the disk
     * has been created.
     *
     * @param creationData the creationData value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withCreationData(CreationData creationData) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withCreationData(creationData);
        return this;
    }

    /**
     * Get the diskSizeGB property: If creationData.createOption is Empty, this field is mandatory and it indicates the
     * size of the disk to create. If this field is present for updates or creation with other options, it indicates a
     * resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's
     * size.
     *
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.innerProperties() == null ? null : this.innerProperties().diskSizeGB();
    }

    /**
     * Set the diskSizeGB property: If creationData.createOption is Empty, this field is mandatory and it indicates the
     * size of the disk to create. If this field is present for updates or creation with other options, it indicates a
     * resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's
     * size.
     *
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withDiskSizeGB(Integer diskSizeGB) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withDiskSizeGB(diskSizeGB);
        return this;
    }

    /**
     * Get the diskSizeBytes property: The size of the disk in bytes. This field is read only.
     *
     * @return the diskSizeBytes value.
     */
    public Long diskSizeBytes() {
        return this.innerProperties() == null ? null : this.innerProperties().diskSizeBytes();
    }

    /**
     * Get the diskState property: The state of the snapshot.
     *
     * @return the diskState value.
     */
    public DiskState diskState() {
        return this.innerProperties() == null ? null : this.innerProperties().diskState();
    }

    /**
     * Get the uniqueId property: Unique Guid identifying the resource.
     *
     * @return the uniqueId value.
     */
    public String uniqueId() {
        return this.innerProperties() == null ? null : this.innerProperties().uniqueId();
    }

    /**
     * Get the encryptionSettingsCollection property: Encryption settings collection used be Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     *
     * @return the encryptionSettingsCollection value.
     */
    public EncryptionSettingsCollection encryptionSettingsCollection() {
        return this.innerProperties() == null ? null : this.innerProperties().encryptionSettingsCollection();
    }

    /**
     * Set the encryptionSettingsCollection property: Encryption settings collection used be Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     *
     * @param encryptionSettingsCollection the encryptionSettingsCollection value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withEncryptionSettingsCollection(encryptionSettingsCollection);
        return this;
    }

    /**
     * Get the provisioningState property: The disk provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the incremental property: Whether a snapshot is incremental. Incremental snapshots on the same disk occupy
     * less space than full snapshots and can be diffed.
     *
     * @return the incremental value.
     */
    public Boolean incremental() {
        return this.innerProperties() == null ? null : this.innerProperties().incremental();
    }

    /**
     * Set the incremental property: Whether a snapshot is incremental. Incremental snapshots on the same disk occupy
     * less space than full snapshots and can be diffed.
     *
     * @param incremental the incremental value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withIncremental(Boolean incremental) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withIncremental(incremental);
        return this;
    }

    /**
     * Get the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     *
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     *
     * @param encryption the encryption value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withEncryption(Encryption encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withEncryption(encryption);
        return this;
    }

    /**
     * Get the networkAccessPolicy property: Policy for accessing the disk via network.
     *
     * @return the networkAccessPolicy value.
     */
    public NetworkAccessPolicy networkAccessPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().networkAccessPolicy();
    }

    /**
     * Set the networkAccessPolicy property: Policy for accessing the disk via network.
     *
     * @param networkAccessPolicy the networkAccessPolicy value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withNetworkAccessPolicy(NetworkAccessPolicy networkAccessPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withNetworkAccessPolicy(networkAccessPolicy);
        return this;
    }

    /**
     * Get the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @return the diskAccessId value.
     */
    public String diskAccessId() {
        return this.innerProperties() == null ? null : this.innerProperties().diskAccessId();
    }

    /**
     * Set the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @param diskAccessId the diskAccessId value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withDiskAccessId(String diskAccessId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withDiskAccessId(diskAccessId);
        return this;
    }

    /**
     * Get the securityProfile property: Contains the security related information for the resource.
     *
     * @return the securityProfile value.
     */
    public DiskSecurityProfile securityProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().securityProfile();
    }

    /**
     * Set the securityProfile property: Contains the security related information for the resource.
     *
     * @param securityProfile the securityProfile value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withSecurityProfile(DiskSecurityProfile securityProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withSecurityProfile(securityProfile);
        return this;
    }

    /**
     * Get the supportsHibernation property: Indicates the OS on a snapshot supports hibernation.
     *
     * @return the supportsHibernation value.
     */
    public Boolean supportsHibernation() {
        return this.innerProperties() == null ? null : this.innerProperties().supportsHibernation();
    }

    /**
     * Set the supportsHibernation property: Indicates the OS on a snapshot supports hibernation.
     *
     * @param supportsHibernation the supportsHibernation value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withSupportsHibernation(Boolean supportsHibernation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withSupportsHibernation(supportsHibernation);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Policy for controlling export on the disk.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Policy for controlling export on the disk.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the completionPercent property: Percentage complete for the background copy when a resource is created via
     * the CopyStart operation.
     *
     * @return the completionPercent value.
     */
    public Float completionPercent() {
        return this.innerProperties() == null ? null : this.innerProperties().completionPercent();
    }

    /**
     * Set the completionPercent property: Percentage complete for the background copy when a resource is created via
     * the CopyStart operation.
     *
     * @param completionPercent the completionPercent value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withCompletionPercent(Float completionPercent) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withCompletionPercent(completionPercent);
        return this;
    }

    /**
     * Get the copyCompletionError property: Indicates the error details if the background copy of a resource created
     * via the CopyStart operation fails.
     *
     * @return the copyCompletionError value.
     */
    public CopyCompletionError copyCompletionError() {
        return this.innerProperties() == null ? null : this.innerProperties().copyCompletionError();
    }

    /**
     * Set the copyCompletionError property: Indicates the error details if the background copy of a resource created
     * via the CopyStart operation fails.
     *
     * @param copyCompletionError the copyCompletionError value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withCopyCompletionError(CopyCompletionError copyCompletionError) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withCopyCompletionError(copyCompletionError);
        return this;
    }

    /**
     * Get the dataAccessAuthMode property: Additional authentication requirements when exporting or uploading to a disk
     * or snapshot.
     *
     * @return the dataAccessAuthMode value.
     */
    public DataAccessAuthMode dataAccessAuthMode() {
        return this.innerProperties() == null ? null : this.innerProperties().dataAccessAuthMode();
    }

    /**
     * Set the dataAccessAuthMode property: Additional authentication requirements when exporting or uploading to a disk
     * or snapshot.
     *
     * @param dataAccessAuthMode the dataAccessAuthMode value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withDataAccessAuthMode(DataAccessAuthMode dataAccessAuthMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withDataAccessAuthMode(dataAccessAuthMode);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
