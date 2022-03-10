// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.generated.models.ArmProxyResource;
import com.azure.resourcemanager.cosmos.generated.models.Permission;
import com.azure.resourcemanager.cosmos.generated.models.RoleDefinitionType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An Azure Cosmos DB SQL Role Definition. */
@Fluent
public final class SqlRoleDefinitionGetResultsInner extends ArmProxyResource {
    /*
     * Properties related to the Role Definition.
     */
    @JsonProperty(value = "properties")
    private SqlRoleDefinitionResource innerProperties;

    /**
     * Get the innerProperties property: Properties related to the Role Definition.
     *
     * @return the innerProperties value.
     */
    private SqlRoleDefinitionResource innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the roleName property: A user-friendly name for the Role Definition. Must be unique for the database account.
     *
     * @return the roleName value.
     */
    public String roleName() {
        return this.innerProperties() == null ? null : this.innerProperties().roleName();
    }

    /**
     * Set the roleName property: A user-friendly name for the Role Definition. Must be unique for the database account.
     *
     * @param roleName the roleName value to set.
     * @return the SqlRoleDefinitionGetResultsInner object itself.
     */
    public SqlRoleDefinitionGetResultsInner withRoleName(String roleName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlRoleDefinitionResource();
        }
        this.innerProperties().withRoleName(roleName);
        return this;
    }

    /**
     * Get the type property: Indicates whether the Role Definition was built-in or user created.
     *
     * @return the type value.
     */
    public RoleDefinitionType typePropertiesType() {
        return this.innerProperties() == null ? null : this.innerProperties().type();
    }

    /**
     * Set the type property: Indicates whether the Role Definition was built-in or user created.
     *
     * @param type the type value to set.
     * @return the SqlRoleDefinitionGetResultsInner object itself.
     */
    public SqlRoleDefinitionGetResultsInner withTypePropertiesType(RoleDefinitionType type) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlRoleDefinitionResource();
        }
        this.innerProperties().withType(type);
        return this;
    }

    /**
     * Get the assignableScopes property: A set of fully qualified Scopes at or below which Role Assignments may be
     * created using this Role Definition. This will allow application of this Role Definition on the entire database
     * account or any underlying Database / Collection. Must have at least one element. Scopes higher than Database
     * account are not enforceable as assignable Scopes. Note that resources referenced in assignable Scopes need not
     * exist.
     *
     * @return the assignableScopes value.
     */
    public List<String> assignableScopes() {
        return this.innerProperties() == null ? null : this.innerProperties().assignableScopes();
    }

    /**
     * Set the assignableScopes property: A set of fully qualified Scopes at or below which Role Assignments may be
     * created using this Role Definition. This will allow application of this Role Definition on the entire database
     * account or any underlying Database / Collection. Must have at least one element. Scopes higher than Database
     * account are not enforceable as assignable Scopes. Note that resources referenced in assignable Scopes need not
     * exist.
     *
     * @param assignableScopes the assignableScopes value to set.
     * @return the SqlRoleDefinitionGetResultsInner object itself.
     */
    public SqlRoleDefinitionGetResultsInner withAssignableScopes(List<String> assignableScopes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlRoleDefinitionResource();
        }
        this.innerProperties().withAssignableScopes(assignableScopes);
        return this;
    }

    /**
     * Get the permissions property: The set of operations allowed through this Role Definition.
     *
     * @return the permissions value.
     */
    public List<Permission> permissions() {
        return this.innerProperties() == null ? null : this.innerProperties().permissions();
    }

    /**
     * Set the permissions property: The set of operations allowed through this Role Definition.
     *
     * @param permissions the permissions value to set.
     * @return the SqlRoleDefinitionGetResultsInner object itself.
     */
    public SqlRoleDefinitionGetResultsInner withPermissions(List<Permission> permissions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlRoleDefinitionResource();
        }
        this.innerProperties().withPermissions(permissions);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
