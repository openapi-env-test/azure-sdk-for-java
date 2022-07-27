// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Text Classification task in AutoML NLP vertical. NLP - Natural Language Processing. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "taskType")
@JsonTypeName("TextClassification")
@Fluent
public final class TextClassification extends AutoMLVertical {
    /*
     * Primary metric for Text-Classification task.
     */
    @JsonProperty(value = "primaryMetric")
    private ClassificationPrimaryMetrics primaryMetric;

    /*
     * Featurization inputs needed for AutoML job.
     */
    @JsonProperty(value = "featurizationSettings")
    private NlpVerticalFeaturizationSettings featurizationSettings;

    /*
     * Execution constraints for AutoMLJob.
     */
    @JsonProperty(value = "limitSettings")
    private NlpVerticalLimitSettings limitSettings;

    /*
     * Validation data inputs.
     */
    @JsonProperty(value = "validationData")
    private MLTableJobInput validationData;

    /**
     * Get the primaryMetric property: Primary metric for Text-Classification task.
     *
     * @return the primaryMetric value.
     */
    public ClassificationPrimaryMetrics primaryMetric() {
        return this.primaryMetric;
    }

    /**
     * Set the primaryMetric property: Primary metric for Text-Classification task.
     *
     * @param primaryMetric the primaryMetric value to set.
     * @return the TextClassification object itself.
     */
    public TextClassification withPrimaryMetric(ClassificationPrimaryMetrics primaryMetric) {
        this.primaryMetric = primaryMetric;
        return this;
    }

    /**
     * Get the featurizationSettings property: Featurization inputs needed for AutoML job.
     *
     * @return the featurizationSettings value.
     */
    public NlpVerticalFeaturizationSettings featurizationSettings() {
        return this.featurizationSettings;
    }

    /**
     * Set the featurizationSettings property: Featurization inputs needed for AutoML job.
     *
     * @param featurizationSettings the featurizationSettings value to set.
     * @return the TextClassification object itself.
     */
    public TextClassification withFeaturizationSettings(NlpVerticalFeaturizationSettings featurizationSettings) {
        this.featurizationSettings = featurizationSettings;
        return this;
    }

    /**
     * Get the limitSettings property: Execution constraints for AutoMLJob.
     *
     * @return the limitSettings value.
     */
    public NlpVerticalLimitSettings limitSettings() {
        return this.limitSettings;
    }

    /**
     * Set the limitSettings property: Execution constraints for AutoMLJob.
     *
     * @param limitSettings the limitSettings value to set.
     * @return the TextClassification object itself.
     */
    public TextClassification withLimitSettings(NlpVerticalLimitSettings limitSettings) {
        this.limitSettings = limitSettings;
        return this;
    }

    /**
     * Get the validationData property: Validation data inputs.
     *
     * @return the validationData value.
     */
    public MLTableJobInput validationData() {
        return this.validationData;
    }

    /**
     * Set the validationData property: Validation data inputs.
     *
     * @param validationData the validationData value to set.
     * @return the TextClassification object itself.
     */
    public TextClassification withValidationData(MLTableJobInput validationData) {
        this.validationData = validationData;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TextClassification withLogVerbosity(LogVerbosity logVerbosity) {
        super.withLogVerbosity(logVerbosity);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TextClassification withTargetColumnName(String targetColumnName) {
        super.withTargetColumnName(targetColumnName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TextClassification withTrainingData(MLTableJobInput trainingData) {
        super.withTrainingData(trainingData);
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
        if (featurizationSettings() != null) {
            featurizationSettings().validate();
        }
        if (limitSettings() != null) {
            limitSettings().validate();
        }
        if (validationData() != null) {
            validationData().validate();
        }
    }
}
