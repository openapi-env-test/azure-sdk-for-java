// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.models.AdvancedThreatProtectionState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties of an Advanced Threat Protection state. */
@Fluent
public final class AdvancedThreatProtectionProperties {
    /*
     * Specifies the state of the Advanced Threat Protection, whether it is
     * enabled or disabled or a state has not been applied yet on the specific
     * database or server.
     */
    @JsonProperty(value = "state", required = true)
    private AdvancedThreatProtectionState state;

    /*
     * Specifies the UTC creation time of the policy.
     */
    @JsonProperty(value = "creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /**
     * Get the state property: Specifies the state of the Advanced Threat Protection, whether it is enabled or disabled
     * or a state has not been applied yet on the specific database or server.
     *
     * @return the state value.
     */
    public AdvancedThreatProtectionState state() {
        return this.state;
    }

    /**
     * Set the state property: Specifies the state of the Advanced Threat Protection, whether it is enabled or disabled
     * or a state has not been applied yet on the specific database or server.
     *
     * @param state the state value to set.
     * @return the AdvancedThreatProtectionProperties object itself.
     */
    public AdvancedThreatProtectionProperties withState(AdvancedThreatProtectionState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the creationTime property: Specifies the UTC creation time of the policy.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (state() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property state in model AdvancedThreatProtectionProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AdvancedThreatProtectionProperties.class);
}
