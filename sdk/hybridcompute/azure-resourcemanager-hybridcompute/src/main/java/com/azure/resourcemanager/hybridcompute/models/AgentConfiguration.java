// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Configurable properties that the user can set locally via the azcmagent config command, or remotely via ARM. */
@Immutable
public final class AgentConfiguration {
    /*
     * Specifies the URL of the proxy to be used.
     */
    @JsonProperty(value = "proxyUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String proxyUrl;

    /*
     * Specifies the list of ports that the agent will be able to listen on.
     */
    @JsonProperty(value = "incomingConnectionsPorts", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> incomingConnectionsPorts;

    /*
     * Array of extensions that are allowed to be installed or updated.
     */
    @JsonProperty(value = "extensionsAllowList", access = JsonProperty.Access.WRITE_ONLY)
    private List<ConfigurationExtension> extensionsAllowList;

    /*
     * Array of extensions that are blocked (cannot be installed or updated)
     */
    @JsonProperty(value = "extensionsBlockList", access = JsonProperty.Access.WRITE_ONLY)
    private List<ConfigurationExtension> extensionsBlockList;

    /*
     * List of service names which should not use the specified proxy server.
     */
    @JsonProperty(value = "proxyBypass", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> proxyBypass;

    /*
     * Specifies whether the extension service is enabled or disabled.
     */
    @JsonProperty(value = "extensionsEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private String extensionsEnabled;

    /*
     * Specified whether the guest configuration service is enabled or
     * disabled.
     */
    @JsonProperty(value = "guestConfigurationEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private String guestConfigurationEnabled;

    /*
     * Name of configuration mode to use. Modes are pre-defined configurations
     * of security controls, extension allowlists and guest configuration,
     * maintained by Microsoft.
     */
    @JsonProperty(value = "configMode", access = JsonProperty.Access.WRITE_ONLY)
    private AgentConfigurationMode configMode;

    /**
     * Get the proxyUrl property: Specifies the URL of the proxy to be used.
     *
     * @return the proxyUrl value.
     */
    public String proxyUrl() {
        return this.proxyUrl;
    }

    /**
     * Get the incomingConnectionsPorts property: Specifies the list of ports that the agent will be able to listen on.
     *
     * @return the incomingConnectionsPorts value.
     */
    public List<String> incomingConnectionsPorts() {
        return this.incomingConnectionsPorts;
    }

    /**
     * Get the extensionsAllowList property: Array of extensions that are allowed to be installed or updated.
     *
     * @return the extensionsAllowList value.
     */
    public List<ConfigurationExtension> extensionsAllowList() {
        return this.extensionsAllowList;
    }

    /**
     * Get the extensionsBlockList property: Array of extensions that are blocked (cannot be installed or updated).
     *
     * @return the extensionsBlockList value.
     */
    public List<ConfigurationExtension> extensionsBlockList() {
        return this.extensionsBlockList;
    }

    /**
     * Get the proxyBypass property: List of service names which should not use the specified proxy server.
     *
     * @return the proxyBypass value.
     */
    public List<String> proxyBypass() {
        return this.proxyBypass;
    }

    /**
     * Get the extensionsEnabled property: Specifies whether the extension service is enabled or disabled.
     *
     * @return the extensionsEnabled value.
     */
    public String extensionsEnabled() {
        return this.extensionsEnabled;
    }

    /**
     * Get the guestConfigurationEnabled property: Specified whether the guest configuration service is enabled or
     * disabled.
     *
     * @return the guestConfigurationEnabled value.
     */
    public String guestConfigurationEnabled() {
        return this.guestConfigurationEnabled;
    }

    /**
     * Get the configMode property: Name of configuration mode to use. Modes are pre-defined configurations of security
     * controls, extension allowlists and guest configuration, maintained by Microsoft.
     *
     * @return the configMode value.
     */
    public AgentConfigurationMode configMode() {
        return this.configMode;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extensionsAllowList() != null) {
            extensionsAllowList().forEach(e -> e.validate());
        }
        if (extensionsBlockList() != null) {
            extensionsBlockList().forEach(e -> e.validate());
        }
    }
}
