// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.sql.generated.models.AdvancedThreatProtectionState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** A managed database Advanced Threat Protection. */
@Fluent
public final class ManagedDatabaseAdvancedThreatProtectionInner extends ProxyResource {
    /*
     * SystemData of AdvancedThreatProtectionResource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private AdvancedThreatProtectionProperties innerProperties;

    /** Creates an instance of ManagedDatabaseAdvancedThreatProtectionInner class. */
    public ManagedDatabaseAdvancedThreatProtectionInner() {
    }

    /**
     * Get the systemData property: SystemData of AdvancedThreatProtectionResource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private AdvancedThreatProtectionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the state property: Specifies the state of the Advanced Threat Protection, whether it is enabled or disabled
     * or a state has not been applied yet on the specific database or server.
     *
     * @return the state value.
     */
    public AdvancedThreatProtectionState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: Specifies the state of the Advanced Threat Protection, whether it is enabled or disabled
     * or a state has not been applied yet on the specific database or server.
     *
     * @param state the state value to set.
     * @return the ManagedDatabaseAdvancedThreatProtectionInner object itself.
     */
    public ManagedDatabaseAdvancedThreatProtectionInner withState(AdvancedThreatProtectionState state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdvancedThreatProtectionProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Get the creationTime property: Specifies the UTC creation time of the policy.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().creationTime();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
