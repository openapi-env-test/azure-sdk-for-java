// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.sql.generated.models.ReplicationMode;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** Distributed availability group between box and Sql Managed Instance. */
@Fluent
public final class DistributedAvailabilityGroupInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private DistributedAvailabilityGroupProperties innerProperties;

    /** Creates an instance of DistributedAvailabilityGroupInner class. */
    public DistributedAvailabilityGroupInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private DistributedAvailabilityGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the targetDatabase property: The name of the target database.
     *
     * @return the targetDatabase value.
     */
    public String targetDatabase() {
        return this.innerProperties() == null ? null : this.innerProperties().targetDatabase();
    }

    /**
     * Set the targetDatabase property: The name of the target database.
     *
     * @param targetDatabase the targetDatabase value to set.
     * @return the DistributedAvailabilityGroupInner object itself.
     */
    public DistributedAvailabilityGroupInner withTargetDatabase(String targetDatabase) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DistributedAvailabilityGroupProperties();
        }
        this.innerProperties().withTargetDatabase(targetDatabase);
        return this;
    }

    /**
     * Get the sourceEndpoint property: The source endpoint.
     *
     * @return the sourceEndpoint value.
     */
    public String sourceEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceEndpoint();
    }

    /**
     * Set the sourceEndpoint property: The source endpoint.
     *
     * @param sourceEndpoint the sourceEndpoint value to set.
     * @return the DistributedAvailabilityGroupInner object itself.
     */
    public DistributedAvailabilityGroupInner withSourceEndpoint(String sourceEndpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DistributedAvailabilityGroupProperties();
        }
        this.innerProperties().withSourceEndpoint(sourceEndpoint);
        return this;
    }

    /**
     * Get the primaryAvailabilityGroupName property: The primary availability group name.
     *
     * @return the primaryAvailabilityGroupName value.
     */
    public String primaryAvailabilityGroupName() {
        return this.innerProperties() == null ? null : this.innerProperties().primaryAvailabilityGroupName();
    }

    /**
     * Set the primaryAvailabilityGroupName property: The primary availability group name.
     *
     * @param primaryAvailabilityGroupName the primaryAvailabilityGroupName value to set.
     * @return the DistributedAvailabilityGroupInner object itself.
     */
    public DistributedAvailabilityGroupInner withPrimaryAvailabilityGroupName(String primaryAvailabilityGroupName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DistributedAvailabilityGroupProperties();
        }
        this.innerProperties().withPrimaryAvailabilityGroupName(primaryAvailabilityGroupName);
        return this;
    }

    /**
     * Get the secondaryAvailabilityGroupName property: The secondary availability group name.
     *
     * @return the secondaryAvailabilityGroupName value.
     */
    public String secondaryAvailabilityGroupName() {
        return this.innerProperties() == null ? null : this.innerProperties().secondaryAvailabilityGroupName();
    }

    /**
     * Set the secondaryAvailabilityGroupName property: The secondary availability group name.
     *
     * @param secondaryAvailabilityGroupName the secondaryAvailabilityGroupName value to set.
     * @return the DistributedAvailabilityGroupInner object itself.
     */
    public DistributedAvailabilityGroupInner withSecondaryAvailabilityGroupName(String secondaryAvailabilityGroupName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DistributedAvailabilityGroupProperties();
        }
        this.innerProperties().withSecondaryAvailabilityGroupName(secondaryAvailabilityGroupName);
        return this;
    }

    /**
     * Get the replicationMode property: The replication mode of a distributed availability group. Parameter will be
     * ignored during link creation.
     *
     * @return the replicationMode value.
     */
    public ReplicationMode replicationMode() {
        return this.innerProperties() == null ? null : this.innerProperties().replicationMode();
    }

    /**
     * Set the replicationMode property: The replication mode of a distributed availability group. Parameter will be
     * ignored during link creation.
     *
     * @param replicationMode the replicationMode value to set.
     * @return the DistributedAvailabilityGroupInner object itself.
     */
    public DistributedAvailabilityGroupInner withReplicationMode(ReplicationMode replicationMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DistributedAvailabilityGroupProperties();
        }
        this.innerProperties().withReplicationMode(replicationMode);
        return this;
    }

    /**
     * Get the distributedAvailabilityGroupId property: The distributed availability group id.
     *
     * @return the distributedAvailabilityGroupId value.
     */
    public UUID distributedAvailabilityGroupId() {
        return this.innerProperties() == null ? null : this.innerProperties().distributedAvailabilityGroupId();
    }

    /**
     * Get the sourceReplicaId property: The source replica id.
     *
     * @return the sourceReplicaId value.
     */
    public UUID sourceReplicaId() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceReplicaId();
    }

    /**
     * Get the targetReplicaId property: The target replica id.
     *
     * @return the targetReplicaId value.
     */
    public UUID targetReplicaId() {
        return this.innerProperties() == null ? null : this.innerProperties().targetReplicaId();
    }

    /**
     * Get the linkState property: The link state.
     *
     * @return the linkState value.
     */
    public String linkState() {
        return this.innerProperties() == null ? null : this.innerProperties().linkState();
    }

    /**
     * Get the lastHardenedLsn property: The last hardened lsn.
     *
     * @return the lastHardenedLsn value.
     */
    public String lastHardenedLsn() {
        return this.innerProperties() == null ? null : this.innerProperties().lastHardenedLsn();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
