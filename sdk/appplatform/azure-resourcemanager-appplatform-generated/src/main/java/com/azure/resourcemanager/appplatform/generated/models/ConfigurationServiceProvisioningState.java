// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ConfigurationServiceProvisioningState. */
public final class ConfigurationServiceProvisioningState
    extends ExpandableStringEnum<ConfigurationServiceProvisioningState> {
    /** Static value Creating for ConfigurationServiceProvisioningState. */
    public static final ConfigurationServiceProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for ConfigurationServiceProvisioningState. */
    public static final ConfigurationServiceProvisioningState UPDATING = fromString("Updating");

    /** Static value Succeeded for ConfigurationServiceProvisioningState. */
    public static final ConfigurationServiceProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for ConfigurationServiceProvisioningState. */
    public static final ConfigurationServiceProvisioningState FAILED = fromString("Failed");

    /** Static value Deleting for ConfigurationServiceProvisioningState. */
    public static final ConfigurationServiceProvisioningState DELETING = fromString("Deleting");

    /**
     * Creates or finds a ConfigurationServiceProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ConfigurationServiceProvisioningState.
     */
    @JsonCreator
    public static ConfigurationServiceProvisioningState fromString(String name) {
        return fromString(name, ConfigurationServiceProvisioningState.class);
    }

    /** @return known ConfigurationServiceProvisioningState values. */
    public static Collection<ConfigurationServiceProvisioningState> values() {
        return values(ConfigurationServiceProvisioningState.class);
    }
}
