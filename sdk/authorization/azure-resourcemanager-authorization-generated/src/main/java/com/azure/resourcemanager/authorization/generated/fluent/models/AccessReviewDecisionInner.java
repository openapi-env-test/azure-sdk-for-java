// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.authorization.generated.models.AccessRecommendationType;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewActorIdentityType;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewApplyResult;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewDecisionInsight;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewDecisionPrincipalResourceMembershipType;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewResult;
import com.azure.resourcemanager.authorization.generated.models.DecisionResourceType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Access Review. */
@Fluent
public final class AccessReviewDecisionInner extends ProxyResource {
    /*
     * Access Review Decision properties.
     */
    @JsonProperty(value = "properties")
    private AccessReviewDecisionProperties innerProperties;

    /**
     * Get the innerProperties property: Access Review Decision properties.
     *
     * @return the innerProperties value.
     */
    private AccessReviewDecisionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the recommendation property: The feature- generated recommendation shown to the reviewer.
     *
     * @return the recommendation value.
     */
    public AccessRecommendationType recommendation() {
        return this.innerProperties() == null ? null : this.innerProperties().recommendation();
    }

    /**
     * Get the decision property: The decision on the approval step. This value is initially set to NotReviewed.
     * Approvers can take action of Approve/Deny.
     *
     * @return the decision value.
     */
    public AccessReviewResult decision() {
        return this.innerProperties() == null ? null : this.innerProperties().decision();
    }

    /**
     * Set the decision property: The decision on the approval step. This value is initially set to NotReviewed.
     * Approvers can take action of Approve/Deny.
     *
     * @param decision the decision value to set.
     * @return the AccessReviewDecisionInner object itself.
     */
    public AccessReviewDecisionInner withDecision(AccessReviewResult decision) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewDecisionProperties();
        }
        this.innerProperties().withDecision(decision);
        return this;
    }

    /**
     * Get the justification property: Justification provided by approvers for their action.
     *
     * @return the justification value.
     */
    public String justification() {
        return this.innerProperties() == null ? null : this.innerProperties().justification();
    }

    /**
     * Set the justification property: Justification provided by approvers for their action.
     *
     * @param justification the justification value to set.
     * @return the AccessReviewDecisionInner object itself.
     */
    public AccessReviewDecisionInner withJustification(String justification) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewDecisionProperties();
        }
        this.innerProperties().withJustification(justification);
        return this;
    }

    /**
     * Get the reviewedDateTime property: Date Time when a decision was taken.
     *
     * @return the reviewedDateTime value.
     */
    public OffsetDateTime reviewedDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().reviewedDateTime();
    }

    /**
     * Get the applyResult property: The outcome of applying the decision.
     *
     * @return the applyResult value.
     */
    public AccessReviewApplyResult applyResult() {
        return this.innerProperties() == null ? null : this.innerProperties().applyResult();
    }

    /**
     * Get the appliedDateTime property: The date and time when the review decision was applied.
     *
     * @return the appliedDateTime value.
     */
    public OffsetDateTime appliedDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().appliedDateTime();
    }

    /**
     * Get the insights property: This is the collection of insights for this decision item.
     *
     * @return the insights value.
     */
    public List<AccessReviewDecisionInsight> insights() {
        return this.innerProperties() == null ? null : this.innerProperties().insights();
    }

    /**
     * Set the insights property: This is the collection of insights for this decision item.
     *
     * @param insights the insights value to set.
     * @return the AccessReviewDecisionInner object itself.
     */
    public AccessReviewDecisionInner withInsights(List<AccessReviewDecisionInsight> insights) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewDecisionProperties();
        }
        this.innerProperties().withInsights(insights);
        return this;
    }

    /**
     * Get the id property: The id of principal whose access was reviewed.
     *
     * @return the id value.
     */
    public String idPropertiesId() {
        return this.innerProperties() == null ? null : this.innerProperties().id();
    }

    /**
     * Get the displayName property: The display name of the user whose access was reviewed.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Get the type property: The type of resource.
     *
     * @return the type value.
     */
    public DecisionResourceType typePropertiesType() {
        return this.innerProperties() == null ? null : this.innerProperties().type();
    }

    /**
     * Get the idResourceId property: The id of resource associated with a decision record.
     *
     * @return the idResourceId value.
     */
    public String idResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().idResourceId();
    }

    /**
     * Get the displayNameResourceDisplayName property: The display name of resource associated with a decision record.
     *
     * @return the displayNameResourceDisplayName value.
     */
    public String displayNameResourceDisplayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayNameResourceDisplayName();
    }

    /**
     * Get the principalId property: The identity id.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.innerProperties() == null ? null : this.innerProperties().principalId();
    }

    /**
     * Get the principalType property: The identity type : user/servicePrincipal.
     *
     * @return the principalType value.
     */
    public AccessReviewActorIdentityType principalType() {
        return this.innerProperties() == null ? null : this.innerProperties().principalType();
    }

    /**
     * Get the principalName property: The identity display name.
     *
     * @return the principalName value.
     */
    public String principalName() {
        return this.innerProperties() == null ? null : this.innerProperties().principalName();
    }

    /**
     * Get the userPrincipalName property: The user principal name(if valid).
     *
     * @return the userPrincipalName value.
     */
    public String userPrincipalName() {
        return this.innerProperties() == null ? null : this.innerProperties().userPrincipalName();
    }

    /**
     * Get the principalIdAppliedByPrincipalId property: The identity id.
     *
     * @return the principalIdAppliedByPrincipalId value.
     */
    public String principalIdAppliedByPrincipalId() {
        return this.innerProperties() == null ? null : this.innerProperties().principalIdAppliedByPrincipalId();
    }

    /**
     * Get the principalTypeAppliedByPrincipalType property: The identity type : user/servicePrincipal.
     *
     * @return the principalTypeAppliedByPrincipalType value.
     */
    public AccessReviewActorIdentityType principalTypeAppliedByPrincipalType() {
        return this.innerProperties() == null ? null : this.innerProperties().principalTypeAppliedByPrincipalType();
    }

    /**
     * Get the principalNameAppliedByPrincipalName property: The identity display name.
     *
     * @return the principalNameAppliedByPrincipalName value.
     */
    public String principalNameAppliedByPrincipalName() {
        return this.innerProperties() == null ? null : this.innerProperties().principalNameAppliedByPrincipalName();
    }

    /**
     * Get the userPrincipalNameAppliedByUserPrincipalName property: The user principal name(if valid).
     *
     * @return the userPrincipalNameAppliedByUserPrincipalName value.
     */
    public String userPrincipalNameAppliedByUserPrincipalName() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().userPrincipalNameAppliedByUserPrincipalName();
    }

    /**
     * Get the membershipTypes property: Every decision item in an access review represents a principal's membership to
     * a resource. This property represents details of the membership. Examples of this detail might be whether the
     * principal has direct access or indirect access.
     *
     * @return the membershipTypes value.
     */
    public List<AccessReviewDecisionPrincipalResourceMembershipType> membershipTypes() {
        return this.innerProperties() == null ? null : this.innerProperties().membershipTypes();
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
