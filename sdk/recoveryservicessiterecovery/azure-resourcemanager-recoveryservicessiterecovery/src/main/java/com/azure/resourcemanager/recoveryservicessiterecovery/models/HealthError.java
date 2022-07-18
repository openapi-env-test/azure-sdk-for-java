// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Health Error. */
@Fluent
public final class HealthError {
    /*
     * The inner health errors. HealthError having a list of HealthError as
     * child errors is problematic. InnerHealthError is used because this will
     * prevent an infinite loop of structures when Hydra tries to auto-generate
     * the contract. We are exposing the related health errors as inner health
     * errors and all API consumers can utilize this in the same fashion as
     * Exception -&gt; InnerException.
     */
    @JsonProperty(value = "innerHealthErrors")
    private List<InnerHealthError> innerHealthErrors;

    /*
     * Source of error.
     */
    @JsonProperty(value = "errorSource")
    private String errorSource;

    /*
     * Type of error.
     */
    @JsonProperty(value = "errorType")
    private String errorType;

    /*
     * Level of error.
     */
    @JsonProperty(value = "errorLevel")
    private String errorLevel;

    /*
     * Category of error.
     */
    @JsonProperty(value = "errorCategory")
    private String errorCategory;

    /*
     * Error code.
     */
    @JsonProperty(value = "errorCode")
    private String errorCode;

    /*
     * Summary message of the entity.
     */
    @JsonProperty(value = "summaryMessage")
    private String summaryMessage;

    /*
     * Error message.
     */
    @JsonProperty(value = "errorMessage")
    private String errorMessage;

    /*
     * Possible causes of error.
     */
    @JsonProperty(value = "possibleCauses")
    private String possibleCauses;

    /*
     * Recommended action to resolve error.
     */
    @JsonProperty(value = "recommendedAction")
    private String recommendedAction;

    /*
     * Error creation time (UTC).
     */
    @JsonProperty(value = "creationTimeUtc")
    private OffsetDateTime creationTimeUtc;

    /*
     * DRA error message.
     */
    @JsonProperty(value = "recoveryProviderErrorMessage")
    private String recoveryProviderErrorMessage;

    /*
     * ID of the entity.
     */
    @JsonProperty(value = "entityId")
    private String entityId;

    /*
     * The health error unique id.
     */
    @JsonProperty(value = "errorId")
    private String errorId;

    /*
     * Value indicating whether the health error is customer resolvable.
     */
    @JsonProperty(value = "customerResolvability")
    private HealthErrorCustomerResolvability customerResolvability;

    /**
     * Get the innerHealthErrors property: The inner health errors. HealthError having a list of HealthError as child
     * errors is problematic. InnerHealthError is used because this will prevent an infinite loop of structures when
     * Hydra tries to auto-generate the contract. We are exposing the related health errors as inner health errors and
     * all API consumers can utilize this in the same fashion as Exception -&amp;gt; InnerException.
     *
     * @return the innerHealthErrors value.
     */
    public List<InnerHealthError> innerHealthErrors() {
        return this.innerHealthErrors;
    }

    /**
     * Set the innerHealthErrors property: The inner health errors. HealthError having a list of HealthError as child
     * errors is problematic. InnerHealthError is used because this will prevent an infinite loop of structures when
     * Hydra tries to auto-generate the contract. We are exposing the related health errors as inner health errors and
     * all API consumers can utilize this in the same fashion as Exception -&amp;gt; InnerException.
     *
     * @param innerHealthErrors the innerHealthErrors value to set.
     * @return the HealthError object itself.
     */
    public HealthError withInnerHealthErrors(List<InnerHealthError> innerHealthErrors) {
        this.innerHealthErrors = innerHealthErrors;
        return this;
    }

    /**
     * Get the errorSource property: Source of error.
     *
     * @return the errorSource value.
     */
    public String errorSource() {
        return this.errorSource;
    }

    /**
     * Set the errorSource property: Source of error.
     *
     * @param errorSource the errorSource value to set.
     * @return the HealthError object itself.
     */
    public HealthError withErrorSource(String errorSource) {
        this.errorSource = errorSource;
        return this;
    }

    /**
     * Get the errorType property: Type of error.
     *
     * @return the errorType value.
     */
    public String errorType() {
        return this.errorType;
    }

    /**
     * Set the errorType property: Type of error.
     *
     * @param errorType the errorType value to set.
     * @return the HealthError object itself.
     */
    public HealthError withErrorType(String errorType) {
        this.errorType = errorType;
        return this;
    }

    /**
     * Get the errorLevel property: Level of error.
     *
     * @return the errorLevel value.
     */
    public String errorLevel() {
        return this.errorLevel;
    }

    /**
     * Set the errorLevel property: Level of error.
     *
     * @param errorLevel the errorLevel value to set.
     * @return the HealthError object itself.
     */
    public HealthError withErrorLevel(String errorLevel) {
        this.errorLevel = errorLevel;
        return this;
    }

    /**
     * Get the errorCategory property: Category of error.
     *
     * @return the errorCategory value.
     */
    public String errorCategory() {
        return this.errorCategory;
    }

    /**
     * Set the errorCategory property: Category of error.
     *
     * @param errorCategory the errorCategory value to set.
     * @return the HealthError object itself.
     */
    public HealthError withErrorCategory(String errorCategory) {
        this.errorCategory = errorCategory;
        return this;
    }

    /**
     * Get the errorCode property: Error code.
     *
     * @return the errorCode value.
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: Error code.
     *
     * @param errorCode the errorCode value to set.
     * @return the HealthError object itself.
     */
    public HealthError withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the summaryMessage property: Summary message of the entity.
     *
     * @return the summaryMessage value.
     */
    public String summaryMessage() {
        return this.summaryMessage;
    }

    /**
     * Set the summaryMessage property: Summary message of the entity.
     *
     * @param summaryMessage the summaryMessage value to set.
     * @return the HealthError object itself.
     */
    public HealthError withSummaryMessage(String summaryMessage) {
        this.summaryMessage = summaryMessage;
        return this;
    }

    /**
     * Get the errorMessage property: Error message.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: Error message.
     *
     * @param errorMessage the errorMessage value to set.
     * @return the HealthError object itself.
     */
    public HealthError withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Get the possibleCauses property: Possible causes of error.
     *
     * @return the possibleCauses value.
     */
    public String possibleCauses() {
        return this.possibleCauses;
    }

    /**
     * Set the possibleCauses property: Possible causes of error.
     *
     * @param possibleCauses the possibleCauses value to set.
     * @return the HealthError object itself.
     */
    public HealthError withPossibleCauses(String possibleCauses) {
        this.possibleCauses = possibleCauses;
        return this;
    }

    /**
     * Get the recommendedAction property: Recommended action to resolve error.
     *
     * @return the recommendedAction value.
     */
    public String recommendedAction() {
        return this.recommendedAction;
    }

    /**
     * Set the recommendedAction property: Recommended action to resolve error.
     *
     * @param recommendedAction the recommendedAction value to set.
     * @return the HealthError object itself.
     */
    public HealthError withRecommendedAction(String recommendedAction) {
        this.recommendedAction = recommendedAction;
        return this;
    }

    /**
     * Get the creationTimeUtc property: Error creation time (UTC).
     *
     * @return the creationTimeUtc value.
     */
    public OffsetDateTime creationTimeUtc() {
        return this.creationTimeUtc;
    }

    /**
     * Set the creationTimeUtc property: Error creation time (UTC).
     *
     * @param creationTimeUtc the creationTimeUtc value to set.
     * @return the HealthError object itself.
     */
    public HealthError withCreationTimeUtc(OffsetDateTime creationTimeUtc) {
        this.creationTimeUtc = creationTimeUtc;
        return this;
    }

    /**
     * Get the recoveryProviderErrorMessage property: DRA error message.
     *
     * @return the recoveryProviderErrorMessage value.
     */
    public String recoveryProviderErrorMessage() {
        return this.recoveryProviderErrorMessage;
    }

    /**
     * Set the recoveryProviderErrorMessage property: DRA error message.
     *
     * @param recoveryProviderErrorMessage the recoveryProviderErrorMessage value to set.
     * @return the HealthError object itself.
     */
    public HealthError withRecoveryProviderErrorMessage(String recoveryProviderErrorMessage) {
        this.recoveryProviderErrorMessage = recoveryProviderErrorMessage;
        return this;
    }

    /**
     * Get the entityId property: ID of the entity.
     *
     * @return the entityId value.
     */
    public String entityId() {
        return this.entityId;
    }

    /**
     * Set the entityId property: ID of the entity.
     *
     * @param entityId the entityId value to set.
     * @return the HealthError object itself.
     */
    public HealthError withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Get the errorId property: The health error unique id.
     *
     * @return the errorId value.
     */
    public String errorId() {
        return this.errorId;
    }

    /**
     * Set the errorId property: The health error unique id.
     *
     * @param errorId the errorId value to set.
     * @return the HealthError object itself.
     */
    public HealthError withErrorId(String errorId) {
        this.errorId = errorId;
        return this;
    }

    /**
     * Get the customerResolvability property: Value indicating whether the health error is customer resolvable.
     *
     * @return the customerResolvability value.
     */
    public HealthErrorCustomerResolvability customerResolvability() {
        return this.customerResolvability;
    }

    /**
     * Set the customerResolvability property: Value indicating whether the health error is customer resolvable.
     *
     * @param customerResolvability the customerResolvability value to set.
     * @return the HealthError object itself.
     */
    public HealthError withCustomerResolvability(HealthErrorCustomerResolvability customerResolvability) {
        this.customerResolvability = customerResolvability;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerHealthErrors() != null) {
            innerHealthErrors().forEach(e -> e.validate());
        }
    }
}
