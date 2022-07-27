// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** The WorkspaceConnectionPropertiesV2 model. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "authType",
    defaultImpl = WorkspaceConnectionPropertiesV2.class)
@JsonTypeName("WorkspaceConnectionPropertiesV2")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "PAT", value = PatAuthTypeWorkspaceConnectionProperties.class),
    @JsonSubTypes.Type(name = "SAS", value = SasAuthTypeWorkspaceConnectionProperties.class),
    @JsonSubTypes.Type(name = "UsernamePassword", value = UsernamePasswordAuthTypeWorkspaceConnectionProperties.class),
    @JsonSubTypes.Type(name = "None", value = NoneAuthTypeWorkspaceConnectionProperties.class),
    @JsonSubTypes.Type(name = "ManagedIdentity", value = ManagedIdentityAuthTypeWorkspaceConnectionProperties.class)
})
@Fluent
public class WorkspaceConnectionPropertiesV2 {
    /*
     * Category of the connection
     */
    @JsonProperty(value = "category")
    private ConnectionCategory category;

    /*
     * The target property.
     */
    @JsonProperty(value = "target")
    private String target;

    /*
     * Dictionary of <AnyObject>
     */
    @JsonProperty(value = "metadata")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> metadata;

    /**
     * Get the category property: Category of the connection.
     *
     * @return the category value.
     */
    public ConnectionCategory category() {
        return this.category;
    }

    /**
     * Set the category property: Category of the connection.
     *
     * @param category the category value to set.
     * @return the WorkspaceConnectionPropertiesV2 object itself.
     */
    public WorkspaceConnectionPropertiesV2 withCategory(ConnectionCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Get the target property: The target property.
     *
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target property: The target property.
     *
     * @param target the target value to set.
     * @return the WorkspaceConnectionPropertiesV2 object itself.
     */
    public WorkspaceConnectionPropertiesV2 withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the metadata property: Dictionary of &lt;AnyObject&gt;.
     *
     * @return the metadata value.
     */
    public Map<String, Object> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Dictionary of &lt;AnyObject&gt;.
     *
     * @param metadata the metadata value to set.
     * @return the WorkspaceConnectionPropertiesV2 object itself.
     */
    public WorkspaceConnectionPropertiesV2 withMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
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
