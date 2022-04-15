package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Operation status filter. */
@Fluent
public final class DeviceFilter {
    /*
     * Device group identity.
     */
    @JsonProperty(value = "groupId")
    private String groupId;

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
     * @return the DeviceFilter object itself.
     */
    public DeviceFilter setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
}
