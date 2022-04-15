package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Deployment device state filter. */
@Fluent
public final class DeploymentDeviceStatesFilter {
    /*
     * Device Identifier.
     */
    @JsonProperty(value = "deviceId")
    private String deviceId;

    /*
     * Device module Identifier.
     */
    @JsonProperty(value = "moduleId")
    private String moduleId;

    /*
     * The deployment device state.
     */
    @JsonProperty(value = "deviceState")
    private DeviceState deviceState;

    /**
     * Get the deviceId property: Device Identifier.
     *
     * @return the deviceId value.
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * Set the deviceId property: Device Identifier.
     *
     * @param deviceId the deviceId value to set.
     * @return the DeploymentDeviceStatesFilter object itself.
     */
    public DeploymentDeviceStatesFilter setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Get the moduleId property: Device module Identifier.
     *
     * @return the moduleId value.
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * Set the moduleId property: Device module Identifier.
     *
     * @param moduleId the moduleId value to set.
     * @return the DeploymentDeviceStatesFilter object itself.
     */
    public DeploymentDeviceStatesFilter setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    /**
     * Get the deviceState property: The deployment device state.
     *
     * @return the deviceState value.
     */
    public DeviceState getDeviceState() {
        return this.deviceState;
    }

    /**
     * Set the deviceState property: The deployment device state.
     *
     * @param deviceState the deviceState value to set.
     * @return the DeploymentDeviceStatesFilter object itself.
     */
    public DeploymentDeviceStatesFilter setDeviceState(DeviceState deviceState) {
        this.deviceState = deviceState;
        return this;
    }
}
