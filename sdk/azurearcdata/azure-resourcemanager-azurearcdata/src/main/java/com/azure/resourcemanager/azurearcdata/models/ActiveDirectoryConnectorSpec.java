// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The specifications of the AD Kubernetes resource. */
@Fluent
public final class ActiveDirectoryConnectorSpec {
    /*
     * null
     */
    @JsonProperty(value = "activeDirectory", required = true)
    private ActiveDirectoryConnectorDomainDetails activeDirectory;

    /*
     * null
     */
    @JsonProperty(value = "dns", required = true)
    private ActiveDirectoryConnectorDnsDetails dns;

    /**
     * Get the activeDirectory property: null.
     *
     * @return the activeDirectory value.
     */
    public ActiveDirectoryConnectorDomainDetails activeDirectory() {
        return this.activeDirectory;
    }

    /**
     * Set the activeDirectory property: null.
     *
     * @param activeDirectory the activeDirectory value to set.
     * @return the ActiveDirectoryConnectorSpec object itself.
     */
    public ActiveDirectoryConnectorSpec withActiveDirectory(ActiveDirectoryConnectorDomainDetails activeDirectory) {
        this.activeDirectory = activeDirectory;
        return this;
    }

    /**
     * Get the dns property: null.
     *
     * @return the dns value.
     */
    public ActiveDirectoryConnectorDnsDetails dns() {
        return this.dns;
    }

    /**
     * Set the dns property: null.
     *
     * @param dns the dns value to set.
     * @return the ActiveDirectoryConnectorSpec object itself.
     */
    public ActiveDirectoryConnectorSpec withDns(ActiveDirectoryConnectorDnsDetails dns) {
        this.dns = dns;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (activeDirectory() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property activeDirectory in model ActiveDirectoryConnectorSpec"));
        } else {
            activeDirectory().validate();
        }
        if (dns() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property dns in model ActiveDirectoryConnectorSpec"));
        } else {
            dns().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ActiveDirectoryConnectorSpec.class);
}
