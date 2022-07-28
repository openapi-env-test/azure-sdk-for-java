// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Represents a server to be created. */
@Fluent
public final class ServerForCreate {
    /*
     * The Azure Active Directory identity of the server.
     */
    @JsonProperty(value = "identity")
    private ResourceIdentity identity;

    /*
     * The SKU (pricing tier) of the server.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Properties of the server.
     */
    @JsonProperty(value = "properties", required = true)
    private ServerPropertiesForCreate properties;

    /*
     * The location the resource resides in.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * Application-specific metadata in the form of key-value pairs.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /**
     * Get the identity property: The Azure Active Directory identity of the server.
     *
     * @return the identity value.
     */
    public ResourceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The Azure Active Directory identity of the server.
     *
     * @param identity the identity value to set.
     * @return the ServerForCreate object itself.
     */
    public ServerForCreate withIdentity(ResourceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the sku property: The SKU (pricing tier) of the server.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU (pricing tier) of the server.
     *
     * @param sku the sku value to set.
     * @return the ServerForCreate object itself.
     */
    public ServerForCreate withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the properties property: Properties of the server.
     *
     * @return the properties value.
     */
    public ServerPropertiesForCreate properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the server.
     *
     * @param properties the properties value to set.
     * @return the ServerForCreate object itself.
     */
    public ServerForCreate withProperties(ServerPropertiesForCreate properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the location property: The location the resource resides in.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location the resource resides in.
     *
     * @param location the location value to set.
     * @return the ServerForCreate object itself.
     */
    public ServerForCreate withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: Application-specific metadata in the form of key-value pairs.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Application-specific metadata in the form of key-value pairs.
     *
     * @param tags the tags value to set.
     * @return the ServerForCreate object itself.
     */
    public ServerForCreate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
        if (properties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property properties in model ServerForCreate"));
        } else {
            properties().validate();
        }
        if (location() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property location in model ServerForCreate"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServerForCreate.class);
}
