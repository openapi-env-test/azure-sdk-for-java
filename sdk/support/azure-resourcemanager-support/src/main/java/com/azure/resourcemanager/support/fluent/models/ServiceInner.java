// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Object that represents a Service resource. */
@Fluent
public final class ServiceInner {
    /*
     * Id of the resource.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Name of the resource.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Type of the resource 'Microsoft.Support/services'.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Properties of the resource.
     */
    @JsonProperty(value = "properties")
    private ServiceProperties innerProperties;

    /**
     * Get the id property: Id of the resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: Name of the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Type of the resource 'Microsoft.Support/services'.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the innerProperties property: Properties of the resource.
     *
     * @return the innerProperties value.
     */
    private ServiceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the displayName property: Localized name of the Azure service.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: Localized name of the Azure service.
     *
     * @param displayName the displayName value to set.
     * @return the ServiceInner object itself.
     */
    public ServiceInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the resourceTypes property: ARM Resource types.
     *
     * @return the resourceTypes value.
     */
    public List<String> resourceTypes() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceTypes();
    }

    /**
     * Set the resourceTypes property: ARM Resource types.
     *
     * @param resourceTypes the resourceTypes value to set.
     * @return the ServiceInner object itself.
     */
    public ServiceInner withResourceTypes(List<String> resourceTypes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceProperties();
        }
        this.innerProperties().withResourceTypes(resourceTypes);
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
