// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.authorization.generated.fluent.models.AccessReviewDecisionInsightProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Access Review Decision Insight. */
@Fluent
public final class AccessReviewDecisionInsight extends ProxyResource {
    /*
     * Access Review Decision Insight properties.
     */
    @JsonProperty(value = "properties")
    private AccessReviewDecisionInsightProperties innerProperties;

    /**
     * Get the innerProperties property: Access Review Decision Insight properties.
     *
     * @return the innerProperties value.
     */
    private AccessReviewDecisionInsightProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the insightCreatedDateTime property: Date Time when the insight was created.
     *
     * @return the insightCreatedDateTime value.
     */
    public Object insightCreatedDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().insightCreatedDateTime();
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
