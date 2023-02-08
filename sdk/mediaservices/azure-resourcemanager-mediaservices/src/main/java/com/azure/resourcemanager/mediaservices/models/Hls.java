// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** HTTP Live Streaming (HLS) packing setting for the live output. */
@Fluent
public final class Hls {
    /*
     * The number of fragments in an HTTP Live Streaming (HLS) TS segment in the output of the live event. This value
     * does not affect the packing ratio for HLS CMAF output.
     */
    @JsonProperty(value = "fragmentsPerTsSegment")
    private Integer fragmentsPerTsSegment;

    /** Creates an instance of Hls class. */
    public Hls() {
    }

    /**
     * Get the fragmentsPerTsSegment property: The number of fragments in an HTTP Live Streaming (HLS) TS segment in the
     * output of the live event. This value does not affect the packing ratio for HLS CMAF output.
     *
     * @return the fragmentsPerTsSegment value.
     */
    public Integer fragmentsPerTsSegment() {
        return this.fragmentsPerTsSegment;
    }

    /**
     * Set the fragmentsPerTsSegment property: The number of fragments in an HTTP Live Streaming (HLS) TS segment in the
     * output of the live event. This value does not affect the packing ratio for HLS CMAF output.
     *
     * @param fragmentsPerTsSegment the fragmentsPerTsSegment value to set.
     * @return the Hls object itself.
     */
    public Hls withFragmentsPerTsSegment(Integer fragmentsPerTsSegment) {
        this.fragmentsPerTsSegment = fragmentsPerTsSegment;
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
