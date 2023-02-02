// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Workload classifier operations for a data warehouse. */
@Fluent
public final class WorkloadClassifierInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private WorkloadClassifierProperties innerProperties;

    /** Creates an instance of WorkloadClassifierInner class. */
    public WorkloadClassifierInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private WorkloadClassifierProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the memberName property: The workload classifier member name.
     *
     * @return the memberName value.
     */
    public String memberName() {
        return this.innerProperties() == null ? null : this.innerProperties().memberName();
    }

    /**
     * Set the memberName property: The workload classifier member name.
     *
     * @param memberName the memberName value to set.
     * @return the WorkloadClassifierInner object itself.
     */
    public WorkloadClassifierInner withMemberName(String memberName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkloadClassifierProperties();
        }
        this.innerProperties().withMemberName(memberName);
        return this;
    }

    /**
     * Get the label property: The workload classifier label.
     *
     * @return the label value.
     */
    public String label() {
        return this.innerProperties() == null ? null : this.innerProperties().label();
    }

    /**
     * Set the label property: The workload classifier label.
     *
     * @param label the label value to set.
     * @return the WorkloadClassifierInner object itself.
     */
    public WorkloadClassifierInner withLabel(String label) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkloadClassifierProperties();
        }
        this.innerProperties().withLabel(label);
        return this;
    }

    /**
     * Get the context property: The workload classifier context.
     *
     * @return the context value.
     */
    public String context() {
        return this.innerProperties() == null ? null : this.innerProperties().context();
    }

    /**
     * Set the context property: The workload classifier context.
     *
     * @param context the context value to set.
     * @return the WorkloadClassifierInner object itself.
     */
    public WorkloadClassifierInner withContext(String context) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkloadClassifierProperties();
        }
        this.innerProperties().withContext(context);
        return this;
    }

    /**
     * Get the startTime property: The workload classifier start time for classification.
     *
     * @return the startTime value.
     */
    public String startTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startTime();
    }

    /**
     * Set the startTime property: The workload classifier start time for classification.
     *
     * @param startTime the startTime value to set.
     * @return the WorkloadClassifierInner object itself.
     */
    public WorkloadClassifierInner withStartTime(String startTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkloadClassifierProperties();
        }
        this.innerProperties().withStartTime(startTime);
        return this;
    }

    /**
     * Get the endTime property: The workload classifier end time for classification.
     *
     * @return the endTime value.
     */
    public String endTime() {
        return this.innerProperties() == null ? null : this.innerProperties().endTime();
    }

    /**
     * Set the endTime property: The workload classifier end time for classification.
     *
     * @param endTime the endTime value to set.
     * @return the WorkloadClassifierInner object itself.
     */
    public WorkloadClassifierInner withEndTime(String endTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkloadClassifierProperties();
        }
        this.innerProperties().withEndTime(endTime);
        return this;
    }

    /**
     * Get the importance property: The workload classifier importance.
     *
     * @return the importance value.
     */
    public String importance() {
        return this.innerProperties() == null ? null : this.innerProperties().importance();
    }

    /**
     * Set the importance property: The workload classifier importance.
     *
     * @param importance the importance value to set.
     * @return the WorkloadClassifierInner object itself.
     */
    public WorkloadClassifierInner withImportance(String importance) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkloadClassifierProperties();
        }
        this.innerProperties().withImportance(importance);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
