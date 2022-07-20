// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.singularity.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** Describes the checkpointing policy for job. */
@Fluent
public final class CheckpointPolicy {
    /*
     * Enables automatic checkpointing of training job.
     */
    @JsonProperty(value = "enableCheckpoint")
    private Boolean enableCheckpoint;

    /*
     * The relative path in the platform storage.
     */
    @JsonProperty(value = "checkpointRelativePath")
    private String checkpointRelativePath;

    /*
     * Maximum elapsed duration between subsequent checkpoints. The value
     * should be in ISO  8601 format
     * (http://en.wikipedia.org/wiki/ISO_8601#Durations).
     */
    @JsonProperty(value = "checkpointInterval")
    private Duration checkpointInterval;

    /*
     * Maximum elapsed iteration count between the subsequent checkpoints.
     */
    @JsonProperty(value = "checkpointIterationCount")
    private Integer checkpointIterationCount;

    /*
     * Describes the checkpointing retention policy for job
     */
    @JsonProperty(value = "checkpointRetentionPolicy")
    private CheckpointRetentionPolicy checkpointRetentionPolicy;

    /**
     * Get the enableCheckpoint property: Enables automatic checkpointing of training job.
     *
     * @return the enableCheckpoint value.
     */
    public Boolean enableCheckpoint() {
        return this.enableCheckpoint;
    }

    /**
     * Set the enableCheckpoint property: Enables automatic checkpointing of training job.
     *
     * @param enableCheckpoint the enableCheckpoint value to set.
     * @return the CheckpointPolicy object itself.
     */
    public CheckpointPolicy withEnableCheckpoint(Boolean enableCheckpoint) {
        this.enableCheckpoint = enableCheckpoint;
        return this;
    }

    /**
     * Get the checkpointRelativePath property: The relative path in the platform storage.
     *
     * @return the checkpointRelativePath value.
     */
    public String checkpointRelativePath() {
        return this.checkpointRelativePath;
    }

    /**
     * Set the checkpointRelativePath property: The relative path in the platform storage.
     *
     * @param checkpointRelativePath the checkpointRelativePath value to set.
     * @return the CheckpointPolicy object itself.
     */
    public CheckpointPolicy withCheckpointRelativePath(String checkpointRelativePath) {
        this.checkpointRelativePath = checkpointRelativePath;
        return this;
    }

    /**
     * Get the checkpointInterval property: Maximum elapsed duration between subsequent checkpoints. The value should be
     * in ISO 8601 format (http://en.wikipedia.org/wiki/ISO_8601#Durations).
     *
     * @return the checkpointInterval value.
     */
    public Duration checkpointInterval() {
        return this.checkpointInterval;
    }

    /**
     * Set the checkpointInterval property: Maximum elapsed duration between subsequent checkpoints. The value should be
     * in ISO 8601 format (http://en.wikipedia.org/wiki/ISO_8601#Durations).
     *
     * @param checkpointInterval the checkpointInterval value to set.
     * @return the CheckpointPolicy object itself.
     */
    public CheckpointPolicy withCheckpointInterval(Duration checkpointInterval) {
        this.checkpointInterval = checkpointInterval;
        return this;
    }

    /**
     * Get the checkpointIterationCount property: Maximum elapsed iteration count between the subsequent checkpoints.
     *
     * @return the checkpointIterationCount value.
     */
    public Integer checkpointIterationCount() {
        return this.checkpointIterationCount;
    }

    /**
     * Set the checkpointIterationCount property: Maximum elapsed iteration count between the subsequent checkpoints.
     *
     * @param checkpointIterationCount the checkpointIterationCount value to set.
     * @return the CheckpointPolicy object itself.
     */
    public CheckpointPolicy withCheckpointIterationCount(Integer checkpointIterationCount) {
        this.checkpointIterationCount = checkpointIterationCount;
        return this;
    }

    /**
     * Get the checkpointRetentionPolicy property: Describes the checkpointing retention policy for job.
     *
     * @return the checkpointRetentionPolicy value.
     */
    public CheckpointRetentionPolicy checkpointRetentionPolicy() {
        return this.checkpointRetentionPolicy;
    }

    /**
     * Set the checkpointRetentionPolicy property: Describes the checkpointing retention policy for job.
     *
     * @param checkpointRetentionPolicy the checkpointRetentionPolicy value to set.
     * @return the CheckpointPolicy object itself.
     */
    public CheckpointPolicy withCheckpointRetentionPolicy(CheckpointRetentionPolicy checkpointRetentionPolicy) {
        this.checkpointRetentionPolicy = checkpointRetentionPolicy;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (checkpointRetentionPolicy() != null) {
            checkpointRetentionPolicy().validate();
        }
    }
}
