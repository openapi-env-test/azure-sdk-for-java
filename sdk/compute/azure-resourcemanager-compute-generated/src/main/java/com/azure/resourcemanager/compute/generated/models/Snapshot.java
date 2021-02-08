// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.SnapshotInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of Snapshot. */
public interface Snapshot {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the managedBy property: Unused. Always Null.
     *
     * @return the managedBy value.
     */
    String managedBy();

    /**
     * Gets the sku property: The snapshots sku name. Can be Standard_LRS, Premium_LRS, or Standard_ZRS. This is an
     * optional parameter for incremental snapshot and the default behavior is the SKU will be set to the same sku as
     * the previous snapshot.
     *
     * @return the sku value.
     */
    SnapshotSku sku();

    /**
     * Gets the extendedLocation property: The extended location where the snapshot will be created. Extended location
     * cannot be changed.
     *
     * @return the extendedLocation value.
     */
    ExtendedLocation extendedLocation();

    /**
     * Gets the timeCreated property: The time when the snapshot was created.
     *
     * @return the timeCreated value.
     */
    OffsetDateTime timeCreated();

    /**
     * Gets the osType property: The Operating System type.
     *
     * @return the osType value.
     */
    OperatingSystemTypes osType();

    /**
     * Gets the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks
     * only.
     *
     * @return the hyperVGeneration value.
     */
    HyperVGeneration hyperVGeneration();

    /**
     * Gets the purchasePlan property: Purchase plan information for the image from which the source disk for the
     * snapshot was originally created.
     *
     * @return the purchasePlan value.
     */
    PurchasePlan purchasePlan();

    /**
     * Gets the creationData property: Disk source information. CreationData information cannot be changed after the
     * disk has been created.
     *
     * @return the creationData value.
     */
    CreationData creationData();

    /**
     * Gets the diskSizeGB property: If creationData.createOption is Empty, this field is mandatory and it indicates the
     * size of the disk to create. If this field is present for updates or creation with other options, it indicates a
     * resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's
     * size.
     *
     * @return the diskSizeGB value.
     */
    Integer diskSizeGB();

    /**
     * Gets the diskSizeBytes property: The size of the disk in bytes. This field is read only.
     *
     * @return the diskSizeBytes value.
     */
    Long diskSizeBytes();

    /**
     * Gets the diskState property: The state of the snapshot.
     *
     * @return the diskState value.
     */
    DiskState diskState();

    /**
     * Gets the uniqueId property: Unique Guid identifying the resource.
     *
     * @return the uniqueId value.
     */
    String uniqueId();

    /**
     * Gets the encryptionSettingsCollection property: Encryption settings collection used be Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     *
     * @return the encryptionSettingsCollection value.
     */
    EncryptionSettingsCollection encryptionSettingsCollection();

    /**
     * Gets the provisioningState property: The disk provisioning state.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the incremental property: Whether a snapshot is incremental. Incremental snapshots on the same disk occupy
     * less space than full snapshots and can be diffed.
     *
     * @return the incremental value.
     */
    Boolean incremental();

    /**
     * Gets the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     *
     * @return the encryption value.
     */
    Encryption encryption();

    /**
     * Gets the networkAccessPolicy property: Policy for accessing the disk via network.
     *
     * @return the networkAccessPolicy value.
     */
    NetworkAccessPolicy networkAccessPolicy();

    /**
     * Gets the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @return the diskAccessId value.
     */
    String diskAccessId();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.SnapshotInner object.
     *
     * @return the inner object.
     */
    SnapshotInner innerModel();

    /** The entirety of the Snapshot definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The Snapshot definition stages. */
    interface DefinitionStages {
        /** The first stage of the Snapshot definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Snapshot definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the Snapshot definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the Snapshot definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithSku,
                DefinitionStages.WithExtendedLocation,
                DefinitionStages.WithOsType,
                DefinitionStages.WithHyperVGeneration,
                DefinitionStages.WithPurchasePlan,
                DefinitionStages.WithCreationData,
                DefinitionStages.WithDiskSizeGB,
                DefinitionStages.WithEncryptionSettingsCollection,
                DefinitionStages.WithIncremental,
                DefinitionStages.WithEncryption,
                DefinitionStages.WithNetworkAccessPolicy,
                DefinitionStages.WithDiskAccessId {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Snapshot create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Snapshot create(Context context);
        }
        /** The stage of the Snapshot definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Snapshot definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The snapshots sku name. Can be Standard_LRS, Premium_LRS, or Standard_ZRS.
             * This is an optional parameter for incremental snapshot and the default behavior is the SKU will be set to
             * the same sku as the previous snapshot.
             *
             * @param sku The snapshots sku name. Can be Standard_LRS, Premium_LRS, or Standard_ZRS. This is an optional
             *     parameter for incremental snapshot and the default behavior is the SKU will be set to the same sku as
             *     the previous snapshot.
             * @return the next definition stage.
             */
            WithCreate withSku(SnapshotSku sku);
        }
        /** The stage of the Snapshot definition allowing to specify extendedLocation. */
        interface WithExtendedLocation {
            /**
             * Specifies the extendedLocation property: The extended location where the snapshot will be created.
             * Extended location cannot be changed..
             *
             * @param extendedLocation The extended location where the snapshot will be created. Extended location
             *     cannot be changed.
             * @return the next definition stage.
             */
            WithCreate withExtendedLocation(ExtendedLocation extendedLocation);
        }
        /** The stage of the Snapshot definition allowing to specify osType. */
        interface WithOsType {
            /**
             * Specifies the osType property: The Operating System type..
             *
             * @param osType The Operating System type.
             * @return the next definition stage.
             */
            WithCreate withOsType(OperatingSystemTypes osType);
        }
        /** The stage of the Snapshot definition allowing to specify hyperVGeneration. */
        interface WithHyperVGeneration {
            /**
             * Specifies the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to
             * OS disks only..
             *
             * @param hyperVGeneration The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
             * @return the next definition stage.
             */
            WithCreate withHyperVGeneration(HyperVGeneration hyperVGeneration);
        }
        /** The stage of the Snapshot definition allowing to specify purchasePlan. */
        interface WithPurchasePlan {
            /**
             * Specifies the purchasePlan property: Purchase plan information for the image from which the source disk
             * for the snapshot was originally created..
             *
             * @param purchasePlan Purchase plan information for the image from which the source disk for the snapshot
             *     was originally created.
             * @return the next definition stage.
             */
            WithCreate withPurchasePlan(PurchasePlan purchasePlan);
        }
        /** The stage of the Snapshot definition allowing to specify creationData. */
        interface WithCreationData {
            /**
             * Specifies the creationData property: Disk source information. CreationData information cannot be changed
             * after the disk has been created..
             *
             * @param creationData Disk source information. CreationData information cannot be changed after the disk
             *     has been created.
             * @return the next definition stage.
             */
            WithCreate withCreationData(CreationData creationData);
        }
        /** The stage of the Snapshot definition allowing to specify diskSizeGB. */
        interface WithDiskSizeGB {
            /**
             * Specifies the diskSizeGB property: If creationData.createOption is Empty, this field is mandatory and it
             * indicates the size of the disk to create. If this field is present for updates or creation with other
             * options, it indicates a resize. Resizes are only allowed if the disk is not attached to a running VM, and
             * can only increase the disk's size..
             *
             * @param diskSizeGB If creationData.createOption is Empty, this field is mandatory and it indicates the
             *     size of the disk to create. If this field is present for updates or creation with other options, it
             *     indicates a resize. Resizes are only allowed if the disk is not attached to a running VM, and can
             *     only increase the disk's size.
             * @return the next definition stage.
             */
            WithCreate withDiskSizeGB(Integer diskSizeGB);
        }
        /** The stage of the Snapshot definition allowing to specify encryptionSettingsCollection. */
        interface WithEncryptionSettingsCollection {
            /**
             * Specifies the encryptionSettingsCollection property: Encryption settings collection used be Azure Disk
             * Encryption, can contain multiple encryption settings per disk or snapshot..
             *
             * @param encryptionSettingsCollection Encryption settings collection used be Azure Disk Encryption, can
             *     contain multiple encryption settings per disk or snapshot.
             * @return the next definition stage.
             */
            WithCreate withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection);
        }
        /** The stage of the Snapshot definition allowing to specify incremental. */
        interface WithIncremental {
            /**
             * Specifies the incremental property: Whether a snapshot is incremental. Incremental snapshots on the same
             * disk occupy less space than full snapshots and can be diffed..
             *
             * @param incremental Whether a snapshot is incremental. Incremental snapshots on the same disk occupy less
             *     space than full snapshots and can be diffed.
             * @return the next definition stage.
             */
            WithCreate withIncremental(Boolean incremental);
        }
        /** The stage of the Snapshot definition allowing to specify encryption. */
        interface WithEncryption {
            /**
             * Specifies the encryption property: Encryption property can be used to encrypt data at rest with customer
             * managed keys or platform managed keys..
             *
             * @param encryption Encryption property can be used to encrypt data at rest with customer managed keys or
             *     platform managed keys.
             * @return the next definition stage.
             */
            WithCreate withEncryption(Encryption encryption);
        }
        /** The stage of the Snapshot definition allowing to specify networkAccessPolicy. */
        interface WithNetworkAccessPolicy {
            /**
             * Specifies the networkAccessPolicy property: Policy for accessing the disk via network..
             *
             * @param networkAccessPolicy Policy for accessing the disk via network.
             * @return the next definition stage.
             */
            WithCreate withNetworkAccessPolicy(NetworkAccessPolicy networkAccessPolicy);
        }
        /** The stage of the Snapshot definition allowing to specify diskAccessId. */
        interface WithDiskAccessId {
            /**
             * Specifies the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on
             * disks..
             *
             * @param diskAccessId ARM id of the DiskAccess resource for using private endpoints on disks.
             * @return the next definition stage.
             */
            WithCreate withDiskAccessId(String diskAccessId);
        }
    }
    /**
     * Begins update for the Snapshot resource.
     *
     * @return the stage of resource update.
     */
    Snapshot.Update update();

    /** The template for Snapshot update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithSku,
            UpdateStages.WithOsType,
            UpdateStages.WithDiskSizeGB,
            UpdateStages.WithEncryptionSettingsCollection,
            UpdateStages.WithEncryption,
            UpdateStages.WithNetworkAccessPolicy,
            UpdateStages.WithDiskAccessId {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Snapshot apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Snapshot apply(Context context);
    }
    /** The Snapshot update stages. */
    interface UpdateStages {
        /** The stage of the Snapshot update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Snapshot update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The snapshots sku name. Can be Standard_LRS, Premium_LRS, or Standard_ZRS.
             * This is an optional parameter for incremental snapshot and the default behavior is the SKU will be set to
             * the same sku as the previous snapshot.
             *
             * @param sku The snapshots sku name. Can be Standard_LRS, Premium_LRS, or Standard_ZRS. This is an optional
             *     parameter for incremental snapshot and the default behavior is the SKU will be set to the same sku as
             *     the previous snapshot.
             * @return the next definition stage.
             */
            Update withSku(SnapshotSku sku);
        }
        /** The stage of the Snapshot update allowing to specify osType. */
        interface WithOsType {
            /**
             * Specifies the osType property: the Operating System type..
             *
             * @param osType the Operating System type.
             * @return the next definition stage.
             */
            Update withOsType(OperatingSystemTypes osType);
        }
        /** The stage of the Snapshot update allowing to specify diskSizeGB. */
        interface WithDiskSizeGB {
            /**
             * Specifies the diskSizeGB property: If creationData.createOption is Empty, this field is mandatory and it
             * indicates the size of the disk to create. If this field is present for updates or creation with other
             * options, it indicates a resize. Resizes are only allowed if the disk is not attached to a running VM, and
             * can only increase the disk's size..
             *
             * @param diskSizeGB If creationData.createOption is Empty, this field is mandatory and it indicates the
             *     size of the disk to create. If this field is present for updates or creation with other options, it
             *     indicates a resize. Resizes are only allowed if the disk is not attached to a running VM, and can
             *     only increase the disk's size.
             * @return the next definition stage.
             */
            Update withDiskSizeGB(Integer diskSizeGB);
        }
        /** The stage of the Snapshot update allowing to specify encryptionSettingsCollection. */
        interface WithEncryptionSettingsCollection {
            /**
             * Specifies the encryptionSettingsCollection property: Encryption settings collection used be Azure Disk
             * Encryption, can contain multiple encryption settings per disk or snapshot..
             *
             * @param encryptionSettingsCollection Encryption settings collection used be Azure Disk Encryption, can
             *     contain multiple encryption settings per disk or snapshot.
             * @return the next definition stage.
             */
            Update withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection);
        }
        /** The stage of the Snapshot update allowing to specify encryption. */
        interface WithEncryption {
            /**
             * Specifies the encryption property: Encryption property can be used to encrypt data at rest with customer
             * managed keys or platform managed keys..
             *
             * @param encryption Encryption property can be used to encrypt data at rest with customer managed keys or
             *     platform managed keys.
             * @return the next definition stage.
             */
            Update withEncryption(Encryption encryption);
        }
        /** The stage of the Snapshot update allowing to specify networkAccessPolicy. */
        interface WithNetworkAccessPolicy {
            /**
             * Specifies the networkAccessPolicy property: Policy for accessing the disk via network..
             *
             * @param networkAccessPolicy Policy for accessing the disk via network.
             * @return the next definition stage.
             */
            Update withNetworkAccessPolicy(NetworkAccessPolicy networkAccessPolicy);
        }
        /** The stage of the Snapshot update allowing to specify diskAccessId. */
        interface WithDiskAccessId {
            /**
             * Specifies the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on
             * disks..
             *
             * @param diskAccessId ARM id of the DiskAccess resource for using private endpoints on disks.
             * @return the next definition stage.
             */
            Update withDiskAccessId(String diskAccessId);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Snapshot refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Snapshot refresh(Context context);

    /**
     * Grants access to a snapshot.
     *
     * @param grantAccessData Access data object supplied in the body of the get snapshot access operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a disk access SAS uri.
     */
    AccessUri grantAccess(GrantAccessData grantAccessData);

    /**
     * Grants access to a snapshot.
     *
     * @param grantAccessData Access data object supplied in the body of the get snapshot access operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a disk access SAS uri.
     */
    AccessUri grantAccess(GrantAccessData grantAccessData, Context context);

    /**
     * Revokes access to a snapshot.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void revokeAccess();

    /**
     * Revokes access to a snapshot.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void revokeAccess(Context context);
}
