// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.models.ArmBaseModel;
import com.azure.resourcemanager.databoxedge.models.AzureContainerDataFormat;
import com.azure.resourcemanager.databoxedge.models.ContainerStatus;
import com.azure.resourcemanager.databoxedge.models.RefreshDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Represents a container on the Data Box Edge/Gateway device. */
@Fluent
public final class ContainerInner extends ArmBaseModel {
    /*
     * The container properties.
     */
    @JsonProperty(value = "properties", required = true)
    private ContainerProperties innerProperties = new ContainerProperties();

    /*
     * Metadata pertaining to creation and last modification of Container
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of ContainerInner class. */
    public ContainerInner() {
    }

    /**
     * Get the innerProperties property: The container properties.
     *
     * @return the innerProperties value.
     */
    private ContainerProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of Container.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the containerStatus property: Current status of the container.
     *
     * @return the containerStatus value.
     */
    public ContainerStatus containerStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().containerStatus();
    }

    /**
     * Get the dataFormat property: DataFormat for Container.
     *
     * @return the dataFormat value.
     */
    public AzureContainerDataFormat dataFormat() {
        return this.innerProperties() == null ? null : this.innerProperties().dataFormat();
    }

    /**
     * Set the dataFormat property: DataFormat for Container.
     *
     * @param dataFormat the dataFormat value to set.
     * @return the ContainerInner object itself.
     */
    public ContainerInner withDataFormat(AzureContainerDataFormat dataFormat) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerProperties();
        }
        this.innerProperties().withDataFormat(dataFormat);
        return this;
    }

    /**
     * Get the refreshDetails property: Details of the refresh job on this container.
     *
     * @return the refreshDetails value.
     */
    public RefreshDetails refreshDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().refreshDetails();
    }

    /**
     * Get the createdDateTime property: The UTC time when container got created.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().createdDateTime();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property innerProperties in model ContainerInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ContainerInner.class);
}
