// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a list of server certificates referenced by common name that are used to secure the cluster. */
@Fluent
public final class ServerCertificateCommonNames {
    /*
     * The list of server certificates referenced by common name that are used
     * to secure the cluster.
     */
    @JsonProperty(value = "commonNames")
    private List<ServerCertificateCommonName> commonNames;

    /*
     * The local certificate store location.
     */
    @JsonProperty(value = "x509StoreName")
    private StoreName x509StoreName;

    /**
     * Get the commonNames property: The list of server certificates referenced by common name that are used to secure
     * the cluster.
     *
     * @return the commonNames value.
     */
    public List<ServerCertificateCommonName> commonNames() {
        return this.commonNames;
    }

    /**
     * Set the commonNames property: The list of server certificates referenced by common name that are used to secure
     * the cluster.
     *
     * @param commonNames the commonNames value to set.
     * @return the ServerCertificateCommonNames object itself.
     */
    public ServerCertificateCommonNames withCommonNames(List<ServerCertificateCommonName> commonNames) {
        this.commonNames = commonNames;
        return this;
    }

    /**
     * Get the x509StoreName property: The local certificate store location.
     *
     * @return the x509StoreName value.
     */
    public StoreName x509StoreName() {
        return this.x509StoreName;
    }

    /**
     * Set the x509StoreName property: The local certificate store location.
     *
     * @param x509StoreName the x509StoreName value to set.
     * @return the ServerCertificateCommonNames object itself.
     */
    public ServerCertificateCommonNames withX509StoreName(StoreName x509StoreName) {
        this.x509StoreName = x509StoreName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (commonNames() != null) {
            commonNames().forEach(e -> e.validate());
        }
    }
}
