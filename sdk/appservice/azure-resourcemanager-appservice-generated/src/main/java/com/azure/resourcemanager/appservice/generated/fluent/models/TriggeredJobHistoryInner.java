// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.generated.models.TriggeredJobRun;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Triggered Web Job History. List of Triggered Web Job Run Information elements. */
@JsonFlatten
@Fluent
public class TriggeredJobHistoryInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TriggeredJobHistoryInner.class);

    /*
     * List of triggered web job runs.
     */
    @JsonProperty(value = "properties.runs")
    private List<TriggeredJobRun> runs;

    /**
     * Get the runs property: List of triggered web job runs.
     *
     * @return the runs value.
     */
    public List<TriggeredJobRun> runs() {
        return this.runs;
    }

    /**
     * Set the runs property: List of triggered web job runs.
     *
     * @param runs the runs value to set.
     * @return the TriggeredJobHistoryInner object itself.
     */
    public TriggeredJobHistoryInner withRuns(List<TriggeredJobRun> runs) {
        this.runs = runs;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TriggeredJobHistoryInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (runs() != null) {
            runs().forEach(e -> e.validate());
        }
    }
}
