package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Device class metadata. */
@Fluent
public final class DeviceClass {
    /*
     * The device class identifier.
     */
    @JsonProperty(value = "deviceClassId", required = true)
    private String deviceClassId;

    /*
     * The compat properties of the device class. This object can be thought of
     * as a set of key-value pairs where the key is the name of the
     * compatibility property and the value is the value of the compatibility
     * property. There will always be at least 1 compat property
     */
    @JsonProperty(value = "compatProperties", required = true)
    private Map<String, String> compatProperties;

    /*
     * Update identity.
     */
    @JsonProperty(value = "bestCompatibleUpdateId", required = true)
    private UpdateId bestCompatibleUpdateId;

    /**
     * Get the deviceClassId property: The device class identifier.
     *
     * @return the deviceClassId value.
     */
    public String getDeviceClassId() {
        return this.deviceClassId;
    }

    /**
     * Set the deviceClassId property: The device class identifier.
     *
     * @param deviceClassId the deviceClassId value to set.
     * @return the DeviceClass object itself.
     */
    public DeviceClass setDeviceClassId(String deviceClassId) {
        this.deviceClassId = deviceClassId;
        return this;
    }

    /**
     * Get the compatProperties property: The compat properties of the device class. This object can be thought of as a
     * set of key-value pairs where the key is the name of the compatibility property and the value is the value of the
     * compatibility property. There will always be at least 1 compat property.
     *
     * @return the compatProperties value.
     */
    public Map<String, String> getCompatProperties() {
        return this.compatProperties;
    }

    /**
     * Set the compatProperties property: The compat properties of the device class. This object can be thought of as a
     * set of key-value pairs where the key is the name of the compatibility property and the value is the value of the
     * compatibility property. There will always be at least 1 compat property.
     *
     * @param compatProperties the compatProperties value to set.
     * @return the DeviceClass object itself.
     */
    public DeviceClass setCompatProperties(Map<String, String> compatProperties) {
        this.compatProperties = compatProperties;
        return this;
    }

    /**
     * Get the bestCompatibleUpdateId property: Update identity.
     *
     * @return the bestCompatibleUpdateId value.
     */
    public UpdateId getBestCompatibleUpdateId() {
        return this.bestCompatibleUpdateId;
    }

    /**
     * Set the bestCompatibleUpdateId property: Update identity.
     *
     * @param bestCompatibleUpdateId the bestCompatibleUpdateId value to set.
     * @return the DeviceClass object itself.
     */
    public DeviceClass setBestCompatibleUpdateId(UpdateId bestCompatibleUpdateId) {
        this.bestCompatibleUpdateId = bestCompatibleUpdateId;
        return this;
    }
}
