// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of SSL certificates of application gateway. */
@Fluent
public final class VpnClientRootCertificatePropertiesFormat {
    /*
     * The certificate public data.
     */
    @JsonProperty(value = "publicCertData", required = true)
    private String publicCertData;

    /*
     * The provisioning state of the VPN client root certificate resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

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
     * @return the VpnClientRootCertificatePropertiesFormat object itself.
     */
    public VpnClientRootCertificatePropertiesFormat withPublicCertData(String publicCertData) {
        this.publicCertData = publicCertData;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VPN client root certificate resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publicCertData() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property publicCertData in model VpnClientRootCertificatePropertiesFormat"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VpnClientRootCertificatePropertiesFormat.class);
}
