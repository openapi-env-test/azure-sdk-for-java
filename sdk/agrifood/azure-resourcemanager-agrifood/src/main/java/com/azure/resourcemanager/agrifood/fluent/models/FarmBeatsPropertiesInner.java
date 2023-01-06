// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.agrifood.models.ProvisioningState;
import com.azure.resourcemanager.agrifood.models.PublicNetworkAccess;
import com.azure.resourcemanager.agrifood.models.SensorIntegration;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URL;

/** FarmBeats ARM Resource properties. */
@Fluent
public final class FarmBeatsPropertiesInner {
    /*
     * Uri of the FarmBeats instance.
     */
    @JsonProperty(value = "instanceUri", access = JsonProperty.Access.WRITE_ONLY)
    private URL instanceUri;

    /*
     * FarmBeats instance provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Sensor integration request model.
     */
    @JsonProperty(value = "sensorIntegration")
    private SensorIntegration sensorIntegration;

    /*
     * Property to allow or block public traffic for an Azure FarmBeats resource.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * The private endpoint connection resource.
     */
    @JsonProperty(value = "privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private PrivateEndpointConnectionInner privateEndpointConnections;

    /** Creates an instance of FarmBeatsPropertiesInner class. */
    public FarmBeatsPropertiesInner() {
    }

    /**
     * Get the instanceUri property: Uri of the FarmBeats instance.
     *
     * @return the instanceUri value.
     */
    public URL instanceUri() {
        return this.instanceUri;
    }

    /**
     * Get the provisioningState property: FarmBeats instance provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the sensorIntegration property: Sensor integration request model.
     *
     * @return the sensorIntegration value.
     */
    public SensorIntegration sensorIntegration() {
        return this.sensorIntegration;
    }

    /**
     * Set the sensorIntegration property: Sensor integration request model.
     *
     * @param sensorIntegration the sensorIntegration value to set.
     * @return the FarmBeatsPropertiesInner object itself.
     */
    public FarmBeatsPropertiesInner withSensorIntegration(SensorIntegration sensorIntegration) {
        this.sensorIntegration = sensorIntegration;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Property to allow or block public traffic for an Azure FarmBeats resource.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Property to allow or block public traffic for an Azure FarmBeats resource.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the FarmBeatsPropertiesInner object itself.
     */
    public FarmBeatsPropertiesInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: The private endpoint connection resource.
     *
     * @return the privateEndpointConnections value.
     */
    public PrivateEndpointConnectionInner privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sensorIntegration() != null) {
            sensorIntegration().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().validate();
        }
    }
}
