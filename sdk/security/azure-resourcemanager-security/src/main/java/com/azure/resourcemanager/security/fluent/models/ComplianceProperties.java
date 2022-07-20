// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.security.models.ComplianceSegment;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The Compliance score (percentage) of a Subscription is a sum of all Resources' Compliances under the given
 * Subscription. A Resource Compliance is defined as the compliant ('healthy') Policy Definitions out of all Policy
 * Definitions applicable to a given resource.
 */
@Immutable
public final class ComplianceProperties {
    /*
     * The timestamp when the Compliance calculation was conducted.
     */
    @JsonProperty(value = "assessmentTimestampUtcDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime assessmentTimestampUtcDate;

    /*
     * The resource count of the given subscription for which the Compliance
     * calculation was conducted (needed for Management Group Compliance
     * calculation).
     */
    @JsonProperty(value = "resourceCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer resourceCount;

    /*
     * An array of segment, which is the actually the compliance assessment.
     */
    @JsonProperty(value = "assessmentResult", access = JsonProperty.Access.WRITE_ONLY)
    private List<ComplianceSegment> assessmentResult;

    /**
     * Get the assessmentTimestampUtcDate property: The timestamp when the Compliance calculation was conducted.
     *
     * @return the assessmentTimestampUtcDate value.
     */
    public OffsetDateTime assessmentTimestampUtcDate() {
        return this.assessmentTimestampUtcDate;
    }

    /**
     * Get the resourceCount property: The resource count of the given subscription for which the Compliance calculation
     * was conducted (needed for Management Group Compliance calculation).
     *
     * @return the resourceCount value.
     */
    public Integer resourceCount() {
        return this.resourceCount;
    }

    /**
     * Get the assessmentResult property: An array of segment, which is the actually the compliance assessment.
     *
     * @return the assessmentResult value.
     */
    public List<ComplianceSegment> assessmentResult() {
        return this.assessmentResult;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (assessmentResult() != null) {
            assessmentResult().forEach(e -> e.validate());
        }
    }
}
