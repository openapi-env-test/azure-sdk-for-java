// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayCustomError;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayProtocol;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of HTTP listener of an application gateway. */
@Fluent
public final class ApplicationGatewayHttpListenerPropertiesFormat {
    /*
     * Frontend IP configuration resource of an application gateway.
     */
    @JsonProperty(value = "frontendIPConfiguration")
    private SubResource frontendIpConfiguration;

    /*
     * Frontend port resource of an application gateway.
     */
    @JsonProperty(value = "frontendPort")
    private SubResource frontendPort;

    /*
     * Protocol of the HTTP listener.
     */
    @JsonProperty(value = "protocol")
    private ApplicationGatewayProtocol protocol;

    /*
     * Host name of HTTP listener.
     */
    @JsonProperty(value = "hostName")
    private String hostname;

    /*
     * SSL certificate resource of an application gateway.
     */
    @JsonProperty(value = "sslCertificate")
    private SubResource sslCertificate;

    /*
     * SSL profile resource of the application gateway.
     */
    @JsonProperty(value = "sslProfile")
    private SubResource sslProfile;

    /*
     * Applicable only if protocol is https. Enables SNI for multi-hosting.
     */
    @JsonProperty(value = "requireServerNameIndication")
    private Boolean requireServerNameIndication;

    /*
     * The provisioning state of the HTTP listener resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Custom error configurations of the HTTP listener.
     */
    @JsonProperty(value = "customErrorConfigurations")
    private List<ApplicationGatewayCustomError> customErrorConfigurations;

    /*
     * Reference to the FirewallPolicy resource.
     */
    @JsonProperty(value = "firewallPolicy")
    private SubResource firewallPolicy;

    /*
     * List of Host names for HTTP Listener that allows special wildcard characters as well.
     */
    @JsonProperty(value = "hostNames")
    private List<String> hostNames;

    /** Creates an instance of ApplicationGatewayHttpListenerPropertiesFormat class. */
    public ApplicationGatewayHttpListenerPropertiesFormat() {
    }

    /**
     * Get the frontendIpConfiguration property: Frontend IP configuration resource of an application gateway.
     *
     * @return the frontendIpConfiguration value.
     */
    public SubResource frontendIpConfiguration() {
        return this.frontendIpConfiguration;
    }

    /**
     * Set the frontendIpConfiguration property: Frontend IP configuration resource of an application gateway.
     *
     * @param frontendIpConfiguration the frontendIpConfiguration value to set.
     * @return the ApplicationGatewayHttpListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayHttpListenerPropertiesFormat withFrontendIpConfiguration(
        SubResource frontendIpConfiguration) {
        this.frontendIpConfiguration = frontendIpConfiguration;
        return this;
    }

    /**
     * Get the frontendPort property: Frontend port resource of an application gateway.
     *
     * @return the frontendPort value.
     */
    public SubResource frontendPort() {
        return this.frontendPort;
    }

    /**
     * Set the frontendPort property: Frontend port resource of an application gateway.
     *
     * @param frontendPort the frontendPort value to set.
     * @return the ApplicationGatewayHttpListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayHttpListenerPropertiesFormat withFrontendPort(SubResource frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }

    /**
     * Get the protocol property: Protocol of the HTTP listener.
     *
     * @return the protocol value.
     */
    public ApplicationGatewayProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Protocol of the HTTP listener.
     *
     * @param protocol the protocol value to set.
     * @return the ApplicationGatewayHttpListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayHttpListenerPropertiesFormat withProtocol(ApplicationGatewayProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the hostname property: Host name of HTTP listener.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: Host name of HTTP listener.
     *
     * @param hostname the hostname value to set.
     * @return the ApplicationGatewayHttpListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayHttpListenerPropertiesFormat withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the sslCertificate property: SSL certificate resource of an application gateway.
     *
     * @return the sslCertificate value.
     */
    public SubResource sslCertificate() {
        return this.sslCertificate;
    }

    /**
     * Set the sslCertificate property: SSL certificate resource of an application gateway.
     *
     * @param sslCertificate the sslCertificate value to set.
     * @return the ApplicationGatewayHttpListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayHttpListenerPropertiesFormat withSslCertificate(SubResource sslCertificate) {
        this.sslCertificate = sslCertificate;
        return this;
    }

    /**
     * Get the sslProfile property: SSL profile resource of the application gateway.
     *
     * @return the sslProfile value.
     */
    public SubResource sslProfile() {
        return this.sslProfile;
    }

    /**
     * Set the sslProfile property: SSL profile resource of the application gateway.
     *
     * @param sslProfile the sslProfile value to set.
     * @return the ApplicationGatewayHttpListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayHttpListenerPropertiesFormat withSslProfile(SubResource sslProfile) {
        this.sslProfile = sslProfile;
        return this;
    }

    /**
     * Get the requireServerNameIndication property: Applicable only if protocol is https. Enables SNI for
     * multi-hosting.
     *
     * @return the requireServerNameIndication value.
     */
    public Boolean requireServerNameIndication() {
        return this.requireServerNameIndication;
    }

    /**
     * Set the requireServerNameIndication property: Applicable only if protocol is https. Enables SNI for
     * multi-hosting.
     *
     * @param requireServerNameIndication the requireServerNameIndication value to set.
     * @return the ApplicationGatewayHttpListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayHttpListenerPropertiesFormat withRequireServerNameIndication(
        Boolean requireServerNameIndication) {
        this.requireServerNameIndication = requireServerNameIndication;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the HTTP listener resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the customErrorConfigurations property: Custom error configurations of the HTTP listener.
     *
     * @return the customErrorConfigurations value.
     */
    public List<ApplicationGatewayCustomError> customErrorConfigurations() {
        return this.customErrorConfigurations;
    }

    /**
     * Set the customErrorConfigurations property: Custom error configurations of the HTTP listener.
     *
     * @param customErrorConfigurations the customErrorConfigurations value to set.
     * @return the ApplicationGatewayHttpListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayHttpListenerPropertiesFormat withCustomErrorConfigurations(
        List<ApplicationGatewayCustomError> customErrorConfigurations) {
        this.customErrorConfigurations = customErrorConfigurations;
        return this;
    }

    /**
     * Get the firewallPolicy property: Reference to the FirewallPolicy resource.
     *
     * @return the firewallPolicy value.
     */
    public SubResource firewallPolicy() {
        return this.firewallPolicy;
    }

    /**
     * Set the firewallPolicy property: Reference to the FirewallPolicy resource.
     *
     * @param firewallPolicy the firewallPolicy value to set.
     * @return the ApplicationGatewayHttpListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayHttpListenerPropertiesFormat withFirewallPolicy(SubResource firewallPolicy) {
        this.firewallPolicy = firewallPolicy;
        return this;
    }

    /**
     * Get the hostNames property: List of Host names for HTTP Listener that allows special wildcard characters as well.
     *
     * @return the hostNames value.
     */
    public List<String> hostNames() {
        return this.hostNames;
    }

    /**
     * Set the hostNames property: List of Host names for HTTP Listener that allows special wildcard characters as well.
     *
     * @param hostNames the hostNames value to set.
     * @return the ApplicationGatewayHttpListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayHttpListenerPropertiesFormat withHostNames(List<String> hostNames) {
        this.hostNames = hostNames;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (customErrorConfigurations() != null) {
            customErrorConfigurations().forEach(e -> e.validate());
        }
    }
}
