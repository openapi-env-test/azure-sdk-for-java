// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServiceRegistryProvisioningState. */
public final class ServiceRegistryProvisioningState extends ExpandableStringEnum<ServiceRegistryProvisioningState> {
    /** Static value Creating for ServiceRegistryProvisioningState. */
    public static final ServiceRegistryProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for ServiceRegistryProvisioningState. */
    public static final ServiceRegistryProvisioningState UPDATING = fromString("Updating");

    /** Static value Succeeded for ServiceRegistryProvisioningState. */
    public static final ServiceRegistryProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for ServiceRegistryProvisioningState. */
    public static final ServiceRegistryProvisioningState FAILED = fromString("Failed");

    /** Static value Deleting for ServiceRegistryProvisioningState. */
    public static final ServiceRegistryProvisioningState DELETING = fromString("Deleting");

    /**
     * Creates or finds a ServiceRegistryProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServiceRegistryProvisioningState.
     */
    @JsonCreator
    public static ServiceRegistryProvisioningState fromString(String name) {
        return fromString(name, ServiceRegistryProvisioningState.class);
    }

    /** @return known ServiceRegistryProvisioningState values. */
    public static Collection<ServiceRegistryProvisioningState> values() {
        return values(ServiceRegistryProvisioningState.class);
    }
}
