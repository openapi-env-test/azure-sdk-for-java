// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.mysqlflexibleserver.models.ServerKeyType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** A MySQL Server key. */
@Fluent
public final class ServerKeyInner extends ProxyResource {
    /*
     * Kind of encryption protector used to protect the key.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * Properties of the ServerKey Resource.
     */
    @JsonProperty(value = "properties")
    private ServerKeyProperties innerProperties;

    /**
     * Get the kind property: Kind of encryption protector used to protect the key.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the innerProperties property: Properties of the ServerKey Resource.
     *
     * @return the innerProperties value.
     */
    private ServerKeyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the serverKeyType property: The key type like 'AzureKeyVault'.
     *
     * @return the serverKeyType value.
     */
    public ServerKeyType serverKeyType() {
        return this.innerProperties() == null ? null : this.innerProperties().serverKeyType();
    }

    /**
     * Set the serverKeyType property: The key type like 'AzureKeyVault'.
     *
     * @param serverKeyType the serverKeyType value to set.
     * @return the ServerKeyInner object itself.
     */
    public ServerKeyInner withServerKeyType(ServerKeyType serverKeyType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerKeyProperties();
        }
        this.innerProperties().withServerKeyType(serverKeyType);
        return this;
    }

    /**
     * Get the uri property: The URI of the key.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.innerProperties() == null ? null : this.innerProperties().uri();
    }

    /**
     * Set the uri property: The URI of the key.
     *
     * @param uri the uri value to set.
     * @return the ServerKeyInner object itself.
     */
    public ServerKeyInner withUri(String uri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerKeyProperties();
        }
        this.innerProperties().withUri(uri);
        return this;
    }

    /**
     * Get the creationDate property: The key creation date.
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().creationDate();
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
