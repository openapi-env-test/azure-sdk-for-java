// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** An identity that can be associated with a resource. */
@Fluent
public class ResourceIdentity {
    /*
     * The type of managed identity used. The type 'SystemAssigned, UserAssigned' includes both an implicitly created
     * identity and a set of user-assigned identities. The type 'None' will remove any identities.
     */
    @JsonProperty(value = "type")
    private IdentityType type;

    /*
     * The list of user-assigned identities associated with the resource. The user-assigned identity dictionary keys
     * will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     */
    @JsonProperty(value = "userAssignedIdentities")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, UserIdentity> userAssignedIdentities;

    /*
     * The principal id of the identity. This property will only be provided for a system-assigned identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /*
     * The tenant id associated with the resource's identity. This property will only be provided for a system-assigned
     * identity.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * Get the type property: The type of managed identity used. The type 'SystemAssigned, UserAssigned' includes both
     * an implicitly created identity and a set of user-assigned identities. The type 'None' will remove any identities.
     *
     * @return the type value.
     */
    public IdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of managed identity used. The type 'SystemAssigned, UserAssigned' includes both
     * an implicitly created identity and a set of user-assigned identities. The type 'None' will remove any identities.
     *
     * @param type the type value to set.
     * @return the ResourceIdentity object itself.
     */
    public ResourceIdentity withType(IdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: The list of user-assigned identities associated with the resource. The
     * user-assigned identity dictionary keys will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @return the userAssignedIdentities value.
     */
    public Map<String, UserIdentity> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: The list of user-assigned identities associated with the resource. The
     * user-assigned identity dictionary keys will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the ResourceIdentity object itself.
     */
    public ResourceIdentity withUserAssignedIdentities(Map<String, UserIdentity> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Get the principalId property: The principal id of the identity. This property will only be provided for a
     * system-assigned identity.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: The tenant id associated with the resource's identity. This property will only be
     * provided for a system-assigned identity.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
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
