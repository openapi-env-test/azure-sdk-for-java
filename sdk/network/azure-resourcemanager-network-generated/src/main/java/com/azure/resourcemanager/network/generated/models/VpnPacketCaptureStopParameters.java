// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Stop packet capture parameters. */
@Fluent
public final class VpnPacketCaptureStopParameters {
    /*
     * SAS url for packet capture on virtual network gateway.
     */
    @JsonProperty(value = "sasUrl")
    private String sasUrl;

    /** Creates an instance of VpnPacketCaptureStopParameters class. */
    public VpnPacketCaptureStopParameters() {
    }

    /**
     * Get the sasUrl property: SAS url for packet capture on virtual network gateway.
     *
     * @return the sasUrl value.
     */
    public String sasUrl() {
        return this.sasUrl;
    }

    /**
     * Set the sasUrl property: SAS url for packet capture on virtual network gateway.
     *
     * @param sasUrl the sasUrl value to set.
     * @return the VpnPacketCaptureStopParameters object itself.
     */
    public VpnPacketCaptureStopParameters withSasUrl(String sasUrl) {
        this.sasUrl = sasUrl;
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
