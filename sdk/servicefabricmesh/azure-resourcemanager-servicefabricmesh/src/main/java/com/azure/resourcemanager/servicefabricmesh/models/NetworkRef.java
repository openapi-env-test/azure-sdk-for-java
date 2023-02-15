// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmesh.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a network reference in a service. */
@Fluent
public final class NetworkRef {
    /*
     * Name of the network
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A list of endpoints that are exposed on this network.
     */
    @JsonProperty(value = "endpointRefs")
    private List<EndpointRef> endpointRefs;

    /** Creates an instance of NetworkRef class. */
    public NetworkRef() {
    }

    /**
     * Get the name property: Name of the network.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the network.
     *
     * @param name the name value to set.
     * @return the NetworkRef object itself.
     */
    public NetworkRef withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the endpointRefs property: A list of endpoints that are exposed on this network.
     *
     * @return the endpointRefs value.
     */
    public List<EndpointRef> endpointRefs() {
        return this.endpointRefs;
    }

    /**
     * Set the endpointRefs property: A list of endpoints that are exposed on this network.
     *
     * @param endpointRefs the endpointRefs value to set.
     * @return the NetworkRef object itself.
     */
    public NetworkRef withEndpointRefs(List<EndpointRef> endpointRefs) {
        this.endpointRefs = endpointRefs;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpointRefs() != null) {
            endpointRefs().forEach(e -> e.validate());
        }
    }
}
