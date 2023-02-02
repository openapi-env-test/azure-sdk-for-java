// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.models.FailoverGroupReadOnlyEndpoint;
import com.azure.resourcemanager.sql.generated.models.FailoverGroupReadWriteEndpoint;
import com.azure.resourcemanager.sql.generated.models.FailoverGroupReplicationRole;
import com.azure.resourcemanager.sql.generated.models.PartnerInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of a failover group. */
@Fluent
public final class FailoverGroupProperties {
    /*
     * Read-write endpoint of the failover group instance.
     */
    @JsonProperty(value = "readWriteEndpoint", required = true)
    private FailoverGroupReadWriteEndpoint readWriteEndpoint;

    /*
     * Read-only endpoint of the failover group instance.
     */
    @JsonProperty(value = "readOnlyEndpoint")
    private FailoverGroupReadOnlyEndpoint readOnlyEndpoint;

    /*
     * Local replication role of the failover group instance.
     */
    @JsonProperty(value = "replicationRole", access = JsonProperty.Access.WRITE_ONLY)
    private FailoverGroupReplicationRole replicationRole;

    /*
     * Replication state of the failover group instance.
     */
    @JsonProperty(value = "replicationState", access = JsonProperty.Access.WRITE_ONLY)
    private String replicationState;

    /*
     * List of partner server information for the failover group.
     */
    @JsonProperty(value = "partnerServers", required = true)
    private List<PartnerInfo> partnerServers;

    /*
     * List of databases in the failover group.
     */
    @JsonProperty(value = "databases")
    private List<String> databases;

    /** Creates an instance of FailoverGroupProperties class. */
    public FailoverGroupProperties() {
    }

    /**
     * Get the readWriteEndpoint property: Read-write endpoint of the failover group instance.
     *
     * @return the readWriteEndpoint value.
     */
    public FailoverGroupReadWriteEndpoint readWriteEndpoint() {
        return this.readWriteEndpoint;
    }

    /**
     * Set the readWriteEndpoint property: Read-write endpoint of the failover group instance.
     *
     * @param readWriteEndpoint the readWriteEndpoint value to set.
     * @return the FailoverGroupProperties object itself.
     */
    public FailoverGroupProperties withReadWriteEndpoint(FailoverGroupReadWriteEndpoint readWriteEndpoint) {
        this.readWriteEndpoint = readWriteEndpoint;
        return this;
    }

    /**
     * Get the readOnlyEndpoint property: Read-only endpoint of the failover group instance.
     *
     * @return the readOnlyEndpoint value.
     */
    public FailoverGroupReadOnlyEndpoint readOnlyEndpoint() {
        return this.readOnlyEndpoint;
    }

    /**
     * Set the readOnlyEndpoint property: Read-only endpoint of the failover group instance.
     *
     * @param readOnlyEndpoint the readOnlyEndpoint value to set.
     * @return the FailoverGroupProperties object itself.
     */
    public FailoverGroupProperties withReadOnlyEndpoint(FailoverGroupReadOnlyEndpoint readOnlyEndpoint) {
        this.readOnlyEndpoint = readOnlyEndpoint;
        return this;
    }

    /**
     * Get the replicationRole property: Local replication role of the failover group instance.
     *
     * @return the replicationRole value.
     */
    public FailoverGroupReplicationRole replicationRole() {
        return this.replicationRole;
    }

    /**
     * Get the replicationState property: Replication state of the failover group instance.
     *
     * @return the replicationState value.
     */
    public String replicationState() {
        return this.replicationState;
    }

    /**
     * Get the partnerServers property: List of partner server information for the failover group.
     *
     * @return the partnerServers value.
     */
    public List<PartnerInfo> partnerServers() {
        return this.partnerServers;
    }

    /**
     * Set the partnerServers property: List of partner server information for the failover group.
     *
     * @param partnerServers the partnerServers value to set.
     * @return the FailoverGroupProperties object itself.
     */
    public FailoverGroupProperties withPartnerServers(List<PartnerInfo> partnerServers) {
        this.partnerServers = partnerServers;
        return this;
    }

    /**
     * Get the databases property: List of databases in the failover group.
     *
     * @return the databases value.
     */
    public List<String> databases() {
        return this.databases;
    }

    /**
     * Set the databases property: List of databases in the failover group.
     *
     * @param databases the databases value to set.
     * @return the FailoverGroupProperties object itself.
     */
    public FailoverGroupProperties withDatabases(List<String> databases) {
        this.databases = databases;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (readWriteEndpoint() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property readWriteEndpoint in model FailoverGroupProperties"));
        } else {
            readWriteEndpoint().validate();
        }
        if (readOnlyEndpoint() != null) {
            readOnlyEndpoint().validate();
        }
        if (partnerServers() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property partnerServers in model FailoverGroupProperties"));
        } else {
            partnerServers().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FailoverGroupProperties.class);
}
