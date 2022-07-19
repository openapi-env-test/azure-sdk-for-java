// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Base class for backup items. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectedItemType")
@JsonTypeName("GenericProtectedItem")
@Fluent
public final class GenericProtectedItem extends ProtectedItem {
    /*
     * Friendly name of the container.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /*
     * Indicates consistency of policy object and policy applied to this backup
     * item.
     */
    @JsonProperty(value = "policyState")
    private String policyState;

    /*
     * Backup state of this backup item.
     */
    @JsonProperty(value = "protectionState")
    private ProtectionState protectionState;

    /*
     * Data Plane Service ID of the protected item.
     */
    @JsonProperty(value = "protectedItemId")
    private Long protectedItemId;

    /*
     * Loosely coupled (type, value) associations (example - parent of a
     * protected item)
     */
    @JsonProperty(value = "sourceAssociations")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> sourceAssociations;

    /*
     * Name of this backup item's fabric.
     */
    @JsonProperty(value = "fabricName")
    private String fabricName;

    /**
     * Get the friendlyName property: Friendly name of the container.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: Friendly name of the container.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the GenericProtectedItem object itself.
     */
    public GenericProtectedItem withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the policyState property: Indicates consistency of policy object and policy applied to this backup item.
     *
     * @return the policyState value.
     */
    public String policyState() {
        return this.policyState;
    }

    /**
     * Set the policyState property: Indicates consistency of policy object and policy applied to this backup item.
     *
     * @param policyState the policyState value to set.
     * @return the GenericProtectedItem object itself.
     */
    public GenericProtectedItem withPolicyState(String policyState) {
        this.policyState = policyState;
        return this;
    }

    /**
     * Get the protectionState property: Backup state of this backup item.
     *
     * @return the protectionState value.
     */
    public ProtectionState protectionState() {
        return this.protectionState;
    }

    /**
     * Set the protectionState property: Backup state of this backup item.
     *
     * @param protectionState the protectionState value to set.
     * @return the GenericProtectedItem object itself.
     */
    public GenericProtectedItem withProtectionState(ProtectionState protectionState) {
        this.protectionState = protectionState;
        return this;
    }

    /**
     * Get the protectedItemId property: Data Plane Service ID of the protected item.
     *
     * @return the protectedItemId value.
     */
    public Long protectedItemId() {
        return this.protectedItemId;
    }

    /**
     * Set the protectedItemId property: Data Plane Service ID of the protected item.
     *
     * @param protectedItemId the protectedItemId value to set.
     * @return the GenericProtectedItem object itself.
     */
    public GenericProtectedItem withProtectedItemId(Long protectedItemId) {
        this.protectedItemId = protectedItemId;
        return this;
    }

    /**
     * Get the sourceAssociations property: Loosely coupled (type, value) associations (example - parent of a protected
     * item).
     *
     * @return the sourceAssociations value.
     */
    public Map<String, String> sourceAssociations() {
        return this.sourceAssociations;
    }

    /**
     * Set the sourceAssociations property: Loosely coupled (type, value) associations (example - parent of a protected
     * item).
     *
     * @param sourceAssociations the sourceAssociations value to set.
     * @return the GenericProtectedItem object itself.
     */
    public GenericProtectedItem withSourceAssociations(Map<String, String> sourceAssociations) {
        this.sourceAssociations = sourceAssociations;
        return this;
    }

    /**
     * Get the fabricName property: Name of this backup item's fabric.
     *
     * @return the fabricName value.
     */
    public String fabricName() {
        return this.fabricName;
    }

    /**
     * Set the fabricName property: Name of this backup item's fabric.
     *
     * @param fabricName the fabricName value to set.
     * @return the GenericProtectedItem object itself.
     */
    public GenericProtectedItem withFabricName(String fabricName) {
        this.fabricName = fabricName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericProtectedItem withContainerName(String containerName) {
        super.withContainerName(containerName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericProtectedItem withSourceResourceId(String sourceResourceId) {
        super.withSourceResourceId(sourceResourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericProtectedItem withPolicyId(String policyId) {
        super.withPolicyId(policyId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericProtectedItem withLastRecoveryPoint(OffsetDateTime lastRecoveryPoint) {
        super.withLastRecoveryPoint(lastRecoveryPoint);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericProtectedItem withBackupSetName(String backupSetName) {
        super.withBackupSetName(backupSetName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericProtectedItem withCreateMode(CreateMode createMode) {
        super.withCreateMode(createMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericProtectedItem withDeferredDeleteTimeInUtc(OffsetDateTime deferredDeleteTimeInUtc) {
        super.withDeferredDeleteTimeInUtc(deferredDeleteTimeInUtc);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericProtectedItem withIsScheduledForDeferredDelete(Boolean isScheduledForDeferredDelete) {
        super.withIsScheduledForDeferredDelete(isScheduledForDeferredDelete);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericProtectedItem withDeferredDeleteTimeRemaining(String deferredDeleteTimeRemaining) {
        super.withDeferredDeleteTimeRemaining(deferredDeleteTimeRemaining);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericProtectedItem withIsDeferredDeleteScheduleUpcoming(Boolean isDeferredDeleteScheduleUpcoming) {
        super.withIsDeferredDeleteScheduleUpcoming(isDeferredDeleteScheduleUpcoming);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericProtectedItem withIsRehydrate(Boolean isRehydrate) {
        super.withIsRehydrate(isRehydrate);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericProtectedItem withResourceGuardOperationRequests(List<String> resourceGuardOperationRequests) {
        super.withResourceGuardOperationRequests(resourceGuardOperationRequests);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericProtectedItem withIsArchiveEnabled(Boolean isArchiveEnabled) {
        super.withIsArchiveEnabled(isArchiveEnabled);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericProtectedItem withPolicyName(String policyName) {
        super.withPolicyName(policyName);
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
    }
}
