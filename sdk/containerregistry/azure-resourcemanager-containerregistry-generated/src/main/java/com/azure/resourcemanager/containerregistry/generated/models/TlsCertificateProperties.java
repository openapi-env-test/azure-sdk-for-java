// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TLS certificate properties of the connected registry login server. */
@Immutable
public final class TlsCertificateProperties {
    /*
     * The type of certificate location.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateType type;

    /*
     * Indicates the location of the certificates.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /** Creates an instance of TlsCertificateProperties class. */
    public TlsCertificateProperties() {
    }

    /**
     * Get the type property: The type of certificate location.
     *
     * @return the type value.
     */
    public CertificateType type() {
        return this.type;
    }

    /**
     * Get the location property: Indicates the location of the certificates.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
