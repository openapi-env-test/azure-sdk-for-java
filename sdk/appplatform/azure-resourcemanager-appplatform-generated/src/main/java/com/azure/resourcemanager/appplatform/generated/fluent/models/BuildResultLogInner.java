// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Build result log resource properties payload. */
@Fluent
public final class BuildResultLogInner {
    /*
     * The public download URL of this build result log
     */
    @JsonProperty(value = "blobUrl")
    private String blobUrl;

    /**
     * Get the blobUrl property: The public download URL of this build result log.
     *
     * @return the blobUrl value.
     */
    public String blobUrl() {
        return this.blobUrl;
    }

    /**
     * Set the blobUrl property: The public download URL of this build result log.
     *
     * @param blobUrl the blobUrl value to set.
     * @return the BuildResultLogInner object itself.
     */
    public BuildResultLogInner withBlobUrl(String blobUrl) {
        this.blobUrl = blobUrl;
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
