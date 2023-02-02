// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.ReplicationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The result of a request to list replications for a container registry. */
@Fluent
public final class ReplicationListResult {
    /*
     * The list of replications. Since this list may be incomplete, the nextLink field should be used to request the
     * next list of replications.
     */
    @JsonProperty(value = "value")
    private List<ReplicationInner> value;

    /*
     * The URI that can be used to request the next list of replications.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of ReplicationListResult class. */
    public ReplicationListResult() {
    }

    /**
     * Get the value property: The list of replications. Since this list may be incomplete, the nextLink field should be
     * used to request the next list of replications.
     *
     * @return the value value.
     */
    public List<ReplicationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of replications. Since this list may be incomplete, the nextLink field should be
     * used to request the next list of replications.
     *
     * @param value the value value to set.
     * @return the ReplicationListResult object itself.
     */
    public ReplicationListResult withValue(List<ReplicationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI that can be used to request the next list of replications.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI that can be used to request the next list of replications.
     *
     * @param nextLink the nextLink value to set.
     * @return the ReplicationListResult object itself.
     */
    public ReplicationListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
