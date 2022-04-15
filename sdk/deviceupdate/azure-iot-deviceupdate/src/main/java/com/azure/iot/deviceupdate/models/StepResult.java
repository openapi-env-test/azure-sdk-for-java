package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The step result under an update. */
@Fluent
public final class StepResult {
    /*
     * It is update id for update steps; otherwise it is null.
     */
    @JsonProperty(value = "updateId")
    private UpdateId updateId;

    /*
     * Step description. It might be null for update steps.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Install result code.
     */
    @JsonProperty(value = "resultCode", required = true)
    private int resultCode;

    /*
     * Install extended result code
     */
    @JsonProperty(value = "extendedResultCode", required = true)
    private int extendedResultCode;

    /*
     * A string containing further details about the install result
     */
    @JsonProperty(value = "resultDetails")
    private String resultDetails;

    /**
     * Get the updateId property: It is update id for update steps; otherwise it is null.
     *
     * @return the updateId value.
     */
    public UpdateId getUpdateId() {
        return this.updateId;
    }

    /**
     * Set the updateId property: It is update id for update steps; otherwise it is null.
     *
     * @param updateId the updateId value to set.
     * @return the StepResult object itself.
     */
    public StepResult setUpdateId(UpdateId updateId) {
        this.updateId = updateId;
        return this;
    }

    /**
     * Get the description property: Step description. It might be null for update steps.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Step description. It might be null for update steps.
     *
     * @param description the description value to set.
     * @return the StepResult object itself.
     */
    public StepResult setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the resultCode property: Install result code.
     *
     * @return the resultCode value.
     */
    public int getResultCode() {
        return this.resultCode;
    }

    /**
     * Set the resultCode property: Install result code.
     *
     * @param resultCode the resultCode value to set.
     * @return the StepResult object itself.
     */
    public StepResult setResultCode(int resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * Get the extendedResultCode property: Install extended result code.
     *
     * @return the extendedResultCode value.
     */
    public int getExtendedResultCode() {
        return this.extendedResultCode;
    }

    /**
     * Set the extendedResultCode property: Install extended result code.
     *
     * @param extendedResultCode the extendedResultCode value to set.
     * @return the StepResult object itself.
     */
    public StepResult setExtendedResultCode(int extendedResultCode) {
        this.extendedResultCode = extendedResultCode;
        return this;
    }

    /**
     * Get the resultDetails property: A string containing further details about the install result.
     *
     * @return the resultDetails value.
     */
    public String getResultDetails() {
        return this.resultDetails;
    }

    /**
     * Set the resultDetails property: A string containing further details about the install result.
     *
     * @param resultDetails the resultDetails value to set.
     * @return the StepResult object itself.
     */
    public StepResult setResultDetails(String resultDetails) {
        this.resultDetails = resultDetails;
        return this;
    }
}
