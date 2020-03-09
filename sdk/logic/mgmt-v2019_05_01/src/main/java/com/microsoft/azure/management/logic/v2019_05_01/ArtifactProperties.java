/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The artifact properties definition.
 */
public class ArtifactProperties {
    /**
     * The artifact creation time.
     */
    @JsonProperty(value = "createdTime")
    private DateTime createdTime;

    /**
     * The artifact changed time.
     */
    @JsonProperty(value = "changedTime")
    private DateTime changedTime;

    /**
     * The metadata property.
     */
    @JsonProperty(value = "metadata")
    private Object metadata;

    /**
     * Get the artifact creation time.
     *
     * @return the createdTime value
     */
    public DateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Set the artifact creation time.
     *
     * @param createdTime the createdTime value to set
     * @return the ArtifactProperties object itself.
     */
    public ArtifactProperties withCreatedTime(DateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Get the artifact changed time.
     *
     * @return the changedTime value
     */
    public DateTime changedTime() {
        return this.changedTime;
    }

    /**
     * Set the artifact changed time.
     *
     * @param changedTime the changedTime value to set
     * @return the ArtifactProperties object itself.
     */
    public ArtifactProperties withChangedTime(DateTime changedTime) {
        this.changedTime = changedTime;
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     * @return the ArtifactProperties object itself.
     */
    public ArtifactProperties withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

}
