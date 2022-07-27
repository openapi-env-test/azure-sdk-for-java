// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** The ManagedIdentityAuthTypeWorkspaceConnectionProperties model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "authType")
@JsonTypeName("ManagedIdentity")
@Fluent
public final class ManagedIdentityAuthTypeWorkspaceConnectionProperties extends WorkspaceConnectionPropertiesV2 {
    /*
     * The credentials property.
     */
    @JsonProperty(value = "credentials")
    private WorkspaceConnectionManagedIdentity credentials;

    /**
     * Get the credentials property: The credentials property.
     *
     * @return the credentials value.
     */
    public WorkspaceConnectionManagedIdentity credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: The credentials property.
     *
     * @param credentials the credentials value to set.
     * @return the ManagedIdentityAuthTypeWorkspaceConnectionProperties object itself.
     */
    public ManagedIdentityAuthTypeWorkspaceConnectionProperties withCredentials(
        WorkspaceConnectionManagedIdentity credentials) {
        this.credentials = credentials;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedIdentityAuthTypeWorkspaceConnectionProperties withCategory(ConnectionCategory category) {
        super.withCategory(category);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedIdentityAuthTypeWorkspaceConnectionProperties withTarget(String target) {
        super.withTarget(target);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedIdentityAuthTypeWorkspaceConnectionProperties withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
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
        if (credentials() != null) {
            credentials().validate();
        }
    }
}
