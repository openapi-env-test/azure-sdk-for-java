// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewScopeAssignmentState;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewScopePrincipalType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** Descriptor for what needs to be reviewed. */
@Fluent
public final class AccessReviewScope {
    /*
     * ResourceId in which this review is getting created
     */
    @JsonProperty(value = "resourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceId;

    /*
     * This is used to indicate the role being reviewed
     */
    @JsonProperty(value = "roleDefinitionId", access = JsonProperty.Access.WRITE_ONLY)
    private String roleDefinitionId;

    /*
     * The identity type user/servicePrincipal to review
     */
    @JsonProperty(value = "principalType", access = JsonProperty.Access.WRITE_ONLY)
    private AccessReviewScopePrincipalType principalType;

    /*
     * The role assignment state eligible/active to review
     */
    @JsonProperty(value = "assignmentState", access = JsonProperty.Access.WRITE_ONLY)
    private AccessReviewScopeAssignmentState assignmentState;

    /*
     * Duration users are inactive for. The value should be in ISO  8601 format
     * (http://en.wikipedia.org/wiki/ISO_8601#Durations).This code can be used
     * to convert TimeSpan to a valid interval string: XmlConvert.ToString(new
     * TimeSpan(hours, minutes, seconds))
     */
    @JsonProperty(value = "inactiveDuration")
    private Duration inactiveDuration;

    /*
     * Flag to indicate whether to expand nested memberships or not.
     */
    @JsonProperty(value = "expandNestedMemberships")
    private Boolean expandNestedMemberships;

    /*
     * Flag to indicate whether to expand nested memberships or not.
     */
    @JsonProperty(value = "includeInheritedAccess")
    private Boolean includeInheritedAccess;

    /*
     * Flag to indicate whether to expand nested memberships or not.
     */
    @JsonProperty(value = "includeAccessBelowResource")
    private Boolean includeAccessBelowResource;

    /*
     * This is used to indicate the resource id(s) to exclude
     */
    @JsonProperty(value = "excludeResourceId")
    private String excludeResourceId;

    /*
     * This is used to indicate the role definition id(s) to exclude
     */
    @JsonProperty(value = "excludeRoleDefinitionId")
    private String excludeRoleDefinitionId;

    /**
     * Get the resourceId property: ResourceId in which this review is getting created.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Get the roleDefinitionId property: This is used to indicate the role being reviewed.
     *
     * @return the roleDefinitionId value.
     */
    public String roleDefinitionId() {
        return this.roleDefinitionId;
    }

    /**
     * Get the principalType property: The identity type user/servicePrincipal to review.
     *
     * @return the principalType value.
     */
    public AccessReviewScopePrincipalType principalType() {
        return this.principalType;
    }

    /**
     * Get the assignmentState property: The role assignment state eligible/active to review.
     *
     * @return the assignmentState value.
     */
    public AccessReviewScopeAssignmentState assignmentState() {
        return this.assignmentState;
    }

    /**
     * Get the inactiveDuration property: Duration users are inactive for. The value should be in ISO 8601 format
     * (http://en.wikipedia.org/wiki/ISO_8601#Durations).This code can be used to convert TimeSpan to a valid interval
     * string: XmlConvert.ToString(new TimeSpan(hours, minutes, seconds)).
     *
     * @return the inactiveDuration value.
     */
    public Duration inactiveDuration() {
        return this.inactiveDuration;
    }

    /**
     * Set the inactiveDuration property: Duration users are inactive for. The value should be in ISO 8601 format
     * (http://en.wikipedia.org/wiki/ISO_8601#Durations).This code can be used to convert TimeSpan to a valid interval
     * string: XmlConvert.ToString(new TimeSpan(hours, minutes, seconds)).
     *
     * @param inactiveDuration the inactiveDuration value to set.
     * @return the AccessReviewScope object itself.
     */
    public AccessReviewScope withInactiveDuration(Duration inactiveDuration) {
        this.inactiveDuration = inactiveDuration;
        return this;
    }

    /**
     * Get the expandNestedMemberships property: Flag to indicate whether to expand nested memberships or not.
     *
     * @return the expandNestedMemberships value.
     */
    public Boolean expandNestedMemberships() {
        return this.expandNestedMemberships;
    }

    /**
     * Set the expandNestedMemberships property: Flag to indicate whether to expand nested memberships or not.
     *
     * @param expandNestedMemberships the expandNestedMemberships value to set.
     * @return the AccessReviewScope object itself.
     */
    public AccessReviewScope withExpandNestedMemberships(Boolean expandNestedMemberships) {
        this.expandNestedMemberships = expandNestedMemberships;
        return this;
    }

    /**
     * Get the includeInheritedAccess property: Flag to indicate whether to expand nested memberships or not.
     *
     * @return the includeInheritedAccess value.
     */
    public Boolean includeInheritedAccess() {
        return this.includeInheritedAccess;
    }

    /**
     * Set the includeInheritedAccess property: Flag to indicate whether to expand nested memberships or not.
     *
     * @param includeInheritedAccess the includeInheritedAccess value to set.
     * @return the AccessReviewScope object itself.
     */
    public AccessReviewScope withIncludeInheritedAccess(Boolean includeInheritedAccess) {
        this.includeInheritedAccess = includeInheritedAccess;
        return this;
    }

    /**
     * Get the includeAccessBelowResource property: Flag to indicate whether to expand nested memberships or not.
     *
     * @return the includeAccessBelowResource value.
     */
    public Boolean includeAccessBelowResource() {
        return this.includeAccessBelowResource;
    }

    /**
     * Set the includeAccessBelowResource property: Flag to indicate whether to expand nested memberships or not.
     *
     * @param includeAccessBelowResource the includeAccessBelowResource value to set.
     * @return the AccessReviewScope object itself.
     */
    public AccessReviewScope withIncludeAccessBelowResource(Boolean includeAccessBelowResource) {
        this.includeAccessBelowResource = includeAccessBelowResource;
        return this;
    }

    /**
     * Get the excludeResourceId property: This is used to indicate the resource id(s) to exclude.
     *
     * @return the excludeResourceId value.
     */
    public String excludeResourceId() {
        return this.excludeResourceId;
    }

    /**
     * Set the excludeResourceId property: This is used to indicate the resource id(s) to exclude.
     *
     * @param excludeResourceId the excludeResourceId value to set.
     * @return the AccessReviewScope object itself.
     */
    public AccessReviewScope withExcludeResourceId(String excludeResourceId) {
        this.excludeResourceId = excludeResourceId;
        return this;
    }

    /**
     * Get the excludeRoleDefinitionId property: This is used to indicate the role definition id(s) to exclude.
     *
     * @return the excludeRoleDefinitionId value.
     */
    public String excludeRoleDefinitionId() {
        return this.excludeRoleDefinitionId;
    }

    /**
     * Set the excludeRoleDefinitionId property: This is used to indicate the role definition id(s) to exclude.
     *
     * @param excludeRoleDefinitionId the excludeRoleDefinitionId value to set.
     * @return the AccessReviewScope object itself.
     */
    public AccessReviewScope withExcludeRoleDefinitionId(String excludeRoleDefinitionId) {
        this.excludeRoleDefinitionId = excludeRoleDefinitionId;
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
