// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The ArmIdentity model. */
@Fluent
public class ArmIdentity {
    /*
     * Principal Id
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /*
     * Tenant Id
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /*
     * The type of identity used for the resource. The type
     * 'SystemAssigned,UserAssigned' includes both an implicitly created
     * identity and a set of user assigned identities. The type 'None' will
     * remove any identities from the service.
     */
    @JsonProperty(value = "type")
    private ResourceIdentityType type;

    /*
     * Dictionary of <ArmUserIdentity>
     */
    @JsonProperty(value = "userAssignedIdentities")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, ArmUserIdentity> userAssignedIdentities;

    /**
     * Get the principalId property: Principal Id.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: Tenant Id.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the type property: The type of identity used for the resource. The type 'SystemAssigned,UserAssigned'
     * includes both an implicitly created identity and a set of user assigned identities. The type 'None' will remove
     * any identities from the service.
     *
     * @return the type value.
     */
    public ResourceIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of identity used for the resource. The type 'SystemAssigned,UserAssigned'
     * includes both an implicitly created identity and a set of user assigned identities. The type 'None' will remove
     * any identities from the service.
     *
     * @param type the type value to set.
     * @return the ArmIdentity object itself.
     */
    public ArmIdentity withType(ResourceIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: Dictionary of &lt;ArmUserIdentity&gt;.
     *
     * @return the userAssignedIdentities value.
     */
    public Map<String, ArmUserIdentity> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: Dictionary of &lt;ArmUserIdentity&gt;.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the ArmIdentity object itself.
     */
    public ArmIdentity withUserAssignedIdentities(Map<String, ArmUserIdentity> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userAssignedIdentities() != null) {
            userAssignedIdentities()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
