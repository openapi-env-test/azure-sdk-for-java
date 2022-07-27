// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** The Image model. */
@Fluent
public final class Image {
    /*
     * Type of the image Type of the image. Possible values are: docker - For
     * docker images. azureml - For AzureML images
     */
    @JsonProperty(value = "type")
    private ImageType type;

    /*
     * Image reference URL
     */
    @JsonProperty(value = "reference")
    private String reference;

    /*
     * Dictionary of <any>
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the type property: Type of the image Type of the image. Possible values are: docker - For docker images.
     * azureml - For AzureML images.
     *
     * @return the type value.
     */
    public ImageType type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the image Type of the image. Possible values are: docker - For docker images.
     * azureml - For AzureML images.
     *
     * @param type the type value to set.
     * @return the Image object itself.
     */
    public Image withType(ImageType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the reference property: Image reference URL.
     *
     * @return the reference value.
     */
    public String reference() {
        return this.reference;
    }

    /**
     * Set the reference property: Image reference URL.
     *
     * @param reference the reference value to set.
     * @return the Image object itself.
     */
    public Image withReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Get the additionalProperties property: Dictionary of &lt;any&gt;.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Dictionary of &lt;any&gt;.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the Image object itself.
     */
    public Image withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
