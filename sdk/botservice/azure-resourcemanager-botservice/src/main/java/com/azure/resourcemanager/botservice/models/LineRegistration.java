// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties corresponding to a line channel registration. */
@Fluent
public final class LineRegistration {
    /*
     * Id generated for the line channel registration
     */
    @JsonProperty(value = "generatedId", access = JsonProperty.Access.WRITE_ONLY)
    private String generatedId;

    /*
     * Secret for the line channel registration
     */
    @JsonProperty(value = "channelSecret")
    private String channelSecret;

    /*
     * Access token for the line channel registration
     */
    @JsonProperty(value = "channelAccessToken")
    private String channelAccessToken;

    /**
     * Get the generatedId property: Id generated for the line channel registration.
     *
     * @return the generatedId value.
     */
    public String generatedId() {
        return this.generatedId;
    }

    /**
     * Get the channelSecret property: Secret for the line channel registration.
     *
     * @return the channelSecret value.
     */
    public String channelSecret() {
        return this.channelSecret;
    }

    /**
     * Set the channelSecret property: Secret for the line channel registration.
     *
     * @param channelSecret the channelSecret value to set.
     * @return the LineRegistration object itself.
     */
    public LineRegistration withChannelSecret(String channelSecret) {
        this.channelSecret = channelSecret;
        return this;
    }

    /**
     * Get the channelAccessToken property: Access token for the line channel registration.
     *
     * @return the channelAccessToken value.
     */
    public String channelAccessToken() {
        return this.channelAccessToken;
    }

    /**
     * Set the channelAccessToken property: Access token for the line channel registration.
     *
     * @param channelAccessToken the channelAccessToken value to set.
     * @return the LineRegistration object itself.
     */
    public LineRegistration withChannelAccessToken(String channelAccessToken) {
        this.channelAccessToken = channelAccessToken;
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
