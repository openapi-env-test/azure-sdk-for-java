package com.azure.iot.deviceupdate.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DeploymentState. */
public final class DeploymentState extends ExpandableStringEnum<DeploymentState> {
    /** Static value Active for DeploymentState. */
    public static final DeploymentState ACTIVE = fromString("Active");

    /** Static value Inactive for DeploymentState. */
    public static final DeploymentState INACTIVE = fromString("Inactive");

    /** Static value Canceled for DeploymentState. */
    public static final DeploymentState CANCELED = fromString("Canceled");

    /**
     * Creates or finds a DeploymentState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DeploymentState.
     */
    @JsonCreator
    public static DeploymentState fromString(String name) {
        return fromString(name, DeploymentState.class);
    }

    /** @return known DeploymentState values. */
    public static Collection<DeploymentState> values() {
        return values(DeploymentState.class);
    }
}
