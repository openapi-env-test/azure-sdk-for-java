// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewaySslCipherSuite;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewaySslProtocol;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An Ssl predefined policy. */
@Fluent
public final class ApplicationGatewaySslPredefinedPolicyInner extends SubResource {
    /*
     * Name of the Ssl predefined policy.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Properties of the application gateway SSL predefined policy.
     */
    @JsonProperty(value = "properties")
    private ApplicationGatewaySslPredefinedPolicyPropertiesFormat innerProperties;

    /** Creates an instance of ApplicationGatewaySslPredefinedPolicyInner class. */
    public ApplicationGatewaySslPredefinedPolicyInner() {
    }

    /**
     * Get the name property: Name of the Ssl predefined policy.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the Ssl predefined policy.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewaySslPredefinedPolicyInner object itself.
     */
    public ApplicationGatewaySslPredefinedPolicyInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the application gateway SSL predefined policy.
     *
     * @return the innerProperties value.
     */
    private ApplicationGatewaySslPredefinedPolicyPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationGatewaySslPredefinedPolicyInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the cipherSuites property: Ssl cipher suites to be enabled in the specified order for application gateway.
     *
     * @return the cipherSuites value.
     */
    public List<ApplicationGatewaySslCipherSuite> cipherSuites() {
        return this.innerProperties() == null ? null : this.innerProperties().cipherSuites();
    }

    /**
     * Set the cipherSuites property: Ssl cipher suites to be enabled in the specified order for application gateway.
     *
     * @param cipherSuites the cipherSuites value to set.
     * @return the ApplicationGatewaySslPredefinedPolicyInner object itself.
     */
    public ApplicationGatewaySslPredefinedPolicyInner withCipherSuites(
        List<ApplicationGatewaySslCipherSuite> cipherSuites) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewaySslPredefinedPolicyPropertiesFormat();
        }
        this.innerProperties().withCipherSuites(cipherSuites);
        return this;
    }

    /**
     * Get the minProtocolVersion property: Minimum version of Ssl protocol to be supported on application gateway.
     *
     * @return the minProtocolVersion value.
     */
    public ApplicationGatewaySslProtocol minProtocolVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().minProtocolVersion();
    }

    /**
     * Set the minProtocolVersion property: Minimum version of Ssl protocol to be supported on application gateway.
     *
     * @param minProtocolVersion the minProtocolVersion value to set.
     * @return the ApplicationGatewaySslPredefinedPolicyInner object itself.
     */
    public ApplicationGatewaySslPredefinedPolicyInner withMinProtocolVersion(
        ApplicationGatewaySslProtocol minProtocolVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewaySslPredefinedPolicyPropertiesFormat();
        }
        this.innerProperties().withMinProtocolVersion(minProtocolVersion);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
