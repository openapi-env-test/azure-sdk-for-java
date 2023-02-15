// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of Radius Server root certificate of VpnServerConfiguration. */
@Fluent
public final class VpnServerConfigRadiusServerRootCertificate {
    /*
     * The certificate name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The certificate public data.
     */
    @JsonProperty(value = "publicCertData")
    private String publicCertData;

    /** Creates an instance of VpnServerConfigRadiusServerRootCertificate class. */
    public VpnServerConfigRadiusServerRootCertificate() {
    }

    /**
     * Get the name property: The certificate name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The certificate name.
     *
     * @param name the name value to set.
     * @return the VpnServerConfigRadiusServerRootCertificate object itself.
     */
    public VpnServerConfigRadiusServerRootCertificate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the publicCertData property: The certificate public data.
     *
     * @return the publicCertData value.
     */
    public String publicCertData() {
        return this.publicCertData;
    }

    /**
     * Set the publicCertData property: The certificate public data.
     *
     * @param publicCertData the publicCertData value to set.
     * @return the VpnServerConfigRadiusServerRootCertificate object itself.
     */
    public VpnServerConfigRadiusServerRootCertificate withPublicCertData(String publicCertData) {
        this.publicCertData = publicCertData;
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
