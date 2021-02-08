// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Details the service to which the subnet is delegated. */
@JsonFlatten
@Fluent
public class Delegation extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Delegation.class);

    /*
     * The name of the resource that is unique within a subnet. This name can
     * be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * The name of the service to whom the subnet should be delegated (e.g.
     * Microsoft.Sql/servers)
     */
    @JsonProperty(value = "properties.serviceName")
    private String serviceName;

    /*
     * Describes the actions permitted to the service upon delegation
     */
    @JsonProperty(value = "properties.actions")
    private List<String> actions;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the name property: The name of the resource that is unique within a subnet. This name can be used to access
     * the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a subnet. This name can be used to access
     * the resource.
     *
     * @param name the name value to set.
     * @return the Delegation object itself.
     */
    public Delegation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the Delegation object itself.
     */
    public Delegation withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the serviceName property: The name of the service to whom the subnet should be delegated (e.g.
     * Microsoft.Sql/servers).
     *
     * @return the serviceName value.
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: The name of the service to whom the subnet should be delegated (e.g.
     * Microsoft.Sql/servers).
     *
     * @param serviceName the serviceName value to set.
     * @return the Delegation object itself.
     */
    public Delegation withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the actions property: Describes the actions permitted to the service upon delegation.
     *
     * @return the actions value.
     */
    public List<String> actions() {
        return this.actions;
    }

    /**
     * Set the actions property: Describes the actions permitted to the service upon delegation.
     *
     * @param actions the actions value to set.
     * @return the Delegation object itself.
     */
    public Delegation withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public Delegation withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
