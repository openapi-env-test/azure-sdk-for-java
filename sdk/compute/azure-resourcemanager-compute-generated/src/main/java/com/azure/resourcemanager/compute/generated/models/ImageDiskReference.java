// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The source image used for creating the disk. */
@Fluent
public final class ImageDiskReference {
    /*
     * A relative uri containing either a Platform Image Repository or user
     * image reference.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * If the disk is created from an image's data disk, this is an index that
     * indicates which of the data disks in the image to use. For OS disks,
     * this field is null.
     */
    @JsonProperty(value = "lun")
    private Integer lun;

    /**
     * Get the id property: A relative uri containing either a Platform Image Repository or user image reference.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: A relative uri containing either a Platform Image Repository or user image reference.
     *
     * @param id the id value to set.
     * @return the ImageDiskReference object itself.
     */
    public ImageDiskReference withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the lun property: If the disk is created from an image's data disk, this is an index that indicates which of
     * the data disks in the image to use. For OS disks, this field is null.
     *
     * @return the lun value.
     */
    public Integer lun() {
        return this.lun;
    }

    /**
     * Set the lun property: If the disk is created from an image's data disk, this is an index that indicates which of
     * the data disks in the image to use. For OS disks, this field is null.
     *
     * @param lun the lun value to set.
     * @return the ImageDiskReference object itself.
     */
    public ImageDiskReference withLun(Integer lun) {
        this.lun = lun;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property id in model ImageDiskReference"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ImageDiskReference.class);
}
