// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.releaseplannertest.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.releaseplannertest.models.Identity;
import com.azure.resourcemanager.releaseplannertest.models.ProvisioningState;
import com.azure.resourcemanager.releaseplannertest.models.PublicNetworkAccess;
import com.azure.resourcemanager.releaseplannertest.models.SensorIntegration;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URL;
import java.util.Map;

/** FarmBeats ARM Resource. */
@Fluent
public final class FarmBeatsInner extends Resource {
    /*
     * Identity for the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * FarmBeats ARM Resource properties.
     */
    @JsonProperty(value = "properties")
    private FarmBeatsPropertiesInner innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of FarmBeatsInner class. */
    public FarmBeatsInner() {
    }

    /**
     * Get the identity property: Identity for the resource.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Identity for the resource.
     *
     * @param identity the identity value to set.
     * @return the FarmBeatsInner object itself.
     */
    public FarmBeatsInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the innerProperties property: FarmBeats ARM Resource properties.
     *
     * @return the innerProperties value.
     */
    private FarmBeatsPropertiesInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public FarmBeatsInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FarmBeatsInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the instanceUri property: Uri of the FarmBeats instance.
     *
     * @return the instanceUri value.
     */
    public URL instanceUri() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceUri();
    }

    /**
     * Get the provisioningState property: FarmBeats instance provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the sensorIntegration property: Sensor integration request model.
     *
     * @return the sensorIntegration value.
     */
    public SensorIntegration sensorIntegration() {
        return this.innerProperties() == null ? null : this.innerProperties().sensorIntegration();
    }

    /**
     * Set the sensorIntegration property: Sensor integration request model.
     *
     * @param sensorIntegration the sensorIntegration value to set.
     * @return the FarmBeatsInner object itself.
     */
    public FarmBeatsInner withSensorIntegration(SensorIntegration sensorIntegration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FarmBeatsPropertiesInner();
        }
        this.innerProperties().withSensorIntegration(sensorIntegration);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Property to allow or block public traffic for an Azure FarmBeats resource.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Property to allow or block public traffic for an Azure FarmBeats resource.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the FarmBeatsInner object itself.
     */
    public FarmBeatsInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FarmBeatsPropertiesInner();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the privateEndpointConnections property: The private endpoint connection resource.
     *
     * @return the privateEndpointConnections value.
     */
    public PrivateEndpointConnectionInner privateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointConnections();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
