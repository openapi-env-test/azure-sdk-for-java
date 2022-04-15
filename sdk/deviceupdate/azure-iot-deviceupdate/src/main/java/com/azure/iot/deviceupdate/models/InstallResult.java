package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The install result of an update and any step results under it. */
@Fluent
public final class InstallResult {
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

    /*
     * Array of step results
     */
    @JsonProperty(value = "stepResults")
    private List<StepResult> stepResults;

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
     * @return the InstallResult object itself.
     */
    public InstallResult setResultCode(int resultCode) {
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
     * @return the InstallResult object itself.
     */
    public InstallResult setExtendedResultCode(int extendedResultCode) {
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
     * @return the InstallResult object itself.
     */
    public InstallResult setResultDetails(String resultDetails) {
        this.resultDetails = resultDetails;
        return this;
    }

    /**
     * Get the stepResults property: Array of step results.
     *
     * @return the stepResults value.
     */
    public List<StepResult> getStepResults() {
        return this.stepResults;
    }

    /**
     * Set the stepResults property: Array of step results.
     *
     * @param stepResults the stepResults value to set.
     * @return the InstallResult object itself.
     */
    public InstallResult setStepResults(List<StepResult> stepResults) {
        this.stepResults = stepResults;
        return this;
    }
}
