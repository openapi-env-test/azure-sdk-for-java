// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties specific to client affine subscriptions. */
@Fluent
public final class SBClientAffineProperties {
    /*
     * Indicates the Client ID of the application that created the client-affine subscription.
     */
    @JsonProperty(value = "clientId")
    private String clientId;

    /*
     * For client-affine subscriptions, this value indicates whether the subscription is durable or not.
     */
    @JsonProperty(value = "isDurable")
    private Boolean isDurable;

    /*
     * For client-affine subscriptions, this value indicates whether the subscription is shared or not.
     */
    @JsonProperty(value = "isShared")
    private Boolean isShared;

    /** Creates an instance of SBClientAffineProperties class. */
    public SBClientAffineProperties() {
    }

    /**
     * Get the clientId property: Indicates the Client ID of the application that created the client-affine
     * subscription.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: Indicates the Client ID of the application that created the client-affine
     * subscription.
     *
     * @param clientId the clientId value to set.
     * @return the SBClientAffineProperties object itself.
     */
    public SBClientAffineProperties withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the isDurable property: For client-affine subscriptions, this value indicates whether the subscription is
     * durable or not.
     *
     * @return the isDurable value.
     */
    public Boolean isDurable() {
        return this.isDurable;
    }

    /**
     * Set the isDurable property: For client-affine subscriptions, this value indicates whether the subscription is
     * durable or not.
     *
     * @param isDurable the isDurable value to set.
     * @return the SBClientAffineProperties object itself.
     */
    public SBClientAffineProperties withIsDurable(Boolean isDurable) {
        this.isDurable = isDurable;
        return this;
    }

    /**
     * Get the isShared property: For client-affine subscriptions, this value indicates whether the subscription is
     * shared or not.
     *
     * @return the isShared value.
     */
    public Boolean isShared() {
        return this.isShared;
    }

    /**
     * Set the isShared property: For client-affine subscriptions, this value indicates whether the subscription is
     * shared or not.
     *
     * @param isShared the isShared value to set.
     * @return the SBClientAffineProperties object itself.
     */
    public SBClientAffineProperties withIsShared(Boolean isShared) {
        this.isShared = isShared;
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
