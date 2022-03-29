// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the server certificate details using common name. */
@Fluent
public final class ServerCertificateCommonName {
    /*
     * The common name of the server certificate.
     */
    @JsonProperty(value = "certificateCommonName", required = true)
    private String certificateCommonName;

    /*
     * The issuer thumbprint of the server certificate.
     */
    @JsonProperty(value = "certificateIssuerThumbprint", required = true)
    private String certificateIssuerThumbprint;

    /**
     * Get the certificateCommonName property: The common name of the server certificate.
     *
     * @return the certificateCommonName value.
     */
    public String certificateCommonName() {
        return this.certificateCommonName;
    }

    /**
     * Set the certificateCommonName property: The common name of the server certificate.
     *
     * @param certificateCommonName the certificateCommonName value to set.
     * @return the ServerCertificateCommonName object itself.
     */
    public ServerCertificateCommonName withCertificateCommonName(String certificateCommonName) {
        this.certificateCommonName = certificateCommonName;
        return this;
    }

    /**
     * Get the certificateIssuerThumbprint property: The issuer thumbprint of the server certificate.
     *
     * @return the certificateIssuerThumbprint value.
     */
    public String certificateIssuerThumbprint() {
        return this.certificateIssuerThumbprint;
    }

    /**
     * Set the certificateIssuerThumbprint property: The issuer thumbprint of the server certificate.
     *
     * @param certificateIssuerThumbprint the certificateIssuerThumbprint value to set.
     * @return the ServerCertificateCommonName object itself.
     */
    public ServerCertificateCommonName withCertificateIssuerThumbprint(String certificateIssuerThumbprint) {
        this.certificateIssuerThumbprint = certificateIssuerThumbprint;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (certificateCommonName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property certificateCommonName in model ServerCertificateCommonName"));
        }
        if (certificateIssuerThumbprint() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property certificateIssuerThumbprint in model ServerCertificateCommonName"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServerCertificateCommonName.class);
}
