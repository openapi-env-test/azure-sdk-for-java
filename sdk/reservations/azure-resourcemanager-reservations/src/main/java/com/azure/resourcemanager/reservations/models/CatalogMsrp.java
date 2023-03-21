// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Pricing information about the sku. */
@Fluent
public final class CatalogMsrp {
    /*
     * Amount in pricing currency. Tax not included.
     */
    @JsonProperty(value = "p1Y")
    private Price p1Y;

    /*
     * Amount in pricing currency. Tax not included.
     */
    @JsonProperty(value = "p3Y")
    private Price p3Y;

    /*
     * Amount in pricing currency. Tax not included.
     */
    @JsonProperty(value = "p5Y")
    private Price p5Y;

    /** Creates an instance of CatalogMsrp class. */
    public CatalogMsrp() {
    }

    /**
     * Get the p1Y property: Amount in pricing currency. Tax not included.
     *
     * @return the p1Y value.
     */
    public Price p1Y() {
        return this.p1Y;
    }

    /**
     * Set the p1Y property: Amount in pricing currency. Tax not included.
     *
     * @param p1Y the p1Y value to set.
     * @return the CatalogMsrp object itself.
     */
    public CatalogMsrp withP1Y(Price p1Y) {
        this.p1Y = p1Y;
        return this;
    }

    /**
     * Get the p3Y property: Amount in pricing currency. Tax not included.
     *
     * @return the p3Y value.
     */
    public Price p3Y() {
        return this.p3Y;
    }

    /**
     * Set the p3Y property: Amount in pricing currency. Tax not included.
     *
     * @param p3Y the p3Y value to set.
     * @return the CatalogMsrp object itself.
     */
    public CatalogMsrp withP3Y(Price p3Y) {
        this.p3Y = p3Y;
        return this;
    }

    /**
     * Get the p5Y property: Amount in pricing currency. Tax not included.
     *
     * @return the p5Y value.
     */
    public Price p5Y() {
        return this.p5Y;
    }

    /**
     * Set the p5Y property: Amount in pricing currency. Tax not included.
     *
     * @param p5Y the p5Y value to set.
     * @return the CatalogMsrp object itself.
     */
    public CatalogMsrp withP5Y(Price p5Y) {
        this.p5Y = p5Y;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (p1Y() != null) {
            p1Y().validate();
        }
        if (p3Y() != null) {
            p3Y().validate();
        }
        if (p5Y() != null) {
            p5Y().validate();
        }
    }
}
