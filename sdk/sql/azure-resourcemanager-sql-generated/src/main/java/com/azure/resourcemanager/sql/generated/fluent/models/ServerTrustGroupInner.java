// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.sql.generated.models.ServerInfo;
import com.azure.resourcemanager.sql.generated.models.ServerTrustGroupPropertiesTrustScopesItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A server trust group. */
@Fluent
public final class ServerTrustGroupInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private ServerTrustGroupProperties innerProperties;

    /** Creates an instance of ServerTrustGroupInner class. */
    public ServerTrustGroupInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private ServerTrustGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the groupMembers property: Group members information for the server trust group.
     *
     * @return the groupMembers value.
     */
    public List<ServerInfo> groupMembers() {
        return this.innerProperties() == null ? null : this.innerProperties().groupMembers();
    }

    /**
     * Set the groupMembers property: Group members information for the server trust group.
     *
     * @param groupMembers the groupMembers value to set.
     * @return the ServerTrustGroupInner object itself.
     */
    public ServerTrustGroupInner withGroupMembers(List<ServerInfo> groupMembers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerTrustGroupProperties();
        }
        this.innerProperties().withGroupMembers(groupMembers);
        return this;
    }

    /**
     * Get the trustScopes property: Trust scope of the server trust group.
     *
     * @return the trustScopes value.
     */
    public List<ServerTrustGroupPropertiesTrustScopesItem> trustScopes() {
        return this.innerProperties() == null ? null : this.innerProperties().trustScopes();
    }

    /**
     * Set the trustScopes property: Trust scope of the server trust group.
     *
     * @param trustScopes the trustScopes value to set.
     * @return the ServerTrustGroupInner object itself.
     */
    public ServerTrustGroupInner withTrustScopes(List<ServerTrustGroupPropertiesTrustScopesItem> trustScopes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerTrustGroupProperties();
        }
        this.innerProperties().withTrustScopes(trustScopes);
        return this;
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
