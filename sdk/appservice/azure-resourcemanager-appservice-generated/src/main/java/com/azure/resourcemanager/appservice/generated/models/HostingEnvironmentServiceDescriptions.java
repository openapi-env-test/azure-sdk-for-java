// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Back end service per ASE. */
@Fluent
public final class HostingEnvironmentServiceDescriptions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HostingEnvironmentServiceDescriptions.class);

    /*
     * Hosting environment Id
     */
    @JsonProperty(value = "hostingEnvironmentId")
    private String hostingEnvironmentId;

    /*
     * Host Id
     */
    @JsonProperty(value = "hostId")
    private String hostId;

    /*
     * service url to use
     */
    @JsonProperty(value = "serviceUrl")
    private String serviceUrl;

    /*
     * When the backend url is in same ASE, for performance reason this flag
     * can be set to true
     * If WebApp.DisableHostNames is also set it improves the security by
     * making the back end accessible only
     * via API calls
     * Note: calls will fail if this option is used but back end is not on the
     * same ASE
     */
    @JsonProperty(value = "useInternalRouting")
    private Boolean useInternalRouting;

    /**
     * Get the hostingEnvironmentId property: Hosting environment Id.
     *
     * @return the hostingEnvironmentId value.
     */
    public String hostingEnvironmentId() {
        return this.hostingEnvironmentId;
    }

    /**
     * Set the hostingEnvironmentId property: Hosting environment Id.
     *
     * @param hostingEnvironmentId the hostingEnvironmentId value to set.
     * @return the HostingEnvironmentServiceDescriptions object itself.
     */
    public HostingEnvironmentServiceDescriptions withHostingEnvironmentId(String hostingEnvironmentId) {
        this.hostingEnvironmentId = hostingEnvironmentId;
        return this;
    }

    /**
     * Get the hostId property: Host Id.
     *
     * @return the hostId value.
     */
    public String hostId() {
        return this.hostId;
    }

    /**
     * Set the hostId property: Host Id.
     *
     * @param hostId the hostId value to set.
     * @return the HostingEnvironmentServiceDescriptions object itself.
     */
    public HostingEnvironmentServiceDescriptions withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * Get the serviceUrl property: service url to use.
     *
     * @return the serviceUrl value.
     */
    public String serviceUrl() {
        return this.serviceUrl;
    }

    /**
     * Set the serviceUrl property: service url to use.
     *
     * @param serviceUrl the serviceUrl value to set.
     * @return the HostingEnvironmentServiceDescriptions object itself.
     */
    public HostingEnvironmentServiceDescriptions withServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
        return this;
    }

    /**
     * Get the useInternalRouting property: When the backend url is in same ASE, for performance reason this flag can be
     * set to true If WebApp.DisableHostNames is also set it improves the security by making the back end accessible
     * only via API calls Note: calls will fail if this option is used but back end is not on the same ASE.
     *
     * @return the useInternalRouting value.
     */
    public Boolean useInternalRouting() {
        return this.useInternalRouting;
    }

    /**
     * Set the useInternalRouting property: When the backend url is in same ASE, for performance reason this flag can be
     * set to true If WebApp.DisableHostNames is also set it improves the security by making the back end accessible
     * only via API calls Note: calls will fail if this option is used but back end is not on the same ASE.
     *
     * @param useInternalRouting the useInternalRouting value to set.
     * @return the HostingEnvironmentServiceDescriptions object itself.
     */
    public HostingEnvironmentServiceDescriptions withUseInternalRouting(Boolean useInternalRouting) {
        this.useInternalRouting = useInternalRouting;
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
