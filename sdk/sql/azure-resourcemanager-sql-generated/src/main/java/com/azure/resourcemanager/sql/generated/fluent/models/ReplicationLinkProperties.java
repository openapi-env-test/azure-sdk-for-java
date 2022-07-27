// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.sql.generated.models.ReplicationLinkType;
import com.azure.resourcemanager.sql.generated.models.ReplicationRole;
import com.azure.resourcemanager.sql.generated.models.ReplicationState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties of a replication link. */
@Immutable
public final class ReplicationLinkProperties {
    /*
     * Resource partner server.
     */
    @JsonProperty(value = "partnerServer", access = JsonProperty.Access.WRITE_ONLY)
    private String partnerServer;

    /*
     * Resource partner database.
     */
    @JsonProperty(value = "partnerDatabase", access = JsonProperty.Access.WRITE_ONLY)
    private String partnerDatabase;

    /*
     * Resource partner location.
     */
    @JsonProperty(value = "partnerLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String partnerLocation;

    /*
     * Local replication role.
     */
    @JsonProperty(value = "role", access = JsonProperty.Access.WRITE_ONLY)
    private ReplicationRole role;

    /*
     * Partner replication role.
     */
    @JsonProperty(value = "partnerRole", access = JsonProperty.Access.WRITE_ONLY)
    private ReplicationRole partnerRole;

    /*
     * Replication mode.
     */
    @JsonProperty(value = "replicationMode", access = JsonProperty.Access.WRITE_ONLY)
    private String replicationMode;

    /*
     * Time at which the link was created.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * Seeding completion percentage for the link.
     */
    @JsonProperty(value = "percentComplete", access = JsonProperty.Access.WRITE_ONLY)
    private Integer percentComplete;

    /*
     * Replication state (PENDING, SEEDING, CATCHUP, SUSPENDED).
     */
    @JsonProperty(value = "replicationState", access = JsonProperty.Access.WRITE_ONLY)
    private ReplicationState replicationState;

    /*
     * Whether the user is currently allowed to terminate the link.
     */
    @JsonProperty(value = "isTerminationAllowed", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isTerminationAllowed;

    /*
     * Link type (GEO, NAMED, STANDBY).
     */
    @JsonProperty(value = "linkType", access = JsonProperty.Access.WRITE_ONLY)
    private ReplicationLinkType linkType;

    /**
     * Get the partnerServer property: Resource partner server.
     *
     * @return the partnerServer value.
     */
    public String partnerServer() {
        return this.partnerServer;
    }

    /**
     * Get the partnerDatabase property: Resource partner database.
     *
     * @return the partnerDatabase value.
     */
    public String partnerDatabase() {
        return this.partnerDatabase;
    }

    /**
     * Get the partnerLocation property: Resource partner location.
     *
     * @return the partnerLocation value.
     */
    public String partnerLocation() {
        return this.partnerLocation;
    }

    /**
     * Get the role property: Local replication role.
     *
     * @return the role value.
     */
    public ReplicationRole role() {
        return this.role;
    }

    /**
     * Get the partnerRole property: Partner replication role.
     *
     * @return the partnerRole value.
     */
    public ReplicationRole partnerRole() {
        return this.partnerRole;
    }

    /**
     * Get the replicationMode property: Replication mode.
     *
     * @return the replicationMode value.
     */
    public String replicationMode() {
        return this.replicationMode;
    }

    /**
     * Get the startTime property: Time at which the link was created.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the percentComplete property: Seeding completion percentage for the link.
     *
     * @return the percentComplete value.
     */
    public Integer percentComplete() {
        return this.percentComplete;
    }

    /**
     * Get the replicationState property: Replication state (PENDING, SEEDING, CATCHUP, SUSPENDED).
     *
     * @return the replicationState value.
     */
    public ReplicationState replicationState() {
        return this.replicationState;
    }

    /**
     * Get the isTerminationAllowed property: Whether the user is currently allowed to terminate the link.
     *
     * @return the isTerminationAllowed value.
     */
    public Boolean isTerminationAllowed() {
        return this.isTerminationAllowed;
    }

    /**
     * Get the linkType property: Link type (GEO, NAMED, STANDBY).
     *
     * @return the linkType value.
     */
    public ReplicationLinkType linkType() {
        return this.linkType;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
