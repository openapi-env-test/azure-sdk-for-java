// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.generated.models.ExpandedProperties;
import com.azure.resourcemanager.authorization.generated.models.PrincipalType;
import com.azure.resourcemanager.authorization.generated.models.RequestType;
import com.azure.resourcemanager.authorization.generated.models.RoleAssignmentScheduleRequestPropertiesScheduleInfo;
import com.azure.resourcemanager.authorization.generated.models.RoleAssignmentScheduleRequestPropertiesTicketInfo;
import com.azure.resourcemanager.authorization.generated.models.Status;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Role assignment schedule request properties with scope. */
@Fluent
public final class RoleAssignmentScheduleRequestProperties {
    /*
     * The role assignment schedule request scope.
     */
    @JsonProperty(value = "scope", access = JsonProperty.Access.WRITE_ONLY)
    private String scope;

    /*
     * The role definition ID.
     */
    @JsonProperty(value = "roleDefinitionId", required = true)
    private String roleDefinitionId;

    /*
     * The principal ID.
     */
    @JsonProperty(value = "principalId", required = true)
    private String principalId;

    /*
     * The principal type of the assigned principal ID.
     */
    @JsonProperty(value = "principalType", access = JsonProperty.Access.WRITE_ONLY)
    private PrincipalType principalType;

    /*
     * The type of the role assignment schedule request. Eg: SelfActivate,
     * AdminAssign etc
     */
    @JsonProperty(value = "requestType", required = true)
    private RequestType requestType;

    /*
     * The status of the role assignment schedule request.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private Status status;

    /*
     * The approvalId of the role assignment schedule request.
     */
    @JsonProperty(value = "approvalId", access = JsonProperty.Access.WRITE_ONLY)
    private String approvalId;

    /*
     * The resultant role assignment schedule id or the role assignment
     * schedule id being updated
     */
    @JsonProperty(value = "targetRoleAssignmentScheduleId")
    private String targetRoleAssignmentScheduleId;

    /*
     * The role assignment schedule instance id being updated
     */
    @JsonProperty(value = "targetRoleAssignmentScheduleInstanceId")
    private String targetRoleAssignmentScheduleInstanceId;

    /*
     * Schedule info of the role assignment schedule
     */
    @JsonProperty(value = "scheduleInfo")
    private RoleAssignmentScheduleRequestPropertiesScheduleInfo scheduleInfo;

    /*
     * The linked role eligibility schedule id - to activate an eligibility.
     */
    @JsonProperty(value = "linkedRoleEligibilityScheduleId")
    private String linkedRoleEligibilityScheduleId;

    /*
     * Justification for the role assignment
     */
    @JsonProperty(value = "justification")
    private String justification;

    /*
     * Ticket Info of the role assignment
     */
    @JsonProperty(value = "ticketInfo")
    private RoleAssignmentScheduleRequestPropertiesTicketInfo ticketInfo;

    /*
     * The conditions on the role assignment. This limits the resources it can
     * be assigned to. e.g.:
     * @Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]
     * StringEqualsIgnoreCase 'foo_storage_container'
     */
    @JsonProperty(value = "condition")
    private String condition;

    /*
     * Version of the condition. Currently accepted value is '2.0'
     */
    @JsonProperty(value = "conditionVersion")
    private String conditionVersion;

    /*
     * DateTime when role assignment schedule request was created
     */
    @JsonProperty(value = "createdOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdOn;

    /*
     * Id of the user who created this request
     */
    @JsonProperty(value = "requestorId", access = JsonProperty.Access.WRITE_ONLY)
    private String requestorId;

    /*
     * Additional properties of principal, scope and role definition
     */
    @JsonProperty(value = "expandedProperties", access = JsonProperty.Access.WRITE_ONLY)
    private ExpandedProperties expandedProperties;

    /**
     * Get the scope property: The role assignment schedule request scope.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Get the roleDefinitionId property: The role definition ID.
     *
     * @return the roleDefinitionId value.
     */
    public String roleDefinitionId() {
        return this.roleDefinitionId;
    }

    /**
     * Set the roleDefinitionId property: The role definition ID.
     *
     * @param roleDefinitionId the roleDefinitionId value to set.
     * @return the RoleAssignmentScheduleRequestProperties object itself.
     */
    public RoleAssignmentScheduleRequestProperties withRoleDefinitionId(String roleDefinitionId) {
        this.roleDefinitionId = roleDefinitionId;
        return this;
    }

    /**
     * Get the principalId property: The principal ID.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: The principal ID.
     *
     * @param principalId the principalId value to set.
     * @return the RoleAssignmentScheduleRequestProperties object itself.
     */
    public RoleAssignmentScheduleRequestProperties withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the principalType property: The principal type of the assigned principal ID.
     *
     * @return the principalType value.
     */
    public PrincipalType principalType() {
        return this.principalType;
    }

    /**
     * Get the requestType property: The type of the role assignment schedule request. Eg: SelfActivate, AdminAssign
     * etc.
     *
     * @return the requestType value.
     */
    public RequestType requestType() {
        return this.requestType;
    }

    /**
     * Set the requestType property: The type of the role assignment schedule request. Eg: SelfActivate, AdminAssign
     * etc.
     *
     * @param requestType the requestType value to set.
     * @return the RoleAssignmentScheduleRequestProperties object itself.
     */
    public RoleAssignmentScheduleRequestProperties withRequestType(RequestType requestType) {
        this.requestType = requestType;
        return this;
    }

    /**
     * Get the status property: The status of the role assignment schedule request.
     *
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Get the approvalId property: The approvalId of the role assignment schedule request.
     *
     * @return the approvalId value.
     */
    public String approvalId() {
        return this.approvalId;
    }

    /**
     * Get the targetRoleAssignmentScheduleId property: The resultant role assignment schedule id or the role assignment
     * schedule id being updated.
     *
     * @return the targetRoleAssignmentScheduleId value.
     */
    public String targetRoleAssignmentScheduleId() {
        return this.targetRoleAssignmentScheduleId;
    }

    /**
     * Set the targetRoleAssignmentScheduleId property: The resultant role assignment schedule id or the role assignment
     * schedule id being updated.
     *
     * @param targetRoleAssignmentScheduleId the targetRoleAssignmentScheduleId value to set.
     * @return the RoleAssignmentScheduleRequestProperties object itself.
     */
    public RoleAssignmentScheduleRequestProperties withTargetRoleAssignmentScheduleId(
        String targetRoleAssignmentScheduleId) {
        this.targetRoleAssignmentScheduleId = targetRoleAssignmentScheduleId;
        return this;
    }

    /**
     * Get the targetRoleAssignmentScheduleInstanceId property: The role assignment schedule instance id being updated.
     *
     * @return the targetRoleAssignmentScheduleInstanceId value.
     */
    public String targetRoleAssignmentScheduleInstanceId() {
        return this.targetRoleAssignmentScheduleInstanceId;
    }

    /**
     * Set the targetRoleAssignmentScheduleInstanceId property: The role assignment schedule instance id being updated.
     *
     * @param targetRoleAssignmentScheduleInstanceId the targetRoleAssignmentScheduleInstanceId value to set.
     * @return the RoleAssignmentScheduleRequestProperties object itself.
     */
    public RoleAssignmentScheduleRequestProperties withTargetRoleAssignmentScheduleInstanceId(
        String targetRoleAssignmentScheduleInstanceId) {
        this.targetRoleAssignmentScheduleInstanceId = targetRoleAssignmentScheduleInstanceId;
        return this;
    }

    /**
     * Get the scheduleInfo property: Schedule info of the role assignment schedule.
     *
     * @return the scheduleInfo value.
     */
    public RoleAssignmentScheduleRequestPropertiesScheduleInfo scheduleInfo() {
        return this.scheduleInfo;
    }

    /**
     * Set the scheduleInfo property: Schedule info of the role assignment schedule.
     *
     * @param scheduleInfo the scheduleInfo value to set.
     * @return the RoleAssignmentScheduleRequestProperties object itself.
     */
    public RoleAssignmentScheduleRequestProperties withScheduleInfo(
        RoleAssignmentScheduleRequestPropertiesScheduleInfo scheduleInfo) {
        this.scheduleInfo = scheduleInfo;
        return this;
    }

    /**
     * Get the linkedRoleEligibilityScheduleId property: The linked role eligibility schedule id - to activate an
     * eligibility.
     *
     * @return the linkedRoleEligibilityScheduleId value.
     */
    public String linkedRoleEligibilityScheduleId() {
        return this.linkedRoleEligibilityScheduleId;
    }

    /**
     * Set the linkedRoleEligibilityScheduleId property: The linked role eligibility schedule id - to activate an
     * eligibility.
     *
     * @param linkedRoleEligibilityScheduleId the linkedRoleEligibilityScheduleId value to set.
     * @return the RoleAssignmentScheduleRequestProperties object itself.
     */
    public RoleAssignmentScheduleRequestProperties withLinkedRoleEligibilityScheduleId(
        String linkedRoleEligibilityScheduleId) {
        this.linkedRoleEligibilityScheduleId = linkedRoleEligibilityScheduleId;
        return this;
    }

    /**
     * Get the justification property: Justification for the role assignment.
     *
     * @return the justification value.
     */
    public String justification() {
        return this.justification;
    }

    /**
     * Set the justification property: Justification for the role assignment.
     *
     * @param justification the justification value to set.
     * @return the RoleAssignmentScheduleRequestProperties object itself.
     */
    public RoleAssignmentScheduleRequestProperties withJustification(String justification) {
        this.justification = justification;
        return this;
    }

    /**
     * Get the ticketInfo property: Ticket Info of the role assignment.
     *
     * @return the ticketInfo value.
     */
    public RoleAssignmentScheduleRequestPropertiesTicketInfo ticketInfo() {
        return this.ticketInfo;
    }

    /**
     * Set the ticketInfo property: Ticket Info of the role assignment.
     *
     * @param ticketInfo the ticketInfo value to set.
     * @return the RoleAssignmentScheduleRequestProperties object itself.
     */
    public RoleAssignmentScheduleRequestProperties withTicketInfo(
        RoleAssignmentScheduleRequestPropertiesTicketInfo ticketInfo) {
        this.ticketInfo = ticketInfo;
        return this;
    }

    /**
     * Get the condition property: The conditions on the role assignment. This limits the resources it can be assigned
     * to. e.g.: @Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]
     * StringEqualsIgnoreCase 'foo_storage_container'.
     *
     * @return the condition value.
     */
    public String condition() {
        return this.condition;
    }

    /**
     * Set the condition property: The conditions on the role assignment. This limits the resources it can be assigned
     * to. e.g.: @Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]
     * StringEqualsIgnoreCase 'foo_storage_container'.
     *
     * @param condition the condition value to set.
     * @return the RoleAssignmentScheduleRequestProperties object itself.
     */
    public RoleAssignmentScheduleRequestProperties withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get the conditionVersion property: Version of the condition. Currently accepted value is '2.0'.
     *
     * @return the conditionVersion value.
     */
    public String conditionVersion() {
        return this.conditionVersion;
    }

    /**
     * Set the conditionVersion property: Version of the condition. Currently accepted value is '2.0'.
     *
     * @param conditionVersion the conditionVersion value to set.
     * @return the RoleAssignmentScheduleRequestProperties object itself.
     */
    public RoleAssignmentScheduleRequestProperties withConditionVersion(String conditionVersion) {
        this.conditionVersion = conditionVersion;
        return this;
    }

    /**
     * Get the createdOn property: DateTime when role assignment schedule request was created.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.createdOn;
    }

    /**
     * Get the requestorId property: Id of the user who created this request.
     *
     * @return the requestorId value.
     */
    public String requestorId() {
        return this.requestorId;
    }

    /**
     * Get the expandedProperties property: Additional properties of principal, scope and role definition.
     *
     * @return the expandedProperties value.
     */
    public ExpandedProperties expandedProperties() {
        return this.expandedProperties;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (roleDefinitionId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property roleDefinitionId in model RoleAssignmentScheduleRequestProperties"));
        }
        if (principalId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property principalId in model RoleAssignmentScheduleRequestProperties"));
        }
        if (requestType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property requestType in model RoleAssignmentScheduleRequestProperties"));
        }
        if (scheduleInfo() != null) {
            scheduleInfo().validate();
        }
        if (ticketInfo() != null) {
            ticketInfo().validate();
        }
        if (expandedProperties() != null) {
            expandedProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RoleAssignmentScheduleRequestProperties.class);
}
