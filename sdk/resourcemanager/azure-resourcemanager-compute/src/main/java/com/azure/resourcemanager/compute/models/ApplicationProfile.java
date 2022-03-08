// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Contains the list of gallery applications that should be made available to the VM/VMSS. */
@Fluent
public final class ApplicationProfile {
    /*
     * Specifies the gallery applications that should be made available to the
     * VM/VMSS
     */
    @JsonProperty(value = "galleryApplications")
    private List<VMGalleryApplication> galleryApplications;

    /**
     * Get the galleryApplications property: Specifies the gallery applications that should be made available to the
     * VM/VMSS.
     *
     * @return the galleryApplications value.
     */
    public List<VMGalleryApplication> galleryApplications() {
        return this.galleryApplications;
    }

    /**
     * Set the galleryApplications property: Specifies the gallery applications that should be made available to the
     * VM/VMSS.
     *
     * @param galleryApplications the galleryApplications value to set.
     * @return the ApplicationProfile object itself.
     */
    public ApplicationProfile withGalleryApplications(List<VMGalleryApplication> galleryApplications) {
        this.galleryApplications = galleryApplications;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (galleryApplications() != null) {
            galleryApplications().forEach(e -> e.validate());
        }
    }
}
