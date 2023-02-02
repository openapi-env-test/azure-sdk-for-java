// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.UUID;

/** Azure Active Directory identity configuration for a resource. */
@Fluent
public class ResourceIdentity {
    /*
     * The resource ids of the user assigned identities to use
     */
    @JsonProperty(value = "userAssignedIdentities")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, UserIdentity> userAssignedIdentities;

    /*
     * The Azure Active Directory principal id.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID principalId;

    /*
     * The identity type. Set this to 'SystemAssigned' in order to automatically create and assign an Azure Active
     * Directory principal for the resource.
     */
    @JsonProperty(value = "type")
    private IdentityType type;

    /*
     * The Azure Active Directory tenant id.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID tenantId;

    /** Creates an instance of ResourceIdentity class. */
    public ResourceIdentity() {
    }

    /**
     * Get the userAssignedIdentities property: The resource ids of the user assigned identities to use.
     *
     * @return the userAssignedIdentities value.
     */
    public Map<String, UserIdentity> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: The resource ids of the user assigned identities to use.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the ResourceIdentity object itself.
     */
    public ResourceIdentity withUserAssignedIdentities(Map<String, UserIdentity> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Get the principalId property: The Azure Active Directory principal id.
     *
     * @return the principalId value.
     */
    public UUID principalId() {
        return this.principalId;
    }

    /**
     * Get the type property: The identity type. Set this to 'SystemAssigned' in order to automatically create and
     * assign an Azure Active Directory principal for the resource.
     *
     * @return the type value.
     */
    public IdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The identity type. Set this to 'SystemAssigned' in order to automatically create and
     * assign an Azure Active Directory principal for the resource.
     *
     * @param type the type value to set.
     * @return the ResourceIdentity object itself.
     */
    public ResourceIdentity withType(IdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the tenantId property: The Azure Active Directory tenant id.
     *
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.tenantId;
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
