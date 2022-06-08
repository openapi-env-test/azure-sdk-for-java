// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ResourceMoveState. */
public final class ResourceMoveState extends ExpandableStringEnum<ResourceMoveState> {
    /** Static value Unknown for ResourceMoveState. */
    public static final ResourceMoveState UNKNOWN = fromString("Unknown");

    /** Static value InProgress for ResourceMoveState. */
    public static final ResourceMoveState IN_PROGRESS = fromString("InProgress");

    /** Static value PrepareFailed for ResourceMoveState. */
    public static final ResourceMoveState PREPARE_FAILED = fromString("PrepareFailed");

    /** Static value CommitFailed for ResourceMoveState. */
    public static final ResourceMoveState COMMIT_FAILED = fromString("CommitFailed");

    /** Static value PrepareTimedout for ResourceMoveState. */
    public static final ResourceMoveState PREPARE_TIMEDOUT = fromString("PrepareTimedout");

    /** Static value CommitTimedout for ResourceMoveState. */
    public static final ResourceMoveState COMMIT_TIMEDOUT = fromString("CommitTimedout");

    /** Static value MoveSucceeded for ResourceMoveState. */
    public static final ResourceMoveState MOVE_SUCCEEDED = fromString("MoveSucceeded");

    /** Static value Failure for ResourceMoveState. */
    public static final ResourceMoveState FAILURE = fromString("Failure");

    /** Static value CriticalFailure for ResourceMoveState. */
    public static final ResourceMoveState CRITICAL_FAILURE = fromString("CriticalFailure");

    /** Static value PartialSuccess for ResourceMoveState. */
    public static final ResourceMoveState PARTIAL_SUCCESS = fromString("PartialSuccess");

    /**
     * Creates or finds a ResourceMoveState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResourceMoveState.
     */
    @JsonCreator
    public static ResourceMoveState fromString(String name) {
        return fromString(name, ResourceMoveState.class);
    }

    /** @return known ResourceMoveState values. */
    public static Collection<ResourceMoveState> values() {
        return values(ResourceMoveState.class);
    }
}
