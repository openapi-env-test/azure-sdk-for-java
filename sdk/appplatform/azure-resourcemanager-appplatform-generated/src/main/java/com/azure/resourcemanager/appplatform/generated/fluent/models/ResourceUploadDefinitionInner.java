// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Resource upload definition payload. */
@Fluent
public final class ResourceUploadDefinitionInner {
    /*
     * Source relative path
     */
    @JsonProperty(value = "relativePath")
    private String relativePath;

    /*
     * Upload URL
     */
    @JsonProperty(value = "uploadUrl")
    private String uploadUrl;

    /**
     * Get the relativePath property: Source relative path.
     *
     * @return the relativePath value.
     */
    public String relativePath() {
        return this.relativePath;
    }

    /**
     * Set the relativePath property: Source relative path.
     *
     * @param relativePath the relativePath value to set.
     * @return the ResourceUploadDefinitionInner object itself.
     */
    public ResourceUploadDefinitionInner withRelativePath(String relativePath) {
        this.relativePath = relativePath;
        return this;
    }

    /**
     * Get the uploadUrl property: Upload URL.
     *
     * @return the uploadUrl value.
     */
    public String uploadUrl() {
        return this.uploadUrl;
    }

    /**
     * Set the uploadUrl property: Upload URL.
     *
     * @param uploadUrl the uploadUrl value to set.
     * @return the ResourceUploadDefinitionInner object itself.
     */
    public ResourceUploadDefinitionInner withUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
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
