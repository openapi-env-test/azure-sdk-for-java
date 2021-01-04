// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerregistry.generated.models.ExportPipelineTargetProperties;
import com.azure.resourcemanager.containerregistry.generated.models.IdentityProperties;
import com.azure.resourcemanager.containerregistry.generated.models.PipelineOptions;
import com.azure.resourcemanager.containerregistry.generated.models.ProvisioningState;
import com.azure.resourcemanager.containerregistry.generated.models.SystemData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An object that represents an export pipeline for a container registry. */
@JsonFlatten
@Fluent
public class ExportPipelineInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExportPipelineInner.class);

    /*
     * The location of the export pipeline.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * The identity of the export pipeline.
     */
    @JsonProperty(value = "identity")
    private IdentityProperties identity;

    /*
     * The target properties of the export pipeline.
     */
    @JsonProperty(value = "properties.target")
    private ExportPipelineTargetProperties target;

    /*
     * The list of all options configured for the pipeline.
     */
    @JsonProperty(value = "properties.options")
    private List<PipelineOptions> options;

    /*
     * The provisioning state of the pipeline at the time the operation was
     * called.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the location property: The location of the export pipeline.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the export pipeline.
     *
     * @param location the location value to set.
     * @return the ExportPipelineInner object itself.
     */
    public ExportPipelineInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the identity property: The identity of the export pipeline.
     *
     * @return the identity value.
     */
    public IdentityProperties identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the export pipeline.
     *
     * @param identity the identity value to set.
     * @return the ExportPipelineInner object itself.
     */
    public ExportPipelineInner withIdentity(IdentityProperties identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the target property: The target properties of the export pipeline.
     *
     * @return the target value.
     */
    public ExportPipelineTargetProperties target() {
        return this.target;
    }

    /**
     * Set the target property: The target properties of the export pipeline.
     *
     * @param target the target value to set.
     * @return the ExportPipelineInner object itself.
     */
    public ExportPipelineInner withTarget(ExportPipelineTargetProperties target) {
        this.target = target;
        return this;
    }

    /**
     * Get the options property: The list of all options configured for the pipeline.
     *
     * @return the options value.
     */
    public List<PipelineOptions> options() {
        return this.options;
    }

    /**
     * Set the options property: The list of all options configured for the pipeline.
     *
     * @param options the options value to set.
     * @return the ExportPipelineInner object itself.
     */
    public ExportPipelineInner withOptions(List<PipelineOptions> options) {
        this.options = options;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the pipeline at the time the operation was called.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
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
        if (identity() != null) {
            identity().validate();
        }
        if (target() != null) {
            target().validate();
        }
        if (systemData() != null) {
            systemData().validate();
        }
    }
}
