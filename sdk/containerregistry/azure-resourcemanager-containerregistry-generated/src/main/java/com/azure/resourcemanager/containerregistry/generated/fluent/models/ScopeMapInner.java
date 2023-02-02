// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.containerregistry.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** An object that represents a scope map for a container registry. */
@Fluent
public final class ScopeMapInner extends ProxyResource {
    /*
     * The properties of the scope map.
     */
    @JsonProperty(value = "properties")
    private ScopeMapProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of ScopeMapInner class. */
    public ScopeMapInner() {
    }

    /**
     * Get the innerProperties property: The properties of the scope map.
     *
     * @return the innerProperties value.
     */
    private ScopeMapProperties innerProperties() {
        return this.innerProperties;
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
     * Get the description property: The user friendly description of the scope map.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The user friendly description of the scope map.
     *
     * @param description the description value to set.
     * @return the ScopeMapInner object itself.
     */
    public ScopeMapInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScopeMapProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the type property: The type of the scope map. E.g. BuildIn scope map.
     *
     * @return the type value.
     */
    public String typePropertiesType() {
        return this.innerProperties() == null ? null : this.innerProperties().type();
    }

    /**
     * Get the creationDate property: The creation date of scope map.
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().creationDate();
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the actions property: The list of scoped permissions for registry artifacts. E.g.
     * repositories/repository-name/content/read, repositories/repository-name/metadata/write.
     *
     * @return the actions value.
     */
    public List<String> actions() {
        return this.innerProperties() == null ? null : this.innerProperties().actions();
    }

    /**
     * Set the actions property: The list of scoped permissions for registry artifacts. E.g.
     * repositories/repository-name/content/read, repositories/repository-name/metadata/write.
     *
     * @param actions the actions value to set.
     * @return the ScopeMapInner object itself.
     */
    public ScopeMapInner withActions(List<String> actions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScopeMapProperties();
        }
        this.innerProperties().withActions(actions);
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
