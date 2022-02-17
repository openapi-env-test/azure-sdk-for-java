// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The properties of the suppression. */
@Fluent
public final class SuppressionProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SuppressionProperties.class);

    /*
     * The GUID of the suppression.
     */
    @JsonProperty(value = "suppressionId")
    private String suppressionId;

    /*
     * The duration for which the suppression is valid.
     */
    @JsonProperty(value = "ttl")
    private String ttl;

    /*
     * Gets or sets the expiration time stamp.
     */
    @JsonProperty(value = "expirationTimeStamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime expirationTimestamp;

    /**
     * Get the suppressionId property: The GUID of the suppression.
     *
     * @return the suppressionId value.
     */
    public String suppressionId() {
        return this.suppressionId;
    }

    /**
     * Set the suppressionId property: The GUID of the suppression.
     *
     * @param suppressionId the suppressionId value to set.
     * @return the SuppressionProperties object itself.
     */
    public SuppressionProperties withSuppressionId(String suppressionId) {
        this.suppressionId = suppressionId;
        return this;
    }

    /**
     * Get the ttl property: The duration for which the suppression is valid.
     *
     * @return the ttl value.
     */
    public String ttl() {
        return this.ttl;
    }

    /**
     * Set the ttl property: The duration for which the suppression is valid.
     *
     * @param ttl the ttl value to set.
     * @return the SuppressionProperties object itself.
     */
    public SuppressionProperties withTtl(String ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * Get the expirationTimestamp property: Gets or sets the expiration time stamp.
     *
     * @return the expirationTimestamp value.
     */
    public OffsetDateTime expirationTimestamp() {
        return this.expirationTimestamp;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
