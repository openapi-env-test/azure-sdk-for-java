// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServiceStatus. */
public final class ServiceStatus extends ExpandableStringEnum<ServiceStatus> {
    /** Static value Creating for ServiceStatus. */
    public static final ServiceStatus CREATING = fromString("Creating");

    /** Static value Running for ServiceStatus. */
    public static final ServiceStatus RUNNING = fromString("Running");

    /** Static value Updating for ServiceStatus. */
    public static final ServiceStatus UPDATING = fromString("Updating");

    /** Static value Deleting for ServiceStatus. */
    public static final ServiceStatus DELETING = fromString("Deleting");

    /** Static value Error for ServiceStatus. */
    public static final ServiceStatus ERROR = fromString("Error");

    /** Static value Stopped for ServiceStatus. */
    public static final ServiceStatus STOPPED = fromString("Stopped");

    /**
     * Creates or finds a ServiceStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServiceStatus.
     */
    @JsonCreator
    public static ServiceStatus fromString(String name) {
        return fromString(name, ServiceStatus.class);
    }

    /**
     * Gets known ServiceStatus values.
     *
     * @return known ServiceStatus values.
     */
    public static Collection<ServiceStatus> values() {
        return values(ServiceStatus.class);
    }
}
