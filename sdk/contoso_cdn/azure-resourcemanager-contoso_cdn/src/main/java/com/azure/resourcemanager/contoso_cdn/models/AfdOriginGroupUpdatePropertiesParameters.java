// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.contoso_cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JSON object that contains the properties of the origin group. */
@Fluent
public class AfdOriginGroupUpdatePropertiesParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AfdOriginGroupUpdatePropertiesParameters.class);

    /*
     * Load balancing settings for a backend pool
     */
    @JsonProperty(value = "loadBalancingSettings")
    private LoadBalancingSettingsParameters loadBalancingSettings;

    /*
     * Health probe settings to the origin that is used to determine the health
     * of the origin.
     */
    @JsonProperty(value = "healthProbeSettings")
    private HealthProbeParameters healthProbeSettings;

    /*
     * Time in minutes to shift the traffic to the endpoint gradually when an
     * unhealthy endpoint comes healthy or a new endpoint is added. Default is
     * 10 mins. This property is currently not supported.
     */
    @JsonProperty(value = "trafficRestorationTimeToHealedOrNewEndpointsInMinutes")
    private Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes;

    /*
     * The JSON object that contains the properties to determine origin health
     * using real requests/responses. This property is currently not supported.
     */
    @JsonProperty(value = "responseBasedAfdOriginErrorDetectionSettings")
    private ResponseBasedOriginErrorDetectionParameters responseBasedAfdOriginErrorDetectionSettings;

    /*
     * Whether to allow session affinity on this host. Valid options are
     * 'Enabled' or 'Disabled'
     */
    @JsonProperty(value = "sessionAffinityState")
    private EnabledState sessionAffinityState;

    /**
     * Get the loadBalancingSettings property: Load balancing settings for a backend pool.
     *
     * @return the loadBalancingSettings value.
     */
    public LoadBalancingSettingsParameters loadBalancingSettings() {
        return this.loadBalancingSettings;
    }

    /**
     * Set the loadBalancingSettings property: Load balancing settings for a backend pool.
     *
     * @param loadBalancingSettings the loadBalancingSettings value to set.
     * @return the AfdOriginGroupUpdatePropertiesParameters object itself.
     */
    public AfdOriginGroupUpdatePropertiesParameters withLoadBalancingSettings(
        LoadBalancingSettingsParameters loadBalancingSettings) {
        this.loadBalancingSettings = loadBalancingSettings;
        return this;
    }

    /**
     * Get the healthProbeSettings property: Health probe settings to the origin that is used to determine the health of
     * the origin.
     *
     * @return the healthProbeSettings value.
     */
    public HealthProbeParameters healthProbeSettings() {
        return this.healthProbeSettings;
    }

    /**
     * Set the healthProbeSettings property: Health probe settings to the origin that is used to determine the health of
     * the origin.
     *
     * @param healthProbeSettings the healthProbeSettings value to set.
     * @return the AfdOriginGroupUpdatePropertiesParameters object itself.
     */
    public AfdOriginGroupUpdatePropertiesParameters withHealthProbeSettings(HealthProbeParameters healthProbeSettings) {
        this.healthProbeSettings = healthProbeSettings;
        return this;
    }

    /**
     * Get the trafficRestorationTimeToHealedOrNewEndpointsInMinutes property: Time in minutes to shift the traffic to
     * the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins.
     * This property is currently not supported.
     *
     * @return the trafficRestorationTimeToHealedOrNewEndpointsInMinutes value.
     */
    public Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes() {
        return this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
    }

    /**
     * Set the trafficRestorationTimeToHealedOrNewEndpointsInMinutes property: Time in minutes to shift the traffic to
     * the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins.
     * This property is currently not supported.
     *
     * @param trafficRestorationTimeToHealedOrNewEndpointsInMinutes the
     *     trafficRestorationTimeToHealedOrNewEndpointsInMinutes value to set.
     * @return the AfdOriginGroupUpdatePropertiesParameters object itself.
     */
    public AfdOriginGroupUpdatePropertiesParameters withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
        Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
        this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes =
            trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
        return this;
    }

    /**
     * Get the responseBasedAfdOriginErrorDetectionSettings property: The JSON object that contains the properties to
     * determine origin health using real requests/responses. This property is currently not supported.
     *
     * @return the responseBasedAfdOriginErrorDetectionSettings value.
     */
    public ResponseBasedOriginErrorDetectionParameters responseBasedAfdOriginErrorDetectionSettings() {
        return this.responseBasedAfdOriginErrorDetectionSettings;
    }

    /**
     * Set the responseBasedAfdOriginErrorDetectionSettings property: The JSON object that contains the properties to
     * determine origin health using real requests/responses. This property is currently not supported.
     *
     * @param responseBasedAfdOriginErrorDetectionSettings the responseBasedAfdOriginErrorDetectionSettings value to
     *     set.
     * @return the AfdOriginGroupUpdatePropertiesParameters object itself.
     */
    public AfdOriginGroupUpdatePropertiesParameters withResponseBasedAfdOriginErrorDetectionSettings(
        ResponseBasedOriginErrorDetectionParameters responseBasedAfdOriginErrorDetectionSettings) {
        this.responseBasedAfdOriginErrorDetectionSettings = responseBasedAfdOriginErrorDetectionSettings;
        return this;
    }

    /**
     * Get the sessionAffinityState property: Whether to allow session affinity on this host. Valid options are
     * 'Enabled' or 'Disabled'.
     *
     * @return the sessionAffinityState value.
     */
    public EnabledState sessionAffinityState() {
        return this.sessionAffinityState;
    }

    /**
     * Set the sessionAffinityState property: Whether to allow session affinity on this host. Valid options are
     * 'Enabled' or 'Disabled'.
     *
     * @param sessionAffinityState the sessionAffinityState value to set.
     * @return the AfdOriginGroupUpdatePropertiesParameters object itself.
     */
    public AfdOriginGroupUpdatePropertiesParameters withSessionAffinityState(EnabledState sessionAffinityState) {
        this.sessionAffinityState = sessionAffinityState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (loadBalancingSettings() != null) {
            loadBalancingSettings().validate();
        }
        if (healthProbeSettings() != null) {
            healthProbeSettings().validate();
        }
        if (responseBasedAfdOriginErrorDetectionSettings() != null) {
            responseBasedAfdOriginErrorDetectionSettings().validate();
        }
    }
}
