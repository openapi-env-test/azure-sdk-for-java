package com.azure.iot.deviceupdate.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OperationStatus. */
public final class OperationStatus extends ExpandableStringEnum<OperationStatus> {
    /** Static value Undefined for OperationStatus. */
    public static final OperationStatus UNDEFINED = fromString("Undefined");

    /** Static value NotStarted for OperationStatus. */
    public static final OperationStatus NOT_STARTED = fromString("NotStarted");

    /** Static value Running for OperationStatus. */
    public static final OperationStatus RUNNING = fromString("Running");

    /** Static value Succeeded for OperationStatus. */
    public static final OperationStatus SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for OperationStatus. */
    public static final OperationStatus FAILED = fromString("Failed");

    /**
     * Creates or finds a OperationStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OperationStatus.
     */
    @JsonCreator
    public static OperationStatus fromString(String name) {
        return fromString(name, OperationStatus.class);
    }

    /** @return known OperationStatus values. */
    public static Collection<OperationStatus> values() {
        return values(OperationStatus.class);
    }
}
