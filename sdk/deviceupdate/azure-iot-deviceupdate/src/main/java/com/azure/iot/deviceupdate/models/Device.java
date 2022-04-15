package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Device metadata. */
@Fluent
public final class Device {
    /*
     * Device identity.
     */
    @JsonProperty(value = "deviceId", required = true)
    private String deviceId;

    /*
     * Device module identity.
     */
    @JsonProperty(value = "moduleId")
    private String moduleId;

    /*
     * Device class identity.
     */
    @JsonProperty(value = "deviceClassId", required = true)
    private String deviceClassId;

    /*
     * Device manufacturer.
     */
    @JsonProperty(value = "manufacturer", required = true)
    private String manufacturer;

    /*
     * Device model.
     */
    @JsonProperty(value = "model", required = true)
    private String model;

    /*
     * Device group identity.
     */
    @JsonProperty(value = "groupId")
    private String groupId;

    /*
     * Update identity.
     */
    @JsonProperty(value = "lastAttemptedUpdateId")
    private UpdateId lastAttemptedUpdateId;

    /*
     * State of the device in its last deployment.
     */
    @JsonProperty(value = "deploymentStatus")
    private DeviceDeploymentState deploymentStatus;

    /*
     * Update identity.
     */
    @JsonProperty(value = "installedUpdateId")
    private UpdateId installedUpdateId;

    /*
     * Boolean flag indicating whether the latest update is installed on the
     * device
     */
    @JsonProperty(value = "onLatestUpdate", required = true)
    private boolean onLatestUpdate;

    /*
     * The deployment identifier for the last deployment to the device
     */
    @JsonProperty(value = "lastDeploymentId")
    private String lastDeploymentId;

    /*
     * Last install result.
     */
    @JsonProperty(value = "lastInstallResult")
    private InstallResult lastInstallResult;

    /**
     * Get the deviceId property: Device identity.
     *
     * @return the deviceId value.
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * Set the deviceId property: Device identity.
     *
     * @param deviceId the deviceId value to set.
     * @return the Device object itself.
     */
    public Device setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Get the moduleId property: Device module identity.
     *
     * @return the moduleId value.
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * Set the moduleId property: Device module identity.
     *
     * @param moduleId the moduleId value to set.
     * @return the Device object itself.
     */
    public Device setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    /**
     * Get the deviceClassId property: Device class identity.
     *
     * @return the deviceClassId value.
     */
    public String getDeviceClassId() {
        return this.deviceClassId;
    }

    /**
     * Set the deviceClassId property: Device class identity.
     *
     * @param deviceClassId the deviceClassId value to set.
     * @return the Device object itself.
     */
    public Device setDeviceClassId(String deviceClassId) {
        this.deviceClassId = deviceClassId;
        return this;
    }

    /**
     * Get the manufacturer property: Device manufacturer.
     *
     * @return the manufacturer value.
     */
    public String getManufacturer() {
        return this.manufacturer;
    }

    /**
     * Set the manufacturer property: Device manufacturer.
     *
     * @param manufacturer the manufacturer value to set.
     * @return the Device object itself.
     */
    public Device setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    /**
     * Get the model property: Device model.
     *
     * @return the model value.
     */
    public String getModel() {
        return this.model;
    }

    /**
     * Set the model property: Device model.
     *
     * @param model the model value to set.
     * @return the Device object itself.
     */
    public Device setModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * Get the groupId property: Device group identity.
     *
     * @return the groupId value.
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * Set the groupId property: Device group identity.
     *
     * @param groupId the groupId value to set.
     * @return the Device object itself.
     */
    public Device setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the lastAttemptedUpdateId property: Update identity.
     *
     * @return the lastAttemptedUpdateId value.
     */
    public UpdateId getLastAttemptedUpdateId() {
        return this.lastAttemptedUpdateId;
    }

    /**
     * Set the lastAttemptedUpdateId property: Update identity.
     *
     * @param lastAttemptedUpdateId the lastAttemptedUpdateId value to set.
     * @return the Device object itself.
     */
    public Device setLastAttemptedUpdateId(UpdateId lastAttemptedUpdateId) {
        this.lastAttemptedUpdateId = lastAttemptedUpdateId;
        return this;
    }

    /**
     * Get the deploymentStatus property: State of the device in its last deployment.
     *
     * @return the deploymentStatus value.
     */
    public DeviceDeploymentState getDeploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * Set the deploymentStatus property: State of the device in its last deployment.
     *
     * @param deploymentStatus the deploymentStatus value to set.
     * @return the Device object itself.
     */
    public Device setDeploymentStatus(DeviceDeploymentState deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
        return this;
    }

    /**
     * Get the installedUpdateId property: Update identity.
     *
     * @return the installedUpdateId value.
     */
    public UpdateId getInstalledUpdateId() {
        return this.installedUpdateId;
    }

    /**
     * Set the installedUpdateId property: Update identity.
     *
     * @param installedUpdateId the installedUpdateId value to set.
     * @return the Device object itself.
     */
    public Device setInstalledUpdateId(UpdateId installedUpdateId) {
        this.installedUpdateId = installedUpdateId;
        return this;
    }

    /**
     * Get the onLatestUpdate property: Boolean flag indicating whether the latest update is installed on the device.
     *
     * @return the onLatestUpdate value.
     */
    public boolean isOnLatestUpdate() {
        return this.onLatestUpdate;
    }

    /**
     * Set the onLatestUpdate property: Boolean flag indicating whether the latest update is installed on the device.
     *
     * @param onLatestUpdate the onLatestUpdate value to set.
     * @return the Device object itself.
     */
    public Device setOnLatestUpdate(boolean onLatestUpdate) {
        this.onLatestUpdate = onLatestUpdate;
        return this;
    }

    /**
     * Get the lastDeploymentId property: The deployment identifier for the last deployment to the device.
     *
     * @return the lastDeploymentId value.
     */
    public String getLastDeploymentId() {
        return this.lastDeploymentId;
    }

    /**
     * Set the lastDeploymentId property: The deployment identifier for the last deployment to the device.
     *
     * @param lastDeploymentId the lastDeploymentId value to set.
     * @return the Device object itself.
     */
    public Device setLastDeploymentId(String lastDeploymentId) {
        this.lastDeploymentId = lastDeploymentId;
        return this;
    }

    /**
     * Get the lastInstallResult property: Last install result.
     *
     * @return the lastInstallResult value.
     */
    public InstallResult getLastInstallResult() {
        return this.lastInstallResult;
    }

    /**
     * Set the lastInstallResult property: Last install result.
     *
     * @param lastInstallResult the lastInstallResult value to set.
     * @return the Device object itself.
     */
    public Device setLastInstallResult(InstallResult lastInstallResult) {
        this.lastInstallResult = lastInstallResult;
        return this;
    }
}
