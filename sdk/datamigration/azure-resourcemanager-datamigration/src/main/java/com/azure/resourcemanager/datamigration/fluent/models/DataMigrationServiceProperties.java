// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datamigration.models.ServiceProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the Database Migration Service instance. */
@Fluent
public final class DataMigrationServiceProperties {
    /*
     * The resource's provisioning state
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ServiceProvisioningState provisioningState;

    /*
     * The public key of the service, used to encrypt secrets sent to the
     * service
     */
    @JsonProperty(value = "publicKey")
    private String publicKey;

    /*
     * The ID of the Microsoft.Network/virtualNetworks/subnets resource to
     * which the service should be joined
     */
    @JsonProperty(value = "virtualSubnetId")
    private String virtualSubnetId;

    /*
     * The ID of the Microsoft.Network/networkInterfaces resource which the
     * service have
     */
    @JsonProperty(value = "virtualNicId")
    private String virtualNicId;

    /*
     * The time delay before the service is auto-stopped when idle.
     */
    @JsonProperty(value = "autoStopDelay")
    private String autoStopDelay;

    /*
     * Whether service resources should be deleted when stopped. (Turned on by
     * default)
     */
    @JsonProperty(value = "deleteResourcesOnStop")
    private Boolean deleteResourcesOnStop;

    /**
     * Get the provisioningState property: The resource's provisioning state.
     *
     * @return the provisioningState value.
     */
    public ServiceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the publicKey property: The public key of the service, used to encrypt secrets sent to the service.
     *
     * @return the publicKey value.
     */
    public String publicKey() {
        return this.publicKey;
    }

    /**
     * Set the publicKey property: The public key of the service, used to encrypt secrets sent to the service.
     *
     * @param publicKey the publicKey value to set.
     * @return the DataMigrationServiceProperties object itself.
     */
    public DataMigrationServiceProperties withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * Get the virtualSubnetId property: The ID of the Microsoft.Network/virtualNetworks/subnets resource to which the
     * service should be joined.
     *
     * @return the virtualSubnetId value.
     */
    public String virtualSubnetId() {
        return this.virtualSubnetId;
    }

    /**
     * Set the virtualSubnetId property: The ID of the Microsoft.Network/virtualNetworks/subnets resource to which the
     * service should be joined.
     *
     * @param virtualSubnetId the virtualSubnetId value to set.
     * @return the DataMigrationServiceProperties object itself.
     */
    public DataMigrationServiceProperties withVirtualSubnetId(String virtualSubnetId) {
        this.virtualSubnetId = virtualSubnetId;
        return this;
    }

    /**
     * Get the virtualNicId property: The ID of the Microsoft.Network/networkInterfaces resource which the service have.
     *
     * @return the virtualNicId value.
     */
    public String virtualNicId() {
        return this.virtualNicId;
    }

    /**
     * Set the virtualNicId property: The ID of the Microsoft.Network/networkInterfaces resource which the service have.
     *
     * @param virtualNicId the virtualNicId value to set.
     * @return the DataMigrationServiceProperties object itself.
     */
    public DataMigrationServiceProperties withVirtualNicId(String virtualNicId) {
        this.virtualNicId = virtualNicId;
        return this;
    }

    /**
     * Get the autoStopDelay property: The time delay before the service is auto-stopped when idle.
     *
     * @return the autoStopDelay value.
     */
    public String autoStopDelay() {
        return this.autoStopDelay;
    }

    /**
     * Set the autoStopDelay property: The time delay before the service is auto-stopped when idle.
     *
     * @param autoStopDelay the autoStopDelay value to set.
     * @return the DataMigrationServiceProperties object itself.
     */
    public DataMigrationServiceProperties withAutoStopDelay(String autoStopDelay) {
        this.autoStopDelay = autoStopDelay;
        return this;
    }

    /**
     * Get the deleteResourcesOnStop property: Whether service resources should be deleted when stopped. (Turned on by
     * default).
     *
     * @return the deleteResourcesOnStop value.
     */
    public Boolean deleteResourcesOnStop() {
        return this.deleteResourcesOnStop;
    }

    /**
     * Set the deleteResourcesOnStop property: Whether service resources should be deleted when stopped. (Turned on by
     * default).
     *
     * @param deleteResourcesOnStop the deleteResourcesOnStop value to set.
     * @return the DataMigrationServiceProperties object itself.
     */
    public DataMigrationServiceProperties withDeleteResourcesOnStop(Boolean deleteResourcesOnStop) {
        this.deleteResourcesOnStop = deleteResourcesOnStop;
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
