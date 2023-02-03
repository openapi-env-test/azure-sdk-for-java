// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The private IP addresses/IP ranges to which traffic will not be SNAT. */
@Fluent
public final class FirewallPolicySnat {
    /*
     * List of private IP addresses/IP address ranges to not be SNAT.
     */
    @JsonProperty(value = "privateRanges")
    private List<String> privateRanges;

    /*
     * The operation mode for automatically learning private ranges to not be SNAT
     */
    @JsonProperty(value = "autoLearnPrivateRanges")
    private AutoLearnPrivateRangesMode autoLearnPrivateRanges;

    /** Creates an instance of FirewallPolicySnat class. */
    public FirewallPolicySnat() {
    }

    /**
     * Get the privateRanges property: List of private IP addresses/IP address ranges to not be SNAT.
     *
     * @return the privateRanges value.
     */
    public List<String> privateRanges() {
        return this.privateRanges;
    }

    /**
     * Set the privateRanges property: List of private IP addresses/IP address ranges to not be SNAT.
     *
     * @param privateRanges the privateRanges value to set.
     * @return the FirewallPolicySnat object itself.
     */
    public FirewallPolicySnat withPrivateRanges(List<String> privateRanges) {
        this.privateRanges = privateRanges;
        return this;
    }

    /**
     * Get the autoLearnPrivateRanges property: The operation mode for automatically learning private ranges to not be
     * SNAT.
     *
     * @return the autoLearnPrivateRanges value.
     */
    public AutoLearnPrivateRangesMode autoLearnPrivateRanges() {
        return this.autoLearnPrivateRanges;
    }

    /**
     * Set the autoLearnPrivateRanges property: The operation mode for automatically learning private ranges to not be
     * SNAT.
     *
     * @param autoLearnPrivateRanges the autoLearnPrivateRanges value to set.
     * @return the FirewallPolicySnat object itself.
     */
    public FirewallPolicySnat withAutoLearnPrivateRanges(AutoLearnPrivateRangesMode autoLearnPrivateRanges) {
        this.autoLearnPrivateRanges = autoLearnPrivateRanges;
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
