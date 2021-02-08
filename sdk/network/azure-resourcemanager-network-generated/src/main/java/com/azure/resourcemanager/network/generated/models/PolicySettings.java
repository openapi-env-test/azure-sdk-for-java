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
     * Describes if the policy is in enabled state or disabled state
     */
    @JsonProperty(value = "enabledState")
    private WebApplicationFirewallEnabledState enabledState;

    /*
     * Describes if it is in detection mode  or prevention mode at policy level
     */
    @JsonProperty(value = "mode")
    private WebApplicationFirewallMode mode;

    /**
     * Get the enabledState property: Describes if the policy is in enabled state or disabled state.
     *
     * @return the enabledState value.
     */
    public WebApplicationFirewallEnabledState enabledState() {
        return this.enabledState;
    }

    /**
     * Set the enabledState property: Describes if the policy is in enabled state or disabled state.
     *
     * @param enabledState the enabledState value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withEnabledState(WebApplicationFirewallEnabledState enabledState) {
        this.enabledState = enabledState;
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
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
