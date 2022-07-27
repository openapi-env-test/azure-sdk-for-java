// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.models.RecommendedActionErrorInfo;
import com.azure.resourcemanager.sql.generated.models.RecommendedActionImpactRecord;
import com.azure.resourcemanager.sql.generated.models.RecommendedActionImplementationInfo;
import com.azure.resourcemanager.sql.generated.models.RecommendedActionInitiatedBy;
import com.azure.resourcemanager.sql.generated.models.RecommendedActionMetricInfo;
import com.azure.resourcemanager.sql.generated.models.RecommendedActionStateInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Properties for a Database, Server or Elastic Pool Recommended Action. */
@Fluent
public final class RecommendedActionProperties {
    /*
     * Gets the reason for recommending this action. e.g., DuplicateIndex
     */
    @JsonProperty(value = "recommendationReason", access = JsonProperty.Access.WRITE_ONLY)
    private String recommendationReason;

    /*
     * Gets the time since when this recommended action is valid.
     */
    @JsonProperty(value = "validSince", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime validSince;

    /*
     * Gets time when this recommended action was last refreshed.
     */
    @JsonProperty(value = "lastRefresh", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastRefresh;

    /*
     * Gets the info of the current state the recommended action is in.
     */
    @JsonProperty(value = "state", required = true)
    private RecommendedActionStateInfo state;

    /*
     * Gets if this recommended action is actionable by user
     */
    @JsonProperty(value = "isExecutableAction", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isExecutableAction;

    /*
     * Gets if changes applied by this recommended action can be reverted by
     * user
     */
    @JsonProperty(value = "isRevertableAction", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isRevertableAction;

    /*
     * Gets if this recommended action was suggested some time ago but user
     * chose to ignore this and system added a new recommended action again.
     */
    @JsonProperty(value = "isArchivedAction", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isArchivedAction;

    /*
     * Gets the time when system started applying this recommended action on
     * the user resource. e.g., index creation start time
     */
    @JsonProperty(value = "executeActionStartTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime executeActionStartTime;

    /*
     * Gets the time taken for applying this recommended action on user
     * resource. e.g., time taken for index creation
     */
    @JsonProperty(value = "executeActionDuration", access = JsonProperty.Access.WRITE_ONLY)
    private String executeActionDuration;

    /*
     * Gets the time when system started reverting changes of this recommended
     * action on user resource. e.g., time when index drop is executed.
     */
    @JsonProperty(value = "revertActionStartTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime revertActionStartTime;

    /*
     * Gets the time taken for reverting changes of this recommended action on
     * user resource. e.g., time taken for dropping the created index.
     */
    @JsonProperty(value = "revertActionDuration", access = JsonProperty.Access.WRITE_ONLY)
    private String revertActionDuration;

    /*
     * Gets if approval for applying this recommended action was given by
     * user/system.
     */
    @JsonProperty(value = "executeActionInitiatedBy", access = JsonProperty.Access.WRITE_ONLY)
    private RecommendedActionInitiatedBy executeActionInitiatedBy;

    /*
     * Gets the time when this recommended action was approved for execution.
     */
    @JsonProperty(value = "executeActionInitiatedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime executeActionInitiatedTime;

    /*
     * Gets if approval for reverting this recommended action was given by
     * user/system.
     */
    @JsonProperty(value = "revertActionInitiatedBy", access = JsonProperty.Access.WRITE_ONLY)
    private RecommendedActionInitiatedBy revertActionInitiatedBy;

    /*
     * Gets the time when this recommended action was approved for revert.
     */
    @JsonProperty(value = "revertActionInitiatedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime revertActionInitiatedTime;

    /*
     * Gets the impact of this recommended action. Possible values are 1 - Low
     * impact, 2 - Medium Impact and 3 - High Impact
     */
    @JsonProperty(value = "score", access = JsonProperty.Access.WRITE_ONLY)
    private Integer score;

    /*
     * Gets the implementation details of this recommended action for user to
     * apply it manually.
     */
    @JsonProperty(value = "implementationDetails", access = JsonProperty.Access.WRITE_ONLY)
    private RecommendedActionImplementationInfo implementationDetails;

    /*
     * Gets the error details if and why this recommended action is put to
     * error state.
     */
    @JsonProperty(value = "errorDetails", access = JsonProperty.Access.WRITE_ONLY)
    private RecommendedActionErrorInfo errorDetails;

    /*
     * Gets the estimated impact info for this recommended action e.g.,
     * Estimated CPU gain, Estimated Disk Space change
     */
    @JsonProperty(value = "estimatedImpact", access = JsonProperty.Access.WRITE_ONLY)
    private List<RecommendedActionImpactRecord> estimatedImpact;

    /*
     * Gets the observed/actual impact info for this recommended action e.g.,
     * Actual CPU gain, Actual Disk Space change
     */
    @JsonProperty(value = "observedImpact", access = JsonProperty.Access.WRITE_ONLY)
    private List<RecommendedActionImpactRecord> observedImpact;

    /*
     * Gets the time series info of metrics for this recommended action e.g.,
     * CPU consumption time series
     */
    @JsonProperty(value = "timeSeries", access = JsonProperty.Access.WRITE_ONLY)
    private List<RecommendedActionMetricInfo> timeSeries;

    /*
     * Gets the linked objects, if any.
     */
    @JsonProperty(value = "linkedObjects", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> linkedObjects;

    /*
     * Gets additional details specific to this recommended action.
     */
    @JsonProperty(value = "details", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> details;

    /**
     * Get the recommendationReason property: Gets the reason for recommending this action. e.g., DuplicateIndex.
     *
     * @return the recommendationReason value.
     */
    public String recommendationReason() {
        return this.recommendationReason;
    }

    /**
     * Get the validSince property: Gets the time since when this recommended action is valid.
     *
     * @return the validSince value.
     */
    public OffsetDateTime validSince() {
        return this.validSince;
    }

    /**
     * Get the lastRefresh property: Gets time when this recommended action was last refreshed.
     *
     * @return the lastRefresh value.
     */
    public OffsetDateTime lastRefresh() {
        return this.lastRefresh;
    }

    /**
     * Get the state property: Gets the info of the current state the recommended action is in.
     *
     * @return the state value.
     */
    public RecommendedActionStateInfo state() {
        return this.state;
    }

    /**
     * Set the state property: Gets the info of the current state the recommended action is in.
     *
     * @param state the state value to set.
     * @return the RecommendedActionProperties object itself.
     */
    public RecommendedActionProperties withState(RecommendedActionStateInfo state) {
        this.state = state;
        return this;
    }

    /**
     * Get the isExecutableAction property: Gets if this recommended action is actionable by user.
     *
     * @return the isExecutableAction value.
     */
    public Boolean isExecutableAction() {
        return this.isExecutableAction;
    }

    /**
     * Get the isRevertableAction property: Gets if changes applied by this recommended action can be reverted by user.
     *
     * @return the isRevertableAction value.
     */
    public Boolean isRevertableAction() {
        return this.isRevertableAction;
    }

    /**
     * Get the isArchivedAction property: Gets if this recommended action was suggested some time ago but user chose to
     * ignore this and system added a new recommended action again.
     *
     * @return the isArchivedAction value.
     */
    public Boolean isArchivedAction() {
        return this.isArchivedAction;
    }

    /**
     * Get the executeActionStartTime property: Gets the time when system started applying this recommended action on
     * the user resource. e.g., index creation start time.
     *
     * @return the executeActionStartTime value.
     */
    public OffsetDateTime executeActionStartTime() {
        return this.executeActionStartTime;
    }

    /**
     * Get the executeActionDuration property: Gets the time taken for applying this recommended action on user
     * resource. e.g., time taken for index creation.
     *
     * @return the executeActionDuration value.
     */
    public String executeActionDuration() {
        return this.executeActionDuration;
    }

    /**
     * Get the revertActionStartTime property: Gets the time when system started reverting changes of this recommended
     * action on user resource. e.g., time when index drop is executed.
     *
     * @return the revertActionStartTime value.
     */
    public OffsetDateTime revertActionStartTime() {
        return this.revertActionStartTime;
    }

    /**
     * Get the revertActionDuration property: Gets the time taken for reverting changes of this recommended action on
     * user resource. e.g., time taken for dropping the created index.
     *
     * @return the revertActionDuration value.
     */
    public String revertActionDuration() {
        return this.revertActionDuration;
    }

    /**
     * Get the executeActionInitiatedBy property: Gets if approval for applying this recommended action was given by
     * user/system.
     *
     * @return the executeActionInitiatedBy value.
     */
    public RecommendedActionInitiatedBy executeActionInitiatedBy() {
        return this.executeActionInitiatedBy;
    }

    /**
     * Get the executeActionInitiatedTime property: Gets the time when this recommended action was approved for
     * execution.
     *
     * @return the executeActionInitiatedTime value.
     */
    public OffsetDateTime executeActionInitiatedTime() {
        return this.executeActionInitiatedTime;
    }

    /**
     * Get the revertActionInitiatedBy property: Gets if approval for reverting this recommended action was given by
     * user/system.
     *
     * @return the revertActionInitiatedBy value.
     */
    public RecommendedActionInitiatedBy revertActionInitiatedBy() {
        return this.revertActionInitiatedBy;
    }

    /**
     * Get the revertActionInitiatedTime property: Gets the time when this recommended action was approved for revert.
     *
     * @return the revertActionInitiatedTime value.
     */
    public OffsetDateTime revertActionInitiatedTime() {
        return this.revertActionInitiatedTime;
    }

    /**
     * Get the score property: Gets the impact of this recommended action. Possible values are 1 - Low impact, 2 -
     * Medium Impact and 3 - High Impact.
     *
     * @return the score value.
     */
    public Integer score() {
        return this.score;
    }

    /**
     * Get the implementationDetails property: Gets the implementation details of this recommended action for user to
     * apply it manually.
     *
     * @return the implementationDetails value.
     */
    public RecommendedActionImplementationInfo implementationDetails() {
        return this.implementationDetails;
    }

    /**
     * Get the errorDetails property: Gets the error details if and why this recommended action is put to error state.
     *
     * @return the errorDetails value.
     */
    public RecommendedActionErrorInfo errorDetails() {
        return this.errorDetails;
    }

    /**
     * Get the estimatedImpact property: Gets the estimated impact info for this recommended action e.g., Estimated CPU
     * gain, Estimated Disk Space change.
     *
     * @return the estimatedImpact value.
     */
    public List<RecommendedActionImpactRecord> estimatedImpact() {
        return this.estimatedImpact;
    }

    /**
     * Get the observedImpact property: Gets the observed/actual impact info for this recommended action e.g., Actual
     * CPU gain, Actual Disk Space change.
     *
     * @return the observedImpact value.
     */
    public List<RecommendedActionImpactRecord> observedImpact() {
        return this.observedImpact;
    }

    /**
     * Get the timeSeries property: Gets the time series info of metrics for this recommended action e.g., CPU
     * consumption time series.
     *
     * @return the timeSeries value.
     */
    public List<RecommendedActionMetricInfo> timeSeries() {
        return this.timeSeries;
    }

    /**
     * Get the linkedObjects property: Gets the linked objects, if any.
     *
     * @return the linkedObjects value.
     */
    public List<String> linkedObjects() {
        return this.linkedObjects;
    }

    /**
     * Get the details property: Gets additional details specific to this recommended action.
     *
     * @return the details value.
     */
    public Map<String, Object> details() {
        return this.details;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (state() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property state in model RecommendedActionProperties"));
        } else {
            state().validate();
        }
        if (implementationDetails() != null) {
            implementationDetails().validate();
        }
        if (errorDetails() != null) {
            errorDetails().validate();
        }
        if (estimatedImpact() != null) {
            estimatedImpact().forEach(e -> e.validate());
        }
        if (observedImpact() != null) {
            observedImpact().forEach(e -> e.validate());
        }
        if (timeSeries() != null) {
            timeSeries().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RecommendedActionProperties.class);
}
