package com.azure.iot.deviceupdate.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DeploymentRetryAction. */
public final class DeploymentRetryAction extends ExpandableStringEnum<DeploymentRetryAction> {
    /** Static value retry for DeploymentRetryAction. */
    public static final DeploymentRetryAction RETRY = fromString("retry");

    /**
     * Creates or finds a DeploymentRetryAction from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DeploymentRetryAction.
     */
    @JsonCreator
    public static DeploymentRetryAction fromString(String name) {
        return fromString(name, DeploymentRetryAction.class);
    }

    /** @return known DeploymentRetryAction values. */
    public static Collection<DeploymentRetryAction> values() {
        return values(DeploymentRetryAction.class);
    }
}
