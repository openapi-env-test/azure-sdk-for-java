// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.devtestlabs.models.StorageType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties of a disk. */
@Fluent
public final class DiskProperties {
    /*
     * The storage type for the disk (i.e. Standard, Premium).
     */
    @JsonProperty(value = "diskType")
    private StorageType diskType;

    /*
     * The size of the disk in Gibibytes.
     */
    @JsonProperty(value = "diskSizeGiB")
    private Integer diskSizeGiB;

    /*
     * The resource ID of the VM to which this disk is leased.
     */
    @JsonProperty(value = "leasedByLabVmId")
    private String leasedByLabVmId;

    /*
     * When backed by a blob, the name of the VHD blob without extension.
     */
    @JsonProperty(value = "diskBlobName")
    private String diskBlobName;

    /*
     * When backed by a blob, the URI of underlying blob.
     */
    @JsonProperty(value = "diskUri")
    private String diskUri;

    /*
     * When backed by a blob, the storage account where the blob is.
     */
    @JsonProperty(value = "storageAccountId")
    private String storageAccountId;

    /*
     * The creation date of the disk.
     */
    @JsonProperty(value = "createdDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdDate;

    /*
     * The host caching policy of the disk (i.e. None, ReadOnly, ReadWrite).
     */
    @JsonProperty(value = "hostCaching")
    private String hostCaching;

    /*
     * When backed by managed disk, this is the ID of the compute disk
     * resource.
     */
    @JsonProperty(value = "managedDiskId")
    private String managedDiskId;

    /*
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "uniqueIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueIdentifier;

    /**
     * Get the diskType property: The storage type for the disk (i.e. Standard, Premium).
     *
     * @return the diskType value.
     */
    public StorageType diskType() {
        return this.diskType;
    }

    /**
     * Set the diskType property: The storage type for the disk (i.e. Standard, Premium).
     *
     * @param diskType the diskType value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withDiskType(StorageType diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * Get the diskSizeGiB property: The size of the disk in Gibibytes.
     *
     * @return the diskSizeGiB value.
     */
    public Integer diskSizeGiB() {
        return this.diskSizeGiB;
    }

    /**
     * Set the diskSizeGiB property: The size of the disk in Gibibytes.
     *
     * @param diskSizeGiB the diskSizeGiB value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withDiskSizeGiB(Integer diskSizeGiB) {
        this.diskSizeGiB = diskSizeGiB;
        return this;
    }

    /**
     * Get the leasedByLabVmId property: The resource ID of the VM to which this disk is leased.
     *
     * @return the leasedByLabVmId value.
     */
    public String leasedByLabVmId() {
        return this.leasedByLabVmId;
    }

    /**
     * Set the leasedByLabVmId property: The resource ID of the VM to which this disk is leased.
     *
     * @param leasedByLabVmId the leasedByLabVmId value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withLeasedByLabVmId(String leasedByLabVmId) {
        this.leasedByLabVmId = leasedByLabVmId;
        return this;
    }

    /**
     * Get the diskBlobName property: When backed by a blob, the name of the VHD blob without extension.
     *
     * @return the diskBlobName value.
     */
    public String diskBlobName() {
        return this.diskBlobName;
    }

    /**
     * Set the diskBlobName property: When backed by a blob, the name of the VHD blob without extension.
     *
     * @param diskBlobName the diskBlobName value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withDiskBlobName(String diskBlobName) {
        this.diskBlobName = diskBlobName;
        return this;
    }

    /**
     * Get the diskUri property: When backed by a blob, the URI of underlying blob.
     *
     * @return the diskUri value.
     */
    public String diskUri() {
        return this.diskUri;
    }

    /**
     * Set the diskUri property: When backed by a blob, the URI of underlying blob.
     *
     * @param diskUri the diskUri value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withDiskUri(String diskUri) {
        this.diskUri = diskUri;
        return this;
    }

    /**
     * Get the storageAccountId property: When backed by a blob, the storage account where the blob is.
     *
     * @return the storageAccountId value.
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    /**
     * Set the storageAccountId property: When backed by a blob, the storage account where the blob is.
     *
     * @param storageAccountId the storageAccountId value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withStorageAccountId(String storageAccountId) {
        this.storageAccountId = storageAccountId;
        return this;
    }

    /**
     * Get the createdDate property: The creation date of the disk.
     *
     * @return the createdDate value.
     */
    public OffsetDateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Get the hostCaching property: The host caching policy of the disk (i.e. None, ReadOnly, ReadWrite).
     *
     * @return the hostCaching value.
     */
    public String hostCaching() {
        return this.hostCaching;
    }

    /**
     * Set the hostCaching property: The host caching policy of the disk (i.e. None, ReadOnly, ReadWrite).
     *
     * @param hostCaching the hostCaching value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withHostCaching(String hostCaching) {
        this.hostCaching = hostCaching;
        return this;
    }

    /**
     * Get the managedDiskId property: When backed by managed disk, this is the ID of the compute disk resource.
     *
     * @return the managedDiskId value.
     */
    public String managedDiskId() {
        return this.managedDiskId;
    }

    /**
     * Set the managedDiskId property: When backed by managed disk, this is the ID of the compute disk resource.
     *
     * @param managedDiskId the managedDiskId value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withManagedDiskId(String managedDiskId) {
        this.managedDiskId = managedDiskId;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value.
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
