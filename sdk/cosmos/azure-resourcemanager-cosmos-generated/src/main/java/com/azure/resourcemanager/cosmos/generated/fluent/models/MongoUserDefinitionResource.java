// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.generated.models.Role;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Azure Cosmos DB Mongo User Definition resource object. */
@Fluent
public final class MongoUserDefinitionResource {
    /*
     * The user name for User Definition.
     */
    @JsonProperty(value = "userName")
    private String username;

    /*
     * The password for User Definition. Response does not contain user
     * password.
     */
    @JsonProperty(value = "password")
    private String password;

    /*
     * The database name for which access is being granted for this User
     * Definition.
     */
    @JsonProperty(value = "databaseName")
    private String databaseName;

    /*
     * A custom definition for the USer Definition.
     */
    @JsonProperty(value = "customData")
    private String customData;

    /*
     * The set of roles inherited by the User Definition.
     */
    @JsonProperty(value = "roles")
    private List<Role> roles;

    /*
     * The Mongo Auth mechanism. For now, we only support auth mechanism
     * SCRAM-SHA-256.
     */
    @JsonProperty(value = "mechanisms")
    private String mechanisms;

    /**
     * Get the username property: The user name for User Definition.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: The user name for User Definition.
     *
     * @param username the username value to set.
     * @return the MongoUserDefinitionResource object itself.
     */
    public MongoUserDefinitionResource withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password for User Definition. Response does not contain user password.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The password for User Definition. Response does not contain user password.
     *
     * @param password the password value to set.
     * @return the MongoUserDefinitionResource object itself.
     */
    public MongoUserDefinitionResource withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the databaseName property: The database name for which access is being granted for this User Definition.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName property: The database name for which access is being granted for this User Definition.
     *
     * @param databaseName the databaseName value to set.
     * @return the MongoUserDefinitionResource object itself.
     */
    public MongoUserDefinitionResource withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the customData property: A custom definition for the USer Definition.
     *
     * @return the customData value.
     */
    public String customData() {
        return this.customData;
    }

    /**
     * Set the customData property: A custom definition for the USer Definition.
     *
     * @param customData the customData value to set.
     * @return the MongoUserDefinitionResource object itself.
     */
    public MongoUserDefinitionResource withCustomData(String customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Get the roles property: The set of roles inherited by the User Definition.
     *
     * @return the roles value.
     */
    public List<Role> roles() {
        return this.roles;
    }

    /**
     * Set the roles property: The set of roles inherited by the User Definition.
     *
     * @param roles the roles value to set.
     * @return the MongoUserDefinitionResource object itself.
     */
    public MongoUserDefinitionResource withRoles(List<Role> roles) {
        this.roles = roles;
        return this;
    }

    /**
     * Get the mechanisms property: The Mongo Auth mechanism. For now, we only support auth mechanism SCRAM-SHA-256.
     *
     * @return the mechanisms value.
     */
    public String mechanisms() {
        return this.mechanisms;
    }

    /**
     * Set the mechanisms property: The Mongo Auth mechanism. For now, we only support auth mechanism SCRAM-SHA-256.
     *
     * @param mechanisms the mechanisms value to set.
     * @return the MongoUserDefinitionResource object itself.
     */
    public MongoUserDefinitionResource withMechanisms(String mechanisms) {
        this.mechanisms = mechanisms;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (roles() != null) {
            roles().forEach(e -> e.validate());
        }
    }
}
