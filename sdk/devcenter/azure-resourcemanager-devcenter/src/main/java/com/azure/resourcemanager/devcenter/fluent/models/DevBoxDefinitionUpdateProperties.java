// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.devcenter.models.ImageReference;
import com.azure.resourcemanager.devcenter.models.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a Dev Box definition. These properties can be updated after the resource has been created. */
@Fluent
public class DevBoxDefinitionUpdateProperties {
    /*
     * Image reference information.
     */
    @JsonProperty(value = "imageReference")
    private ImageReference imageReference;

    /*
     * The SKU for Dev Boxes created using this definition.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * The storage type used for the Operating System disk of Dev Boxes created
     * using this definition.
     */
    @JsonProperty(value = "osStorageType")
    private String osStorageType;

    /**
     * Get the imageReference property: Image reference information.
     *
     * @return the imageReference value.
     */
    public ImageReference imageReference() {
        return this.imageReference;
    }

    /**
     * Set the imageReference property: Image reference information.
     *
     * @param imageReference the imageReference value to set.
     * @return the DevBoxDefinitionUpdateProperties object itself.
     */
    public DevBoxDefinitionUpdateProperties withImageReference(ImageReference imageReference) {
        this.imageReference = imageReference;
        return this;
    }

    /**
     * Get the sku property: The SKU for Dev Boxes created using this definition.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU for Dev Boxes created using this definition.
     *
     * @param sku the sku value to set.
     * @return the DevBoxDefinitionUpdateProperties object itself.
     */
    public DevBoxDefinitionUpdateProperties withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the osStorageType property: The storage type used for the Operating System disk of Dev Boxes created using
     * this definition.
     *
     * @return the osStorageType value.
     */
    public String osStorageType() {
        return this.osStorageType;
    }

    /**
     * Set the osStorageType property: The storage type used for the Operating System disk of Dev Boxes created using
     * this definition.
     *
     * @param osStorageType the osStorageType value to set.
     * @return the DevBoxDefinitionUpdateProperties object itself.
     */
    public DevBoxDefinitionUpdateProperties withOsStorageType(String osStorageType) {
        this.osStorageType = osStorageType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (imageReference() != null) {
            imageReference().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }
}
