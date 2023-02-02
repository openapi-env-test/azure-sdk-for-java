// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.datamigration.models.ProjectTaskProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A task resource. */
@Fluent
public final class ProjectTaskInner extends ProxyResource {
    /*
     * HTTP strong entity tag value. This is ignored if submitted.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Custom task properties
     */
    @JsonProperty(value = "properties")
    private ProjectTaskProperties properties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of ProjectTaskInner class. */
    public ProjectTaskInner() {
    }

    /**
     * Get the etag property: HTTP strong entity tag value. This is ignored if submitted.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: HTTP strong entity tag value. This is ignored if submitted.
     *
     * @param etag the etag value to set.
     * @return the ProjectTaskInner object itself.
     */
    public ProjectTaskInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the properties property: Custom task properties.
     *
     * @return the properties value.
     */
    public ProjectTaskProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Custom task properties.
     *
     * @param properties the properties value to set.
     * @return the ProjectTaskInner object itself.
     */
    public ProjectTaskInner withProperties(ProjectTaskProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
