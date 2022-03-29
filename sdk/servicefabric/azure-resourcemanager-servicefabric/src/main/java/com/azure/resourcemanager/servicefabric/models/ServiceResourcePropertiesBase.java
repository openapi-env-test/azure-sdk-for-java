// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The common service resource properties. */
@Fluent
public class ServiceResourcePropertiesBase {
    /*
     * The placement constraints as a string. Placement constraints are boolean
     * expressions on node properties and allow for restricting a service to
     * particular nodes based on the service requirements. For example, to
     * place a service on nodes where NodeType is blue specify the following:
     * "NodeColor == blue)".
     */
    @JsonProperty(value = "placementConstraints")
    private String placementConstraints;

    /*
     * A list that describes the correlation of the service with other
     * services.
     */
    @JsonProperty(value = "correlationScheme")
    private List<ServiceCorrelationDescription> correlationScheme;

    /*
     * The service load metrics is given as an array of
     * ServiceLoadMetricDescription objects.
     */
    @JsonProperty(value = "serviceLoadMetrics")
    private List<ServiceLoadMetricDescription> serviceLoadMetrics;

    /*
     * A list that describes the correlation of the service with other
     * services.
     */
    @JsonProperty(value = "servicePlacementPolicies")
    private List<ServicePlacementPolicyDescription> servicePlacementPolicies;

    /*
     * Specifies the move cost for the service.
     */
    @JsonProperty(value = "defaultMoveCost")
    private MoveCost defaultMoveCost;

    /**
     * Get the placementConstraints property: The placement constraints as a string. Placement constraints are boolean
     * expressions on node properties and allow for restricting a service to particular nodes based on the service
     * requirements. For example, to place a service on nodes where NodeType is blue specify the following: "NodeColor
     * == blue)".
     *
     * @return the placementConstraints value.
     */
    public String placementConstraints() {
        return this.placementConstraints;
    }

    /**
     * Set the placementConstraints property: The placement constraints as a string. Placement constraints are boolean
     * expressions on node properties and allow for restricting a service to particular nodes based on the service
     * requirements. For example, to place a service on nodes where NodeType is blue specify the following: "NodeColor
     * == blue)".
     *
     * @param placementConstraints the placementConstraints value to set.
     * @return the ServiceResourcePropertiesBase object itself.
     */
    public ServiceResourcePropertiesBase withPlacementConstraints(String placementConstraints) {
        this.placementConstraints = placementConstraints;
        return this;
    }

    /**
     * Get the correlationScheme property: A list that describes the correlation of the service with other services.
     *
     * @return the correlationScheme value.
     */
    public List<ServiceCorrelationDescription> correlationScheme() {
        return this.correlationScheme;
    }

    /**
     * Set the correlationScheme property: A list that describes the correlation of the service with other services.
     *
     * @param correlationScheme the correlationScheme value to set.
     * @return the ServiceResourcePropertiesBase object itself.
     */
    public ServiceResourcePropertiesBase withCorrelationScheme(List<ServiceCorrelationDescription> correlationScheme) {
        this.correlationScheme = correlationScheme;
        return this;
    }

    /**
     * Get the serviceLoadMetrics property: The service load metrics is given as an array of
     * ServiceLoadMetricDescription objects.
     *
     * @return the serviceLoadMetrics value.
     */
    public List<ServiceLoadMetricDescription> serviceLoadMetrics() {
        return this.serviceLoadMetrics;
    }

    /**
     * Set the serviceLoadMetrics property: The service load metrics is given as an array of
     * ServiceLoadMetricDescription objects.
     *
     * @param serviceLoadMetrics the serviceLoadMetrics value to set.
     * @return the ServiceResourcePropertiesBase object itself.
     */
    public ServiceResourcePropertiesBase withServiceLoadMetrics(List<ServiceLoadMetricDescription> serviceLoadMetrics) {
        this.serviceLoadMetrics = serviceLoadMetrics;
        return this;
    }

    /**
     * Get the servicePlacementPolicies property: A list that describes the correlation of the service with other
     * services.
     *
     * @return the servicePlacementPolicies value.
     */
    public List<ServicePlacementPolicyDescription> servicePlacementPolicies() {
        return this.servicePlacementPolicies;
    }

    /**
     * Set the servicePlacementPolicies property: A list that describes the correlation of the service with other
     * services.
     *
     * @param servicePlacementPolicies the servicePlacementPolicies value to set.
     * @return the ServiceResourcePropertiesBase object itself.
     */
    public ServiceResourcePropertiesBase withServicePlacementPolicies(
        List<ServicePlacementPolicyDescription> servicePlacementPolicies) {
        this.servicePlacementPolicies = servicePlacementPolicies;
        return this;
    }

    /**
     * Get the defaultMoveCost property: Specifies the move cost for the service.
     *
     * @return the defaultMoveCost value.
     */
    public MoveCost defaultMoveCost() {
        return this.defaultMoveCost;
    }

    /**
     * Set the defaultMoveCost property: Specifies the move cost for the service.
     *
     * @param defaultMoveCost the defaultMoveCost value to set.
     * @return the ServiceResourcePropertiesBase object itself.
     */
    public ServiceResourcePropertiesBase withDefaultMoveCost(MoveCost defaultMoveCost) {
        this.defaultMoveCost = defaultMoveCost;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (correlationScheme() != null) {
            correlationScheme().forEach(e -> e.validate());
        }
        if (serviceLoadMetrics() != null) {
            serviceLoadMetrics().forEach(e -> e.validate());
        }
        if (servicePlacementPolicies() != null) {
            servicePlacementPolicies().forEach(e -> e.validate());
        }
    }
}
