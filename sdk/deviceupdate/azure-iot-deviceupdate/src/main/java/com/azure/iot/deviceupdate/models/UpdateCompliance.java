package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Update compliance information. */
@Fluent
public final class UpdateCompliance {
    /*
     * Total number of devices.
     */
    @JsonProperty(value = "totalDeviceCount", required = true)
    private int totalDeviceCount;

    /*
     * Number of devices on the latest update.
     */
    @JsonProperty(value = "onLatestUpdateDeviceCount", required = true)
    private int onLatestUpdateDeviceCount;

    /*
     * Number of devices with a newer update available.
     */
    @JsonProperty(value = "newUpdatesAvailableDeviceCount", required = true)
    private int newUpdatesAvailableDeviceCount;

    /*
     * Number of devices with update in-progress.
     */
    @JsonProperty(value = "updatesInProgressDeviceCount", required = true)
    private int updatesInProgressDeviceCount;

    /**
     * Get the totalDeviceCount property: Total number of devices.
     *
     * @return the totalDeviceCount value.
     */
    public int getTotalDeviceCount() {
        return this.totalDeviceCount;
    }

    /**
     * Set the totalDeviceCount property: Total number of devices.
     *
     * @param totalDeviceCount the totalDeviceCount value to set.
     * @return the UpdateCompliance object itself.
     */
    public UpdateCompliance setTotalDeviceCount(int totalDeviceCount) {
        this.totalDeviceCount = totalDeviceCount;
        return this;
    }

    /**
     * Get the onLatestUpdateDeviceCount property: Number of devices on the latest update.
     *
     * @return the onLatestUpdateDeviceCount value.
     */
    public int getOnLatestUpdateDeviceCount() {
        return this.onLatestUpdateDeviceCount;
    }

    /**
     * Set the onLatestUpdateDeviceCount property: Number of devices on the latest update.
     *
     * @param onLatestUpdateDeviceCount the onLatestUpdateDeviceCount value to set.
     * @return the UpdateCompliance object itself.
     */
    public UpdateCompliance setOnLatestUpdateDeviceCount(int onLatestUpdateDeviceCount) {
        this.onLatestUpdateDeviceCount = onLatestUpdateDeviceCount;
        return this;
    }

    /**
     * Get the newUpdatesAvailableDeviceCount property: Number of devices with a newer update available.
     *
     * @return the newUpdatesAvailableDeviceCount value.
     */
    public int getNewUpdatesAvailableDeviceCount() {
        return this.newUpdatesAvailableDeviceCount;
    }

    /**
     * Set the newUpdatesAvailableDeviceCount property: Number of devices with a newer update available.
     *
     * @param newUpdatesAvailableDeviceCount the newUpdatesAvailableDeviceCount value to set.
     * @return the UpdateCompliance object itself.
     */
    public UpdateCompliance setNewUpdatesAvailableDeviceCount(int newUpdatesAvailableDeviceCount) {
        this.newUpdatesAvailableDeviceCount = newUpdatesAvailableDeviceCount;
        return this;
    }

    /**
     * Get the updatesInProgressDeviceCount property: Number of devices with update in-progress.
     *
     * @return the updatesInProgressDeviceCount value.
     */
    public int getUpdatesInProgressDeviceCount() {
        return this.updatesInProgressDeviceCount;
    }

    /**
     * Set the updatesInProgressDeviceCount property: Number of devices with update in-progress.
     *
     * @param updatesInProgressDeviceCount the updatesInProgressDeviceCount value to set.
     * @return the UpdateCompliance object itself.
     */
    public UpdateCompliance setUpdatesInProgressDeviceCount(int updatesInProgressDeviceCount) {
        this.updatesInProgressDeviceCount = updatesInProgressDeviceCount;
        return this;
    }
}
