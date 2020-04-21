/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2020-03-01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties describing the software upgrade state of the Cache.
 */
public class CacheUpgradeStatus {
    /**
     * Version string of the firmware currently installed on this Cache.
     */
    @JsonProperty(value = "currentFirmwareVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String currentFirmwareVersion;

    /**
     * True if there is a firmware update ready to install on this Cache. The
     * firmware will automatically be installed after firmwareUpdateDeadline if
     * not triggered earlier via the upgrade operation. Possible values
     * include: 'available', 'unavailable'.
     */
    @JsonProperty(value = "firmwareUpdateStatus", access = JsonProperty.Access.WRITE_ONLY)
    private FirmwareStatusType firmwareUpdateStatus;

    /**
     * Time at which the pending firmware update will automatically be
     * installed on the Cache.
     */
    @JsonProperty(value = "firmwareUpdateDeadline", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime firmwareUpdateDeadline;

    /**
     * Time of the last successful firmware update.
     */
    @JsonProperty(value = "lastFirmwareUpdate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastFirmwareUpdate;

    /**
     * When firmwareUpdateAvailable is true, this field holds the version
     * string for the update.
     */
    @JsonProperty(value = "pendingFirmwareVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String pendingFirmwareVersion;

    /**
     * Get version string of the firmware currently installed on this Cache.
     *
     * @return the currentFirmwareVersion value
     */
    public String currentFirmwareVersion() {
        return this.currentFirmwareVersion;
    }

    /**
     * Get true if there is a firmware update ready to install on this Cache. The firmware will automatically be installed after firmwareUpdateDeadline if not triggered earlier via the upgrade operation. Possible values include: 'available', 'unavailable'.
     *
     * @return the firmwareUpdateStatus value
     */
    public FirmwareStatusType firmwareUpdateStatus() {
        return this.firmwareUpdateStatus;
    }

    /**
     * Get time at which the pending firmware update will automatically be installed on the Cache.
     *
     * @return the firmwareUpdateDeadline value
     */
    public DateTime firmwareUpdateDeadline() {
        return this.firmwareUpdateDeadline;
    }

    /**
     * Get time of the last successful firmware update.
     *
     * @return the lastFirmwareUpdate value
     */
    public DateTime lastFirmwareUpdate() {
        return this.lastFirmwareUpdate;
    }

    /**
     * Get when firmwareUpdateAvailable is true, this field holds the version string for the update.
     *
     * @return the pendingFirmwareVersion value
     */
    public String pendingFirmwareVersion() {
        return this.pendingFirmwareVersion;
    }

}
