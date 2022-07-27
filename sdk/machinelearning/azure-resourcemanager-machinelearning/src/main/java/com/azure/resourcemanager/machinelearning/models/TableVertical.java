// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Abstract class for AutoML tasks that use table dataset as input - such as Classification/Regression/Forecasting. */
@Fluent
public class TableVertical {
    /*
     * Columns to use for CVSplit data.
     */
    @JsonProperty(value = "cvSplitColumnNames")
    private List<String> cvSplitColumnNames;

    /*
     * Featurization inputs needed for AutoML job.
     */
    @JsonProperty(value = "featurizationSettings")
    private TableVerticalFeaturizationSettings featurizationSettings;

    /*
     * Execution constraints for AutoMLJob.
     */
    @JsonProperty(value = "limitSettings")
    private TableVerticalLimitSettings limitSettings;

    /*
     * Number of cross validation folds to be applied on training dataset
     * when validation dataset is not provided.
     */
    @JsonProperty(value = "nCrossValidations")
    private NCrossValidations nCrossValidations;

    /*
     * Test data input.
     */
    @JsonProperty(value = "testData")
    private MLTableJobInput testData;

    /*
     * The fraction of test dataset that needs to be set aside for validation
     * purpose.
     * Values between (0.0 , 1.0)
     * Applied when validation dataset is not provided.
     */
    @JsonProperty(value = "testDataSize")
    private Double testDataSize;

    /*
     * Validation data inputs.
     */
    @JsonProperty(value = "validationData")
    private MLTableJobInput validationData;

    /*
     * The fraction of training dataset that needs to be set aside for
     * validation purpose.
     * Values between (0.0 , 1.0)
     * Applied when validation dataset is not provided.
     */
    @JsonProperty(value = "validationDataSize")
    private Double validationDataSize;

    /*
     * The name of the sample weight column. Automated ML supports a weighted
     * column as an input, causing rows in the data to be weighted up or down.
     */
    @JsonProperty(value = "weightColumnName")
    private String weightColumnName;

    /**
     * Get the cvSplitColumnNames property: Columns to use for CVSplit data.
     *
     * @return the cvSplitColumnNames value.
     */
    public List<String> cvSplitColumnNames() {
        return this.cvSplitColumnNames;
    }

    /**
     * Set the cvSplitColumnNames property: Columns to use for CVSplit data.
     *
     * @param cvSplitColumnNames the cvSplitColumnNames value to set.
     * @return the TableVertical object itself.
     */
    public TableVertical withCvSplitColumnNames(List<String> cvSplitColumnNames) {
        this.cvSplitColumnNames = cvSplitColumnNames;
        return this;
    }

    /**
     * Get the featurizationSettings property: Featurization inputs needed for AutoML job.
     *
     * @return the featurizationSettings value.
     */
    public TableVerticalFeaturizationSettings featurizationSettings() {
        return this.featurizationSettings;
    }

    /**
     * Set the featurizationSettings property: Featurization inputs needed for AutoML job.
     *
     * @param featurizationSettings the featurizationSettings value to set.
     * @return the TableVertical object itself.
     */
    public TableVertical withFeaturizationSettings(TableVerticalFeaturizationSettings featurizationSettings) {
        this.featurizationSettings = featurizationSettings;
        return this;
    }

    /**
     * Get the limitSettings property: Execution constraints for AutoMLJob.
     *
     * @return the limitSettings value.
     */
    public TableVerticalLimitSettings limitSettings() {
        return this.limitSettings;
    }

    /**
     * Set the limitSettings property: Execution constraints for AutoMLJob.
     *
     * @param limitSettings the limitSettings value to set.
     * @return the TableVertical object itself.
     */
    public TableVertical withLimitSettings(TableVerticalLimitSettings limitSettings) {
        this.limitSettings = limitSettings;
        return this;
    }

    /**
     * Get the nCrossValidations property: Number of cross validation folds to be applied on training dataset when
     * validation dataset is not provided.
     *
     * @return the nCrossValidations value.
     */
    public NCrossValidations nCrossValidations() {
        return this.nCrossValidations;
    }

    /**
     * Set the nCrossValidations property: Number of cross validation folds to be applied on training dataset when
     * validation dataset is not provided.
     *
     * @param nCrossValidations the nCrossValidations value to set.
     * @return the TableVertical object itself.
     */
    public TableVertical withNCrossValidations(NCrossValidations nCrossValidations) {
        this.nCrossValidations = nCrossValidations;
        return this;
    }

    /**
     * Get the testData property: Test data input.
     *
     * @return the testData value.
     */
    public MLTableJobInput testData() {
        return this.testData;
    }

    /**
     * Set the testData property: Test data input.
     *
     * @param testData the testData value to set.
     * @return the TableVertical object itself.
     */
    public TableVertical withTestData(MLTableJobInput testData) {
        this.testData = testData;
        return this;
    }

    /**
     * Get the testDataSize property: The fraction of test dataset that needs to be set aside for validation purpose.
     * Values between (0.0 , 1.0) Applied when validation dataset is not provided.
     *
     * @return the testDataSize value.
     */
    public Double testDataSize() {
        return this.testDataSize;
    }

    /**
     * Set the testDataSize property: The fraction of test dataset that needs to be set aside for validation purpose.
     * Values between (0.0 , 1.0) Applied when validation dataset is not provided.
     *
     * @param testDataSize the testDataSize value to set.
     * @return the TableVertical object itself.
     */
    public TableVertical withTestDataSize(Double testDataSize) {
        this.testDataSize = testDataSize;
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
     * @return the TableVertical object itself.
     */
    public TableVertical withValidationData(MLTableJobInput validationData) {
        this.validationData = validationData;
        return this;
    }

    /**
     * Get the validationDataSize property: The fraction of training dataset that needs to be set aside for validation
     * purpose. Values between (0.0 , 1.0) Applied when validation dataset is not provided.
     *
     * @return the validationDataSize value.
     */
    public Double validationDataSize() {
        return this.validationDataSize;
    }

    /**
     * Set the validationDataSize property: The fraction of training dataset that needs to be set aside for validation
     * purpose. Values between (0.0 , 1.0) Applied when validation dataset is not provided.
     *
     * @param validationDataSize the validationDataSize value to set.
     * @return the TableVertical object itself.
     */
    public TableVertical withValidationDataSize(Double validationDataSize) {
        this.validationDataSize = validationDataSize;
        return this;
    }

    /**
     * Get the weightColumnName property: The name of the sample weight column. Automated ML supports a weighted column
     * as an input, causing rows in the data to be weighted up or down.
     *
     * @return the weightColumnName value.
     */
    public String weightColumnName() {
        return this.weightColumnName;
    }

    /**
     * Set the weightColumnName property: The name of the sample weight column. Automated ML supports a weighted column
     * as an input, causing rows in the data to be weighted up or down.
     *
     * @param weightColumnName the weightColumnName value to set.
     * @return the TableVertical object itself.
     */
    public TableVertical withWeightColumnName(String weightColumnName) {
        this.weightColumnName = weightColumnName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (featurizationSettings() != null) {
            featurizationSettings().validate();
        }
        if (limitSettings() != null) {
            limitSettings().validate();
        }
        if (nCrossValidations() != null) {
            nCrossValidations().validate();
        }
        if (testData() != null) {
            testData().validate();
        }
        if (validationData() != null) {
            validationData().validate();
        }
    }
}
