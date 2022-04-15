package com.azure.iot.deviceupdate.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DeviceDeploymentState. */
public final class DeviceDeploymentState extends ExpandableStringEnum<DeviceDeploymentState> {
    /** Static value Succeeded for DeviceDeploymentState. */
    public static final DeviceDeploymentState SUCCEEDED = fromString("Succeeded");

    /** Static value InProgress for DeviceDeploymentState. */
    public static final DeviceDeploymentState IN_PROGRESS = fromString("InProgress");

    /** Static value Failed for DeviceDeploymentState. */
    public static final DeviceDeploymentState FAILED = fromString("Failed");

    /** Static value Canceled for DeviceDeploymentState. */
    public static final DeviceDeploymentState CANCELED = fromString("Canceled");

    /** Static value Incompatible for DeviceDeploymentState. */
    public static final DeviceDeploymentState INCOMPATIBLE = fromString("Incompatible");

    /**
     * Creates or finds a DeviceDeploymentState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DeviceDeploymentState.
     */
    @JsonCreator
    public static DeviceDeploymentState fromString(String name) {
        return fromString(name, DeviceDeploymentState.class);
    }

    /** @return known DeviceDeploymentState values. */
    public static Collection<DeviceDeploymentState> values() {
        return values(DeviceDeploymentState.class);
    }
}
