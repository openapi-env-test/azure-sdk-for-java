package com.azure.iot.deviceupdate.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DeploymentCancelAction. */
public final class DeploymentCancelAction extends ExpandableStringEnum<DeploymentCancelAction> {
    /** Static value cancel for DeploymentCancelAction. */
    public static final DeploymentCancelAction CANCEL = fromString("cancel");

    /**
     * Creates or finds a DeploymentCancelAction from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DeploymentCancelAction.
     */
    @JsonCreator
    public static DeploymentCancelAction fromString(String name) {
        return fromString(name, DeploymentCancelAction.class);
    }

    /** @return known DeploymentCancelAction values. */
    public static Collection<DeploymentCancelAction> values() {
        return values(DeploymentCancelAction.class);
    }
}
