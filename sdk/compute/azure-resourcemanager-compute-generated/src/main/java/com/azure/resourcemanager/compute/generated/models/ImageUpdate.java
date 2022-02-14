// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.models.ImageProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The source user image virtual hard disk. Only tags may be updated. */
@Fluent
public final class ImageUpdate extends UpdateResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImageUpdate.class);

    /*
     * Describes the properties of an Image.
     */
    @JsonProperty(value = "properties")
    private ImageProperties innerProperties;

    /**
     * Get the innerProperties property: Describes the properties of an Image.
     *
     * @return the innerProperties value.
     */
    private ImageProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ImageUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the sourceVirtualMachine property: The source virtual machine from which Image is created.
     *
     * @return the sourceVirtualMachine value.
     */
    public SubResource sourceVirtualMachine() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceVirtualMachine();
    }

    /**
     * Set the sourceVirtualMachine property: The source virtual machine from which Image is created.
     *
     * @param sourceVirtualMachine the sourceVirtualMachine value to set.
     * @return the ImageUpdate object itself.
     */
    public ImageUpdate withSourceVirtualMachine(SubResource sourceVirtualMachine) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ImageProperties();
        }
        this.innerProperties().withSourceVirtualMachine(sourceVirtualMachine);
        return this;
    }

    /**
     * Get the storageProfile property: Specifies the storage settings for the virtual machine disks.
     *
     * @return the storageProfile value.
     */
    public ImageStorageProfile storageProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().storageProfile();
    }

    /**
     * Set the storageProfile property: Specifies the storage settings for the virtual machine disks.
     *
     * @param storageProfile the storageProfile value to set.
     * @return the ImageUpdate object itself.
     */
    public ImageUpdate withStorageProfile(ImageStorageProfile storageProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ImageProperties();
        }
        this.innerProperties().withStorageProfile(storageProfile);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the hyperVGeneration property: Specifies the HyperVGenerationType of the VirtualMachine created from the
     * image. From API Version 2019-03-01 if the image source is a blob, then we need the user to specify the value, if
     * the source is managed resource like disk or snapshot, we may require the user to specify the property if we
     * cannot deduce it from the source managed resource.
     *
     * @return the hyperVGeneration value.
     */
    public HyperVGenerationTypes hyperVGeneration() {
        return this.innerProperties() == null ? null : this.innerProperties().hyperVGeneration();
    }

    /**
     * Set the hyperVGeneration property: Specifies the HyperVGenerationType of the VirtualMachine created from the
     * image. From API Version 2019-03-01 if the image source is a blob, then we need the user to specify the value, if
     * the source is managed resource like disk or snapshot, we may require the user to specify the property if we
     * cannot deduce it from the source managed resource.
     *
     * @param hyperVGeneration the hyperVGeneration value to set.
     * @return the ImageUpdate object itself.
     */
    public ImageUpdate withHyperVGeneration(HyperVGenerationTypes hyperVGeneration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ImageProperties();
        }
        this.innerProperties().withHyperVGeneration(hyperVGeneration);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
