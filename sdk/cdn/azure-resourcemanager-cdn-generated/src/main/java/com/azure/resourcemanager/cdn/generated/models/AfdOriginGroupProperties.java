// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JSON object that contains the properties of the origin group. */
@Immutable
public final class AfdOriginGroupProperties extends AfdOriginGroupUpdatePropertiesParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AfdOriginGroupProperties.class);

    /*
     * Provisioning status
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private AfdProvisioningState provisioningState;

    /*
     * The deploymentStatus property.
     */
    @JsonProperty(value = "deploymentStatus", access = JsonProperty.Access.WRITE_ONLY)
    private DeploymentStatus deploymentStatus;

    /**
     * Get the provisioningState property: Provisioning status.
     *
     * @return the provisioningState value.
     */
    public AfdProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the deploymentStatus property: The deploymentStatus property.
     *
     * @return the deploymentStatus value.
     */
    public DeploymentStatus deploymentStatus() {
        return this.deploymentStatus;
    }

    /** {@inheritDoc} */
    @Override
    public AfdOriginGroupProperties withLoadBalancingSettings(LoadBalancingSettingsParameters loadBalancingSettings) {
        super.withLoadBalancingSettings(loadBalancingSettings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AfdOriginGroupProperties withHealthProbeSettings(HealthProbeParameters healthProbeSettings) {
        super.withHealthProbeSettings(healthProbeSettings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AfdOriginGroupProperties withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
        Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
        super
            .withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
                trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AfdOriginGroupProperties withResponseBasedAfdOriginErrorDetectionSettings(
        ResponseBasedOriginErrorDetectionParameters responseBasedAfdOriginErrorDetectionSettings) {
        super.withResponseBasedAfdOriginErrorDetectionSettings(responseBasedAfdOriginErrorDetectionSettings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AfdOriginGroupProperties withSessionAffinityState(EnabledState sessionAffinityState) {
        super.withSessionAffinityState(sessionAffinityState);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
