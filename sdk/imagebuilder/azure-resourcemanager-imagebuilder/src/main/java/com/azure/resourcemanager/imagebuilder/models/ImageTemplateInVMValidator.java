// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes a unit of in-VM validation of image. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = ImageTemplateInVMValidator.class)
@JsonTypeName("ImageTemplateInVMValidator")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Shell", value = ImageTemplateShellValidator.class),
    @JsonSubTypes.Type(name = "PowerShell", value = ImageTemplatePowerShellValidator.class),
    @JsonSubTypes.Type(name = "File", value = ImageTemplateFileValidator.class)
})
@Fluent
public class ImageTemplateInVMValidator {
    /*
     * Friendly Name to provide context on what this validation step does
     */
    @JsonProperty(value = "name")
    private String name;

    /** Creates an instance of ImageTemplateInVMValidator class. */
    public ImageTemplateInVMValidator() {
    }

    /**
     * Get the name property: Friendly Name to provide context on what this validation step does.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Friendly Name to provide context on what this validation step does.
     *
     * @param name the name value to set.
     * @return the ImageTemplateInVMValidator object itself.
     */
    public ImageTemplateInVMValidator withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
