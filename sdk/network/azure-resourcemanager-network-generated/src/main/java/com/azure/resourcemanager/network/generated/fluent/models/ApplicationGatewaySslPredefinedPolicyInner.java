// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewaySslCipherSuite;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewaySslProtocol;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An Ssl predefined policy. */
@JsonFlatten
@Fluent
public class ApplicationGatewaySslPredefinedPolicyInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewaySslPredefinedPolicyInner.class);

    /*
     * Name of Ssl predefined policy.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Ssl cipher suites to be enabled in the specified order for application
     * gateway.
     */
    @JsonProperty(value = "properties.cipherSuites")
    private List<ApplicationGatewaySslCipherSuite> cipherSuites;

    /*
     * Minimum version of Ssl protocol to be supported on application gateway.
     */
    @JsonProperty(value = "properties.minProtocolVersion")
    private ApplicationGatewaySslProtocol minProtocolVersion;

    /**
     * Get the name property: Name of Ssl predefined policy.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of Ssl predefined policy.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewaySslPredefinedPolicyInner object itself.
     */
    public ApplicationGatewaySslPredefinedPolicyInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the cipherSuites property: Ssl cipher suites to be enabled in the specified order for application gateway.
     *
     * @return the cipherSuites value.
     */
    public List<ApplicationGatewaySslCipherSuite> cipherSuites() {
        return this.cipherSuites;
    }

    /**
     * Set the cipherSuites property: Ssl cipher suites to be enabled in the specified order for application gateway.
     *
     * @param cipherSuites the cipherSuites value to set.
     * @return the ApplicationGatewaySslPredefinedPolicyInner object itself.
     */
    public ApplicationGatewaySslPredefinedPolicyInner withCipherSuites(
        List<ApplicationGatewaySslCipherSuite> cipherSuites) {
        this.cipherSuites = cipherSuites;
        return this;
    }

    /**
     * Get the minProtocolVersion property: Minimum version of Ssl protocol to be supported on application gateway.
     *
     * @return the minProtocolVersion value.
     */
    public ApplicationGatewaySslProtocol minProtocolVersion() {
        return this.minProtocolVersion;
    }

    /**
     * Set the minProtocolVersion property: Minimum version of Ssl protocol to be supported on application gateway.
     *
     * @param minProtocolVersion the minProtocolVersion value to set.
     * @return the ApplicationGatewaySslPredefinedPolicyInner object itself.
     */
    public ApplicationGatewaySslPredefinedPolicyInner withMinProtocolVersion(
        ApplicationGatewaySslProtocol minProtocolVersion) {
        this.minProtocolVersion = minProtocolVersion;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationGatewaySslPredefinedPolicyInner withId(String id) {
        super.withId(id);
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
