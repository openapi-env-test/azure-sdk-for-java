package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Device tag properties. */
@Fluent
public final class DeviceTag {
    /*
     * Tag name.
     */
    @JsonProperty(value = "tagName", required = true)
    private String tagName;

    /*
     * Number of devices with this tag.
     */
    @JsonProperty(value = "deviceCount", required = true)
    private int deviceCount;

    /**
     * Get the tagName property: Tag name.
     *
     * @return the tagName value.
     */
    public String getTagName() {
        return this.tagName;
    }

    /**
     * Set the tagName property: Tag name.
     *
     * @param tagName the tagName value to set.
     * @return the DeviceTag object itself.
     */
    public DeviceTag setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * Get the deviceCount property: Number of devices with this tag.
     *
     * @return the deviceCount value.
     */
    public int getDeviceCount() {
        return this.deviceCount;
    }

    /**
     * Set the deviceCount property: Number of devices with this tag.
     *
     * @param deviceCount the deviceCount value to set.
     * @return the DeviceTag object itself.
     */
    public DeviceTag setDeviceCount(int deviceCount) {
        this.deviceCount = deviceCount;
        return this;
    }
}
