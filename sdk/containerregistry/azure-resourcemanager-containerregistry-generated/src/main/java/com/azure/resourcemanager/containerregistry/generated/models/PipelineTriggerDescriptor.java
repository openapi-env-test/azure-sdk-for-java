// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PipelineTriggerDescriptor model. */
@Fluent
public final class PipelineTriggerDescriptor {
    /*
     * The source trigger that caused the pipeline run.
     */
    @JsonProperty(value = "sourceTrigger")
    private PipelineSourceTriggerDescriptor sourceTrigger;

    /** Creates an instance of PipelineTriggerDescriptor class. */
    public PipelineTriggerDescriptor() {
    }

    /**
     * Get the sourceTrigger property: The source trigger that caused the pipeline run.
     *
     * @return the sourceTrigger value.
     */
    public PipelineSourceTriggerDescriptor sourceTrigger() {
        return this.sourceTrigger;
    }

    /**
     * Set the sourceTrigger property: The source trigger that caused the pipeline run.
     *
     * @param sourceTrigger the sourceTrigger value to set.
     * @return the PipelineTriggerDescriptor object itself.
     */
    public PipelineTriggerDescriptor withSourceTrigger(PipelineSourceTriggerDescriptor sourceTrigger) {
        this.sourceTrigger = sourceTrigger;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceTrigger() != null) {
            sourceTrigger().validate();
        }
    }
}
