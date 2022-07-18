// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** VMwareV2 fabric specific details. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("VMwareV2")
@Immutable
public final class VMwareV2FabricSpecificDetails extends FabricSpecificDetails {
    /*
     * The ARM Id of the VMware site.
     */
    @JsonProperty(value = "vmwareSiteId", access = JsonProperty.Access.WRITE_ONLY)
    private String vmwareSiteId;

    /*
     * The ARM Id of the physical site.
     */
    @JsonProperty(value = "physicalSiteId", access = JsonProperty.Access.WRITE_ONLY)
    private String physicalSiteId;

    /*
     * The Migration solution ARM Id.
     */
    @JsonProperty(value = "migrationSolutionId", access = JsonProperty.Access.WRITE_ONLY)
    private String migrationSolutionId;

    /*
     * The service endpoint.
     */
    @JsonProperty(value = "serviceEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceEndpoint;

    /*
     * The service resource Id.
     */
    @JsonProperty(value = "serviceResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceResourceId;

    /*
     * The service container Id.
     */
    @JsonProperty(value = "serviceContainerId", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceContainerId;

    /*
     * The list of process servers.
     */
    @JsonProperty(value = "processServers", access = JsonProperty.Access.WRITE_ONLY)
    private List<ProcessServerDetails> processServers;

    /**
     * Get the vmwareSiteId property: The ARM Id of the VMware site.
     *
     * @return the vmwareSiteId value.
     */
    public String vmwareSiteId() {
        return this.vmwareSiteId;
    }

    /**
     * Get the physicalSiteId property: The ARM Id of the physical site.
     *
     * @return the physicalSiteId value.
     */
    public String physicalSiteId() {
        return this.physicalSiteId;
    }

    /**
     * Get the migrationSolutionId property: The Migration solution ARM Id.
     *
     * @return the migrationSolutionId value.
     */
    public String migrationSolutionId() {
        return this.migrationSolutionId;
    }

    /**
     * Get the serviceEndpoint property: The service endpoint.
     *
     * @return the serviceEndpoint value.
     */
    public String serviceEndpoint() {
        return this.serviceEndpoint;
    }

    /**
     * Get the serviceResourceId property: The service resource Id.
     *
     * @return the serviceResourceId value.
     */
    public String serviceResourceId() {
        return this.serviceResourceId;
    }

    /**
     * Get the serviceContainerId property: The service container Id.
     *
     * @return the serviceContainerId value.
     */
    public String serviceContainerId() {
        return this.serviceContainerId;
    }

    /**
     * Get the processServers property: The list of process servers.
     *
     * @return the processServers value.
     */
    public List<ProcessServerDetails> processServers() {
        return this.processServers;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (processServers() != null) {
            processServers().forEach(e -> e.validate());
        }
    }
}
