// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This is the data disk image. */
@Immutable
public final class GalleryDataDiskImage extends GalleryDiskImage {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GalleryDataDiskImage.class);

    /*
     * This property specifies the logical unit number of the data disk. This
     * value is used to identify data disks within the Virtual Machine and
     * therefore must be unique for each data disk attached to the Virtual
     * Machine.
     */
    @JsonProperty(value = "lun", access = JsonProperty.Access.WRITE_ONLY)
    private Integer lun;

    /**
     * Get the lun property: This property specifies the logical unit number of the data disk. This value is used to
     * identify data disks within the Virtual Machine and therefore must be unique for each data disk attached to the
     * Virtual Machine.
     *
     * @return the lun value.
     */
    public Integer lun() {
        return this.lun;
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
