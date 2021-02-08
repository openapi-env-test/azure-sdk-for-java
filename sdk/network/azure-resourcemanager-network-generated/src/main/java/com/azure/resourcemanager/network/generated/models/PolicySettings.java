// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines contents of a web application firewall global configuration. */
@Fluent
public final class PolicySettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PolicySettings.class);

    /*
     * Describes if the policy is in enabled state or disabled state.
     */
    @JsonProperty(value = "state")
    private WebApplicationFirewallEnabledState state;

    /*
     * Describes if it is in detection mode or prevention mode at policy level.
     */
    @JsonProperty(value = "mode")
    private WebApplicationFirewallMode mode;

    /*
     * Whether to allow WAF to check request Body.
     */
    @JsonProperty(value = "requestBodyCheck")
    private Boolean requestBodyCheck;

    /*
     * Maximum request body size in Kb for WAF.
     */
    @JsonProperty(value = "maxRequestBodySizeInKb")
    private Integer maxRequestBodySizeInKb;

    /*
     * Maximum file upload size in Mb for WAF.
     */
    @JsonProperty(value = "fileUploadLimitInMb")
    private Integer fileUploadLimitInMb;

    /**
     * Get the state property: Describes if the policy is in enabled state or disabled state.
     *
     * @return the state value.
     */
    public WebApplicationFirewallEnabledState state() {
        return this.state;
    }

    /**
     * Set the state property: Describes if the policy is in enabled state or disabled state.
     *
     * @param state the state value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withState(WebApplicationFirewallEnabledState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the mode property: Describes if it is in detection mode or prevention mode at policy level.
     *
     * @return the mode value.
     */
    public WebApplicationFirewallMode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: Describes if it is in detection mode or prevention mode at policy level.
     *
     * @param mode the mode value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withMode(WebApplicationFirewallMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the requestBodyCheck property: Whether to allow WAF to check request Body.
     *
     * @return the requestBodyCheck value.
     */
    public Boolean requestBodyCheck() {
        return this.requestBodyCheck;
    }

    /**
     * Set the requestBodyCheck property: Whether to allow WAF to check request Body.
     *
     * @param requestBodyCheck the requestBodyCheck value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withRequestBodyCheck(Boolean requestBodyCheck) {
        this.requestBodyCheck = requestBodyCheck;
        return this;
    }

    /**
     * Get the maxRequestBodySizeInKb property: Maximum request body size in Kb for WAF.
     *
     * @return the maxRequestBodySizeInKb value.
     */
    public Integer maxRequestBodySizeInKb() {
        return this.maxRequestBodySizeInKb;
    }

    /**
     * Set the maxRequestBodySizeInKb property: Maximum request body size in Kb for WAF.
     *
     * @param maxRequestBodySizeInKb the maxRequestBodySizeInKb value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withMaxRequestBodySizeInKb(Integer maxRequestBodySizeInKb) {
        this.maxRequestBodySizeInKb = maxRequestBodySizeInKb;
        return this;
    }

    /**
     * Get the fileUploadLimitInMb property: Maximum file upload size in Mb for WAF.
     *
     * @return the fileUploadLimitInMb value.
     */
    public Integer fileUploadLimitInMb() {
        return this.fileUploadLimitInMb;
    }

    /**
     * Set the fileUploadLimitInMb property: Maximum file upload size in Mb for WAF.
     *
     * @param fileUploadLimitInMb the fileUploadLimitInMb value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withFileUploadLimitInMb(Integer fileUploadLimitInMb) {
        this.fileUploadLimitInMb = fileUploadLimitInMb;
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
