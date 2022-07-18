// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServiceProvisioningState. */
public final class ServiceProvisioningState extends ExpandableStringEnum<ServiceProvisioningState> {
    /** Static value Accepted for ServiceProvisioningState. */
    public static final ServiceProvisioningState ACCEPTED = fromString("Accepted");

    /** Static value Deleting for ServiceProvisioningState. */
    public static final ServiceProvisioningState DELETING = fromString("Deleting");

    /** Static value Deploying for ServiceProvisioningState. */
    public static final ServiceProvisioningState DEPLOYING = fromString("Deploying");

    /** Static value Stopped for ServiceProvisioningState. */
    public static final ServiceProvisioningState STOPPED = fromString("Stopped");

    /** Static value Stopping for ServiceProvisioningState. */
    public static final ServiceProvisioningState STOPPING = fromString("Stopping");

    /** Static value Starting for ServiceProvisioningState. */
    public static final ServiceProvisioningState STARTING = fromString("Starting");

    /** Static value FailedToStart for ServiceProvisioningState. */
    public static final ServiceProvisioningState FAILED_TO_START = fromString("FailedToStart");

    /** Static value FailedToStop for ServiceProvisioningState. */
    public static final ServiceProvisioningState FAILED_TO_STOP = fromString("FailedToStop");

    /** Static value Succeeded for ServiceProvisioningState. */
    public static final ServiceProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for ServiceProvisioningState. */
    public static final ServiceProvisioningState FAILED = fromString("Failed");

    /**
     * Creates or finds a ServiceProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServiceProvisioningState.
     */
    @JsonCreator
    public static ServiceProvisioningState fromString(String name) {
        return fromString(name, ServiceProvisioningState.class);
    }

    /**
     * Gets known ServiceProvisioningState values.
     *
     * @return known ServiceProvisioningState values.
     */
    public static Collection<ServiceProvisioningState> values() {
        return values(ServiceProvisioningState.class);
    }
}
