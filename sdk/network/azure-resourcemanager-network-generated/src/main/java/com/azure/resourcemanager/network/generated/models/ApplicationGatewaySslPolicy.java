// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Application gateway SSL policy. */
@Fluent
public final class ApplicationGatewaySslPolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewaySslPolicy.class);

    /*
     * SSL protocols to be disabled on application gateway.
     */
    @JsonProperty(value = "disabledSslProtocols")
    private List<ApplicationGatewaySslProtocol> disabledSslProtocols;

    /**
     * Get the disabledSslProtocols property: SSL protocols to be disabled on application gateway.
     *
     * @return the disabledSslProtocols value.
     */
    public List<ApplicationGatewaySslProtocol> disabledSslProtocols() {
        return this.disabledSslProtocols;
    }

    /**
     * Set the disabledSslProtocols property: SSL protocols to be disabled on application gateway.
     *
     * @param disabledSslProtocols the disabledSslProtocols value to set.
     * @return the ApplicationGatewaySslPolicy object itself.
     */
    public ApplicationGatewaySslPolicy withDisabledSslProtocols(
        List<ApplicationGatewaySslProtocol> disabledSslProtocols) {
        this.disabledSslProtocols = disabledSslProtocols;
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
