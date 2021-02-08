// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the application rule protocol. */
@Fluent
public final class FirewallPolicyRuleConditionApplicationProtocol {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(FirewallPolicyRuleConditionApplicationProtocol.class);

    /*
     * Protocol type
     */
    @JsonProperty(value = "protocolType")
    private FirewallPolicyRuleConditionApplicationProtocolType protocolType;

    /*
     * Port number for the protocol, cannot be greater than 64000.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /**
     * Get the protocolType property: Protocol type.
     *
     * @return the protocolType value.
     */
    public FirewallPolicyRuleConditionApplicationProtocolType protocolType() {
        return this.protocolType;
    }

    /**
     * Set the protocolType property: Protocol type.
     *
     * @param protocolType the protocolType value to set.
     * @return the FirewallPolicyRuleConditionApplicationProtocol object itself.
     */
    public FirewallPolicyRuleConditionApplicationProtocol withProtocolType(
        FirewallPolicyRuleConditionApplicationProtocolType protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /**
     * Get the port property: Port number for the protocol, cannot be greater than 64000.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: Port number for the protocol, cannot be greater than 64000.
     *
     * @param port the port value to set.
     * @return the FirewallPolicyRuleConditionApplicationProtocol object itself.
     */
    public FirewallPolicyRuleConditionApplicationProtocol withPort(Integer port) {
        this.port = port;
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
