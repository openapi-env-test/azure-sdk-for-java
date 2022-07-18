// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Mars agent details. */
@Immutable
public final class MarsAgentDetails {
    /*
     * The Mars agent Id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The Mars agent name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The Mars agent Bios Id.
     */
    @JsonProperty(value = "biosId", access = JsonProperty.Access.WRITE_ONLY)
    private String biosId;

    /*
     * The fabric object Id.
     */
    @JsonProperty(value = "fabricObjectId", access = JsonProperty.Access.WRITE_ONLY)
    private String fabricObjectId;

    /*
     * The Mars agent Fqdn.
     */
    @JsonProperty(value = "fqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String fqdn;

    /*
     * The version.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * The last heartbeat received from the Mars agent.
     */
    @JsonProperty(value = "lastHeartbeatUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastHeartbeatUtc;

    /*
     * The health of the Mars agent.
     */
    @JsonProperty(value = "health", access = JsonProperty.Access.WRITE_ONLY)
    private ProtectionHealth health;

    /*
     * The health errors.
     */
    @JsonProperty(value = "healthErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<HealthError> healthErrors;

    /**
     * Get the id property: The Mars agent Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The Mars agent name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the biosId property: The Mars agent Bios Id.
     *
     * @return the biosId value.
     */
    public String biosId() {
        return this.biosId;
    }

    /**
     * Get the fabricObjectId property: The fabric object Id.
     *
     * @return the fabricObjectId value.
     */
    public String fabricObjectId() {
        return this.fabricObjectId;
    }

    /**
     * Get the fqdn property: The Mars agent Fqdn.
     *
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Get the version property: The version.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the lastHeartbeatUtc property: The last heartbeat received from the Mars agent.
     *
     * @return the lastHeartbeatUtc value.
     */
    public OffsetDateTime lastHeartbeatUtc() {
        return this.lastHeartbeatUtc;
    }

    /**
     * Get the health property: The health of the Mars agent.
     *
     * @return the health value.
     */
    public ProtectionHealth health() {
        return this.health;
    }

    /**
     * Get the healthErrors property: The health errors.
     *
     * @return the healthErrors value.
     */
    public List<HealthError> healthErrors() {
        return this.healthErrors;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (healthErrors() != null) {
            healthErrors().forEach(e -> e.validate());
        }
    }
}
