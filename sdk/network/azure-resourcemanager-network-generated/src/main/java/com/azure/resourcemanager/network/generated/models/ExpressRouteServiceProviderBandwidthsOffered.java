// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains Bandwidths offered in ExpressRouteServiceProviders. */
@Fluent
public final class ExpressRouteServiceProviderBandwidthsOffered {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ExpressRouteServiceProviderBandwidthsOffered.class);

    /*
     * Gets the OfferName
     */
    @JsonProperty(value = "offerName")
    private String offerName;

    /*
     * Gets the ValueInMbps.
     */
    @JsonProperty(value = "valueInMbps")
    private Integer valueInMbps;

    /**
     * Get the offerName property: Gets the OfferName.
     *
     * @return the offerName value.
     */
    public String offerName() {
        return this.offerName;
    }

    /**
     * Set the offerName property: Gets the OfferName.
     *
     * @param offerName the offerName value to set.
     * @return the ExpressRouteServiceProviderBandwidthsOffered object itself.
     */
    public ExpressRouteServiceProviderBandwidthsOffered withOfferName(String offerName) {
        this.offerName = offerName;
        return this;
    }

    /**
     * Get the valueInMbps property: Gets the ValueInMbps.
     *
     * @return the valueInMbps value.
     */
    public Integer valueInMbps() {
        return this.valueInMbps;
    }

    /**
     * Set the valueInMbps property: Gets the ValueInMbps.
     *
     * @param valueInMbps the valueInMbps value to set.
     * @return the ExpressRouteServiceProviderBandwidthsOffered object itself.
     */
    public ExpressRouteServiceProviderBandwidthsOffered withValueInMbps(Integer valueInMbps) {
        this.valueInMbps = valueInMbps;
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
