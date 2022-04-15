package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Device Update agent id. */
@Fluent
public final class DeviceUpdateAgentId {
    /*
     * Device Id
     */
    @JsonProperty(value = "deviceId", required = true)
    private String deviceId;

    /*
     * Module Id
     */
    @JsonProperty(value = "moduleId")
    private String moduleId;

    /**
     * Get the deviceId property: Device Id.
     *
     * @return the deviceId value.
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * Set the deviceId property: Device Id.
     *
     * @param deviceId the deviceId value to set.
     * @return the DeviceUpdateAgentId object itself.
     */
    public DeviceUpdateAgentId setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Get the moduleId property: Module Id.
     *
     * @return the moduleId value.
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * Set the moduleId property: Module Id.
     *
     * @param moduleId the moduleId value to set.
     * @return the DeviceUpdateAgentId object itself.
     */
    public DeviceUpdateAgentId setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
}
