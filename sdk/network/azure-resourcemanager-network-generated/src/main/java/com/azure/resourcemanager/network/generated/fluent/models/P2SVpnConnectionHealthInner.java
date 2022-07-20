// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** P2S Vpn connection detailed health written to sas url. */
@Fluent
public final class P2SVpnConnectionHealthInner {
    /*
     * Returned sas url of the blob to which the p2s vpn connection detailed
     * health will be written.
     */
    @JsonProperty(value = "sasUrl")
    private String sasUrl;

    /**
     * Get the sasUrl property: Returned sas url of the blob to which the p2s vpn connection detailed health will be
     * written.
     *
     * @return the sasUrl value.
     */
    public String sasUrl() {
        return this.sasUrl;
    }

    /**
     * Set the sasUrl property: Returned sas url of the blob to which the p2s vpn connection detailed health will be
     * written.
     *
     * @param sasUrl the sasUrl value to set.
     * @return the P2SVpnConnectionHealthInner object itself.
     */
    public P2SVpnConnectionHealthInner withSasUrl(String sasUrl) {
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
