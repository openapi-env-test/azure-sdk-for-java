// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewDecisionServicePrincipalIdentity;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewDecisionUserIdentity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Target of the decision. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = AccessReviewDecisionIdentity.class)
@JsonTypeName("AccessReviewDecisionIdentity")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "user", value = AccessReviewDecisionUserIdentity.class),
    @JsonSubTypes.Type(name = "servicePrincipal", value = AccessReviewDecisionServicePrincipalIdentity.class)
})
@Immutable
public class AccessReviewDecisionIdentity {
    /*
     * The id of principal whose access was reviewed.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The display name of the user whose access was reviewed.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /**
     * Get the id property: The id of principal whose access was reviewed.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the displayName property: The display name of the user whose access was reviewed.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
