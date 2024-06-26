// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appcontainers.models.JobConfiguration;
import com.azure.resourcemanager.appcontainers.models.JobProvisioningState;
import com.azure.resourcemanager.appcontainers.models.JobTemplate;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Container Apps Job resource specific properties. */
@Fluent
public final class JobProperties {
    /*
     * Provisioning state of the Container Apps Job.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private JobProvisioningState provisioningState;

    /*
     * Resource ID of environment.
     */
    @JsonProperty(value = "environmentId")
    private String environmentId;

    /*
     * Workload profile name to pin for container apps job execution.
     */
    @JsonProperty(value = "workloadProfileName")
    private String workloadProfileName;

    /*
     * Container Apps Job configuration properties.
     */
    @JsonProperty(value = "configuration")
    private JobConfiguration configuration;

    /*
     * Container Apps job definition.
     */
    @JsonProperty(value = "template")
    private JobTemplate template;

    /*
     * Outbound IP Addresses of a container apps job.
     */
    @JsonProperty(value = "outboundIpAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> outboundIpAddresses;

    /*
     * The endpoint of the eventstream of the container apps job.
     */
    @JsonProperty(value = "eventStreamEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String eventStreamEndpoint;

    /** Creates an instance of JobProperties class. */
    public JobProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning state of the Container Apps Job.
     *
     * @return the provisioningState value.
     */
    public JobProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the environmentId property: Resource ID of environment.
     *
     * @return the environmentId value.
     */
    public String environmentId() {
        return this.environmentId;
    }

    /**
     * Set the environmentId property: Resource ID of environment.
     *
     * @param environmentId the environmentId value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * Get the workloadProfileName property: Workload profile name to pin for container apps job execution.
     *
     * @return the workloadProfileName value.
     */
    public String workloadProfileName() {
        return this.workloadProfileName;
    }

    /**
     * Set the workloadProfileName property: Workload profile name to pin for container apps job execution.
     *
     * @param workloadProfileName the workloadProfileName value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withWorkloadProfileName(String workloadProfileName) {
        this.workloadProfileName = workloadProfileName;
        return this;
    }

    /**
     * Get the configuration property: Container Apps Job configuration properties.
     *
     * @return the configuration value.
     */
    public JobConfiguration configuration() {
        return this.configuration;
    }

    /**
     * Set the configuration property: Container Apps Job configuration properties.
     *
     * @param configuration the configuration value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withConfiguration(JobConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Get the template property: Container Apps job definition.
     *
     * @return the template value.
     */
    public JobTemplate template() {
        return this.template;
    }

    /**
     * Set the template property: Container Apps job definition.
     *
     * @param template the template value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withTemplate(JobTemplate template) {
        this.template = template;
        return this;
    }

    /**
     * Get the outboundIpAddresses property: Outbound IP Addresses of a container apps job.
     *
     * @return the outboundIpAddresses value.
     */
    public List<String> outboundIpAddresses() {
        return this.outboundIpAddresses;
    }

    /**
     * Get the eventStreamEndpoint property: The endpoint of the eventstream of the container apps job.
     *
     * @return the eventStreamEndpoint value.
     */
    public String eventStreamEndpoint() {
        return this.eventStreamEndpoint;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (configuration() != null) {
            configuration().validate();
        }
        if (template() != null) {
            template().validate();
        }
    }
}
