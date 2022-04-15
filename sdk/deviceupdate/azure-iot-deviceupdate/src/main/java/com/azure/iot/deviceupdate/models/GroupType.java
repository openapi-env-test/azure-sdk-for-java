package com.azure.iot.deviceupdate.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for GroupType. */
public final class GroupType extends ExpandableStringEnum<GroupType> {
    /** Static value DeviceClassIdAndIoTHubTag for GroupType. */
    public static final GroupType DEVICE_CLASS_ID_AND_IO_THUB_TAG = fromString("DeviceClassIdAndIoTHubTag");

    /** Static value InvalidDeviceClassIdAndIoTHubTag for GroupType. */
    public static final GroupType INVALID_DEVICE_CLASS_ID_AND_IO_THUB_TAG =
            fromString("InvalidDeviceClassIdAndIoTHubTag");

    /** Static value DefaultDeviceClassId for GroupType. */
    public static final GroupType DEFAULT_DEVICE_CLASS_ID = fromString("DefaultDeviceClassId");

    /**
     * Creates or finds a GroupType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GroupType.
     */
    @JsonCreator
    public static GroupType fromString(String name) {
        return fromString(name, GroupType.class);
    }

    /** @return known GroupType values. */
    public static Collection<GroupType> values() {
        return values(GroupType.class);
    }
}
