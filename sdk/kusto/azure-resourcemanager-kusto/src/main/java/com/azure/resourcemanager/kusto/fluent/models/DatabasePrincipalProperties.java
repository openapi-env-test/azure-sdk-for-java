// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalRole;
import com.azure.resourcemanager.kusto.models.PrincipalType;
import com.azure.resourcemanager.kusto.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A class representing database principal property. */
@Fluent
public final class DatabasePrincipalProperties {
    /*
     * The principal ID assigned to the database principal. It can be a user
     * email, application ID, or security group name.
     */
    @JsonProperty(value = "principalId", required = true)
    private String principalId;

    /*
     * Database principal role.
     */
    @JsonProperty(value = "role", required = true)
    private DatabasePrincipalRole role;

    /*
     * The tenant id of the principal
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * Principal type.
     */
    @JsonProperty(value = "principalType", required = true)
    private PrincipalType principalType;

    /*
     * The tenant name of the principal
     */
    @JsonProperty(value = "tenantName", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantName;

    /*
     * The principal name
     */
    @JsonProperty(value = "principalName", access = JsonProperty.Access.WRITE_ONLY)
    private String principalName;

    /*
     * The provisioned state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the principalId property: The principal ID assigned to the database principal. It can be a user email,
     * application ID, or security group name.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: The principal ID assigned to the database principal. It can be a user email,
     * application ID, or security group name.
     *
     * @param principalId the principalId value to set.
     * @return the DatabasePrincipalProperties object itself.
     */
    public DatabasePrincipalProperties withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the role property: Database principal role.
     *
     * @return the role value.
     */
    public DatabasePrincipalRole role() {
        return this.role;
    }

    /**
     * Set the role property: Database principal role.
     *
     * @param role the role value to set.
     * @return the DatabasePrincipalProperties object itself.
     */
    public DatabasePrincipalProperties withRole(DatabasePrincipalRole role) {
        this.role = role;
        return this;
    }

    /**
     * Get the tenantId property: The tenant id of the principal.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenant id of the principal.
     *
     * @param tenantId the tenantId value to set.
     * @return the DatabasePrincipalProperties object itself.
     */
    public DatabasePrincipalProperties withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the principalType property: Principal type.
     *
     * @return the principalType value.
     */
    public PrincipalType principalType() {
        return this.principalType;
    }

    /**
     * Set the principalType property: Principal type.
     *
     * @param principalType the principalType value to set.
     * @return the DatabasePrincipalProperties object itself.
     */
    public DatabasePrincipalProperties withPrincipalType(PrincipalType principalType) {
        this.principalType = principalType;
        return this;
    }

    /**
     * Get the tenantName property: The tenant name of the principal.
     *
     * @return the tenantName value.
     */
    public String tenantName() {
        return this.tenantName;
    }

    /**
     * Get the principalName property: The principal name.
     *
     * @return the principalName value.
     */
    public String principalName() {
        return this.principalName;
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (principalId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property principalId in model DatabasePrincipalProperties"));
        }
        if (role() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property role in model DatabasePrincipalProperties"));
        }
        if (principalType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property principalType in model DatabasePrincipalProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DatabasePrincipalProperties.class);
}
