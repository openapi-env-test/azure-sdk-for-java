/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class contains the error details per object.
 */
public class JobErrorDetails {
    /**
     * The Service error details.
     */
    @JsonProperty(value = "serviceErrorDetails")
    private ServiceError serviceErrorDetails;

    /**
     * The Provider error details.
     */
    @JsonProperty(value = "providerErrorDetails")
    private ProviderError providerErrorDetails;

    /**
     * Error level of error.
     */
    @JsonProperty(value = "errorLevel")
    private String errorLevel;

    /**
     * The creation time of job error.
     */
    @JsonProperty(value = "creationTime")
    private DateTime creationTime;

    /**
     * The Id of the task.
     */
    @JsonProperty(value = "taskId")
    private String taskId;

    /**
     * Get the Service error details.
     *
     * @return the serviceErrorDetails value
     */
    public ServiceError serviceErrorDetails() {
        return this.serviceErrorDetails;
    }

    /**
     * Set the Service error details.
     *
     * @param serviceErrorDetails the serviceErrorDetails value to set
     * @return the JobErrorDetails object itself.
     */
    public JobErrorDetails withServiceErrorDetails(ServiceError serviceErrorDetails) {
        this.serviceErrorDetails = serviceErrorDetails;
        return this;
    }

    /**
     * Get the Provider error details.
     *
     * @return the providerErrorDetails value
     */
    public ProviderError providerErrorDetails() {
        return this.providerErrorDetails;
    }

    /**
     * Set the Provider error details.
     *
     * @param providerErrorDetails the providerErrorDetails value to set
     * @return the JobErrorDetails object itself.
     */
    public JobErrorDetails withProviderErrorDetails(ProviderError providerErrorDetails) {
        this.providerErrorDetails = providerErrorDetails;
        return this;
    }

    /**
     * Get error level of error.
     *
     * @return the errorLevel value
     */
    public String errorLevel() {
        return this.errorLevel;
    }

    /**
     * Set error level of error.
     *
     * @param errorLevel the errorLevel value to set
     * @return the JobErrorDetails object itself.
     */
    public JobErrorDetails withErrorLevel(String errorLevel) {
        this.errorLevel = errorLevel;
        return this;
    }

    /**
     * Get the creation time of job error.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set the creation time of job error.
     *
     * @param creationTime the creationTime value to set
     * @return the JobErrorDetails object itself.
     */
    public JobErrorDetails withCreationTime(DateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get the Id of the task.
     *
     * @return the taskId value
     */
    public String taskId() {
        return this.taskId;
    }

    /**
     * Set the Id of the task.
     *
     * @param taskId the taskId value to set
     * @return the JobErrorDetails object itself.
     */
    public JobErrorDetails withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

}
