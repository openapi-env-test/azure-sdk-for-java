// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.models.ServerInfo;
import com.azure.resourcemanager.sql.generated.models.ServerTrustGroupPropertiesTrustScopesItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of a server trust group. */
@Fluent
public final class ServerTrustGroupProperties {
    /*
     * Group members information for the server trust group.
     */
    @JsonProperty(value = "groupMembers", required = true)
    private List<ServerInfo> groupMembers;

    /*
     * Trust scope of the server trust group.
     */
    @JsonProperty(value = "trustScopes", required = true)
    private List<ServerTrustGroupPropertiesTrustScopesItem> trustScopes;

    /**
     * Get the groupMembers property: Group members information for the server trust group.
     *
     * @return the groupMembers value.
     */
    public List<ServerInfo> groupMembers() {
        return this.groupMembers;
    }

    /**
     * Set the groupMembers property: Group members information for the server trust group.
     *
     * @param groupMembers the groupMembers value to set.
     * @return the ServerTrustGroupProperties object itself.
     */
    public ServerTrustGroupProperties withGroupMembers(List<ServerInfo> groupMembers) {
        this.groupMembers = groupMembers;
        return this;
    }

    /**
     * Get the trustScopes property: Trust scope of the server trust group.
     *
     * @return the trustScopes value.
     */
    public List<ServerTrustGroupPropertiesTrustScopesItem> trustScopes() {
        return this.trustScopes;
    }

    /**
     * Set the trustScopes property: Trust scope of the server trust group.
     *
     * @param trustScopes the trustScopes value to set.
     * @return the ServerTrustGroupProperties object itself.
     */
    public ServerTrustGroupProperties withTrustScopes(List<ServerTrustGroupPropertiesTrustScopesItem> trustScopes) {
        this.trustScopes = trustScopes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (groupMembers() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property groupMembers in model ServerTrustGroupProperties"));
        } else {
            groupMembers().forEach(e -> e.validate());
        }
        if (trustScopes() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property trustScopes in model ServerTrustGroupProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServerTrustGroupProperties.class);
}
