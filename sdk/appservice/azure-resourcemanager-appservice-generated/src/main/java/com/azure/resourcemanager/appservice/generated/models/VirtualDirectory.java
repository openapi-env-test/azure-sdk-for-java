// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VirtualDirectory model. */
@Fluent
public final class VirtualDirectory {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualDirectory.class);

    /*
     * The virtualPath property.
     */
    @JsonProperty(value = "virtualPath")
    private String virtualPath;

    /*
     * The physicalPath property.
     */
    @JsonProperty(value = "physicalPath")
    private String physicalPath;

    /**
     * Get the virtualPath property: The virtualPath property.
     *
     * @return the virtualPath value.
     */
    public String virtualPath() {
        return this.virtualPath;
    }

    /**
     * Set the virtualPath property: The virtualPath property.
     *
     * @param virtualPath the virtualPath value to set.
     * @return the VirtualDirectory object itself.
     */
    public VirtualDirectory withVirtualPath(String virtualPath) {
        this.virtualPath = virtualPath;
        return this;
    }

    /**
     * Get the physicalPath property: The physicalPath property.
     *
     * @return the physicalPath value.
     */
    public String physicalPath() {
        return this.physicalPath;
    }

    /**
     * Set the physicalPath property: The physicalPath property.
     *
     * @param physicalPath the physicalPath value to set.
     * @return the VirtualDirectory object itself.
     */
    public VirtualDirectory withPhysicalPath(String physicalPath) {
        this.physicalPath = physicalPath;
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
