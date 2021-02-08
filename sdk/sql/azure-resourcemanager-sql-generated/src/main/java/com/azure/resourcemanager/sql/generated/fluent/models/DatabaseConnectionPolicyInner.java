// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A database connection policy. */
@JsonFlatten
@Fluent
public class DatabaseConnectionPolicyInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabaseConnectionPolicyInner.class);

    /*
     * Resource kind.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * Resource location.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * The state of security access.
     */
    @JsonProperty(value = "properties.securityEnabledAccess")
    private String securityEnabledAccess;

    /*
     * The fully qualified host name of the auditing proxy.
     */
    @JsonProperty(value = "properties.proxyDnsName")
    private String proxyDnsName;

    /*
     * The port number of the auditing proxy.
     */
    @JsonProperty(value = "properties.proxyPort")
    private String proxyPort;

    /*
     * The visibility of the auditing proxy.
     */
    @JsonProperty(value = "properties.visibility")
    private String visibility;

    /*
     * Whether server default is enabled or disabled.
     */
    @JsonProperty(value = "properties.useServerDefault")
    private String useServerDefault;

    /*
     * The state of proxy redirection.
     */
    @JsonProperty(value = "properties.redirectionState")
    private String redirectionState;

    /*
     * The connection policy state.
     */
    @JsonProperty(value = "properties.state")
    private String state;

    /**
     * Get the kind property: Resource kind.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the location property: Resource location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the securityEnabledAccess property: The state of security access.
     *
     * @return the securityEnabledAccess value.
     */
    public String securityEnabledAccess() {
        return this.securityEnabledAccess;
    }

    /**
     * Set the securityEnabledAccess property: The state of security access.
     *
     * @param securityEnabledAccess the securityEnabledAccess value to set.
     * @return the DatabaseConnectionPolicyInner object itself.
     */
    public DatabaseConnectionPolicyInner withSecurityEnabledAccess(String securityEnabledAccess) {
        this.securityEnabledAccess = securityEnabledAccess;
        return this;
    }

    /**
     * Get the proxyDnsName property: The fully qualified host name of the auditing proxy.
     *
     * @return the proxyDnsName value.
     */
    public String proxyDnsName() {
        return this.proxyDnsName;
    }

    /**
     * Set the proxyDnsName property: The fully qualified host name of the auditing proxy.
     *
     * @param proxyDnsName the proxyDnsName value to set.
     * @return the DatabaseConnectionPolicyInner object itself.
     */
    public DatabaseConnectionPolicyInner withProxyDnsName(String proxyDnsName) {
        this.proxyDnsName = proxyDnsName;
        return this;
    }

    /**
     * Get the proxyPort property: The port number of the auditing proxy.
     *
     * @return the proxyPort value.
     */
    public String proxyPort() {
        return this.proxyPort;
    }

    /**
     * Set the proxyPort property: The port number of the auditing proxy.
     *
     * @param proxyPort the proxyPort value to set.
     * @return the DatabaseConnectionPolicyInner object itself.
     */
    public DatabaseConnectionPolicyInner withProxyPort(String proxyPort) {
        this.proxyPort = proxyPort;
        return this;
    }

    /**
     * Get the visibility property: The visibility of the auditing proxy.
     *
     * @return the visibility value.
     */
    public String visibility() {
        return this.visibility;
    }

    /**
     * Set the visibility property: The visibility of the auditing proxy.
     *
     * @param visibility the visibility value to set.
     * @return the DatabaseConnectionPolicyInner object itself.
     */
    public DatabaseConnectionPolicyInner withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Get the useServerDefault property: Whether server default is enabled or disabled.
     *
     * @return the useServerDefault value.
     */
    public String useServerDefault() {
        return this.useServerDefault;
    }

    /**
     * Set the useServerDefault property: Whether server default is enabled or disabled.
     *
     * @param useServerDefault the useServerDefault value to set.
     * @return the DatabaseConnectionPolicyInner object itself.
     */
    public DatabaseConnectionPolicyInner withUseServerDefault(String useServerDefault) {
        this.useServerDefault = useServerDefault;
        return this;
    }

    /**
     * Get the redirectionState property: The state of proxy redirection.
     *
     * @return the redirectionState value.
     */
    public String redirectionState() {
        return this.redirectionState;
    }

    /**
     * Set the redirectionState property: The state of proxy redirection.
     *
     * @param redirectionState the redirectionState value to set.
     * @return the DatabaseConnectionPolicyInner object itself.
     */
    public DatabaseConnectionPolicyInner withRedirectionState(String redirectionState) {
        this.redirectionState = redirectionState;
        return this;
    }

    /**
     * Get the state property: The connection policy state.
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: The connection policy state.
     *
     * @param state the state value to set.
     * @return the DatabaseConnectionPolicyInner object itself.
     */
    public DatabaseConnectionPolicyInner withState(String state) {
        this.state = state;
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
