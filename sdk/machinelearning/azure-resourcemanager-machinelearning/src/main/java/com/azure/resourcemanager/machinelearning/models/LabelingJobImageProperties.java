// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Properties of a labeling job for image data. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "mediaType")
@JsonTypeName("Image")
@Fluent
public final class LabelingJobImageProperties extends LabelingJobMediaProperties {
    /*
     * Annotation type of image labeling job.
     */
    @JsonProperty(value = "annotationType")
    private ImageAnnotationType annotationType;

    /**
     * Get the annotationType property: Annotation type of image labeling job.
     *
     * @return the annotationType value.
     */
    public ImageAnnotationType annotationType() {
        return this.annotationType;
    }

    /**
     * Set the annotationType property: Annotation type of image labeling job.
     *
     * @param annotationType the annotationType value to set.
     * @return the LabelingJobImageProperties object itself.
     */
    public LabelingJobImageProperties withAnnotationType(ImageAnnotationType annotationType) {
        this.annotationType = annotationType;
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
    }
}
