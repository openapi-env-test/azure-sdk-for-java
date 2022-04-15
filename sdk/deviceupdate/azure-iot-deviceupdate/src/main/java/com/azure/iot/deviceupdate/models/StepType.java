package com.azure.iot.deviceupdate.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for StepType. */
public final class StepType extends ExpandableStringEnum<StepType> {
    /** Static value Inline for StepType. */
    public static final StepType INLINE = fromString("Inline");

    /** Static value Reference for StepType. */
    public static final StepType REFERENCE = fromString("Reference");

    /**
     * Creates or finds a StepType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StepType.
     */
    @JsonCreator
    public static StepType fromString(String name) {
        return fromString(name, StepType.class);
    }

    /** @return known StepType values. */
    public static Collection<StepType> values() {
        return values(StepType.class);
    }
}
