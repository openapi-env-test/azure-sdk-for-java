// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate;

import com.azure.core.util.ServiceVersion;

/** Service version of DeviceUpdateClient. */
public enum DeviceUpdateServiceVersion implements ServiceVersion {
    /** Enum value 2022-07-01-preview. */
    V2022_07_01_PREVIEW("2022-07-01-preview");

    private final String version;

    DeviceUpdateServiceVersion(String version) {
        this.version = version;
    }

    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     *
     * @return The latest {@link DeviceUpdateServiceVersion}.
     */
    public static DeviceUpdateServiceVersion getLatest() {
        return V2022_07_01_PREVIEW;
    }
}
